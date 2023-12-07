package X;

public final class 05y {
   public static volatile Boolean A00;

   static {
      06A var0 = new 06A();
      if (05v.A06) {
         05v.A01(05v.A00, var0);
      }

   }

   public static void A00() {
      String var4 = 05v.A02("debug.atrace.app_cmdlines");
      int var1 = var4.length();
      int var0 = 0;
      Boolean var3 = false;
      Boolean var2 = var3;
      if (var1 != 0) {
         String[] var6 = var4.split(",");
         String var5 = 0Al.A00();

         while(true) {
            var2 = var3;
            if (var0 >= var6.length) {
               break;
            }

            if (var5.equals(var6[var0])) {
               var2 = true;
               break;
            }

            ++var0;
         }
      }

      A00 = var2;
   }
}
