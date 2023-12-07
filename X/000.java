package X;

import android.content.Context;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class 000 {
   public static 037 A00(07q var0) {
      079 var2 = var0.A08;
      Object var1 = var2;
      if (var2 == null) {
         var1 = new 0BF(var0, 5);
         var0.A08 = (079)var1;
      }

      return (037)((079)var1).get();
   }

   public static File A01(Context var0) {
      return new File(var0.getApplicationInfo().sourceDir);
   }

   public static File A02(Context var0, String var1) {
      File var2 = new File(new File(var0.getApplicationInfo().dataDir), var1);
      var2.mkdirs();
      return var2;
   }

   public static File A03(Context var0, String var1) {
      return new File(var0.getFilesDir(), var1);
   }

   public static File A04(File var0, String var1) {
      return new File(var0, var1);
   }

   public static IllegalArgumentException A05(String var0) {
      return new IllegalArgumentException(var0);
   }

   public static NullPointerException A06(String var0, boolean var1, boolean var2) {
      06i.A0J(var0, "sigquitDetected inFgV1: %b inFgV2: %b", var1, var2);
      return new NullPointerException("onSigquitTracesAvailable");
   }

   public static String A07(Object var0, String var1, StringBuilder var2) {
      var2.append(var1);
      var2.append(var0);
      return var2.toString();
   }

   public static String A08(String var0, String var1, StringBuilder var2) {
      var2.append(var0);
      var2.append(var1);
      return var2.toString();
   }

   public static String A09(String var0, StringBuilder var1) {
      var1.append(var0);
      return var1.toString();
   }

   public static String A0A(String var0, StringBuilder var1, int var2) {
      var1.append(var0);
      var1.append(var2);
      return var1.toString();
   }

   public static StringBuilder A0B() {
      return new StringBuilder();
   }

   public static StringBuilder A0C(String var0) {
      StringBuilder var1 = new StringBuilder();
      var1.append(var0);
      return var1;
   }

   public static Field A0D(Class var0, String var1) {
      Field var2 = var0.getDeclaredField(var1);
      var2.setAccessible(true);
      return var2;
   }

   public static ArrayList A0E() {
      return new ArrayList();
   }

   public static HashMap A0F() {
      return new HashMap();
   }

   public static void A0G(Object var0, Object var1, Object var2, Object[] var3) {
      var3[2] = var0;
      var3[3] = var1;
      var3[4] = var2;
   }

   public static void A0H(ReentrantReadWriteLock var0) {
      var0.readLock().unlock();
   }

   public static void A0I(Object[] var0, int var1, int var2) {
      var0[var2] = var1;
   }
}
