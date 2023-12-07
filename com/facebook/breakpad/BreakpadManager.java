package com.facebook.breakpad;

import X.06G;
import X.06i;
import X.0At;
import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;
import java.util.TreeMap;

public class BreakpadManager {
   public static volatile File mCrashDirectory;
   public static String mNativeLibraryName;

   public static native void addMappingInfo(String var0, byte[] var1, int var2, long var3, long var5, long var7);

   public static boolean containsKey(String param0) {
      // $FF: Couldn't be decompiled
   }

   public static native void crashProcessByAssert(String var0);

   public static native void crashThisProcess();

   public static native void crashThisProcessAsan();

   public static native void crashThisProcessGWPAsan();

   public static native boolean disableCoreDumpingImpl();

   public static boolean enableCoreDumping(Context var0) {
      if (mNativeLibraryName == null) {
         0At.A07("breakpad");
         mNativeLibraryName = "breakpad";
      }

      if (VERSION.SDK_INT < 24) {
         label51: {
            File var3 = new File("/proc/sys/kernel/core_pattern");
            File var1 = null;

            FileReader var2;
            try {
               var2 = new FileReader(var3);
            } catch (FileNotFoundException var7) {
               StringBuilder var8 = new StringBuilder();
               var8.append("Core pattern file not found or blocked by SELinux");
               var8.append(var7.getMessage());
               Log.w("BreakpadManager", var8.toString());
               break label51;
            }

            BufferedReader var10 = new BufferedReader(var2);

            File var9;
            label39: {
               try {
                  String var4 = var10.readLine();
                  var9 = new File(var4);
               } catch (IOException var6) {
                  Log.e("BreakpadManager", "There was a problem reading core pattern file", var6);
                  break label39;
               }

               var1 = var9;
            }

            try {
               var10.close();
            } catch (IOException var5) {
               Log.e("BreakpadManager", "There was a problem closing core pattern file", var5);
            }

            if (var1 != null) {
               var9 = var1.getParentFile();
               if (var1.isAbsolute() && var9 != null && !var9.canWrite()) {
                  return false;
               }
            }
         }
      }

      if (isCoreResourceHardUnlimited()) {
         return enableCoreDumpingImpl(var0.getApplicationInfo().dataDir);
      } else {
         return false;
      }
   }

   public static native boolean enableCoreDumpingImpl(String var0);

   public static File getCrashDirectory() {
      if (mCrashDirectory != null) {
         return mCrashDirectory;
      } else {
         throw new RuntimeException("Breakpad not installed");
      }
   }

   public static String getCustomData(String param0) {
      // $FF: Couldn't be decompiled
   }

   public static native long getMinidumpFlags();

   public static native void install(String var0, String var1, int var2, int var3);

   public static boolean isActive() {
      File var1 = mCrashDirectory;
      boolean var0 = false;
      if (var1 != null) {
         var0 = true;
      }

      return var0;
   }

   public static native boolean isCoreResourceHardUnlimited();

   public static native boolean isPrivacyModeEnabled();

   public static native boolean nativeContainsKey(String var0);

   public static native String nativeGetCustomData(String var0);

   public static native void nativeGetCustomDataSnapshot(TreeMap var0);

   public static native void nativeRemoveCustomData(String var0);

   public static native void nativeSetCustomData(String var0, String var1);

   public static native boolean nativeSetJvmStreamEnabled(boolean var0, boolean var1);

   public static void removeCustomData(String param0) {
      // $FF: Couldn't be decompiled
   }

   public static void setCustomData(String var0, String var1, Object... var2) {
      if (mCrashDirectory != null) {
         if ((getMinidumpFlags() & 32768L) != 32768L) {
            synchronized(BreakpadManager.class){}
            String var3 = var1;

            Throwable var10000;
            boolean var10001;
            label205: {
               label204: {
                  try {
                     if (var2.length <= 0) {
                        break label204;
                     }
                  } catch (Throwable var24) {
                     var10000 = var24;
                     var10001 = false;
                     break label205;
                  }

                  var3 = var1;
                  if (var1 != null) {
                     try {
                        StringBuilder var26 = new StringBuilder();
                        Formatter var4 = new Formatter(var26);
                        var4.format(var1, var2);
                        var4.close();
                        var3 = var26.toString();
                     } catch (Throwable var23) {
                        var10000 = var23;
                        var10001 = false;
                        break label205;
                     }
                  }
               }

               label197:
               try {
                  nativeSetCustomData(var0, var3);
                  return;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label197;
               }
            }

            while(true) {
               Throwable var25 = var10000;

               try {
                  throw var25;
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  continue;
               }
            }
         }
      } else {
         06i.A07("BreakpadManager", "Breakpad is not active (setCustomData).");
      }

   }

   public static void setJvmStreamEnabled(boolean var0) {
      synchronized(BreakpadManager.class){}

      label223: {
         Throwable var10000;
         label227: {
            boolean var10001;
            String var3;
            try {
               var3 = System.getProperty("java.vm.version");
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label227;
            }

            boolean var1;
            label218: {
               label217: {
                  if (var3 != null) {
                     try {
                        if (!var3.startsWith("1.") && !var3.startsWith("0.")) {
                           break label217;
                        }
                     } catch (Throwable var22) {
                        var10000 = var22;
                        var10001 = false;
                        break label227;
                     }
                  }

                  var1 = false;
                  break label218;
               }

               boolean var2 = true;
               var1 = var2;
               if (var0) {
                  try {
                     0At.A07("breakpad_cpp_helper");
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label227;
                  }

                  var1 = var2;
               }
            }

            label206:
            try {
               nativeSetJvmStreamEnabled(var1, var0);
               break label223;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label206;
            }
         }

         Throwable var24 = var10000;
         throw var24;
      }

   }

   public static native void setMinidumpFlags(long var0);

   public static native void setVersionInfo(int var0, String var1, String var2);

   public static native boolean simulateSignalDelivery(int var0, String var1);

   public static void start(Context var0) {
      start(var0, 0L, 1536000, (String)null);
   }

   public static void start(Context var0, long var1, int var3, String var4) {
      synchronized(BreakpadManager.class){}
      boolean var20 = false;
      if ((Long.MIN_VALUE & var1) != 0L) {
         var20 = true;
      }

      label152: {
         Throwable var10000;
         label151: {
            boolean var10001;
            label156: {
               try {
                  if (mNativeLibraryName != null) {
                     break label156;
                  }
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label151;
               }

               if (var20) {
                  var4 = "breakpad_static";
               } else {
                  var4 = "breakpad";
               }

               try {
                  0At.A07(var4);
                  mNativeLibraryName = var4;
               } catch (Throwable var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label151;
               }
            }

            label143:
            try {
               if (mCrashDirectory == null) {
                  var4 = var0.getApplicationInfo().dataDir;
                  File var18 = new File(var4);
                  File var21 = new File(var18, "app_minidumps");
                  var21.mkdirs();
                  install(var21.getAbsolutePath(), "", 1536000, VERSION.SDK_INT);
                  mCrashDirectory = var21;
                  setMinidumpFlags(var1 | getMinidumpFlags() | 2L | 4L);
                  var3 = 06G.A01();
                  String var19 = Build.FINGERPRINT;
                  setVersionInfo(var3, "384.0.0.8.114", var19);
                  setCustomData("Fingerprint", var19);
               }
               break label152;
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label143;
            }
         }

         Throwable var17 = var10000;
         throw var17;
      }

   }

   public static native void uninstall();
}
