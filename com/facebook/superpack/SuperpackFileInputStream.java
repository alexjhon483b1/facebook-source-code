package com.facebook.superpack;

import X.06i;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class SuperpackFileInputStream extends InputStream {
   public static final boolean $assertionsDisabled = false;
   public Boolean mCloseWhenInputStreamIsClosed;
   public int mLength;
   public int mMarked;
   public int mOffset;
   public byte[] mOneByte;
   public final SuperpackFile mSuperpackFile;

   public SuperpackFileInputStream(SuperpackFile var1) {
      this.mSuperpackFile = var1;
      this.mOffset = 0;
      synchronized(var1){}

      int var2;
      try {
         if (var1.mPtr == 0L) {
            IllegalStateException var3 = new IllegalStateException();
            throw var3;
         }

         var2 = var1.mLength;
      } finally {
         ;
      }

      this.mLength = var2;
      this.mMarked = 0;
      this.mOneByte = null;
      this.mCloseWhenInputStreamIsClosed = false;
   }

   public SuperpackFileInputStream(SuperpackFile var1, Boolean var2) {
      this(var1);
      this.mCloseWhenInputStreamIsClosed = var2;
   }

   public static SuperpackFileInputStream createFromSingletonArchive(SuperpackArchive var0, String var1) {
      if (var0.hasNext()) {
         SuperpackFile var2 = var0.next();
         if (!var0.hasNext()) {
            return new SuperpackFileInputStream(var2, true);
         } else {
            throw new IllegalArgumentException();
         }
      } else {
         throw new IllegalArgumentException();
      }
   }

   public static SuperpackFileInputStream createFromSingletonArchiveFile(File var0, String var1) {
      int var2;
      if (var1.equals("spo")) {
         var2 = Runtime.getRuntime().availableProcessors();
      } else {
         var2 = 1;
      }

      return createFromSingletonArchiveFile(var0, var1, var2);
   }

   public static SuperpackFileInputStream createFromSingletonArchiveFile(File var0, String var1, int var2) {
      long var3;
      if (!var1.matches("spo")) {
         var3 = 0L;
      } else {
         var3 = SuperpackArchive.getThreadNumOption(var2);
      }

      Throwable var32;
      boolean var10001;
      SuperpackArchive var5;
      try {
         var3 = SuperpackArchive.readNative(var0.getPath(), var1, var3);
         var5 = new SuperpackArchive(var3, (String[])null);
      } catch (RuntimeException var31) {
         06i.A09("SuperpackArchive", "Failed to read superpack file, retrying.", var31);
         FileInputStream var6 = new FileInputStream(var0);

         try {
            var5 = new SuperpackArchive(SuperpackArchive.readNative((InputStream)var6, var1, 0L), (String[])null);
         } catch (Throwable var30) {
            var32 = var30;

            try {
               var6.close();
            } catch (Throwable var29) {
               var10001 = false;
               throw var32;
            }

            var32 = var30;
            throw var32;
         }

         var6.close();
      }

      SuperpackFileInputStream var33;
      try {
         var33 = createFromSingletonArchive(var5, var1);
      } catch (Throwable var28) {
         var32 = var28;

         try {
            var5.close();
         } catch (Throwable var27) {
            var10001 = false;
            throw var32;
         }

         throw var28;
      }

      var5.close();
      return var33;
   }

   public static SuperpackFileInputStream createFromSingletonArchiveInputStream(InputStream var0, String var1) {
      int var2;
      if (var1.equals("spo")) {
         var2 = Runtime.getRuntime().availableProcessors();
      } else {
         var2 = 1;
      }

      return createFromSingletonArchiveInputStream(var0, var1, var2);
   }

   public static SuperpackFileInputStream createFromSingletonArchiveInputStream(InputStream var0, String var1, int var2) {
      long var3;
      if (!var1.matches("spo")) {
         var3 = 0L;
      } else {
         var3 = SuperpackArchive.getThreadNumOption(var2);
      }

      SuperpackArchive var12 = new SuperpackArchive(SuperpackArchive.readNative(var0, var1, var3), (String[])null);
      boolean var9 = false;

      SuperpackFileInputStream var13;
      try {
         var9 = true;
         var13 = createFromSingletonArchive(var12, var1);
         var9 = false;
      } finally {
         if (var9) {
            label68:
            try {
               var12.close();
            } finally {
               break label68;
            }

         }
      }

      var12.close();
      return var13;
   }

   public static int getDefaultThreadNum(String var0) {
      return var0.equals("spo") ? Runtime.getRuntime().availableProcessors() : 1;
   }

   public static InputStream wrapAndClose(SuperpackFile var0) {
      return new SuperpackFileInputStream(var0, true);
   }

   public int available() {
      synchronized(this){}

      int var1;
      int var2;
      try {
         var1 = this.mLength;
         var2 = this.mOffset;
      } finally {
         ;
      }

      return var1 - var2;
   }

   public void close() {
      if (this.mCloseWhenInputStreamIsClosed) {
         this.mSuperpackFile.close();
      }

   }

   public void mark(int var1) {
      synchronized(this){}

      try {
         this.mMarked = this.mOffset;
      } finally {
         ;
      }

   }

   public boolean markSupported() {
      return true;
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

   public int read(byte[] param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public void reset() {
      synchronized(this){}

      try {
         this.mOffset = this.mMarked;
      } finally {
         ;
      }

   }

   public long skip(long var1) {
      synchronized(this){}
      if (var1 < 0L) {
         return 0L;
      } else {
         Throwable var10000;
         label150: {
            boolean var10001;
            int var4;
            try {
               var4 = this.mOffset;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label150;
            }

            long var7 = (long)var4;

            int var3;
            try {
               var3 = this.mLength;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label150;
            }

            long var5 = var1;
            if (var7 + var1 > (long)var3) {
               var5 = (long)(var3 - var4);
            }

            label134:
            try {
               this.mOffset = (int)(var7 + var5);
               return var5;
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label134;
            }
         }

         Throwable var9 = var10000;
         throw var9;
      }
   }
}
