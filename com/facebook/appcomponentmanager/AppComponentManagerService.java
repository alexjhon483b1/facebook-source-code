package com.facebook.appcomponentmanager;

import X.000;
import X.02A;
import X.02V;
import X.060;
import X.064;
import X.067;
import X.06i;
import X.06w;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;

public class AppComponentManagerService extends 02A {
   public final void A05(Intent var1) {
      Throwable var10000;
      Throwable var33;
      label319: {
         var1.getAction();
         Class var3;
         02V var4;
         boolean var10001;
         Object var35;
         if ("com.facebook.appcomponentmanager.ACTION_ENABLE_COMPONENTS".equals(var1.getAction())) {
            try {
               060.A03(this, "app_update");
               var1 = new Intent("com.facebook.appcomponentmanager.ENABLING_CMPS_DONE");
               var1.setPackage(this.getPackageName());
               this.sendBroadcast(var1);
               return;
            } catch (RuntimeException var29) {
               06i.A09("AppComponentManagerService", "Exception while enabling components. Aborting.", var29);
               var3 = 06w.class;
               synchronized(06w.class){}

               try {
                  var4 = 06w.A00;
               } catch (Throwable var27) {
                  var10000 = var27;
                  var10001 = false;
                  break label319;
               }

               if (var4 == null) {
                  return;
               }

               var35 = var29;
            }
         } else {
            if (!"com.facebook.appcomponentmanager.ACTION_EFNORCE_MANIFEST_CONSISTENCY".equals(var1.getAction())) {
               return;
            }

            PackageManager var31 = this.getPackageManager();
            067 var38 = new 067();
            File var36 = 000.A01(this);

            label303: {
               int var2;
               PackageInfo var32;
               064 var37;
               String var39;
               try {
                  var32 = var31.getPackageInfo(this.getPackageName(), 0);
                  var37 = var38.A03(var36);
                  var2 = var32.versionCode;
                  String var5 = Integer.toString(var2);
                  var39 = var37.A01;
                  if (var5.equals(var39) && var32.versionName.equals(var37.A02) && var32.packageName.equals(var37.A00)) {
                     return;
                  }
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label303;
               }

               label285:
               try {
                  StringBuilder var42 = 000.A0B();
                  var42.append("PackageInfo{package=");
                  var42.append(var32.packageName);
                  var42.append(",");
                  var42.append("versionCode=");
                  var42.append(var2);
                  var42.append(",");
                  var42.append("versionName=");
                  var42.append(var32.versionName);
                  var42.append("} ,");
                  var42.append("Manifest{package=");
                  var42.append(var37.A00);
                  var42.append(", ");
                  var42.append("versionCode=");
                  var42.append(var39);
                  var42.append(", ");
                  var42.append("versionName=");
                  var42.append(var37.A02);
                  var42.append(", ");
                  var42.append("activities=");
                  var42.append(var37.A03.size());
                  var42.append(", ");
                  var42.append("receivers=");
                  var42.append(var37.A05.size());
                  var42.append(", ");
                  var42.append("services=");
                  var42.append(var37.A06.size());
                  var42.append(", ");
                  var42.append("providers=");
                  var42.append(var37.A04.size());
                  String var40 = 000.A09("}", var42);
                  IllegalStateException var34 = new IllegalStateException(var40);
                  throw var34;
               } catch (Throwable var26) {
                  var10000 = var26;
                  var10001 = false;
                  break label285;
               }
            }

            var33 = var10000;
            var3 = 06w.class;
            synchronized(06w.class){}

            02V var41;
            try {
               var41 = 06w.A00;
            } catch (Throwable var28) {
               var10000 = var28;
               var10001 = false;
               break label319;
            }

            var4 = var41;
            var35 = var33;
            if (var41 == null) {
               06i.A09("AppComponentManagerService", "enforceManifestConsistency failed", var33);
               return;
            }
         }

         var4.AG9((Throwable)var35);
         return;
      }

      var33 = var10000;
      throw var33;
   }
}
