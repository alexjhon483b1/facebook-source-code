package X;

import java.util.List;

public final class 03v {
   public final 09F A00;
   public final List A01;
   public final boolean A02;

   public _3v/* $FF was: 03v*/(09F var1, List var2, boolean var3) {
      if (!var2.isEmpty()) {
         this.A00 = var1;
         this.A01 = var2;
         this.A02 = var3;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public final boolean equals(Object var1) {
      boolean var3 = false;
      boolean var2 = var3;
      if (var1 != null) {
         var2 = var3;
         if (var1 instanceof 03v) {
            03v var4 = (03v)var1;
            var2 = var3;
            if (this.A01.equals(var4.A01)) {
               var2 = var3;
               if (this.A00.A01.A00(var4.A00.A01)) {
                  var2 = true;
               }
            }
         }
      }

      return var2;
   }

   public final int hashCode() {
      int var1 = this.A01.hashCode();
      09G var2 = this.A00.A01;
      return ((159 + var1) * 53 + var2.A00) * 53 + var2.A02.hashCode();
   }
}
