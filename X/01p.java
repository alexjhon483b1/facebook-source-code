package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class 01p implements Iterator, 01H {
   public int A00;
   public boolean A01;
   public final int A02;
   public final int A03;

   public _1p/* $FF was: 01p*/() {
   }

   public _1p/* $FF was: 01p*/(int var1, int var2) {
      boolean var3 = true;
      super();
      this.A03 = 1;
      this.A02 = var2;
      if (var1 > var2) {
         var3 = false;
      }

      this.A01 = var3;
      if (!var3) {
         var1 = var2;
      }

      this.A00 = var1;
   }

   public final int A00() {
      int var1 = this.A00;
      if (var1 == this.A02) {
         if (this.A01) {
            this.A01 = false;
            return var1;
         } else {
            throw new NoSuchElementException();
         }
      } else {
         this.A00 = this.A03 + var1;
         return var1;
      }
   }

   public final boolean hasNext() {
      return this.A01;
   }

   public final void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
