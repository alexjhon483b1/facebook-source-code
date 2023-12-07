package X;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class 01Z extends 01X {
   public static final LinkedHashMap A01(01Y... var0) {
      int var2 = var0.length;
      LinkedHashMap var4 = new LinkedHashMap(01X.A00(var2));

      for(int var1 = 0; var1 < var2; ++var1) {
         01Y var3 = var0[var1];
         var4.put(var3.A00, var3.A01);
      }

      return var4;
   }

   public static final Map A02(Iterable var0) {
      LinkedHashMap var2;
      if (var0 instanceof Collection) {
         Collection var7 = (Collection)var0;
         int var1 = var7.size();
         Object var5;
         if (var1 != 0) {
            01Y var6;
            if (var1 == 1) {
               if (var0 instanceof List) {
                  var5 = ((List)var0).get(0);
               } else {
                  var5 = var0.iterator().next();
               }

               var6 = (01Y)var5;
               09E.A08(var6, 0);
               Map var8 = Collections.singletonMap(var6.A00, var6.A01);
               09E.A03(var8);
               return var8;
            }

            var2 = new LinkedHashMap(01X.A00(var7.size()));
            Iterator var9 = var0.iterator();

            while(true) {
               var5 = var2;
               if (!var9.hasNext()) {
                  break;
               }

               var6 = (01Y)var9.next();
               var2.put(var6.A00, var6.A01);
            }
         } else {
            var5 = new 01I();
         }

         return (Map)var5;
      } else {
         var2 = new LinkedHashMap();
         Iterator var4 = var0.iterator();

         while(var4.hasNext()) {
            01Y var3 = (01Y)var4.next();
            var2.put(var3.A00, var3.A01);
         }

         return A03(var2);
      }
   }

   public static final Map A03(Map var0) {
      int var1 = var0.size();
      if (var1 != 0) {
         Map var2 = var0;
         if (var1 == 1) {
            Entry var3 = (Entry)var0.entrySet().iterator().next();
            var2 = Collections.singletonMap(var3.getKey(), var3.getValue());
            09E.A03(var2);
         }

         return var2;
      } else {
         return new 01I();
      }
   }

   public static final Map A04(Map var0) {
      09E.A08(var0, 0);
      int var1 = var0.size();
      if (var1 != 0) {
         if (var1 != 1) {
            return new LinkedHashMap(var0);
         } else {
            Entry var2 = (Entry)var0.entrySet().iterator().next();
            var0 = Collections.singletonMap(var2.getKey(), var2.getValue());
            09E.A03(var0);
            return var0;
         }
      } else {
         return new 01I();
      }
   }

   public static final Map A05(01Y... var0) {
      int var2 = var0.length;
      Object var5;
      if (var2 > 0) {
         LinkedHashMap var4 = new LinkedHashMap(01X.A00(var2));
         int var1 = 0;

         while(true) {
            01Y var3 = var0[var1];
            var4.put(var3.A00, var3.A01);
            ++var1;
            var5 = var4;
            if (var1 < var2) {
               continue;
            }
         }
      } else {
         var5 = new 01I();
      }

      return (Map)var5;
   }
}
