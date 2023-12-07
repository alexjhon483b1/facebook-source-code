package X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

public final class 01c {
   public static void A00(Handler var0) {
      Looper var1 = Looper.myLooper();
      if (var1 != var0.getLooper()) {
         String var4;
         if (var1 != null) {
            var4 = var1.getThread().getName();
         } else {
            var4 = "null current looper";
         }

         String var3 = var0.getLooper().getThread().getName();
         StringBuilder var2 = new StringBuilder();
         var2.append("Must be called on ");
         var2.append(var3);
         var2.append(" thread, but got ");
         var2.append(var4);
         var2.append(".");
         throw new IllegalStateException(var2.toString());
      }
   }

   public static void A01(Object var0) {
      if (var0 == null) {
         throw new NullPointerException("null reference");
      }
   }

   public static void A02(Object var0, Object var1) {
      if (var0 == null) {
         throw new NullPointerException(String.valueOf(var1));
      }
   }

   public static void A03(Object var0, boolean var1) {
      if (!var1) {
         throw new IllegalArgumentException(String.valueOf(var0));
      }
   }

   public static void A04(Object var0, boolean var1) {
      if (!var1) {
         throw new IllegalStateException(String.valueOf(var0));
      }
   }

   public static void A05(String var0) {
      if (TextUtils.isEmpty(var0)) {
         throw new IllegalArgumentException("Given String is empty or null");
      }
   }

   public static void A06(String var0) {
      if (Looper.getMainLooper() == Looper.myLooper()) {
         throw new IllegalStateException(var0);
      }
   }

   public static void A07(String var0, Object var1) {
      if (TextUtils.isEmpty(var0)) {
         throw new IllegalArgumentException(String.valueOf(var1));
      }
   }
}
