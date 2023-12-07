package X;

import android.os.Trace;
import android.os.Build.VERSION;
import java.lang.reflect.Method;

@Deprecated
public final class 04q {
   public static Method A00;
   public static Method A01;
   public static Method A02;
   public static Method A03;

   static {
      int var0 = VERSION.SDK_INT;
      if (var0 >= 18 && var0 < 29) {
         try {
            Trace.class.getField("TRACE_TAG_APP").getLong((Object)null);
            Class var1 = Long.TYPE;
            A02 = Trace.class.getMethod("isTagEnabled", var1);
            A00 = Trace.class.getMethod("asyncTraceBegin", var1, String.class, Integer.TYPE);
            Class var2 = Long.TYPE;
            var2 = Integer.TYPE;
            A01 = Trace.class.getMethod("asyncTraceEnd", var1, String.class, var2);
            A03 = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, var2);
         } catch (Exception var3) {
         }
      }

   }

   public static void A00() {
      if (VERSION.SDK_INT >= 18) {
         04p.A00();
      }

   }

   public static void A01(String var0) {
      if (VERSION.SDK_INT >= 18) {
         04p.A01(var0);
      }

   }
}
