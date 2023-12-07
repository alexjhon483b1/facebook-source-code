package X;

public class 01X extends 01W {
   public static final int A00(int var0) {
      int var1 = var0;
      if (var0 >= 0) {
         if (var0 >= 3) {
            if (var0 < 1073741824) {
               return (int)((float)var0 / 0.75F + 1.0F);
            }

            return Integer.MAX_VALUE;
         }

         var1 = var0 + 1;
      }

      return var1;
   }
}
