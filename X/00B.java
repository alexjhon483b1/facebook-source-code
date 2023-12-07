package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class 00B {
   public final ApplicationInfo A00;
   public final String A01;
   public final String A02;
   public final PackageInfo A03;

   public _0B/* $FF was: 00B*/(PackageInfo var1) {
      09E.A08(var1, 1);
      super();
      this.A03 = var1;
      String var3 = var1.packageName;
      String var2 = var3;
      if (var3 == null) {
         var2 = "";
      }

      this.A01 = var2;
      var3 = var1.versionName;
      var2 = var3;
      if (var3 == null) {
         var2 = "";
      }

      this.A02 = var2;
      this.A00 = var1.applicationInfo;
   }

   public final long A00() {
      int var1 = VERSION.SDK_INT;
      PackageInfo var2 = this.A03;
      return var1 >= 28 ? var2.getLongVersionCode() : (long)var2.versionCode;
   }

   public final 02T A01() {
      int var1 = VERSION.SDK_INT;
      boolean var2 = true;
      Object var6 = null;
      List var7;
      02T var8;
      Iterator var9;
      Signature[] var10;
      ArrayList var11;
      Object var13;
      if (var1 >= 28) {
         PackageInfo var4 = this.A03;
         SigningInfo var5 = var4.signingInfo;
         if (var5 != null) {
            boolean var3 = var5.hasMultipleSigners();
            var2 = var4.signingInfo.hasPastSigningCertificates();
            SigningInfo var12 = var4.signingInfo;
            if (var3) {
               var10 = var12.getApkContentsSigners();
            } else {
               var10 = var12.getSigningCertificateHistory();
            }

            var8 = (02T)var6;
            if (var10 != null) {
               var7 = Arrays.asList(var10);
               09E.A03(var7);
               var8 = (02T)var6;
               if (var7 != null) {
                  var11 = new ArrayList();
                  var9 = var7.iterator();

                  while(var9.hasNext()) {
                     var13 = var9.next();
                     if (var13 != null) {
                        var11.add(var13);
                     }
                  }

                  var8 = (02T)var6;
                  if (!var11.isEmpty()) {
                     return new 02T(var11, var3, var2);
                  }

                  return var8;
               }
            }

            return var8;
         }
      }

      var10 = this.A03.signatures;
      var8 = (02T)var6;
      if (var10 != null) {
         var7 = Arrays.asList(var10);
         09E.A03(var7);
         var8 = (02T)var6;
         if (var7 != null) {
            var11 = new ArrayList();
            var9 = var7.iterator();

            while(var9.hasNext()) {
               var13 = var9.next();
               if (var13 != null) {
                  var11.add(var13);
               }
            }

            var8 = (02T)var6;
            if (!var11.isEmpty()) {
               if (var11.size() <= 1) {
                  var2 = false;
               }

               var8 = new 02T(var11, var2, false);
            }
         }
      }

      return var8;
   }
}
