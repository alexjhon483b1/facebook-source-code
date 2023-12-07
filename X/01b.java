package X;

import java.util.ListIterator;

public final class 01b implements ListIterator, 01H {
   public static final 01b A00 = new 01b();

   public final boolean hasNext() {
      return false;
   }

   public final boolean hasPrevious() {
      return false;
   }

   public final int nextIndex() {
      return 0;
   }

   public final int previousIndex() {
      return -1;
   }

   public final void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
