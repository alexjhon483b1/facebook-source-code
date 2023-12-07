package X;

import android.os.SystemClock;
import java.io.OutputStream;

public final class 05X extends OutputStream {
   public boolean A00;
   public final 05W A01;
   public final OutputStream A02;

   public _5X/* $FF was: 05X*/(05W var1, OutputStream var2) {
      this.A02 = var2;
      this.A01 = var1;
   }

   public final void close() {
      long var1 = SystemClock.elapsedRealtime();

      try {
         if (!this.A00) {
            this.A02.close();
            this.A00 = true;
         }
      } finally {
         this.A01.AR6(var1, SystemClock.elapsedRealtime(), 0);
      }

   }

   public final void flush() {
      long var1 = SystemClock.elapsedRealtime();

      try {
         this.A02.flush();
      } finally {
         this.A01.AR6(var1, SystemClock.elapsedRealtime(), 0);
      }

   }

   public final void write(int var1) {
      long var2 = SystemClock.elapsedRealtime();

      try {
         this.A02.write(var1);
      } finally {
         this.A01.AR6(var2, SystemClock.elapsedRealtime(), 1);
      }

   }

   public final void write(byte[] var1) {
      long var2 = SystemClock.elapsedRealtime();

      try {
         this.A02.write(var1);
      } finally {
         this.A01.AR6(var2, SystemClock.elapsedRealtime(), var1.length);
      }

   }

   public final void write(byte[] var1, int var2, int var3) {
      long var4 = SystemClock.elapsedRealtime();

      try {
         this.A02.write(var1, var2, var3);
      } finally {
         this.A01.AR6(var4, SystemClock.elapsedRealtime(), var3);
      }

   }
}
