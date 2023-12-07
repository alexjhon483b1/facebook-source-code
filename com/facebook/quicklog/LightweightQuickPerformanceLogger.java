package com.facebook.quicklog;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public interface LightweightQuickPerformanceLogger {
   long currentMonotonicTimestamp();

   long currentMonotonicTimestampNanos();

   boolean isMarkerOn(int var1, int var2, boolean var3);

   boolean isMarkerOn(int var1, boolean var2);

   EventBuilder markEventBuilder(int var1, int var2, String var3);

   EventBuilder markEventBuilder(int var1, String var2);

   void markerAnnotate(int var1, int var2, String var3, double var4);

   void markerAnnotate(int var1, int var2, String var3, int var4);

   void markerAnnotate(int var1, int var2, String var3, long var4);

   void markerAnnotate(int var1, int var2, String var3, String var4);

   void markerAnnotate(int var1, int var2, String var3, boolean var4);

   void markerAnnotate(int var1, int var2, String var3, double[] var4);

   void markerAnnotate(int var1, int var2, String var3, int[] var4);

   void markerAnnotate(int var1, int var2, String var3, long[] var4);

   void markerAnnotate(int var1, int var2, String var3, String[] var4);

   void markerAnnotate(int var1, int var2, String var3, boolean[] var4);

   void markerAnnotate(int var1, String var2, double var3);

   void markerAnnotate(int var1, String var2, int var3);

   void markerAnnotate(int var1, String var2, long var3);

   void markerAnnotate(int var1, String var2, String var3);

   void markerAnnotate(int var1, String var2, boolean var3);

   void markerAnnotate(int var1, String var2, double[] var3);

   void markerAnnotate(int var1, String var2, int[] var3);

   void markerAnnotate(int var1, String var2, long[] var3);

   void markerAnnotate(int var1, String var2, String[] var3);

   void markerAnnotate(int var1, String var2, boolean[] var3);

   void markerAnnotateCrucialForUserFlow(int var1, int var2, String var3, int var4);

   void markerAnnotateCrucialForUserFlow(int var1, int var2, String var3, String var4);

   void markerDrop(int var1);

   void markerDrop(int var1, int var2);

   void markerDropForUserFlow(int var1, int var2);

   void markerEnd(int var1, int var2, short var3);

   void markerEnd(int var1, int var2, short var3, long var4, TimeUnit var6);

   void markerEnd(int var1, short var2);

   void markerEnd(int var1, short var2, long var3, TimeUnit var5);

   void markerEndAtPointForUserFlow(int var1, int var2, short var3, String var4);

   void markerEndForUserFlow(int var1, int var2, short var3);

   void markerEndForUserFlow(int var1, String var2, int var3, short var4);

   void markerGenerateWithAnnotations(int var1, short var2, long var3, TimeUnit var5, Map var6);

   void markerLinkPivot(int var1, int var2, String var3);

   void markerPoint(int var1, int var2, String var3);

   void markerPoint(int var1, int var2, String var3, long var4, TimeUnit var6);

   void markerPoint(int var1, int var2, String var3, String var4);

   void markerPoint(int var1, int var2, String var3, String var4, long var5, TimeUnit var7);

   void markerPoint(int var1, int var2, String var3, String var4, long var5, TimeUnit var7, int var8);

   void markerPoint(int var1, String var2);

   void markerPoint(int var1, String var2, long var3, TimeUnit var5);

   void markerPoint(int var1, String var2, String var3);

   void markerPoint(int var1, String var2, String var3, long var4, TimeUnit var6);

   void markerStart(int var1);

   void markerStart(int var1, int var2);

   void markerStart(int var1, int var2, long var3, TimeUnit var5);

   void markerStart(int var1, int var2, long var3, TimeUnit var5, int var6);

   void markerStart(int var1, int var2, String var3, String var4);

   void markerStart(int var1, int var2, String var3, String var4, long var5, TimeUnit var7);

   void markerStart(int var1, String var2, String var3);

   void markerStartForUserFlow(int var1, int var2, long var3, TimeUnit var5, boolean var6);

   void markerStartForUserFlow(int var1, int var2, String var3, boolean var4, long var5);

   void markerStartForUserFlow(int var1, int var2, boolean var3, long var4);

   void markerStartForUserFlowE2E(int var1, int var2, long var3, TimeUnit var5, String var6, boolean var7);

   void markerStartWithCancelPolicy(int var1, boolean var2, int var3, long var4, TimeUnit var6);

   @Deprecated
   void markerTag(int var1, int var2, String var3);

   @Deprecated
   void markerTag(int var1, String var2);

   MarkerEditor withMarker(int var1);

   MarkerEditor withMarker(int var1, int var2);
}
