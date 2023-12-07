package X;

import android.content.ComponentName;
import android.content.Intent;

public abstract class 04o {
   public int A00;
   public boolean A01;
   public final ComponentName A02;

   public _4o/* $FF was: 04o*/(ComponentName var1) {
      this.A02 = var1;
   }

   public void A00() {
   }

   public void A01() {
   }

   public void A02() {
   }

   public final void A03(int var1) {
      if (!this.A01) {
         this.A01 = true;
         this.A00 = var1;
      } else {
         int var2 = this.A00;
         if (var2 != var1) {
            StringBuilder var3 = 000.A0B();
            var3.append("Given job ID ");
            var3.append(var1);
            throw 000.A05(000.A0A(" is different than previous ", var3, var2));
         }
      }

   }

   public abstract void A04(Intent var1);
}
