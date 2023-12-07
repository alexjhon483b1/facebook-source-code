package X;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.os.Build.VERSION;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public final class 01C {
   public static 01C A07;
   public static final long A08;
   public long A00;
   public final Lock A01 = new ReentrantLock();
   public volatile StatFs A02 = null;
   public volatile StatFs A03 = null;
   public volatile File A04;
   public volatile File A05;
   public volatile boolean A06 = false;

   static {
      A08 = TimeUnit.MINUTES.toMillis(2L);
   }

   public static StatFs A00(StatFs param0, File param1) {
      // $FF: Couldn't be decompiled
   }

   public static 01C A01() {
      synchronized(01C.class){}

      01C var0;
      label71: {
         Throwable var10000;
         label75: {
            01C var1;
            boolean var10001;
            try {
               var1 = A07;
            } catch (Throwable var7) {
               var10000 = var7;
               var10001 = false;
               break label75;
            }

            var0 = var1;
            if (var1 != null) {
               break label71;
            }

            label66:
            try {
               var0 = new 01C();
               A07 = var0;
               break label71;
            } catch (Throwable var6) {
               var10000 = var6;
               var10001 = false;
               break label66;
            }
         }

         Throwable var8 = var10000;
         throw var8;
      }

      return var0;
   }

   private void A02() {
      if (!this.A06) {
         Lock var1 = this.A01;
         var1.lock();

         try {
            if (!this.A06) {
               this.A05 = Environment.getDataDirectory();
               this.A04 = Environment.getExternalStorageDirectory();
               this.A03 = A00(this.A03, this.A05);
               this.A02 = A00(this.A02, this.A04);
               this.A00 = SystemClock.uptimeMillis();
               this.A06 = true;
            }
         } finally {
            var1.unlock();
         }
      }

   }

   private void A03() {
      Lock var2 = this.A01;
      if (var2.tryLock()) {
         try {
            if (SystemClock.uptimeMillis() - this.A00 > A08) {
               this.A03 = A00(this.A03, this.A05);
               this.A02 = A00(this.A02, this.A04);
               this.A00 = SystemClock.uptimeMillis();
            }
         } finally {
            var2.unlock();
         }
      }

   }

   public final long A04() {
      this.A02();
      this.A03();
      StatFs var5 = this.A03;
      if (var5 != null) {
         long var1;
         long var3;
         if (VERSION.SDK_INT >= 18) {
            var3 = var5.getBlockSizeLong();
            var1 = var5.getFreeBlocksLong();
         } else {
            var3 = (long)var5.getBlockSize();
            var1 = (long)var5.getFreeBlocks();
         }

         return var3 * var1;
      } else {
         return -1L;
      }
   }

   public final long A05(Integer var1) {
      this.A02();
      this.A03();
      StatFs var6;
      if (var1 == 04j.A00) {
         var6 = this.A03;
      } else {
         var6 = this.A02;
      }

      if (var6 != null) {
         long var2;
         long var4;
         if (VERSION.SDK_INT >= 18) {
            var2 = var6.getBlockSizeLong();
            var4 = var6.getAvailableBlocksLong();
         } else {
            var2 = (long)var6.getBlockSize();
            var4 = (long)var6.getAvailableBlocks();
         }

         return var2 * var4;
      } else {
         return 0L;
      }
   }

   public final boolean A06(Integer var1, long var2) {
      this.A02();
      long var4 = this.A05(var1);
      boolean var7 = true;
      boolean var6 = var7;
      if (var4 > 0L) {
         var6 = var7;
         if (var4 >= var2) {
            var6 = false;
         }
      }

      return var6;
   }
}
