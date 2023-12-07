package X;

import android.app.Application;
import java.io.File;
import java.io.RandomAccessFile;

public final class 004 implements 08R {
   public final Application A00;
   public final 077 A01;
   public final 08l A02;
   public final 079 A03;

   public _04/* $FF was: 004*/(Application var1, 077 var2, 08l var3, 079 var4) {
      this.A00 = var1;
      this.A02 = var3;
      this.A01 = var2;
      this.A03 = var4;
   }

   // $FF: synthetic method
   public final 02v ABF() {
      return null;
   }

   public final 02Y ABx() {
      return 02Y.A08;
   }

   public final void start() {
      03R var9 = (03R)this.A03.get();
      if (var9.A07) {
         08l var6 = this.A02;
         File var10 = var6.A01(var6.A07);
         if (var10 != null) {
            File var7;
            String var8;
            String var11;
            File var395;
            Throwable var10000;
            boolean var10001;
            label4172: {
               label4190: {
                  Application var394 = this.A00;
                  var8 = var10.getName();
                  File[] var12 = var394.getDir("minidumps", 0).listFiles(new 00H());
                  if (var12 != null) {
                     var11 = var8.substring(var8.indexOf(45) + 1);
                     int var2 = var12.length;

                     for(int var1 = 0; var1 < var2; ++var1) {
                        var395 = var12[var1];
                        String var13 = var395.getName();
                        if (var395.length() == 0L) {
                           06i.A07("lacrima", "The minidump file is empty during matching!");
                           break;
                        }

                        var7 = var395;
                        if (var13.contains(var11)) {
                           break label4172;
                        }

                        if (var13.startsWith("_")) {
                           label4179: {
                              RandomAccessFile var398;
                              try {
                                 var398 = new RandomAccessFile(var395, "r");
                              } catch (Throwable var393) {
                                 var10000 = var393;
                                 var10001 = false;
                                 break label4179;
                              }

                              label4191: {
                                 try {
                                    05m var408 = new 05m(var398);
                                    var13 = var408.A01(072.A4D.A00);
                                 } catch (Throwable var392) {
                                    var10000 = var392;
                                    var10001 = false;
                                    break label4191;
                                 }

                                 if (var13 != null) {
                                    label4188: {
                                       try {
                                          if (!var8.contains(var13)) {
                                             break label4188;
                                          }
                                       } catch (Throwable var391) {
                                          var10000 = var391;
                                          var10001 = false;
                                          break label4191;
                                       }

                                       try {
                                          var398.close();
                                          break label4190;
                                       } catch (Throwable var389) {
                                          var10000 = var389;
                                          var10001 = false;
                                          break label4179;
                                       }
                                    }
                                 }

                                 try {
                                    var398.close();
                                    continue;
                                 } catch (Throwable var390) {
                                    var10000 = var390;
                                    var10001 = false;
                                    break label4179;
                                 }
                              }

                              Throwable var409 = var10000;

                              label4087:
                              try {
                                 var398.close();
                              } finally {
                                 break label4087;
                              }

                              label4132:
                              try {
                                 throw var409;
                              } catch (Throwable var388) {
                                 var10000 = var388;
                                 var10001 = false;
                                 break label4132;
                              }
                           }

                           Throwable var399 = var10000;
                           08Y.A00();
                           06i.A0I("lacrima", "Could not read minidump, file size: %d.", var395.length(), var399);
                        }
                     }
                  }

                  var7 = null;
                  break label4172;
               }

               var7 = var395;
            }

            label4127: {
               label4192: {
                  if (var7 != null && var7.length() != 0L) {
                     label4121: {
                        Throwable var397;
                        label4182: {
                           RandomAccessFile var400;
                           try {
                              var400 = new RandomAccessFile(var7, "r");
                           } catch (Throwable var387) {
                              var10000 = var387;
                              var10001 = false;
                              break label4182;
                           }

                           label4183: {
                              try {
                                 05m var396 = new 05m(var400);
                                 var11 = var396.A01(072.A6S.A00);
                              } catch (Throwable var386) {
                                 var10000 = var386;
                                 var10001 = false;
                                 break label4183;
                              }

                              label4112: {
                                 if (var11 != null) {
                                    try {
                                       if (!var11.isEmpty()) {
                                          var395 = new File(var11);
                                          if (var395.isFile()) {
                                             break label4112;
                                          }
                                       }
                                    } catch (Throwable var385) {
                                       var10000 = var385;
                                       var10001 = false;
                                       break label4183;
                                    }
                                 }

                                 try {
                                    var400.close();
                                    break label4121;
                                 } catch (Throwable var384) {
                                    var10000 = var384;
                                    var10001 = false;
                                    break label4182;
                                 }
                              }

                              try {
                                 var400.close();
                                 break label4192;
                              } catch (Throwable var383) {
                                 var10000 = var383;
                                 var10001 = false;
                                 break label4182;
                              }
                           }

                           var397 = var10000;

                           label4084:
                           try {
                              var400.close();
                           } finally {
                              break label4084;
                           }

                           label4097:
                           try {
                              throw var397;
                           } catch (Throwable var382) {
                              var10000 = var382;
                              var10001 = false;
                              break label4097;
                           }
                        }

                        var397 = var10000;
                        08Y.A00();
                        06i.A0B("lacrima", "Could not extract LogcatInterceptor File", var397);
                     }
                  } else {
                     06i.A07("lacrima", "The minidump file is empty!");
                  }

                  var8 = null;
                  var395 = null;
                  if (var7 == null) {
                     var395 = var8;
                     if (var9.A04 == '0') {
                        return;
                     }
                     break label4127;
                  }
               }

               var7.getPath();
            }

            File var402 = new File(var10, "native_state.txt");
            02h var401 = new 02h((Throwable)null);

            boolean var5;
            label4080: {
               label4079: {
                  label4078: {
                     label4184: {
                        07b var405;
                        try {
                           var401.A04(072.A4e, "native_crash");
                           var401.A03(072.A1M, System.currentTimeMillis() / 1000L);
                           var405 = 072.A31;
                        } catch (Throwable var379) {
                           var10000 = var379;
                           var10001 = false;
                           break label4184;
                        }

                        long var3;
                        if (var7 != null) {
                           try {
                              var3 = var7.lastModified();
                           } catch (Throwable var378) {
                              var10000 = var378;
                              var10001 = false;
                              break label4184;
                           }
                        } else {
                           try {
                              var3 = var402.lastModified();
                           } catch (Throwable var377) {
                              var10000 = var377;
                              var10001 = false;
                              break label4184;
                           }
                        }

                        try {
                           var401.A03(var405, var3 / 1000L);
                        } catch (Throwable var376) {
                           var10000 = var376;
                           var10001 = false;
                           break label4184;
                        }

                        if (var7 == null) {
                           break label4078;
                        }

                        label4065:
                        try {
                           var401.A03(072.A27, var7.lastModified());
                           break label4079;
                        } catch (Throwable var375) {
                           var10000 = var375;
                           var10001 = false;
                           break label4065;
                        }
                     }

                     Throwable var403 = var10000;
                     08Y.A00();
                     var401.A04(072.A5h, var403.getMessage());
                     if (var7 != null) {
                        break label4079;
                     }
                  }

                  var5 = false;
                  break label4080;
               }

               var5 = true;
            }

            var401.A01(072.A0A, var5);
            077 var404 = this.A01;
            02Z var406 = 02Z.A02;
            var404.A0B(var406, this);
            var404.A05(var401, var406, this);
            var404.A0A(var406, this);
            if (var5) {
               074 var407 = 074.A0B;
               var406 = 02Z.A03;
               var401.A05(var407, var406, var7);
               if (var395 != null) {
                  var401.A05(074.A0A, var406, var395);
               }

               var404.A0B(var406, this);
               var404.A05(var401, var406, this);
               var404.A0A(var406, this);
               return;
            }
         }
      }

   }
}
