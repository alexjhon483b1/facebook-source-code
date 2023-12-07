package X;

public abstract class 01n implements Iterable, 01H {
   public final int A00;
   public final int A01;

   public _1n/* $FF was: 01n*/(int var1, int var2) {
      this.A00 = var1;
      int var3 = var2;
      if (var1 < var2) {
         int var4 = var2 % 1;
         var3 = var4;
         if (var4 < 0) {
            var3 = var4 + 1;
         }

         var4 = var1 % 1;
         var1 = var4;
         if (var4 < 0) {
            var1 = var4 + 1;
         }

         var3 = (var3 - var1) % 1;
         var1 = var3;
         if (var3 < 0) {
            var1 = var3 + 1;
         }

         var3 = var2 - var1;
      }

      this.A01 = var3;
   }
}
