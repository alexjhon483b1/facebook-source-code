package com.facebook.soloader;

import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public final class SysUtil$LollipopSysdeps {
   public static void fallocateIfSupported(FileDescriptor var0, long var1) {
      try {
         Os.posix_fallocate(var0, 0L, var1);
      } catch (ErrnoException var3) {
         if (var3.errno != OsConstants.EOPNOTSUPP && var3.errno != OsConstants.ENOSYS && var3.errno != OsConstants.EINVAL) {
            throw new IOException(var3.toString(), var3);
         }
      }
   }

   public static String[] getSupportedAbis() {
      String[] var2 = Build.SUPPORTED_ABIS;
      TreeSet var5 = new TreeSet();
      int var0 = 0;

      try {
         if (is64Bit()) {
            var5.add("arm64-v8a");
            var5.add("x86_64");
         } else {
            var5.add("armeabi-v7a");
            var5.add("x86");
         }
      } catch (ErrnoException var6) {
         Log.e("SysUtil", String.format("Could not read /proc/self/exe. Falling back to default ABI list: %s. errno: %d Err msg: %s", Arrays.toString(var2), var6.errno, var6.getMessage()));
         String[] var3 = Build.SUPPORTED_ABIS;
         return var2;
      }

      ArrayList var7 = new ArrayList();

      for(int var1 = var2.length; var0 < var1; ++var0) {
         String var4 = var2[var0];
         if (var5.contains(var4)) {
            var7.add(var4);
         }
      }

      return (String[])var7.toArray(new String[var7.size()]);
   }

   public static boolean is64Bit() {
      return Os.readlink("/proc/self/exe").contains("64");
   }
}
