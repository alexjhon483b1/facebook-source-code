package X;

import java.util.HashSet;
import java.util.Iterator;

// $FF: synthetic class
public final class 01A implements Runnable {
   public static final String __redex_internal_original_name = "GlobalAppState$$ExternalSyntheticLambda3";
   public final HashSet A00;
   public final boolean A01;

   // $FF: synthetic method
   public _1A/* $FF was: 01A*/(HashSet var1, boolean var2) {
      this.A00 = var1;
      this.A01 = var2;
   }

   public final void run() {
      HashSet var2 = this.A00;
      boolean var1 = this.A01;
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         02j var4 = (02j)var3.next();
         if (!var1) {
            var4.ALC();
         }
      }

   }
}
