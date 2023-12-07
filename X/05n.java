package X;

import android.os.Process;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class 05n implements 06f {
   public static volatile Method A00;
   public static volatile boolean A01;
   public static volatile Method A02;
   public static volatile Method A03;
   public static volatile boolean A04;
   public static volatile boolean A05;

   public static 05n A00() {
      if (VERSION.SDK_INT <= 25) {
         if (!A01) {
            Class var0 = Integer.TYPE;
            A00 = A04("parseProcLine", byte[].class, var0, var0, int[].class, String[].class, long[].class, float[].class);
            A01 = true;
         }

         if (A00 != null && A02() != null && A03() != null) {
            return new 05n();
         }
      }

      return null;
   }

   public static Object A01(Method var0, Object... var1) {
      if (var0 != null) {
         try {
            return var0.invoke((Object)null, var1);
         } catch (IllegalAccessException var2) {
            if (Log.isLoggable("OldProcReader", 6)) {
               StringBuilder var4 = new StringBuilder("Error (IllegalAccessException - ");
               Log.e("OldProcReader", 000.A08(var2.getLocalizedMessage(), ")", var4), var2);
            }
         } catch (InvocationTargetException var3) {
            if (Log.isLoggable("OldProcReader", 6)) {
               StringBuilder var5 = new StringBuilder("Error (InvocationTargetException - ");
               Log.e("OldProcReader", 000.A08(var3.getLocalizedMessage(), ")", var5), var3);
            }
         }
      }

      return Boolean.FALSE;
   }

   public static Method A02() {
      if (!A04) {
         A02 = A04("readProcFile", String.class, int[].class, String[].class, long[].class, float[].class);
         A04 = true;
      }

      return A02;
   }

   public static Method A03() {
      if (!A05) {
         A03 = A04("readProcLines", String.class, String[].class, long[].class);
         A05 = true;
      }

      return A03;
   }

   public static Method A04(String var0, Class... var1) {
      try {
         return Process.class.getMethod(var0, var1);
      } catch (NoSuchMethodException var2) {
         if (Log.isLoggable("OldProcReader", 5)) {
            Log.w("OldProcReader", 000.A09(var0, new StringBuilder("Warning! Could not get access to JNI method - ")), var2);
         }

         return null;
      }
   }

   public final int AWW(String var1, float[] var2, int[] var3, long[] var4, String[] var5) {
      Method var9 = A02();
      Object[] var7 = new Object[5];
      byte var6 = 0;
      var7[0] = var1;
      var7[1] = var3;
      000.A0G(var5, var4, (Object)null, var7);
      Object var8 = A01(var9, var7);
      if (var8 == null) {
         return 2;
      } else {
         if (!(Boolean)var8) {
            var6 = 3;
         }

         return var6;
      }
   }

   public final boolean AWX(String var1, long[] var2, String[] var3) {
      Object var4 = A01(A03(), var1, var3, var2);
      return Boolean.FALSE.equals(var4) ^ true;
   }
}
