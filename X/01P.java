package X;

import java.util.Collection;
import java.util.Iterator;

public class 01P extends 01O {
   public static final void A05(Iterable var0, Collection var1) {
      09E.A08(var0, 1);
      if (var0 instanceof Collection) {
         var1.addAll((Collection)var0);
      } else {
         Iterator var2 = var0.iterator();

         while(var2.hasNext()) {
            var1.add(var2.next());
         }
      }

   }
}
