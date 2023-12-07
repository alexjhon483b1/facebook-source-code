package com.facebook.superpack;

import X.0At;
import java.io.Closeable;

public class OpenboxArchive implements Closeable {
   static {
      0At.A07("superpack-jni");
   }

   public static native void closeNative(long var0);

   public static native int getFileCountNative(long var0);

   public static native long getFilePtrNative(long var0, int var2);

   public static native long getFileSizeNative(long var0, int var2);

   public static native long openNative(int var0, long var1, long var3);

   public void close() {
   }
}
