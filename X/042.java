package X;

import java.util.List;
import java.util.Properties;

public abstract class 042 implements 07i {
   public final 07i A00;

   public _42/* $FF was: 042*/(07i var1) {
      this.A00 = var1;
   }

   public abstract boolean A00(046 var1);

   public final void A2B(Properties var1) {
      this.A00.A2B(var1);
   }

   public final boolean AC7(046 var1) {
      boolean var3 = false;

      boolean var2;
      while(true) {
         var2 = var3;
         if (!this.A00.AC7(var1)) {
            break;
         }

         if (this.A00(var1)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public final String[] ADF(List var1) {
      String[] var4 = this.A00.ADF(var1);
      046 var5 = new 046();

      for(int var2 = 0; var2 < var4.length; ++var2) {
         var5.A00 = (String)var1.get(var2);
         var5.A01 = var4[var2];
         String var3;
         if (!this.A00(var5)) {
            var3 = null;
         } else {
            var3 = var5.A01;
         }

         var4[var2] = var3;
      }

      this.reset();
      return var4;
   }

   public final void reset() {
      this.A00.reset();
   }
}
