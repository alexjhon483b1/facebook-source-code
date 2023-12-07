package com.facebook.superpack;

import android.content.res.AssetManager;
import java.io.InputStream;

public class AssetDecompressor {
   public static native String[] decompress(AssetManager var0, String var1, String var2, String var3);

   public static native String[] decompress_legacy(InputStream var0, String var1, String var2);

   public static native int get_architecture();

   public static native int sync_file_to_disk(String var0);

   public static native void testDecompressorLibraryUsable(byte[] var0);
}
