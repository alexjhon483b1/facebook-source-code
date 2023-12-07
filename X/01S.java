package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public final class 01S extends 01R {
   public static final Object A06(List var0) {
      09E.A08(var0, 0);
      if (!var0.isEmpty()) {
         return var0.get(0);
      } else {
         throw new NoSuchElementException("List is empty.");
      }
   }

   public static final String A07(CharSequence var0, Iterable var1, 01V var2) {
      09E.A08(var1, 0);
      09E.A08(var0, 1);
      StringBuilder var3 = new StringBuilder();
      A0A(var3, var0, var1, var2);
      String var4 = var3.toString();
      09E.A03(var4);
      return var4;
   }

   public static final List A08(Iterable var0) {
      Object var3;
      label27: {
         09E.A08(var0, 0);
         int var1;
         ArrayList var4;
         if (var0 instanceof Collection) {
            Collection var2 = (Collection)var0;
            var1 = var2.size();
            if (var1 != 0) {
               if (var1 != 1) {
                  var4 = new ArrayList(var2);
                  return var4;
               }

               if (var0 instanceof List) {
                  var3 = ((List)var0).get(0);
               } else {
                  var3 = var0.iterator().next();
               }
               break label27;
            }
         } else {
            09E.A08(var0, 0);
            ArrayList var5 = new ArrayList();
            A0B(var0, var5);
            var1 = var5.size();
            if (var1 != 0) {
               var4 = var5;
               if (var1 != 1) {
                  return var4;
               }

               var3 = var5.get(0);
               break label27;
            }
         }

         return 020.A00;
      }

      List var6 = Collections.singletonList(var3);
      09E.A03(var6);
      return var6;
   }

   public static final Set A09(Iterable var0) {
      Object var4;
      label32: {
         09E.A08(var0, 0);
         int var1;
         Iterator var3;
         LinkedHashSet var5;
         LinkedHashSet var6;
         if (var0 instanceof Collection) {
            Collection var2 = (Collection)var0;
            var1 = var2.size();
            if (var1 == 0) {
               return 01a.A00;
            }

            if (var1 != 1) {
               var6 = new LinkedHashSet(01X.A00(var2.size()));
               A0B(var0, var6);
               var5 = var6;
               return var5;
            }

            if (var0 instanceof List) {
               var4 = ((List)var0).get(0);
               break label32;
            }

            var3 = var0.iterator();
         } else {
            var6 = new LinkedHashSet();
            A0B(var0, var6);
            var1 = var6.size();
            if (var1 == 0) {
               return 01a.A00;
            }

            var5 = var6;
            if (var1 != 1) {
               return var5;
            }

            var3 = var6.iterator();
         }

         var4 = var3.next();
      }

      Set var7 = Collections.singleton(var4);
      09E.A03(var7);
      return var7;
   }

   public static final void A0A(Appendable var0, CharSequence var1, Iterable var2, 01V var3) {
      09E.A08(var2, 0);
      09E.A08(var1, 2);
      var0.append("");
      Iterator var6 = var2.iterator();
      int var4 = 0;

      while(true) {
         while(var6.hasNext()) {
            Object var5 = var6.next();
            ++var4;
            if (var4 > 1) {
               var0.append(var1);
            }

            Object var7;
            if (var3 != null) {
               var7 = var3.AHE(var5);
            } else {
               var7 = var5;
               if (var5 != null) {
                  var7 = var5;
                  if (!(var5 instanceof CharSequence)) {
                     if (var5 instanceof Character) {
                        var0.append((Character)var5);
                        continue;
                     }

                     var7 = String.valueOf(var5);
                  }
               }
            }

            var0.append((CharSequence)var7);
         }

         var0.append("");
         return;
      }
   }

   public static final void A0B(Iterable var0, Collection var1) {
      09E.A08(var0, 0);
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         var1.add(var2.next());
      }

   }

   public static final boolean A0C(Iterable var0, Object var1) {
      if (var0 instanceof Collection) {
         return ((Collection)var0).contains(var1);
      } else {
         if (var0 instanceof List) {
            if (((List)var0).indexOf(var1) >= 0) {
               return true;
            }
         } else {
            int var2 = 0;

            for(Iterator var4 = var0.iterator(); var4.hasNext(); ++var2) {
               Object var3 = var4.next();
               if (var2 < 0) {
                  01K.A02();
                  throw null;
               }

               if (09E.A0D(var1, var3)) {
                  return true;
               }
            }
         }

         return false;
      }
   }
}
