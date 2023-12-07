package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class 02Q {
   public static 00j A00() {
      Set var2 = 00h.A1I;
      Set var1 = 02R.A00;
      HashMap var0 = new HashMap();
      Iterator var3 = var2.iterator();

      while(var3.hasNext()) {
         var0.put(var3.next(), Collections.unmodifiableSet(var1));
      }

      return new 00j(Collections.unmodifiableMap(var0));
   }

   public static 00j A01(Set var0) {
      HashMap var1 = new HashMap();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         var1.put(var2.next(), Collections.unmodifiableSet(new HashSet(Collections.singletonList("*|all_packages|*"))));
      }

      return new 00j(Collections.unmodifiableMap(var1));
   }
}
