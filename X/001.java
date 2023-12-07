package X;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public final class 001 implements 08R {
   public final 077 A00;
   public final 08l A01;
   public final 079 A02;

   public _01/* $FF was: 001*/(077 var1, 08l var2, 079 var3) {
      this.A01 = var2;
      this.A00 = var1;
      this.A02 = var3;
   }

   public static Properties A00(File var0) {
      Properties var1 = new Properties();
      if (var0 != null) {
         IOException var10000;
         label110: {
            boolean var10001;
            FileInputStream var2;
            try {
               var2 = new FileInputStream(var0);
            } catch (IOException var18) {
               var10000 = var18;
               var10001 = false;
               break label110;
            }

            boolean var13 = false;

            try {
               var13 = true;
               var1.load(var2);
               var13 = false;
            } finally {
               if (var13) {
                  label94:
                  try {
                     var2.close();
                  } finally {
                     break label94;
                  }

                  try {
                     ;
                  } catch (IOException var16) {
                     var10000 = var16;
                     var10001 = false;
                     break label110;
                  }
               }
            }

            try {
               var2.close();
               return var1;
            } catch (IOException var15) {
               var10000 = var15;
               var10001 = false;
            }
         }

         IOException var19 = var10000;
         06i.A0B("lacrima", "Error while reading Anr report", var19);
         08Y.A00();
      }

      return var1;
   }

   // $FF: synthetic method
   public final 02v ABF() {
      return null;
   }

   public final 02Y ABx() {
      return 02Y.A04;
   }

   public final void start() {
      06i.A0J("lacrima", "Start AnrAppDeathDetector... %s", this.getClass().getName());
      03R var13 = (03R)this.A02.get();
      if (var13.A07) {
         Properties var12 = null;
         08l var10 = this.A01;
         File var14 = var10.A01(var10.A07);
         if (var14 != null) {
            File[] var15 = var14.listFiles(new 003(this));
            File var11 = null;
            File var18 = null;
            if (var15 != null) {
               int var2 = -1;
               int var5 = var15.length;
               int var1 = 0;

               while(true) {
                  var11 = var18;
                  if (var1 >= var5) {
                     break;
                  }

                  var11 = var15[var1];

                  int var3;
                  label61: {
                     int var4;
                     try {
                        var4 = Integer.parseInt(var11.getName().replace("anr_report_", "").replace(".dmp", ""));
                     } catch (NumberFormatException var17) {
                        06i.A0J("lacrima", "Invalid anr report name %s", var11.getName(), var17);
                        08Y.A00();
                        var3 = var2;
                        break label61;
                     }

                     var3 = var2;
                     if (var4 > var2) {
                        var18 = var11;
                        var3 = var4;
                     }
                  }

                  ++var1;
                  var2 = var3;
               }
            }

            boolean var6 = var13.A06;
            Properties var19 = var12;
            if (!var6) {
               var12 = A00(var11);
               var19 = var12;
               if (!"true".equals(var12.getProperty(072.A01.A00))) {
                  return;
               }
            }

            var13.A00();
            if (var13.A00()) {
               var14 = new File(var14, "anr_state.txt");
               02h var23 = new 02h((Throwable)null);
               07b var21 = 072.A31;
               long var8;
               if (var11 != null) {
                  var8 = var11.lastModified();
               } else {
                  var8 = var14.lastModified();
               }

               label48: {
                  var23.A03(var21, var8 / 1000L);
                  var23.A03(072.A1M, System.currentTimeMillis() / 1000L);
                  if (var11 != null) {
                     074 var22 = 074.A02;
                     var23.A05(var22, 02Z.A02, var11);
                     var23.A05(var22, 02Z.A03, var11);
                     var12 = var19;
                     if (var19 == null) {
                        var12 = A00(var11);
                     }

                     if (var6) {
                        var6 = "true".equals(var12.getProperty(072.A89.A00)) ^ true;
                        break label48;
                     }

                     if ("true".equals(var12.getProperty(072.A01.A00))) {
                        boolean var7 = "true".equals(var12.getProperty(072.A89.A00));
                        var6 = true;
                        if (!var7) {
                           break label48;
                        }
                     }
                  }

                  var6 = false;
               }

               var23.A01(072.A0A, var6);
               077 var20 = this.A00;
               var20.A06(var23, 02Z.A02, this);
               if (var6) {
                  var20.A06(var23, 02Z.A03, this);
                  return;
               }
            }
         }
      }

   }
}
