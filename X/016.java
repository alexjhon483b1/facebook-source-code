package X;

public final class 016 {
   public static String A00(String var0, Object... var1) {
      String var6 = String.valueOf(var0);
      int var2 = var6.length();
      int var4 = var1.length;
      StringBuilder var7 = new StringBuilder(var2 + var4 * 16);
      var2 = 0;

      int var3;
      for(var3 = 0; var2 < var4; ++var2) {
         int var5 = var6.indexOf("%s", var3);
         if (var5 == -1) {
            break;
         }

         var7.append(var6.substring(var3, var5));
         var7.append(var1[var2]);
         var3 = var5 + 2;
      }

      var7.append(var6.substring(var3));
      if (var2 < var4) {
         var7.append(" [");
         var3 = var2 + 1;
         var7.append(var1[var2]);

         for(var2 = var3; var2 < var4; ++var2) {
            var7.append(", ");
            var7.append(var1[var2]);
         }

         var7.append(']');
      }

      return var7.toString();
   }

   public static void A01(Boolean var0) {
      if (var0 != null && !var0) {
         throw new IllegalArgumentException();
      }
   }

   public static void A02(Object var0, Object var1) {
      if (var0 == null) {
         throw new NullPointerException(String.valueOf(var1));
      }
   }

   public static void A03(String var0, Object[] var1, boolean var2) {
      if (!var2) {
         throw new IllegalArgumentException(A00(var0, var1));
      }
   }

   public static void A04(boolean var0) {
      if (!var0) {
         throw new IllegalStateException();
      }
   }
}
