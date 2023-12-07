package com.facebook.systrace;

import X.00x;
import X.05D;
import X.05v;
import X.06q;
import X.0B0;
import X.0B1;
import android.os.Process;
import android.util.Log;

public class TraceDirect {
   public static final String TAG = "TraceDirect";
   public static final boolean sForceJavaImpl = "true".equals(05v.A02("debug.fbsystrace.force_java"));
   public static volatile 00x sNativeAvailable;
   public static volatile int sPrevSoLoaderSourcesVersion;
   public static final boolean sTraceLoad = "true".equals(05v.A02("debug.fbsystrace.trace_load"));

   static {
      sNativeAvailable = 00x.A02;
   }

   public static void asyncTraceBegin(String var0, int var1, long var2) {
      if (checkNative()) {
         nativeAsyncTraceBegin(var0, var1, var2);
      } else {
         05D var4 = new 05D('S');
         var4.A00(Process.myPid());
         var4.A02(var0);
         var4.A01("<0>");
         if (var2 != 0L) {
            var4.A01("<T");
            var4.A01(Long.toString(var2));
            var4.A01(">");
         }

         var4.A00(var1);
         06q.A00(var4.A00.toString());
      }
   }

   public static void asyncTraceCancel(String var0, int var1) {
      if (checkNative()) {
         nativeAsyncTraceCancel(var0, var1);
      } else {
         05D var2 = new 05D('F');
         var2.A00(Process.myPid());
         var2.A02(var0);
         var2.A01("<X>");
         var2.A00(var1);
         06q.A00(var2.A00.toString());
      }
   }

   public static void asyncTraceEnd(String var0, int var1, long var2) {
      if (checkNative()) {
         nativeAsyncTraceEnd(var0, var1, var2);
      } else {
         05D var4 = new 05D('F');
         var4.A00(Process.myPid());
         var4.A02(var0);
         if (var2 != 0L) {
            var4.A01("<T");
            var4.A01(Long.toString(var2));
            var4.A01(">");
         }

         var4.A00(var1);
         06q.A00(var4.A00.toString());
      }
   }

   public static void asyncTraceRename(String var0, String var1, int var2) {
      if (checkNative()) {
         nativeAsyncTraceRename(var0, var1, var2);
      } else {
         05D var3 = new 05D('F');
         var3.A00(Process.myPid());
         var3.A02(var0);
         var3.A01("<M>");
         var3.A00(var2);
         var3.A02(var1);
         06q.A00(var3.A00.toString());
      }
   }

   public static void asyncTraceStageBegin(String var0, int var1, long var2, String var4) {
      if (checkNative()) {
         nativeAsyncTraceStageBegin(var0, var1, var2, var4);
      } else {
         05D var5 = new 05D('T');
         var5.A00(Process.myPid());
         var5.A02(var0);
         if (var2 != 0L) {
            var5.A01("<T");
            var5.A01(Long.toString(var2));
            var5.A01(">");
         }

         var5.A00(var1);
         var5.A02(var4);
         06q.A00(var5.A00.toString());
      }
   }

   public static void beginSection(String var0) {
      if (checkNative()) {
         nativeBeginSection(var0);
      } else {
         05D var1 = new 05D('B');
         var1.A00(Process.myPid());
         var1.A02(var0);
         06q.A00(var1.A00.toString());
      }
   }

   public static void beginSectionWithArgs(String var0, String[] var1, int var2) {
      if (checkNative()) {
         nativeBeginSectionWithArgs(var0, var1, var2);
      } else {
         05D var3 = new 05D('B');
         var3.A00(Process.myPid());
         var3.A02(var0);
         var3.A03(var1, var2);
         06q.A00(var3.A00.toString());
      }
   }

