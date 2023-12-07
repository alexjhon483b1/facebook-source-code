package X;

public final class 05D {
   public final StringBuilder A00;

   public _5D/* $FF was: 05D*/(char var1) {
      StringBuilder var2 = new StringBuilder(1024);
      this.A00 = var2;
      var2.append(var1);
   }

   public final void A00(int var1) {
      StringBuilder var2 = this.A00;
      var2.append('|');
      var2.append(var1);
   }

   public final void A01(String var1) {
      int var4 = var1.length();

      for(int var3 = 0; var3 < var4; ++var3) {
         StringBuilder var5 = this.A00;
         char var2 = var1.charAt(var3);
         if (var2 == 0 || var2 == '\r' || var2 == ';' || var2 == '|' || var2 == '\t' || var2 == '\n') {
            var2 = ' ';
         }

         var5.append(var2);
      }

   }

   public final void A02(String var1) {
      this.A00.append('|');
      this.A01(var1);
   }

   public final void A03(String[] var1, int var2) {
      StringBuilder var4 = this.A00;
      var4.append('|');

      for(int var3 = 1; var3 < var2; var3 += 2) {
         String var6 = var1[var3 - 1];
         String var5 = var1[var3];
         var4.append(var6);
         var4.append('=');
         var4.append(var5);
         if (var3 < var2 - 1) {
            var4.append(';');
         }
      }

   }

   public final String toString() {
      return this.A00.toString();
   }
}
