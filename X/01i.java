package X;

import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class 01i {
   public static final long A00;
   public static final Method A01;
   public static final Method A02;
   public static volatile boolean A03;

   static {
      if (VERSION.SDK_INT >= 18) {
         05w var0 = 05w.A00();
         if (var0 != null) {
            A01 = var0.A01;
            A02 = var0.A02;
            A00 = var0.A00;
            A03 = true;
         }
      }

   }

   public static Object A00(Method var0, Object... var1) {
      try {
         return var0.invoke((Object)null, var1);
      } catch (IllegalAccessException var2) {
         A03 = false;
         return null;
      } catch (InvocationTargetException var3) {
         Throwable var4 = var3.getTargetException();
         if (!(var4 instanceof RuntimeException) && !(var4 instanceof Error)) {
            return null;
         } else {
            throw var4;
         }
      }
   }
}
