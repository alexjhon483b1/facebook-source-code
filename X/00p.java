package X;

import java.util.Comparator;
import java.util.Map;

// $FF: synthetic class
public final class 00p implements Comparator {
   public final Map A00;

   // $FF: synthetic method
   public _0p/* $FF was: 00p*/(Map var1) {
      this.A00 = var1;
   }

   public final int compare(Object var1, Object var2) {
      Map var3 = this.A00;
      return (int)(((Number)var3.get(var1)).longValue() - ((Number)var3.get(var2)).longValue());
   }
}
