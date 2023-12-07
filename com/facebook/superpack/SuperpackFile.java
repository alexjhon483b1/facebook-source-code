package com.facebook.superpack;

import X.0At;
import java.io.Closeable;
import java.io.InputStream;

public final class SuperpackFile implements Closeable {
   public int mFd;
   public int mLength;
   public boolean mOwnsFilePtr;
   public long mPtr;

   static {
      0At.A07("superpack-jni");
   }

   public SuperpackFile(long var1, int var3) {
      if (var1 != 0L) {
         this.mPtr = var1;
         this.mOwnsFilePtr = true;
         this.mLength = getLengthNative(var1);
         this.mFd = -1;
      } else {
         throw null;
      }
   }

   public static native void closeMemfdNative(long var0);

   public static native void closeNative(long var0);

   public static native long createSuperpackFileNative(String var0, InputStream var1);

   public static native long createSuperpackFileNative(String var0, byte[] var1);

   public static native int getLengthNative(long var0);

   public static native String getNameNative(long var0);

   public static native void readBytesNative(long var0, int var2, int var3, byte[] var4, int var5);

   public void close() {
      synchronized(this){}

      Throwable var10000;
      label290: {
         long var1;
         boolean var10001;
         try {
            var1 = this.mPtr;
         } catch (Throwable var33) {
            var10000 = var33;
            var10001 = false;
            break label290;
         }

         if (var1 != 0L) {
            label294: {
               label295: {
                  try {
                     if (this.mFd >= 0) {
                        closeMemfdNative(var1);
                        break label295;
                     }
                  } catch (Throwable var31) {
                     var10000 = var31;
                     var10001 = false;
                     break label294;
                  }

                  try {
                     if (this.mOwnsFilePtr) {
                        closeNative(var1);
                     }
                  } catch (Throwable var30) {
                     var10000 = var30;
                     var10001 = false;
                     break label294;
                  }
               }

               try {
                  this.mPtr = 0L;
               } catch (Throwable var29) {
                  var10000 = var29;
                  var10001 = false;
                  break label294;
               }

               return;
            }
         } else {
            label286:
            try {
               IllegalStateException var34 = new IllegalStateException();
               throw var34;
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label286;
            }
         }
      }

      Throwable var3 = var10000;
      throw var3;
   }

   public void finalize() {
      long var1 = this.mPtr;
      if (var1 != 0L) {
         if (this.mOwnsFilePtr) {
            closeNative(var1);
         }

         this.mPtr = 0L;
         throw new IllegalStateException();
      }
   }
}
