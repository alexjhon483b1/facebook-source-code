package X;

public final class 056 {
   public final int A00;
   public final Object A01;

   public _56/* $FF was: 056*/(int var1, Object var2) {
      this.A00 = var1;
      this.A01 = var2;
   }

   public final boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof 056)) {
            return false;
         }

         056 var2 = (056)var1;
         if (this.A00 != var2.A00 || !09E.A0D(this.A01, var2.A01)) {
            return false;
         }
      }

      return true;
   }

   public final int hashCode() {
      int var2 = this.A00;
      Object var3 = this.A01;
      int var1;
      if (var3 == null) {
         var1 = 0;
      } else {
         var1 = var3.hashCode();
      }

      return var2 * 31 + var1;
   }

   public final String toString() {
      StringBuilder var1 = 000.A0B();
      var1.append("IndexedValue(index=");
      var1.append(this.A00);
      var1.append(", value=");
      var1.append(this.A01);
      var1.append(')');
      return var1.toString();
   }
}
