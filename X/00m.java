package X;

import java.util.Arrays;
import java.util.List;

public final class 00m {
   public static int A00;
   public static 02D A01;
   public static 00n[] A02 = new 00n[8];
   public static final List A03 = Arrays.asList("com.android.", "com.google.android.");
   public static final List A04 = Arrays.asList("media", "mms", "mms-sms", "sms");

   public static void A00(Integer var0, String var1, int var2) {
      synchronized(00m.class){}

      int var3;
      00n[] var4;
      02D var5;
      label234: {
         Throwable var10000;
         boolean var10001;
         label235: {
            try {
               var5 = A01;
               var4 = A02;
               var3 = A00;
            } catch (Throwable var25) {
               var10000 = var25;
               var10001 = false;
               break label235;
            }

            if (var4 != null) {
               try {
                  A00 = var3 + 1;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label235;
               }
            }

            label222:
            try {
               break label234;
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label222;
            }
         }

         while(true) {
            Throwable var26 = var10000;

            try {
               throw var26;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               continue;
            }
         }
      }

      if (var5 != null) {
         var5.A00(var0, var1, var2);
      } else if (var4 != null && var3 < var4.length) {
         var4[var3] = new 00n(var0, var1, var2);
         return;
      }

   }
}
