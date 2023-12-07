package com.facebook.xzdecoder;

import X.0B0;
import java.io.IOException;
import java.io.InputStream;

public class XzInputStream extends InputStream {
   public int clientOutPos;
   public byte[] inBuf;
   public InputStream inFile;
   public int inPos;
   public int inSize;
   public byte[] outBuf;
   public int outPos;
   public long state;

   static {
      0B0.A02("fb_xzdecoder");
      initializeLibrary();
   }

   public XzInputStream(InputStream var1) {
      this.inFile = var1;
      this.inBuf = new byte['耀'];
      this.outBuf = new byte['耀'];
      this.state = initializeState();
   }

   private void decodeMoreBytes() {
      long var3 = this.state;
      byte[] var6 = this.inBuf;
      int var1 = this.inPos;
      int var2 = this.inSize;
      byte[] var5 = this.outBuf;
      var3 = decompressStream(var3, var6, var1, var2, var5, 0, var5.length);
      this.inPos = (int)(var3 >>> 32);
      this.outPos = (int)var3;
      this.clientOutPos = 0;
   }

   public static native long decompressStream(long var0, byte[] var2, int var3, int var4, byte[] var5, int var6, int var7);

   public static native void end(long var0);

   public static native void initializeLibrary();

   public static native long initializeState();

   private boolean readMoreInput() {
      boolean var3 = false;
      this.inSize = 0;
      int var1 = 0;
      this.inPos = 0;

      int var2;
      do {
         InputStream var4 = this.inFile;
         byte[] var5 = this.inBuf;
         var1 = var4.read(var5, var1, var5.length - var1);
         if (var1 == -1) {
            if (this.inSize > 0) {
               var3 = true;
            }

            return var3;
         }

         var2 = this.inSize + var1;
         this.inSize = var2;
         var1 = var2;
      } while(var2 < 32768);

      return true;
   }

   public void close() {
      this.inFile.close();
      long var1 = this.state;
      if (var1 != 0L) {
         end(var1);
         this.state = 0L;
      }

   }

   public int read() {
      if (this.state != 0L) {
         if (this.clientOutPos == this.outPos) {
            if (this.inPos == this.inSize && !this.readMoreInput()) {
               return -1;
            }

            this.decodeMoreBytes();
         }

         byte[] var2 = this.outBuf;
         int var1 = this.clientOutPos++;
         return var2[var1];
      } else {
         throw new IOException("Stream closed");
      }
   }

   public int read(byte[] var1, int var2, int var3) {
      byte var6 = 0;
      if (var3 >= 0 && var2 >= 0 && var2 + var3 <= var1.length) {
         if (this.state == 0L) {
            throw new IOException("Stream closed");
         } else {
            int var5 = var3;
            int var4 = var2;
            var2 = var6;

            int var8;
            while(true) {
               var8 = var2;
               if (var2 >= var3) {
                  break;
               }

               int var7 = this.clientOutPos;
               var8 = this.outPos;
               if (var7 < var8) {
                  var8 = Math.min(var5, var8 - var7);
                  System.arraycopy(this.outBuf, var7, var1, var4, var8);
                  this.clientOutPos += var8;
                  var5 -= var8;
                  var4 += var8;
                  var2 += var8;
               } else {
                  if (this.inPos == this.inSize && !this.readMoreInput()) {
                     var8 = var2;
                     if (var2 == 0) {
                        var8 = -1;
                     }
                     break;
                  }

                  this.decodeMoreBytes();
               }
            }

            return var8;
         }
      } else {
         throw new IndexOutOfBoundsException(String.format("buf.length = %d, off = %d, len = %d", var1.length, var2, var3));
      }
   }
}
