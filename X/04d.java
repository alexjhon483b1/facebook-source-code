package X;

import java.io.File;
import java.io.IOException;

public final class 04d implements Runnable {
   public static final String __redex_internal_original_name = "UnpackingSoSource$2";
   public final 0Ai A00;
   public final 05z A01;
   public final File A02;
   public final boolean A03;

   public _4d/* $FF was: 04d*/(0Ai var1, 05z var2, File var3, boolean var4) {
      this.A01 = var2;
      this.A03 = var4;
      this.A02 = var3;
      this.A00 = var1;
   }

   public final void run() {
      0Aj.A01("fb-UnpackingSoSource");

      IOException var24;
      label166: {
         boolean var10001;
         label170: {
            Throwable var10000;
            label171: {
               boolean var1;
               try {
                  var1 = this.A03;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label171;
               }

               if (var1) {
                  try {
                     0Ay.A06(this.A01.A01);
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label171;
                  }
               }

               label157:
               try {
                  05z.A00(this.A02, (byte)1, var1);
                  break label170;
               } catch (Throwable var20) {
                  var10000 = var20;
                  var10001 = false;
                  break label157;
               }
            }

            Throwable var2 = var10000;

            try {
               0Aj.A01("fb-UnpackingSoSource");
               this.A00.close();
               throw var2;
            } catch (IOException var18) {
               var24 = var18;
               var10001 = false;
               break label166;
            }
         }

         try {
            0Aj.A01("fb-UnpackingSoSource");
            this.A00.close();
            return;
         } catch (IOException var19) {
            var24 = var19;
            var10001 = false;
         }
      }

      IOException var23 = var24;
      throw new RuntimeException(var23);
   }
}
