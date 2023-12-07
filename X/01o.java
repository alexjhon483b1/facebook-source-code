package X;

public final class 01o extends 01n {
   public static final 01o A00 = new 01o(1, 0);

   public _1o/* $FF was: 01o*/(int var1, int var2) {
      super(var1, var2);
   }

   public final boolean equals(Object var1) {
      if (var1 instanceof 01o) {
         int var2 = super.A00;
         int var3 = super.A01;
         if (var2 > var3) {
            01n var4 = (01n)var1;
            if (var4.A00 > var4.A01) {
               return true;
            }
         }

         01n var5 = (01n)var1;
         if (var2 == var5.A00 && var3 == var5.A01) {
            return true;
         }
      }

      return false;
   }

   public final int hashCode() {
      int var2 = super.A00;
      int var1 = super.A01;
      return var2 > var1 ? -1 : var2 * 31 + var1;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(super.A00);
      var1.append("..");
      var1.append(super.A01);
      return var1.toString();
   }
}