   public static boolean checkNative() {
      00x var2 = sNativeAvailable;
      00x var3 = 00x.A02;
      boolean var1 = true;
      if (var2 == var3) {
         if (sForceJavaImpl) {
            sNativeAvailable = 00x.A01;
         } else {
            int var0;
            if (0B0.A01()) {
               label328: {
                  synchronized(0B0.class){}

                  Throwable var10000;
                  boolean var10001;
                  label318: {
                     0B1 var29;
                     try {
                        var29 = 0B0.A00;
                     } catch (Throwable var28) {
                        var10000 = var28;
                        var10001 = false;
                        break label318;
                     }

                     if (var29 != null) {
                        label314: {
                           try {
                              ;
                           } catch (Throwable var27) {
                              var10000 = var27;
                              var10001 = false;
                              break label314;
                           }

                           var0 = var29.AER();
                           break label328;
                        }
                     } else {
                        label304:
                        try {
                           IllegalStateException var31 = new IllegalStateException("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
                           throw var31;
                        } catch (Throwable var26) {
                           var10000 = var26;
                           var10001 = false;
                           break label304;
                        }
                     }
                  }

                  while(true) {
                     Throwable var30 = var10000;

                     try {
                        throw var30;
                     } catch (Throwable var25) {
                        var10000 = var25;
                        var10001 = false;
                        continue;
                     }
                  }
               }
            } else {
               var0 = -1;
            }

            if (var0 != sPrevSoLoaderSourcesVersion) {
               sPrevSoLoaderSourcesVersion = var0;
               String.format("Attempting to load fbsystrace.so [%d|%d].", sPrevSoLoaderSourcesVersion, var0);

               try {
                  0B0.A02("fbsystrace");
                  nativeSetEnabledTags(05v.A00("debug.fbsystrace.tags"));
                  nativeBeginSection("fbsystrace.so loaded");
                  nativeEndSection();
                  sNativeAvailable = 00x.A03;
               } catch (UnsatisfiedLinkError var24) {
                  Log.w(TAG, "fbsystrace.so could not be loaded - switching to Java implementation.");
               }
            }
         }
      }

      if (sNativeAvailable != 00x.A03) {
         var1 = false;
      }

      return var1;
   }

   public static void endAsyncFlow(String var0, int var1) {
      if (checkNative()) {
         nativeEndAsyncFlow(var0, var1);
      } else {
         05D var2 = new 05D('f');
         var2.A00(Process.myPid());
         var2.A02(var0);
         var2.A00(var1);
         06q.A00(var2.A00.toString());
      }
   }

   public static void endSection() {
      if (checkNative()) {
         nativeEndSection();
      } else {
         06q.A00("E");
      }
   }

   public static void endSectionWithArgs(String[] var0, int var1) {
      if (checkNative()) {
         nativeEndSectionWithArgs(var0, var1);
      } else {
         05D var3 = new 05D('E');
         StringBuilder var2 = var3.A00;
         var2.append('|');
         var2.append('|');
         var3.A03(var0, var1);
         06q.A00(var2.toString());
      }
   }

   public static native void nativeAsyncTraceBegin(String var0, int var1, long var2);

   public static native void nativeAsyncTraceCancel(String var0, int var1);

   public static native void nativeAsyncTraceEnd(String var0, int var1, long var2);

   public static native void nativeAsyncTraceRename(String var0, String var1, int var2);

   public static native void nativeAsyncTraceStageBegin(String var0, int var1, long var2, String var4);

   public static native void nativeBeginSection(String var0);

   public static native void nativeBeginSectionWithArgs(String var0, String[] var1, int var2);

   public static native void nativeEndAsyncFlow(String var0, int var1);

   public static native void nativeEndSection();

   public static native void nativeEndSectionWithArgs(String[] var0, int var1);

   public static native void nativeSetEnabledTags(long var0);

   public static native void nativeStartAsyncFlow(String var0, int var1);

   public static native void nativeStepAsyncFlow(String var0, int var1);

   public static native void nativeTraceCounter(String var0, int var1);

   public static native void nativeTraceInstant(String var0, String var1, char var2);

   public static native void nativeTraceMetadata(String var0, String var1, int var2);

   public static void setEnabledTags(long var0) {
      if (checkNative()) {
         nativeSetEnabledTags(var0);
      }

   }

   public static void startAsyncFlow(String var0, int var1) {
      if (checkNative()) {
         nativeStartAsyncFlow(var0, var1);
      } else {
         05D var2 = new 05D('s');
         var2.A00(Process.myPid());
         var2.A02(var0);
         var2.A00(var1);
         06q.A00(var2.A00.toString());
      }
   }

   public static void stepAsyncFlow(String var0, int var1) {
      if (checkNative()) {
         nativeStepAsyncFlow(var0, var1);
      } else {
         05D var2 = new 05D('t');
         var2.A00(Process.myPid());
         var2.A02(var0);
         var2.A00(var1);
         06q.A00(var2.A00.toString());
      }
   }

   public static void traceCounter(String var0, int var1) {
      if (checkNative()) {
         nativeTraceCounter(var0, var1);
      } else {
         05D var2 = new 05D('C');
         var2.A00(Process.myPid());
         var2.A02(var0);
         var2.A00(var1);
         06q.A00(var2.A00.toString());
      }
   }

   public static void traceInstant(String var0, String var1, char var2) {
      if (checkNative()) {
         nativeTraceInstant(var0, var1, var2);
      } else {
         05D var3 = new 05D('I');
         var3.A00(Process.myPid());
         var3.A02(var1);
         StringBuilder var4 = var3.A00;
         var4.append('|');
         if (var2 == 0 || var2 == '\r' || var2 == ';' || var2 == '|' || var2 == '\t' || var2 == '\n') {
            var2 = ' ';
         }

         var4.append(var2);
         var3.A02(var0);
         06q.A00(var4.toString());
      }
   }

   public static void traceMetadata(String var0, String var1, int var2) {
      if (checkNative()) {
         nativeTraceMetadata(var0, var1, var2);
      } else {
         05D var3 = new 05D('M');
         var3.A00(Process.myPid());
         var3.A02(var0);
         var3.A00(var2);
         var3.A02(var1);
         06q.A00(var3.A00.toString());
      }
   }
}
