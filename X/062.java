package X;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.zip.ZipEntry;

public final class 062 extends 0AY {
   public final File A00;
   public final boolean A01;
   public final 05M A02;

   public _62/* $FF was: 062*/(05M var1, 05S var2, boolean var3) {
      super(var1, var2);
      this.A02 = var1;
      this.A01 = var3;
      this.A00 = new File(var1.A01.getApplicationInfo().nativeLibraryDir);
   }

   public final 0Ab[] A03() {
      0Ab[] var8 = super.A00;
      0Ab[] var7 = var8;
      if (var8 == null) {
         var7 = this.A04();
         super.A00 = var7;
         String var14;
         if (this.A01) {
            var14 = "Unconditonally extracting all DSOs from zip";
         } else {
            int var2 = var7.length;
            int var1 = 0;

            StringBuilder var15;
            String var17;
            while(true) {
               if (var1 >= var2) {
                  var7 = new 0Ab[0];
                  super.A00 = var7;
                  return var7;
               }

               0Ab var16 = var7[var1];
               ZipEntry var11 = var16.A01;
               String var9 = var16.A01;
               var17 = var11.getName();
               File var12 = this.A00;
               File var10 = 000.A04(var12, var9);

               label57: {
                  try {
                     if (!var10.getCanonicalPath().startsWith(var12.getCanonicalPath())) {
                        0Aj.A01("BackupSoSource");
                        break label57;
                     }
                  } catch (IOException var13) {
                     StringBuilder var19 = 000.A0C("Not allowing consideration of ");
                     var19.append(var17);
                     var19.append(": ");
                     var19.append(var9);
                     var19.append(", IOException when constructing path: ");
                     Log.w("BackupSoSource", 000.A09(var13.toString(), var19));
                     break label57;
                  }

                  if (!var10.isFile()) {
                     var15 = 000.A0C("Allowing consideration of ");
                     var15.append(var17);
                     var15.append(": ");
                     var15.append(var9);
                     var17 = " not in system lib dir";
                     break;
                  }

                  long var3 = var10.length();
                  long var5 = var11.getSize();
                  if (var3 != var5) {
                     var15 = 000.A0C("Allowing consideration of ");
                     var15.append(var10);
                     var15.append(": sysdir file length is ");
                     var15.append(var3);
                     var15.append(", but the file is ");
                     var15.append(var5);
                     var17 = " bytes long in the APK";
                     break;
                  }

                  StringBuilder var18 = 000.A0C("Not allowing consideration of ");
                  var18.append(var17);
                  Log.w("BackupSoSource", 000.A09(": deferring to libdir", var18));
               }

               ++var1;
            }

            var15.append(var17);
            var14 = var15.toString();
         }

         Log.w("BackupSoSource", var14);
         var7 = super.A00;
      }

      return var7;
   }
}
