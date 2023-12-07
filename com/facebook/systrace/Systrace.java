package com.facebook.systrace;

import X.00z;
import X.013;
import X.01i;
import X.02E;
import X.052;
import X.08n;
import X.09x;
import android.os.Build.VERSION;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

public final class Systrace {
   public static long A00;
   public static final ThreadLocal A01;
   public static final AtomicInteger A02;
   public static final String[][] A03;

   static {
      if (01i.A03) {
         Method var0 = 01i.A02;
         08n.A00(var0);
         01i.A00(var0, true);
      }

      00z.A00(5);
      A02 = new AtomicInteger();
      A01 = new 013();
      String[] var1 = new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerEnd"};
      A03 = new String[][]{{"com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onActivate", "com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onDeactivate"}, var1, {"com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsEnd"}};
   }

   public static void A00(long var0) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(var0)) {
         TraceDirect.endSection();
      }

   }

   public static void A01(long var0, String var2) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(var0)) {
         TraceDirect.beginSection(var2);
      }

   }

   public static void A02(09x var0, String var1) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(281474976710656L)) {
         TraceDirect.traceInstant("", var1, var0.A00);
      }

   }

   public static void A03(String var0) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(1L)) {
         TraceDirect.traceCounter(var0, 1000);
      }

   }

   public static void A04(String var0, int var1) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(281474976710656L)) {
         TraceDirect.asyncTraceBegin(var0, var1, 0L);
      }

   }

   public static void A05(String var0, int var1) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(281474976710656L)) {
         TraceDirect.endAsyncFlow(var0, var1);
      }

   }

   public static void A06(String var0, int var1) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(281474976710656L)) {
         TraceDirect.asyncTraceEnd(var0, var1, 0L);
      }

   }

   public static void A07(String var0, int var1) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(281474976710656L)) {
         TraceDirect.startAsyncFlow(var0, var1);
      }

   }

   public static void A08(String var0, int var1) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(281474976710656L)) {
         TraceDirect.stepAsyncFlow(var0, var1);
      }

   }

   public static void A09(String var0, int var1, long var2) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(4L)) {
         TraceDirect.asyncTraceBegin(var0, var1, 052.A00(var2));
      }

   }

   public static void A0A(String var0, int var1, long var2) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(4L)) {
         TraceDirect.asyncTraceEnd(var0, var1, 052.A00(var2));
      }

   }

   public static void A0B(String var0, int var1, String var2) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(281474976710656L)) {
         TraceDirect.asyncTraceStageBegin(var0, var1, 0L, var2);
      }

   }

   public static void A0C(String var0, int var1, String var2) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(4L)) {
         TraceDirect.asyncTraceRename(var0, var2, var1);
      }

   }

   public static void A0D(String var0, int var1, String var2) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(64L)) {
         TraceDirect.traceMetadata(var0, var2, var1);
      }

   }

   public static void A0E(String var0, String var1, int var2, long var3, long var5) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(var3)) {
         TraceDirect.asyncTraceStageBegin(var0, var2, 052.A00(var5), var1);
      }

   }

   public static void A0F(String var0, String[] var1, int var2, long var3) {
      if (VERSION.SDK_INT >= 30) {
         02E.A00();
      }

      if (A0G(var3)) {
         TraceDirect.beginSectionWithArgs(var0, var1, var2);
      }

   }

   public static boolean A0G(long var0) {
      boolean var2;
      if ((var0 & 00z.A01) == 0L) {
         long var3 = A00;
         var2 = false;
         if ((var0 & var3) == 0L) {
            return var2;
         }
      }

      var2 = true;
      return var2;
   }
}
