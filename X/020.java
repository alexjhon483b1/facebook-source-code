package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class 020 implements List, Serializable, RandomAccess, 01H {
   public static final 020 A00 = new 020();

   public final boolean addAll(int var1, Collection var2) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

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
      if (var1 instanceof List) {
         boolean var3 = ((List)var1).isEmpty();
         var2 = true;
         if (var3) {
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   public final int hashCode() {
      return 1;
   }

   public final boolean isEmpty() {
      return true;
   }

   public final Iterator iterator() {
      return 01b.A00;
   }

   public final ListIterator listIterator() {
      return 01b.A00;
   }

   public final ListIterator listIterator(int var1) {
      if (var1 == 0) {
         return 01b.A00;
      } else {
         StringBuilder var2 = new StringBuilder();
         var2.append("Index: ");
         var2.append(var1);
         throw new IndexOutOfBoundsException(var2.toString());
      }
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

   public final List subList(int var1, int var2) {
      if (var1 == 0 && var2 == 0) {
         return this;
      } else {
         StringBuilder var3 = new StringBuilder();
         var3.append("fromIndex: ");
         var3.append(var1);
         var3.append(", toIndex: ");
         var3.append(var2);
         throw new IndexOutOfBoundsException(var3.toString());
      }
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
