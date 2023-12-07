package X;

public final class 04H {
   public final long A00;
   public final long A01;
   public final long A02;
   public final boolean A03;
   public final boolean A04;

   public _4H/* $FF was: 04H*/(long var1) {
      this.A02 = 0L;
      this.A00 = 0L;
      this.A01 = var1;
      boolean var3 = false;
      this.A03 = false;
      if (var1 == -758L) {
         var3 = true;
      }

      this.A04 = var3;
   }

   public _4H/* $FF was: 04H*/(long var1, long var3) {
      this.A02 = var1;
      this.A00 = var3;
      this.A01 = 0L;
      this.A03 = true;
      this.A04 = false;
   }

   public final String toString() {
      StringBuilder var2;
      label15: {
         var2 = new StringBuilder("[Rel And Abs Timestamp ");
         String var1;
         if (this.A04) {
            var1 = "was not set";
         } else {
            if (!this.A03) {
               var2.append("was not valid with error code ");
               var2.append(this.A01);
               break label15;
            }

            var2.append("rel time ");
            var2.append(this.A02);
            var1 = " ms";
            var2.append(" ms");
            var2.append(" and ");
            var2.append("abs time ");
            var2.append(this.A00);
         }

         var2.append(var1);
      }

      var2.append("]");
      return var2.toString();
   }
}
