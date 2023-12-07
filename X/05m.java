package X;

import android.text.TextUtils;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.RandomAccessFile;
import java.io.StringReader;

public final class 05m {
   public int A00;
   public int A01;
   public RandomAccessFile A02;

   public _5m/* $FF was: 05m*/(RandomAccessFile var1) {
      this.A02 = var1;
      var1.seek(0L);
      if (A00(this) == 1347241037) {
         this.A02.skipBytes(4);
         this.A00 = A00(this);
         this.A01 = A00(this);
      } else {
         throw new RuntimeException("Invalid minidump signature");
      }
   }

   public static int A00(05m var0) {
      int var1 = var0.A02.readInt();
      return var1 >> 24 & 255 | (var1 & 255) << 24 | ('\uff00' & var1) << 8 | (16711680 & var1) >> 8;
   }

   public final String A01(String var1) {
      Exception var198;
      String var200;
      label1859: {
         String var7;
         Exception var10000;
         boolean var10001;
         label1855: {
            label1854: {
               label1860: {
                  try {
                     this.A02.seek((long)this.A01);
                  } catch (Exception var197) {
                     var10000 = var197;
                     var10001 = false;
                     break label1860;
                  }

                  int var2 = 0;

                  while(true) {
                     int var3;
                     int var4;
                     int var5;
                     label1846: {
                        try {
                           if (var2 < this.A00) {
                              var3 = A00(this);
                              var4 = A00(this);
                              var5 = A00(this);
                              break label1846;
                           }
                        } catch (Exception var196) {
                           var10000 = var196;
                           var10001 = false;
                           break label1860;
                        }

                        var7 = null;
                        break;
                     }

                     if (var3 == -87110918) {
                        try {
                           RandomAccessFile var201 = this.A02;
                           var201.seek((long)var5);
                           byte[] var6 = new byte[var4];
                           var201.read(var6);
                           var7 = new String(var6);
                           break;
                        } catch (Exception var195) {
                           var10000 = var195;
                           var10001 = false;
                           break label1860;
                        }
                     }

                     ++var2;
                  }

                  var200 = var7;

                  try {
                     if (!TextUtils.isEmpty(var7)) {
                        break label1855;
                     }
                     break label1854;
                  } catch (Exception var194) {
                     var10000 = var194;
                     var10001 = false;
                  }
               }

               var198 = var10000;
               var200 = "";
               break label1859;
            }

            var200 = null;
         }

         if (var200 == null) {
            return null;
         }

         label1862: {
            JsonReader var9;
            try {
               StringReader var202 = new StringReader(var200);
               var9 = new JsonReader(var202);
            } catch (Exception var184) {
               var10000 = var184;
               var10001 = false;
               break label1862;
            }

            label1863: {
               Throwable var204;
               label1864: {
                  try {
                     var9.beginObject();
                  } catch (Throwable var192) {
                     var204 = var192;
                     var10001 = false;
                     break label1864;
                  }

                  JsonReader var203;
                  while(true) {
                     label1819: {
                        label1865: {
                           try {
                              while(var9.hasNext()) {
                                 var7 = var9.nextName();
                                 if (var9.peek() != JsonToken.NULL) {
                                    if (!var7.equals("global")) {
                                       break label1819;
                                    }
                                    break label1865;
                                 }
                              }
                           } catch (Throwable var193) {
                              var204 = var193;
                              var10001 = false;
                              break label1864;
                           }

                           try {
                              var9.endObject();
                           } catch (Throwable var190) {
                              var204 = var190;
                              var10001 = false;
                              break label1864;
                           }

                           var203 = null;
                           break;
                        }

                        var203 = var9;
                        break;
                     }

                     try {
                        var9.skipValue();
                     } catch (Throwable var191) {
                        var204 = var191;
                        var10001 = false;
                        break label1864;
                     }
                  }

                  JsonReader var8;
                  label1799: {
                     if (var203 != null) {
                        try {
                           var203.beginObject();
                        } catch (Throwable var187) {
                           var204 = var187;
                           var10001 = false;
                           break label1864;
                        }

                        label1795:
                        while(true) {
                           String var10;
                           try {
                              do {
                                 if (!var203.hasNext()) {
                                    break label1795;
                                 }

                                 var10 = var203.nextName();
                              } while(var203.peek() == JsonToken.NULL);
                           } catch (Throwable var189) {
                              var204 = var189;
                              var10001 = false;
                              break label1864;
                           }

                           var8 = var203;

                           try {
                              if (var10.equals(var1)) {
                                 break label1799;
                              }

                              var203.skipValue();
                           } catch (Throwable var188) {
                              var204 = var188;
                              var10001 = false;
                              break label1864;
                           }
                        }

                        try {
                           var203.endObject();
                        } catch (Throwable var186) {
                           var204 = var186;
                           var10001 = false;
                           break label1864;
                        }
                     }

                     var8 = null;
                  }

                  if (var8 == null) {
                     var1 = null;
                     break label1863;
                  }

                  label1776:
                  try {
                     var1 = var8.nextString();
                     break label1863;
                  } catch (Throwable var185) {
                     var204 = var185;
                     var10001 = false;
                     break label1776;
                  }
               }

               Throwable var199 = var204;

               label1763:
               try {
                  var9.close();
               } finally {
                  break label1763;
               }

               try {
                  throw var199;
               } catch (Exception var183) {
                  var10000 = var183;
                  var10001 = false;
                  break label1862;
               }
            }

            try {
               var9.close();
               return var1;
            } catch (Exception var182) {
               var10000 = var182;
               var10001 = false;
            }
         }

         var198 = var10000;
      }

      06i.A0F("MinidumpReader", "getCustomData error: %s", var198, var200);
      return null;
   }
}
