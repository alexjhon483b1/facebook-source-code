package X;

import java.io.Serializable;

public final class 01Y implements Serializable {
   public final Object A00;
   public final Object A01;

   public _1Y/* $FF was: 01Y*/(Object var1, Object var2) {
      this.A00 = var1;
      this.A01 = var2;
   }

   public final boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof 01Y)) {
            return false;
         }

         01Y var2 = (01Y)var1;
         if (!09E.A0D(this.A00, var2.A00) || !09E.A0D(this.A01, var2.A01)) {
            return false;
         }
      }

      return true;
   }

   public final int hashCode() {
      Object var3 = this.A00;
      int var2 = 0;
      int var1;
      if (var3 == null) {
         var1 = 0;
      } else {
         var1 = var3.hashCode();
      }

      var3 = this.A01;
      if (var3 != null) {
         var2 = var3.hashCode();
      }

      return var1 * 31 + var2;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append('(');
      var1.append(this.A00);
      var1.append(", ");
      var1.append(this.A01);
      var1.append(')');
      return var1.toString();
   }
}
