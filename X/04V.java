package X;

import android.text.TextUtils.SimpleStringSplitter;
import android.util.Log;
import com.facebook.superpack.AssetDecompressionException;
import com.facebook.superpack.AssetDecompressor;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public final class 04V extends 04U {
   public final ZipEntry A00;
   public final ZipFile A01;
   public final 04Y[] A02;
   public final 05Q A03;

   public _4V/* $FF was: 04V*/(05z var1, 05Q var2) {
      this.A03 = var2;
      ZipFile var8 = new ZipFile(var2.A04);

      Throwable var10000;
      Throwable var672;
      label5402: {
         ZipEntry var5;
         ZipEntry var10;
         boolean var10001;
         try {
            var5 = var8.getEntry(var2.A05);
            var10 = var8.getEntry(var2.A06);
         } catch (Throwable var652) {
            var10000 = var652;
            var10001 = false;
            break label5402;
         }

         InputStream var9;
         label5403: {
            if (var5 == null) {
               try {
                  this.A02 = new 04Y[0];
                  this.A01 = var8;
               } catch (Throwable var651) {
                  var10000 = var651;
                  var10001 = false;
                  break label5402;
               }

               if (var10 != null) {
                  try {
                     this.A00 = var10;
                     var2.A01 = false;
                     return;
                  } catch (Throwable var645) {
                     var10000 = var645;
                     var10001 = false;
                     break label5402;
                  }
               }
            } else {
               ArrayList var11;
               String[] var12;
               HashMap var13;
               try {
                  var11 = new ArrayList();
                  var13 = new HashMap();
                  var12 = 0Ay.A0B();
                  var9 = var8.getInputStream(var5);
               } catch (Throwable var650) {
                  var10000 = var650;
                  var10001 = false;
                  break label5402;
               }

               LinkedHashSet var14;
               BufferedReader var15;
               SimpleStringSplitter var16;
               try {
                  var14 = new LinkedHashSet();
                  InputStreamReader var670 = new InputStreamReader(var9);
                  var15 = new BufferedReader(var670);
                  var16 = new SimpleStringSplitter(' ');
               } catch (Throwable var662) {
                  var10000 = var662;
                  var10001 = false;
                  break label5403;
               }

               while(true) {
                  String var17;
                  try {
                     var17 = var15.readLine();
                  } catch (Throwable var657) {
                     var10000 = var657;
                     var10001 = false;
                     break label5403;
                  }

                  if (var17 == null) {
                     try {
                        var1.A00 = (String[])var14.toArray(new String[var14.size()]);
                     } catch (Throwable var656) {
                        var10000 = var656;
                        var10001 = false;
                        break label5403;
                     }

                     if (var9 != null) {
                        try {
                           var9.close();
                        } catch (Throwable var649) {
                           var10000 = var649;
                           var10001 = false;
                           break label5402;
                        }
                     }

                     Iterator var673;
                     try {
                        var673 = var13.values().iterator();
                     } catch (Throwable var648) {
                        var10000 = var648;
                        var10001 = false;
                        break label5402;
                     }

                     while(true) {
                        try {
                           if (!var673.hasNext()) {
                              break;
                           }

                           ((04Y)var673.next()).A00 = true;
                        } catch (Throwable var653) {
                           var10000 = var653;
                           var10001 = false;
                           break label5402;
                        }
                     }

                     try {
                        this.A02 = (04Y[])var11.toArray(new 04Y[var11.size()]);
                        this.A00 = var10;
                        this.A01 = var8;
                        break;
                     } catch (Throwable var647) {
                        var10000 = var647;
                        var10001 = false;
                        break label5402;
                     }
                  }

                  String var6;
                  StringBuilder var7;
                  String var671;
                  String var674;
                  label5381: {
                     label5380: {
                        label5379: {
                           label5378: {
                              try {
                                 if (var17.length() == 0) {
                                    continue;
                                 }

                                 var16.setString(var17);
                                 if (var16.hasNext()) {
                                    var674 = var16.next();
                                    if (!var16.hasNext()) {
                                       break label5378;
                                    }

                                    var6 = var16.next();
                                    if (!var16.hasNext()) {
                                       break label5380;
                                    }

                                    var671 = var16.next();
                                    break label5381;
                                 }
                              } catch (Throwable var667) {
                                 var10000 = var667;
                                 var10001 = false;
                                 break label5403;
                              }

                              var671 = null;
                              break label5379;
                           }

                           var671 = var674;
                        }

                        var6 = null;
                        var7 = null;
                        var674 = var671;
                        var671 = var7;
                        break label5381;
                     }

                     var671 = null;
                  }

                  StringBuilder var668;
                  RuntimeException var669;
                  if (var674 != null && var6 != null && var671 != null) {
                     int var3;
                     int var4;
                     try {
                        var7 = new StringBuilder();
                        var7.append("assets/lib/");
                        var7.append(var674);
                        if (var8.getEntry(var7.toString()) != null) {
                           continue;
                        }

                        var4 = Integer.parseInt(var6);
                        var3 = var674.indexOf(47);
                     } catch (Throwable var664) {
                        var10000 = var664;
                        var10001 = false;
                        break label5403;
                     }

                     if (var3 != -1) {
                        try {
                           var6 = var674.substring(0, var3);
                           var674 = var674.substring(var3 + 1);
                        } catch (Throwable var661) {
                           var10000 = var661;
                           var10001 = false;
                           break label5403;
                        }

                        var3 = 0;

                        while(true) {
                           label5350: {
                              try {
                                 if (var3 < var12.length) {
                                    break label5350;
                                 }
                              } catch (Throwable var666) {
                                 var10000 = var666;
                                 var10001 = false;
                                 break label5403;
                              }

                              var3 = -1;
                              break;
                           }

                           if (var12[var3] != null) {
                              try {
                                 if (var6.equals(var12[var3])) {
                                    break;
                                 }
                              } catch (Throwable var665) {
                                 var10000 = var665;
                                 var10001 = false;
                                 break label5403;
                              }
                           }

                           ++var3;
                        }

                        04Y var676;
                        try {
                           var676 = new 04Y(var674, var671, var4, var3);
                           var11.add(var676);
                        } catch (Throwable var660) {
                           var10000 = var660;
                           var10001 = false;
                           break label5403;
                        }

                        if (var3 < 0) {
                           continue;
                        }

                        04Y var675;
                        try {
                           var14.add(var6);
                           var675 = (04Y)var13.get(var674);
                        } catch (Throwable var659) {
                           var10000 = var659;
                           var10001 = false;
                           break label5403;
                        }

                        if (var675 != null) {
                           try {
                              if (var3 >= var675.A01) {
                                 continue;
                              }
                           } catch (Throwable var663) {
                              var10000 = var663;
                              var10001 = false;
                              break label5403;
                           }
                        }

                        try {
                           var13.put(var674, var676);
                           continue;
                        } catch (Throwable var658) {
                           var10000 = var658;
                           var10001 = false;
                           break label5403;
                        }
                     }

                     try {
                        var668 = new StringBuilder();
                        var668.append("illegal line in compressed metadata: [");
                        var668.append(var17);
                        var668.append("]");
                        var671 = var668.toString();
                        var669 = new RuntimeException(var671);
                     } catch (Throwable var654) {
                        var10000 = var654;
                        var10001 = false;
                        break label5403;
                     }
                  } else {
                     try {
                        var668 = new StringBuilder();
                        var668.append("illegal line in compressed metadata: [");
                        var668.append(var17);
                        var668.append("]");
                        var669 = new RuntimeException(var668.toString());
                     } catch (Throwable var655) {
                        var10000 = var655;
                        var10001 = false;
                        break label5403;
                     }
                  }

                  try {
                     throw var669;
                  } catch (Throwable var646) {
                     var10000 = var646;
                     var10001 = false;
                     break label5403;
                  }
               }
            }

            return;
         }

         var672 = var10000;
         if (var9 != null) {
            label5280:
            try {
               var9.close();
            } finally {
               break label5280;
            }
         }

         label5285:
         try {
            throw var672;
         } catch (Throwable var644) {
            var10000 = var644;
            var10001 = false;
            break label5285;
         }
      }

      var672 = var10000;
      var8.close();
      throw var672;
   }

   public final void A01(File var1) {
      if (this.A00 != null) {
         05Q var4 = this.A03;
         if (!var4.A01) {
            try {
               0B8 var232 = var4.A00;
               String var230 = var232.A00.replace("assets/", "");
               String var233 = var232.A01;
               var233 = var233.substring(var233.lastIndexOf(46) + 1);
               0At.A07("superpack-jni");
               String[] var231 = AssetDecompressor.decompress(var4.A01.getAssets(), var230, var233, var1.getCanonicalPath());
               StringBuilder var227 = new StringBuilder();
               var227.append("Extracted ");
               var227.append(var231.length);
               var227.append(" libs using Superpack");
               Log.w("SoLoader", var227.toString());
            } catch (AssetDecompressionException var212) {
               throw new IOException(var212);
            }
         } else {
            byte[] var7 = new byte['耀'];
            04Z var6 = new 04Z(this);

            Throwable var10000;
            label1742:
            while(true) {
               int var2;
               boolean var10001;
               try {
                  var2 = var6.A00;
               } catch (Throwable var224) {
                  var10000 = var224;
                  var10001 = false;
                  break;
               }

               while(true) {
                  int var3;
                  04Y[] var8;
                  try {
                     var8 = var6.A02.A02;
                     var3 = var8.length;
                  } catch (Throwable var223) {
                     var10000 = var223;
                     var10001 = false;
                     break label1742;
                  }

                  label1747: {
                     if (var2 < var3) {
                        try {
                           if (!var8[var2].A00) {
                              break label1747;
                           }
                        } catch (Throwable var225) {
                           var10000 = var225;
                           var10001 = false;
                           break label1742;
                        }
                     }

                     if (var2 >= var3) {
                        var6.close();
                        return;
                     }

                     04b var228;
                     while(true) {
                        var228 = null;

                        try {
                           var2 = var6.A00;
                        } catch (Throwable var218) {
                           var10000 = var218;
                           var10001 = false;
                           break label1742;
                        }

                        if (var2 >= var3) {
                           break;
                        }

                        try {
                           var6.A00 = var2 + 1;
                        } catch (Throwable var221) {
                           var10000 = var221;
                           var10001 = false;
                           break label1742;
                        }

                        04Y var9 = var8[var2];

                        04a var229;
                        try {
                           var2 = var9.A02;
                           var229 = new 04a(var6, var2);
                        } catch (Throwable var220) {
                           var10000 = var220;
                           var10001 = false;
                           break label1742;
                        }

                        boolean var127 = false;

                        04b var5;
                        try {
                           var127 = true;
                           var5 = new 04b(var9, var229);
                           var127 = false;
                        } finally {
                           if (var127) {
                              try {
                                 var229.close();
                              } catch (Throwable var216) {
                                 var10000 = var216;
                                 var10001 = false;
                                 break label1742;
                              }
                           }
                        }

                        var228 = var5;

                        try {
                           if (var9.A00) {
                              break;
                           }

                           var5.close();
                        } catch (Throwable var222) {
                           var10000 = var222;
                           var10001 = false;
                           break label1742;
                        }
                     }

                     try {
                        04U.A00(var228, var1, var7);
                        break;
                     } finally {
                        if (var228 != null) {
                           label1694:
                           try {
                              var228.close();
                           } finally {
                              break label1694;
                           }
                        }

                        try {
                           ;
                        } catch (Throwable var215) {
                           var10000 = var215;
                           var10001 = false;
                           break label1742;
                        }
                     }
                  }

                  ++var2;
               }
            }

            Throwable var226 = var10000;

            try {
               var6.close();
            } finally {
               throw var226;
            }

            throw var226;
         }
      }
   }

   public final 04X[] A02() {
      return this.A02;
   }

   public final void close() {
      this.A01.close();
   }
}
