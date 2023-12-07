package X;

import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class 03H implements 075 {
   public final int A00;
   public final 07Y A01;
   public final File A02;

   public _3H/* $FF was: 03H*/() {
      07Y var1 = 072.A6O;
      super();
      this.A01 = var1;
      this.A02 = null;
      this.A00 = -1;
   }

   public _3H/* $FF was: 03H*/(File var1) {
      this.A01 = 072.A6O;
      this.A02 = var1;
      this.A00 = 200;
   }

   public final Integer ABy() {
      return 04j.A0I;
   }

   public final void AVJ(02h var1, 02Z var2) {
      Object var7 = null;

      String var25;
      label99: {
         StringBuilder var26;
         label98: {
            StringBuilder var21;
            IOException var24;
            label103: {
               int var3;
               byte var4;
               ArrayList var8;
               label96: {
                  IOException var10000;
                  label104: {
                     File var5;
                     ArrayList var6;
                     boolean var10001;
                     try {
                        var6 = new ArrayList();
                        var6.add("logcat");
                        var6.add("-d");
                        var5 = this.A02;
                     } catch (IOException var17) {
                        var10000 = var17;
                        var10001 = false;
                        break label104;
                     }

                     if (var5 != null) {
                        try {
                           var6.add("-f");
                           var6.add(var5.getPath());
                        } catch (IOException var16) {
                           var10000 = var16;
                           var10001 = false;
                           break label104;
                        }
                     }

                     try {
                        var3 = this.A00;
                     } catch (IOException var15) {
                        var10000 = var15;
                        var10001 = false;
                        break label104;
                     }

                     if (var3 > 0) {
                        try {
                           var6.add("-t");
                           var6.add(String.valueOf(var3));
                        } catch (IOException var14) {
                           var10000 = var14;
                           var10001 = false;
                           break label104;
                        }
                     }

                     BufferedReader var20;
                     try {
                        InputStream var19 = Runtime.getRuntime().exec((String[])var6.toArray(new String[var6.size()])).getInputStream();
                        InputStreamReader var22 = new InputStreamReader(var19);
                        var20 = new BufferedReader(var22);
                        var8 = new ArrayList();
                     } catch (IOException var13) {
                        var10000 = var13;
                        var10001 = false;
                        break label104;
                     }

                     var4 = 0;
                     var3 = 0;

                     while(true) {
                        String var23;
                        try {
                           var23 = var20.readLine();
                        } catch (IOException var11) {
                           var10000 = var11;
                           var10001 = false;
                           break;
                        }

                        if (var23 == null) {
                           try {
                              var21 = new StringBuilder(var3);
                              break label96;
                           } catch (IOException var10) {
                              var10000 = var10;
                              var10001 = false;
                              break;
                           }
                        }

                        try {
                           var8.add(var23);
                           var3 = var3 + var23.length() + 1;
                        } catch (IOException var12) {
                           var10000 = var12;
                           var10001 = false;
                           break;
                        }
                     }
                  }

                  var24 = var10000;
                  var21 = null;
                  break label103;
               }

               var3 = var4;

               while(true) {
                  var26 = var21;

                  try {
                     if (var3 >= var8.size()) {
                        break label98;
                     }

                     var21.append((String)var8.get(var3));
                     var21.append("\n");
                  } catch (IOException var9) {
                     var24 = var9;
                     break;
                  }

                  ++var3;
               }
            }

            08Y.A00();
            Log.e("LogcatCollector", "LogCatCollector.collectLogcat could not retrieve data.", var24);
            var26 = var21;
            if (var21 == null) {
               var25 = (String)var7;
               break label99;
            }
         }

         var25 = var26.toString();
      }

      File var27 = this.A02;
      if (var27 == null) {
         07Y var28 = this.A01;
         String var18 = var25;
         if (var25 == null) {
            var18 = "unknown";
         }

         var1.A04(var28, var18);
      } else {
         var1.A05(074.A0A, var2, var27);
      }
   }
}
