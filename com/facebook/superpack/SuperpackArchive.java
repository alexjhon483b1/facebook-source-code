package com.facebook.superpack;

import X.0At;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SuperpackArchive implements Iterator, Closeable {
   public static final String TAG;
   public int mDecompressedFiles = 0;
   public long mPtr;

   static {
      0At.A07("superpack-jni");
      TAG = "SuperpackArchive";
   }

   public SuperpackArchive(long var1, String[] var3) {
      if (var1 != 0L) {
         this.mPtr = var1;
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static native void appendAnonNative(long var0, long var2);

   public static native void appendNative(long var0, long var2);

   public static native void closeNative(long var0);

   public static native long createNative();

   public static native long extractNextNative(long var0, String[] var2);

   public static native long getThreadNumOption(int var0);

   public static native boolean isEmptyNative(long var0);

   public static native long[] nextMemfdNative(long var0, String var2);

   public static native long nextNative(long var0);

   public static native long readNative(InputStream var0, String var1, long var2);

   public static native long readNative(String var0, String var1, long var2);

   public static native void setPackingOptionsNative(long var0, boolean var2, boolean var3);

   public static native void setStorageNative(long var0, String var2, int var3);

   public static native void writeNative(long var0, OutputStream var2);

   public void close() {
      synchronized(this){}

      Throwable var10000;
      label105: {
         long var1;
         boolean var10001;
         try {
            var1 = this.mPtr;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label105;
         }

         if (var1 != 0L) {
            label99: {
               try {
                  closeNative(var1);
                  this.mPtr = 0L;
               } catch (Throwable var13) {
                  var10000 = var13;
                  var10001 = false;
                  break label99;
               }

               return;
            }
         } else {
            label101:
            try {
               IllegalStateException var16 = new IllegalStateException();
               throw var16;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label101;
            }
         }
      }

      Throwable var3 = var10000;
      throw var3;
   }

   public void finalize() {
      long var1 = this.mPtr;
      if (var1 != 0L) {
         closeNative(var1);
         this.mPtr = 0L;
         throw new IllegalStateException();
      }
   }

   public boolean hasNext() {
      synchronized(this){}

      Throwable var10000;
      label105: {
         long var1;
         boolean var10001;
         try {
            var1 = this.mPtr;
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label105;
         }

         if (var1 != 0L) {
            label99: {
               boolean var3;
               try {
                  var3 = isEmptyNative(var1);
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break label99;
               }

               return var3 ^ true;
            }
         } else {
            label101:
            try {
               IllegalStateException var17 = new IllegalStateException();
               throw var17;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label101;
            }
         }
      }

      Throwable var4 = var10000;
      throw var4;
   }

   public SuperpackFile next() {
      synchronized(this){}

      Throwable var10000;
      label321: {
         long var1;
         boolean var10001;
         try {
            var1 = this.mPtr;
         } catch (Throwable var45) {
            var10000 = var45;
            var10001 = false;
            break label321;
         }

         Object var3;
         if (var1 != 0L) {
            try {
               var1 = nextNative(var1);
            } catch (Throwable var44) {
               var10000 = var44;
               var10001 = false;
               break label321;
            }

            if (var1 != 0L) {
               SuperpackFile var46;
               try {
                  ++this.mDecompressedFiles;
                  var46 = new SuperpackFile(var1, -1);
               } catch (Throwable var40) {
                  var10000 = var40;
                  var10001 = false;
                  break label321;
               }

               return var46;
            }

            try {
               var3 = new NoSuchElementException();
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label321;
            }
         } else {
            try {
               var3 = new IllegalStateException();
            } catch (Throwable var42) {
               var10000 = var42;
               var10001 = false;
               break label321;
            }
         }

         label304:
         try {
            throw var3;
         } catch (Throwable var41) {
            var10000 = var41;
            var10001 = false;
            break label304;
         }
      }

      Throwable var47 = var10000;
      throw var47;
   }
}
