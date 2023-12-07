package X;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.AbstractMutableCollection;

public final class 05G<V> extends AbstractMutableCollection<V> implements Collection<V>, 05Y {
   public final 0Am A00;

   public _5G/* $FF was: 05G*/() {
   }

   public _5G/* $FF was: 05G*/(0Am var1) {
      this.A00 = var1;
   }

   public final boolean add(Object var1) {
      throw new UnsupportedOperationException();
   }

   public final boolean addAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   public final void clear() {
      this.A00.clear();
   }

   public final boolean contains(Object var1) {
      return this.A00.containsValue(var1);
   }

   public final boolean isEmpty() {
      return this.A00.isEmpty();
   }

   public final Iterator iterator() {
      return new 083(this.A00);
   }

   public final boolean remove(Object var1) {
      0Am var4 = this.A00;
      var4.A05();
      int var2 = var4.A01;

      while(true) {
         int var3 = var2 - 1;
         if (var3 < 0) {
            return false;
         }

         var2 = var3;
         if (var4.A09[var3] >= 0) {
            Object[] var5 = var4.A0B;
            09E.A07(var5);
            var2 = var3;
            if (09E.A0D(var5[var3], var1)) {
               0Am.A03(var4, var3);
               return true;
            }
         }
      }
   }

   public final boolean removeAll(Collection var1) {
      09E.A08(var1, 0);
      this.A00.A05();
      return super.removeAll(var1);
   }

   public final boolean retainAll(Collection var1) {
      09E.A08(var1, 0);
      this.A00.A05();
      return super.retainAll(var1);
   }
}
