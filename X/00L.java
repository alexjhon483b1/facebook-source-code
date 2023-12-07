package X;

import android.app.Application;
import java.io.File;

public final class 00L extends 038 {
   public _0L/* $FF was: 00L*/(Application var1, 09Q var2, 037 var3) {
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
      return 02Y.A03;
   }

   public final Integer A02() {
      return 04j.A01;
   }

   public final void A03(02Z var1, File var2, File var3) {
      if (var1 == 02Z.A03) {
         synchronized(00J.class){}

         boolean var4;
         try {
            var4 = 00J.A0B;
         } finally {
            ;
         }

         if (!var4) {
            super.A03(var1, var2, var3);
            return;
         }
      }

   }
}
