package X;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public final class 01w implements Runnable {
   public static final String __redex_internal_original_name = "ConcurrentSocketConnector$3";
   public final 03z A00;
   public final Object A01;
   public final List A02;

   public _1w/* $FF was: 01w*/(03z var1, Object var2, List var3) {
      this.A02 = var3;
      this.A01 = var2;
      this.A00 = var1;
   }

   public final void run() {
      Iterator var1 = this.A02.iterator();

      while(var1.hasNext()) {
         Future var2 = (Future)var1.next();

         boolean var10001;
         Object var6;
         try {
            var6 = var2.get();
         } catch (InterruptedException | ExecutionException var5) {
            var10001 = false;
            continue;
         }

         if (var6 != null) {
            01u var7;
            try {
               if (var6 == this.A01) {
                  continue;
               }

               var7 = (01u)var6;
            } catch (InterruptedException | ExecutionException var4) {
               var10001 = false;
               continue;
            }

            if (var7 != null) {
               try {
                  var7.close();
               } catch (ExecutionException | InterruptedException | IOException var3) {
                  var10001 = false;
               }
            }
         }
      }

   }
}
