package X;

import java.util.Collections;
import java.util.Map;

public final class 04z implements 075 {
   public static final Map A03 = Collections.synchronizedMap(000.A0F());
   public final Object A00 = new Object();
   public final Map A01 = 000.A0F();
   public final Map A02 = 000.A0F();

   public static void A00(06z var0) {
      A03.put(var0.A00, var0);
   }

   public final void A01(String var1, String var2) {
      Object var3 = this.A00;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            if (A03.containsKey(var1)) {
               this.A02.put(var1, var2);
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            return;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   public final Integer ABy() {
      return 04j.A06;
   }

   public final void AVJ(02h param1, 02Z param2) {
      // $FF: Couldn't be decompiled
   }
}
