package X;

public final class 04G {
   public final String A00;
   public final boolean A01;

   public _4G/* $FF was: 04G*/(boolean var1, String var2) {
      this.A01 = var1;
      this.A00 = var2;
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder("[Success State: ");
      String var1;
      if (this.A01) {
         var1 = "Succeeded";
      } else {
         var1 = "Failed";
      }

      var3.append(var1);
      var3.append(" Err Msg If Present: ");
      String var2 = this.A00;
      var1 = var2;
      if (var2 == null) {
         var1 = "<none>";
      }

      var3.append(var1);
      var3.append("]");
      return var3.toString();
   }
}
