package X;

import android.os.Trace;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class 05w {
   public final long A00;
   public final Method A01;
   public final Method A02;

   public _5w/* $FF was: 05w*/(Method var1, Method var2, long var3) {
      this.A01 = var1;
      this.A02 = var2;
      this.A00 = var3;
   }

   public static 05w A00() {
      try {
         Method var2 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
         Method var1 = Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE);
         Field var0 = Trace.class.getField("TRACE_TAG_APP");
         return var0.getType() != Long.TYPE ? null : new 05w(var2, var1, var0.getLong((Object)null));
      } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException var3) {
         return null;
      }
   }
}
