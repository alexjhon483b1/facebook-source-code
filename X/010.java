package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class 010 {
   public static final File A03 = new File("/sys/kernel/debug/tracing/trace");
   public boolean A00;
   public final Object A01 = new Object[0];
   public final List A02 = new ArrayList();

   public final void A00() {
      Object var2 = this.A01;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label211: {
         try {
            this.A00 = true;
         } catch (Throwable var23) {
            var10000 = var23;
            var10001 = false;
            break label211;
         }

         int var1 = 0;

         while(true) {
            try {
               List var3 = this.A02;
               if (var1 >= var3.size()) {
                  break;
               }

               ((014)var3.get(var1)).ATg();
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label211;
            }

            ++var1;
         }

         label195:
         try {
            return;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            break label195;
         }
      }

      while(true) {
         Throwable var24 = var10000;

         try {
            throw var24;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            continue;
         }
      }
   }
}
