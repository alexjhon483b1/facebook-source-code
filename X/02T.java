package X;

import java.util.List;

public final class 02T {
   public final List A00;
   public final boolean A01;
   public final boolean A02;

   public _2T/* $FF was: 02T*/(List var1, boolean var2, boolean var3) {
      this.A00 = var1;
      this.A01 = var2;
      this.A02 = var3;
   }

   public final boolean equals(Object var1) {
      if (this != var1) {
         if (!(var1 instanceof 02T)) {
            return false;
         }

         02T var2 = (02T)var1;
         if (!09E.A0D(this.A00, var2.A00) || this.A01 != var2.A01 || this.A02 != var2.A02) {
            return false;
         }
      }

      return true;
   }

   public final int hashCode() {
      int var4 = this.A00.hashCode();
      byte var3 = this.A01;
      byte var2 = 1;
      byte var1 = var3;
      if (var3 != 0) {
         var1 = 1;
      }

      if (!this.A02) {
         var2 = 0;
      }

      return (var4 * 31 + var1) * 31 + var2;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("SigningInfoCompat(signatures=");
      var1.append(this.A00);
      var1.append(", hasMultipleSigners=");
      var1.append(this.A01);
      var1.append(", hasPastSigningCertificates=");
      var1.append(this.A02);
      var1.append(')');
      return var1.toString();
   }
}
