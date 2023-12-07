package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class 01L extends 01K {
   public static final int A03(Iterable var0) {
      int var1 = 10;
      09E.A08(var0, 0);
      if (var0 instanceof Collection) {
         var1 = ((Collection)var0).size();
      }

      return var1;
   }

   public static final ArrayList A04(Iterable var0) {
      ArrayList var1 = new ArrayList();
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         01P.A05((Iterable)var2.next(), var1);
      }

      return var1;
   }
}
