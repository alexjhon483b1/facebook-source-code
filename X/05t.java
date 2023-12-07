package X;

import android.util.Log;

public final class 05t implements 06X {
   public static final 05t A00 = new 05t();

   public static void A00(int var0, String var1, String var2) {
      Log.println(var0, 000.A08(":", var1, 000.A0C("unknown")), var2);
   }

   public static void A01(String var0, String var1, Throwable var2, int var3) {
      String var4 = 000.A08(":", var0, 000.A0C("unknown"));
      StringBuilder var5 = 000.A0C(var1);
      var5.append('\n');
      if (var2 == null) {
         var0 = "";
      } else {
         var0 = Log.getStackTraceString(var2);
      }

      Log.println(var3, var4, 000.A09(var0, var5));
   }

   public final void A5z(String var1, String var2) {
      A00(6, var1, var2);
   }

   public final void A60(String var1, String var2, Throwable var3) {
      A01(var1, var2, var3, 6);
   }

   public final int ABq() {
      return 5;
   }

   public final boolean AI5(int var1) {
      boolean var2 = false;
      if (5 <= var1) {
         var2 = true;
      }

      return var2;
   }

   public final void AJ6(int var1, String var2, String var3) {
      A00(var1, "msys", var3);
   }

   public final void AZa(int var1) {
   }

   public final void AdC(String var1, String var2) {
      A00(5, var1, var2);
   }

   public final void AdD(String var1, String var2, Throwable var3) {
      A01(var1, var2, var3, 5);
   }

   public final void Adc(String var1, String var2) {
      A00(6, var1, var2);
   }

   public final void Add(String var1, String var2, Throwable var3) {
      A01(var1, var2, var3, 6);
   }
}
