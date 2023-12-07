package X;

import java.io.IOException;
import java.io.InputStream;

public final class 04a extends InputStream {
   public int A00;
   public final 04Z A01;

   public _4a/* $FF was: 04a*/(04Z var1, int var2) {
      this.A01 = var1;
      this.A00 = var2;
   }

   public final int available() {
      return this.A00;
   }

   public final void close() {
      while(true) {
         int var1 = this.A00;
         if (var1 <= 0) {
            return;
         }

         this.skip((long)var1);
      }
   }

   public final int read() {
      if (this.A00 == 0) {
         return -1;
      } else {
         int var1 = this.A01.A01.read();
         if (var1 != -1) {
            --this.A00;
            return var1;
         } else {
            throw new IOException("compressed stream terminated prematurely");
         }
      }
   }

   public final int read(byte[] var1, int var2, int var3) {
      if (var3 > 0 && this.A00 == 0) {
         var2 = -1;
      } else {
         var3 = Math.min(this.A00, var3);
         var3 = this.A01.A01.read(var1, var2, var3);
         var2 = var3;
         if (var3 > 0) {
            this.A00 -= var3;
            return var3;
         }
      }

      return var2;
   }
}
