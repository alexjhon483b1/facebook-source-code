package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class 05v {
   public static final Method A00;
   public static final Method A01;
   public static final Method A02;
   public static final Method A03;
   public static final Method A04;
   public static final Method A05;
   public static volatile boolean A06;

   static {
      05u var1 = 05u.A00();
      boolean var0;
      if (var1 != null) {
         A00 = var1.A00;
         A02 = var1.A02;
         A01 = var1.A01;
         A03 = var1.A03;
         A04 = var1.A04;
         A05 = var1.A05;
         var0 = true;
      } else {
         var0 = false;
      }

      A06 = var0;
   }

   public static long A00(String var0) {
      long var3 = 0L;
      long var1 = var3;
      if (A06) {
         Number var5 = (Number)A01(A04, var0, 0L);
         var1 = var3;
         if (var5 != null) {
            var1 = var5.longValue();
         }
      }

      return var1;
   }

   public static Object A01(Method var0, Object... var1) {
      if (var0 != null) {
         try {
            return var0.invoke((Object)null, var1);
         } catch (IllegalAccessException var2) {
            A06 = false;
         } catch (InvocationTargetException var3) {
            Throwable var4 = var3.getTargetException();
            if (!(var4 instanceof RuntimeException) && !(var4 instanceof Error)) {
               return null;
            }

            throw var4;
         }
      }

      return null;
   }

   public static String A02(String var0) {
      if (A06) {
         var0 = (String)A01(A02, var0);
         if (var0 != null) {
            return var0;
         }
      }

      return "";
   }
}
