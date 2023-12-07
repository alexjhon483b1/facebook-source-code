package X;

import java.util.HashSet;
import java.util.Iterator;

// $FF: synthetic class
public final class 01G implements Runnable {
   public static final String __redex_internal_original_name = "GlobalAppState$$ExternalSyntheticLambda2";
   public final HashSet A00;

   // $FF: synthetic method
   public _1G/* $FF was: 01G*/(HashSet var1) {
      this.A00 = var1;
   }

   public final void run() {
      Iterator var1 = this.A00.iterator();
      if (var1.hasNext()) {
         var1.next();
         throw new NullPointerException("onEndpointChanged");
      }
   }
}
