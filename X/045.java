package X;

public final class 045 extends 042 {
   public final 03j A00;

   public _45/* $FF was: 045*/(07i var1, 03j var2) {
      super(var1);
      this.A00 = var2;
   }

   public final boolean A00(046 var1) {
      if (03j.A03.contains(var1.A00)) {
         String var3 = var1.A00;
         if (var3 != null) {
            String var2 = var1.A01;
            if (var2 == null || var2.equals("")) {
               if (var3.endsWith("id")) {
                  var2 = "0";
               } else {
                  var2 = "unknown";
               }

               var1.A01 = var2;
            }
         }
      }

      return true;
   }
}
