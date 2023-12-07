package X;

public final class 04r {
   public static 077 A00(07q var0, Object var1) {
      A01(var1, "Did you call earlyInit()?");
      077 var2 = var0.A00;
      A01(var2, "Did you call earlyInit()?");
      return var2;
   }

   public static void A01(Object var0, Object var1) {
      if (var0 == null) {
         throw new NullPointerException(String.valueOf(var1));
      }
   }
}
