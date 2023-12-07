package com.facebook.superpack;

import X.0At;
import java.io.InputStream;

public class ObiInputStream extends InputStream {
   public byte[] mOneByte;

   static {
      0At.A07("superpack-jni");
   }

   public static native void closeNative(long var0, byte[] var2);

   public static native long openBytesNative(byte[] var0, int var1, int var2);

   public static native long openInputStreamNative(InputStream var0, int var1);

   public static native long openRawBytesNative(long var0, int var2);

   public static native int readNative(long var0, byte[] var2, int var3, int var4);

   public void close() {
      synchronized(this){}

      try {
         closeNative(0L, (byte[])null);
      } finally {
         ;
      }

   }

   public int read() {
      synchronized(this){}

      Throwable var10000;
      label270: {
         byte[] var4;
         boolean var10001;
         try {
            var4 = this.mOneByte;
         } catch (Throwable var34) {
            var10000 = var34;
            var10001 = false;
            break label270;
         }

         byte[] var3 = var4;
         if (var4 == null) {
            try {
               var3 = new byte[1];
               this.mOneByte = var3;
            } catch (Throwable var33) {
               var10000 = var33;
               var10001 = false;
               break label270;
            }
         }

         int var2;
         try {
            var2 = this.read(var3);
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label270;
         }

         int var1 = -1;
         if (var2 != -1) {
            if (var2 != 1) {
               try {
                  IllegalStateException var37 = new IllegalStateException("Unexpected number of bytes read");
                  throw var37;
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label270;
               }
            }

            byte var35;
            try {
               var35 = this.mOneByte[0];
            } catch (Throwable var31) {
               var10000 = var31;
               var10001 = false;
               break label270;
            }

            var1 = var35;
            if (var35 < 0) {
               var1 = var35 + 256;
            }
         }

         return var1;
      }

      Throwable var36 = var10000;
      throw var36;
   }

   public int read(byte[] var1) {
      return this.read(var1, 0, var1.length);
   }

   public int read(byte[] var1, int var2, int var3) {
      Throwable var10000;
      label225: {
         synchronized(this){}
         boolean var10001;
         Object var24;
         if (var1 == null) {
            try {
               var24 = new NullPointerException();
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label225;
            }
         } else {
            if (var2 >= 0 && var3 >= 0) {
               label213: {
                  try {
                     if (var3 + var2 > var1.length) {
                        break label213;
                     }

                     if (readNative(0L, var1, var2, var3) <= 0) {
                        return -1;
                     }
                  } catch (Throwable var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label225;
                  }

                  return var3;
               }
            }

            try {
               var24 = new IndexOutOfBoundsException();
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label225;
            }
         }

         label195:
         try {
            throw var24;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label195;
         }
      }

      Throwable var25 = var10000;
      throw var25;
   }
}
