package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class 058<E> extends 05K<E> implements Set<E>, 05N {
   public final 0Am A00;

   public _58/* $FF was: 058*/(0Am var1) {
      this.A00 = var1;
   }

   public final int A00() {
      return this.A00.size();
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
      return this.A00.containsKey(var1);
   }

   public final boolean isEmpty() {
      return this.A00.isEmpty();
   }

   public final Iterator iterator() {
      return new 084(this.A00);
   }

   public final boolean remove(Object var1) {
      0Am var3 = this.A00;
      var3.A05();
      int var2 = 0Am.A00(var1, var3);
      if (var2 < 0) {
         return false;
      } else {
         0Am.A03(var3, var2);
         return true;
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
