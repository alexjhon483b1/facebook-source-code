package X;

public final class 03Q {
   public static boolean A00(char var0) {
      boolean var1;
      if ('r' != var0 && 'c' != var0 && 's' != var0 && 'p' != var0) {
         var1 = false;
         if ('f' != var0) {
            return var1;
         }
      }

      var1 = true;
      return var1;
   }

   public static boolean A01(Integer var0, char var1) {
      07G[] var6 = 07G.values();
      int var3 = var6.length;
      boolean var5 = false;
      int var2 = 0;

      boolean var4;
      while(true) {
         var4 = var5;
         if (var2 >= var3) {
            break;
         }

         07G var7 = var6[var2];
         if (var7.A01 == var1) {
            var4 = var5;
            if (var7.A00 == var0) {
               var4 = true;
            }
            break;
         }

         ++var2;
      }

      return var4;
   }
}
