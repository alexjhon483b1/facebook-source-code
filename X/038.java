package X;

import android.app.Application;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class 038 {
   public final Application A00;
   public final 09Q A01;
   public final 037 A02;

   public _38/* $FF was: 038*/(Application var1, 09Q var2, 037 var3) {
      this.A00 = var1;
      this.A01 = var2;
      this.A02 = var3;
   }

   public abstract 02h A00(02Z var1);

   public abstract 02Y A01();

   public abstract Integer A02();

   public void A03(02Z var1, File var2, File var3) {
      Integer var9 = this.A02();
      Integer var10 = 04j.A00;
      File var8 = var2;
      if (var9 == var10) {
         var8 = var3;
      }

      if (var8 != null) {
         037 var13 = this.A02;
         02Y var12 = this.A01();
         Object var11 = 037.A05;
         synchronized(var11){}

         Throwable var10000;
         boolean var10001;
         Throwable var291;
         File[] var293;
         File[] var294;
         label3475: {
            label3476: {
               try {
                  00f var292 = new 00f(var1, var12);
                  var294 = var2.listFiles(var292);
               } catch (Throwable var290) {
                  var10000 = var290;
                  var10001 = false;
                  break label3476;
               }

               var293 = var294;
               if (var294 == null) {
                  try {
                     var293 = 037.A06;
                  } catch (Throwable var289) {
                     var10000 = var289;
                     var10001 = false;
                     break label3476;
                  }
               }

               label3459:
               try {
                  break label3475;
               } catch (Throwable var288) {
                  var10000 = var288;
                  var10001 = false;
                  break label3459;
               }
            }

            while(true) {
               var291 = var10000;

               try {
                  throw var291;
               } catch (Throwable var278) {
                  var10000 = var278;
                  var10001 = false;
                  continue;
               }
            }
         }

         int var6 = var293.length;
         if (var6 != 0) {
            for(int var4 = 0; var4 < var6; ++var4) {
               File var14 = var293[var4];
               if (!037.A02(var2, var14.getName())) {
                  var14.getName();
                  String var297 = var14.getName();
                  if (037.A04 == null) {
                     037.A04 = 06p.A00();
                  }

                  StringBuilder var295 = new StringBuilder();
                  var295.append(var297.replace("_prop.txt", "_"));
                  var295.append(037.A04);
                  String var296 = var295.toString();
                  File var15 = new File(var13.A01, var296);
                  var15.mkdirs();
                  synchronized(var11){}

                  File[] var299;
                  label3478: {
                     label3479: {
                        try {
                           04J var298 = new 04J(var1);
                           var299 = var8.listFiles(var298);
                        } catch (Throwable var287) {
                           var10000 = var287;
                           var10001 = false;
                           break label3479;
                        }

                        var294 = var299;
                        if (var299 == null) {
                           try {
                              var294 = 037.A06;
                           } catch (Throwable var286) {
                              var10000 = var286;
                              var10001 = false;
                              break label3479;
                           }
                        }

                        label3440:
                        try {
                           break label3478;
                        } catch (Throwable var285) {
                           var10000 = var285;
                           var10001 = false;
                           break label3440;
                        }
                     }

                     while(true) {
                        var291 = var10000;

                        try {
                           throw var291;
                        } catch (Throwable var276) {
                           var10000 = var276;
                           var10001 = false;
                           continue;
                        }
                     }
                  }

                  02h var16 = this.A00(var1);
                  var16.A02(072.A2d, 06G.A00());
                  var16.A02(072.A2e, 06G.A01());
                  var16.A01(072.A08, true);
                  Application var17 = this.A00;
                  var297 = var17.getPackageName();
                  var297 = var17.getPackageManager().getInstallerPackageName(var297);
                  if (var297 != null) {
                     var16.A04(072.A8X, var297);
                  }

                  ArrayList var303 = new ArrayList(Arrays.asList(var294));
                  if (!var303.contains(var14)) {
                     var303.add(var14);
                  }

                  ArrayList var18 = new ArrayList();
                  synchronized(var11){}

                  04K var300;
                  label3480: {
                     label3481: {
                        try {
                           var300 = new 04K(var1, true);
                           var299 = var8.listFiles(var300);
                        } catch (Throwable var284) {
                           var10000 = var284;
                           var10001 = false;
                           break label3481;
                        }

                        var294 = var299;
                        if (var299 == null) {
                           try {
                              var294 = 037.A06;
                           } catch (Throwable var283) {
                              var10000 = var283;
                              var10001 = false;
                              break label3481;
                           }
                        }

                        label3424:
                        try {
                           break label3480;
                        } catch (Throwable var282) {
                           var10000 = var282;
                           var10001 = false;
                           break label3424;
                        }
                     }

                     while(true) {
                        var291 = var10000;

                        try {
                           throw var291;
                        } catch (Throwable var277) {
                           var10000 = var277;
                           var10001 = false;
                           continue;
                        }
                     }
                  }

                  int var7 = var294.length;

                  int var5;
                  File var301;
                  for(var5 = 0; var5 < var7; ++var5) {
                     var301 = var294[var5];
                     if (!037.A02(var2, var301.getName())) {
                        var18.add(var301);
                     }
                  }

                  var5 = 0;
                  synchronized(var11){}

                  label3483: {
                     label3484: {
                        try {
                           var300 = new 04K(var1, false);
                           var299 = var2.listFiles(var300);
                        } catch (Throwable var281) {
                           var10000 = var281;
                           var10001 = false;
                           break label3484;
                        }

                        var294 = var299;
                        if (var299 == null) {
                           try {
                              var294 = 037.A06;
                           } catch (Throwable var280) {
                              var10000 = var280;
                              var10001 = false;
                              break label3484;
                           }
                        }

                        label3405:
                        try {
                           break label3483;
                        } catch (Throwable var279) {
                           var10000 = var279;
                           var10001 = false;
                           break label3405;
                        }
                     }

                     while(true) {
                        var291 = var10000;

                        try {
                           throw var291;
                        } catch (Throwable var275) {
                           var10000 = var275;
                           var10001 = false;
                           continue;
                        }
                     }
                  }

                  for(var7 = var294.length; var5 < var7; ++var5) {
                     var301 = var294[var5];
                     if (!037.A02(var2, var301.getName())) {
                        var18.add(var301);
                     }
                  }

                  StringBuilder var302;
                  if (!var18.isEmpty()) {
                     var302 = new StringBuilder();
                     var302.append(var1.A00);
                     var295 = new StringBuilder();
                     var295.append(var12.A00);
                     var295.append("_attach.txt");
                     var302.append(var295.toString());
                     var13.A03((02h)null, var15, var302.toString(), var18);
                  }

                  var303.addAll(var18);
                  var295 = new StringBuilder();
                  var295.append(var1.A00);
                  var302 = new StringBuilder();
                  var302.append(var12.A00);
                  var302.append("_report.txt");
                  var295.append(var302.toString());
                  var13.A03(var16, var15, var295.toString(), var303);
                  037.A01(var2, var14.getName());
                  037.A01(var2, var14.getName().replace("_prop.txt", "_attach.txt"));
               }
            }
         }
      }

   }
}
