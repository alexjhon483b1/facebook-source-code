package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class 01a implements Set, Serializable, 01H {
   public static final 01a A00 = new 01a();

   public final boolean addAll(Collection var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final boolean containsAll(Collection var1) {
      09E.A08(var1, 0);
      return var1.isEmpty();
   }

   public final boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof Set) {
         boolean var3 = ((Set)var1).isEmpty();
         var2 = true;
         if (var3) {
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   public final int hashCode() {
      return 0;
   }

   public final boolean isEmpty() {
      return true;
   }

   public final Iterator iterator() {
      return 01b.A00;
   }

   public final boolean remove(Object var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final boolean removeAll(Collection var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final boolean retainAll(Collection var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final Object[] toArray() {
      return 09T.A00(this);
   }

   public final Object[] toArray(Object[] var1) {
      09E.A08(var1, 0);
      return 09T.A01(this, var1);
   }

   public final String toString() {
      return "[]";
   }
}
