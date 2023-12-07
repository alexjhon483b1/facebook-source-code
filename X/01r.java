package X;

import android.content.Context;
import android.os.Build.VERSION;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class 01r implements 075 {
   public final int A00;
   public final Context A01;

   public _1r/* $FF was: 01r*/(Context var1) {
      this.A01 = var1;
      07T var44 = 07T.A01;
      if (var44 == null) {
         throw new IllegalStateException("Did you call PreviousSessionHelper.init?");
      } else {
         08l var45 = var44.A00;
         byte var4 = 0;
         byte var3 = 0;
         byte var5 = 0;
         int var2 = var3;
         if (var45 != null) {
            File var46 = var45.A01(var45.A07);
            var2 = var3;
            if (var46 != null) {
               label362: {
                  var46 = new File(var46, "critical_suppl_startup_prop.txt");
                  Properties var7 = new Properties();
                  int var49 = var4;

                  NumberFormatException var10000;
                  label357: {
                     FileInputStream var6;
                     boolean var10001;
                     try {
                        var6 = new FileInputStream;
                     } catch (IOException | NumberFormatException var43) {
                        var10000 = var43;
                        var10001 = false;
                        break label357;
                     }

                     var49 = var4;

                     try {
                        var6.<init>(var46);
                     } catch (IOException | NumberFormatException var42) {
                        var10000 = var42;
                        var10001 = false;
                        break label357;
                     }

                     var49 = var4;

                     BufferedInputStream var47;
                     try {
                        var47 = new BufferedInputStream;
                     } catch (IOException | NumberFormatException var41) {
                        var10000 = var41;
                        var10001 = false;
                        break label357;
                     }

                     var49 = var4;

                     try {
                        var47.<init>(var6);
                     } catch (IOException | NumberFormatException var40) {
                        var10000 = var40;
                        var10001 = false;
                        break label357;
                     }

                     label358: {
                        Throwable var52;
                        label359: {
                           String var50;
                           try {
                              var7.load(var47);
                              var50 = var7.getProperty("pid");
                           } catch (Throwable var39) {
                              var52 = var39;
                              var10001 = false;
                              break label359;
                           }

                           var2 = var5;
                           if (var50 == null) {
                              break label358;
                           }

                           label329:
                           try {
                              var2 = Integer.parseInt(var50);
                              break label358;
                           } catch (Throwable var38) {
                              var52 = var38;
                              var10001 = false;
                              break label329;
                           }
                        }

                        Throwable var51 = var52;

                        label310:
                        try {
                           var47.close();
                        } finally {
                           break label310;
                        }

                        var49 = var4;

                        try {
                           throw var51;
                        } catch (IOException | NumberFormatException var36) {
                           var10000 = var36;
                           var10001 = false;
                           break label357;
                        }
                     }

                     var49 = var2;

                     try {
                        var47.close();
                        break label362;
                     } catch (IOException | NumberFormatException var37) {
                        var10000 = var37;
                        var10001 = false;
                     }
                  }

                  NumberFormatException var48 = var10000;
                  08Y.A00();
                  06i.A0B("lacrima", "Error getting previous process id", var48);
                  var2 = var49;
               }
            }
         }

         this.A00 = var2;
      }
   }

   public final Integer ABy() {
      return 04j.A0o;
   }

   public final void AVJ(02h var1, 02Z var2) {
      if (VERSION.SDK_INT >= 30) {
         int var3 = this.A00;
         if (var3 != 0) {
            04I var4 = 04I.A00(this.A01, var3);
            if (var4 != null) {
               var1.A02(072.A1P, var4.A03());
               var1.A02(072.A1O, var4.A02());
               var1.A04(072.A5F, var4.A09());
               var1.A02(072.A1R, var4.A04());
               var1.A02(072.A1T, var4.A05());
               var1.A03(072.A1U, var4.A08());
               var1.A04(072.A5H, 04I.A01());
               var1.A01(072.A0R, var4.A0B());
               var1.A04(072.A5G, var4.A0A());
               var1.A03(072.A1Q, var4.A06());
               var1.A03(072.A1S, var4.A07());
            }
         }
      }

   }
}
