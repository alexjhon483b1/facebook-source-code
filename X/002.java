package X;

import android.app.Application;
import java.io.File;

public final class 002 extends 038 {
   public _02/* $FF was: 002*/(Application var1, 09Q var2, 037 var3) {
      super(var1, var2, var3);
   }

   public final 02h A00(02Z var1) {
      02h var2 = new 02h((Throwable)null);
      var2.A04(072.A4e, "anr");
      07Y var3 = 072.A6T;
      StringBuilder var4 = new StringBuilder();
      var4.append("android_");
      var4.append(var1.A00);
      var4.append("anr");
      var2.A04(var3, var4.toString());
      return var2;
   }

   public final 02Y A01() {
      return 02Y.A04;
   }

   public final Integer A02() {
      return 04j.A00;
   }

   public final void A03(02Z var1, File var2, File var3) {
      if (var3 != null) {
         File var9 = new File(var3, "critical_anr_prop.txt");
         if (var9.exists()) {
            var9.renameTo(new File(var9.getParentFile(), "critical_suppl_anr_extra_prop.txt"));
         }

         File[] var11 = var3.listFiles(new 00g(this));
         var9 = null;
         if (var11 != null) {
            int var5 = -1;
            int var8 = var11.length;

            int var6;
            for(int var4 = 0; var4 < var8; var5 = var6) {
               File var10 = var11[var4];

               label33: {
                  int var7;
                  try {
                     var7 = Integer.parseInt(var10.getName().replace("large_", "").replace("_anr_prop.txt", ""));
                  } catch (NumberFormatException var13) {
                     06i.A0J("lacrima", "Invalid anr report name %s", var10.getName(), var13);
                     08Y.A00();
                     var6 = var5;
                     break label33;
                  }

                  var6 = var5;
                  if (var7 > var5) {
                     var9 = var10;
                     var6 = var7;
                  }
               }

               ++var4;
            }

            if (var9 != null && var9.exists()) {
               var9.renameTo(new File(var9.getParentFile(), "large_suppl_anr_extra_prop.txt"));
            }
         }
      }

      super.A03(var1, var2, var3);
   }
}
