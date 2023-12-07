package X;

import android.content.Context;
import android.os.SystemClock;
import dalvik.system.DexFile;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public final class 01l {
   public static Long A00;

   public static void A00(Context var0, boolean var1) {
      08C var8 = 08C.A00(var0);
      ArrayList var5 = new ArrayList();
      DexFile[] var4 = var8.A04;
      int var3 = var4.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         DexFile var6 = var4[var2];
         if (var6 != null) {
            Enumeration var11 = var6.entries();

            while(var11.hasMoreElements()) {
               var5.add(var11.nextElement());
            }
         }
      }

      Iterator var9 = var5.iterator();

      while(var9.hasNext()) {
         String var10 = (String)var9.next();

         try {
            Class.forName(var10, var1, var8);
         } catch (ClassNotFoundException var7) {
         }
      }

   }

   public static void A01(Context var0, boolean var1, boolean var2) {
      Long var3 = A00;
      if (var3 == null || SystemClock.elapsedRealtime() - var3.longValue() >= 5000L) {
         A00 = SystemClock.elapsedRealtime();
         if (var2) {
            (new Thread(new 08u(var0, var1))).start();
         } else {
            A00(var0, var1);
         }
      }
   }
}
