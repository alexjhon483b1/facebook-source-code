package X;

import android.os.Build.VERSION;

public final class 00z {
   public static final 010 A00 = new 010();
   public static volatile long A01;

   static {
      if (VERSION.SDK_INT < 30) {
         A00(3);
         012 var0 = new 012();
         if (05v.A06) {
            05v.A01(05v.A00, var0);
         }
      }

   }

   public static void A00(int param0) {
      // $FF: Couldn't be decompiled
   }

   public static void A01(014 var0) {
      010 var2 = A00;
      Object var1 = var2.A01;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            var2.A02.add(var0);
            if (var2.A00) {
               var0.ATg();
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            return;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var15 = var10000;

         try {
            throw var15;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            continue;
         }
      }
   }
}
