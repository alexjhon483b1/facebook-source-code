package X;

public enum 00x {
   public static final 00x[] A00;
   A01,
   A02,
   A03;

   static {
      00x var1 = new 00x("YES", 0);
      A03 = var1;
      00x var2 = new 00x("NO", 1);
      A01 = var2;
      00x var0 = new 00x("UNSET", 2);
      A02 = var0;
      A00 = new 00x[]{var1, var2, var0};
   }

   public final boolean A00() {
      int var1 = this.ordinal();
      if (var1 != 0) {
         if (var1 != 1 && var1 != 2) {
            StringBuilder var2 = new StringBuilder();
            var2.append("Unrecognized TriState value: ");
            var2.append(this);
            throw new IllegalStateException(var2.toString());
         } else {
            return false;
         }
      } else {
         return true;
      }
   }
}
