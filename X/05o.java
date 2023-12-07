package X;

import java.util.HashSet;
import java.util.Set;

public final class 05o implements 06f {
   public final Set A00 = new HashSet();

   private int A00(String param1, byte[] param2) {
      // $FF: Couldn't be decompiled
   }

   public static 05o A01() {
      return new 05o();
   }

   public final int AWW(String var1, float[] var2, int[] var3, long[] var4, String[] var5) {
      byte[] var22 = new byte[384];
      int var17 = this.A00(var1, var22);
      if (var17 < 0) {
         return 4;
      } else {
         int var18 = var3.length;
         int var10;
         if (var5 != null) {
            var10 = var5.length;
         } else {
            var10 = 0;
         }

         int var11;
         if (var4 != null) {
            var11 = var4.length;
         } else {
            var11 = 0;
         }

         int var19 = Math.max(var10, Math.max(var11, 0));
         int var8 = 0;
         int var12 = 0;

         int var9;
         for(int var13 = 0; var12 < var18; var8 = var9) {
            int var7;
            int var14;
            label151: {
               var9 = var3[var12];
               if ((var9 & 512) == 0) {
                  var7 = var8;
                  var14 = var9;
                  if ((var9 & 1024) == 0) {
                     break label151;
                  }

                  if (var22[var8] != 34) {
                     var14 = var9 & -1025;
                     var7 = var8;
                     break label151;
                  }
               }

               var7 = var8 + 1;
               var14 = var9;
            }

            char var16 = (char)(var14 & 255);
            if (var7 >= var17) {
               return 5;
            }

            var9 = -1;
            label142:
            if ((var14 & 512) != 0) {
               var8 = var7;

               while(true) {
                  var9 = var8;
                  if (var8 >= var17) {
                     break label142;
                  }

                  var9 = var8;
                  if (var22[var8] == 41) {
                     break label142;
                  }

                  ++var8;
               }
            } else if ((var14 & 1024) == 0) {
               var8 = var7;
            } else {
               var8 = var7;

               while(true) {
                  var9 = var8;
                  if (var22[var8] == 34) {
                     break label142;
                  }

                  var9 = var8;
                  if (var8 >= var17) {
                     break label142;
                  }

                  ++var8;
               }
            }

            for(var8 = var9 + 1; var8 < var17 && var22[var8] != var16; ++var8) {
            }

            int var15 = var9;
            if (var9 < 0) {
               var15 = var8;
            }

            var9 = var8;
            if (var8 < var17) {
               ++var8;
               var9 = var8;
               if ((var14 & 256) != 0) {
                  while(true) {
                     var9 = var8;
                     if (var8 >= var17) {
                        break;
                     }

                     var9 = var8;
                     if (var22[var8] != var16) {
                        break;
                     }

                     ++var8;
                  }
               }
            }

            var8 = var13;
            if ((var14 & 28672) != 0) {
               byte var6;
               boolean var23;
               if (var15 < 384) {
                  var23 = true;
                  var6 = var22[var15];
                  var22[var15] = 0;
               } else {
                  var23 = false;
                  var6 = 0;
               }

               if ((var14 & 8192) != 0 && var13 < var11 && var4 != null) {
                  long var20;
                  if ((var14 & 2048) != 0) {
                     var20 = (long)var22[var7];
                  } else {
                     var20 = 06e.A00(var22, var7);
                  }

                  var4[var13] = var20;
               }

               if ((var14 & 4096) != 0 && var13 < var10 && var5 != null) {
                  var8 = var7;

                  while(true) {
                     if (var8 >= 384) {
                        var14 = 384;
                        break;
                     }

                     var14 = var8;
                     if (var22[var8] == 0) {
                        break;
                     }

                     ++var8;
                  }

                  var5[var13] = new String(var22, var7, var14 - var7);
               }

               if (var23) {
                  var22[var15] = var6;
               }

               var7 = var13 + 1;
               var8 = var7;
               if (var7 >= var19) {
                  break;
               }
            }

            ++var12;
            var13 = var8;
         }

         return 0;
      }
   }

   public final boolean AWX(String var1, long[] var2, String[] var3) {
      if (var1 == null) {
         throw new NullPointerException("Cannot pass null values");
      } else {
         int var12 = var3.length;
         if (var12 > var2.length) {
            throw 000.A05("Array lengths differ");
         } else {
            int var4;
            for(var4 = 0; var4 < var12; ++var4) {
               var2[var4] = 0L;
            }

            int var9;
            boolean var13;
            byte[] var15;
            label125: {
               var15 = new byte[2048];
               var4 = this.A00(var1, var15);
               if (var4 < 0) {
                  var13 = false;
                  var4 = 0;
               } else {
                  var13 = true;
                  boolean var14 = true;
                  var9 = var4;
                  if (var4 >= 2048) {
                     break label125;
                  }

                  var13 = var14;
               }

               var15[var4] = 0;
               var9 = var4;
            }

            var4 = 0;
            int var5 = 0;

            label118:
            while(var4 < var9 && var15[var4] != 0 && var5 < var12) {
               int var10 = 0;

               int var6;
               int var7;
               label115:
               while(true) {
                  var6 = var4;
                  var7 = var5;
                  if (var10 >= var12) {
                     break;
                  }

                  var1 = var3[var10];
                  var6 = var4;
                  int var8 = var1.length();
                  var7 = 0;

                  while(true) {
                     if (var6 >= 2048 || var7 >= var8) {
                        if (var7 == var8) {
                           for(var4 += var1.length(); var4 < 2048 && (var15[var4] == 0 || var15[var4] == 32 || var15[var4] == 9); ++var4) {
                           }

                           var6 = var4;

                           boolean var11;
                           label89: {
                              boolean var18;
                              while(true) {
                                 if (var6 < 2048) {
                                    if (var15[var6] >= 48 && var15[var6] <= 57) {
                                       ++var6;
                                       continue;
                                    }

                                    byte var17 = var15[var6];
                                    var18 = false;
                                    if (var17 == 10) {
                                       break;
                                    }
                                 }

                                 var11 = true;
                                 var18 = true;
                                 var7 = var6;
                                 if (var6 >= 2048) {
                                    break label89;
                                 }
                                 break;
                              }

                              var11 = var18;
                              var7 = var6;
                              if (var15[var6] != 0) {
                                 var15[var6] = 0;
                                 var7 = var6 + 1;
                                 var11 = var18;
                              }
                           }

                           var2[var10] = 06e.A00(var15, var4);
                           var8 = var5 + 1;
                           var6 = var7;
                           var4 = var7;
                           var5 = var8;
                           if (!var11) {
                              continue label118;
                           }

                           var7 = var8;
                           break label115;
                        }
                        break;
                     }

                     if (var15[var6] != var1.charAt(var7)) {
                        break;
                     }

                     ++var6;
                     ++var7;
                  }

                  ++var10;
               }

               while(var6 < var9) {
                  byte var16 = var15[var6];
                  if (var16 == 0 || var16 == 10) {
                     break;
                  }

                  ++var6;
               }

               var4 = var6;
               var5 = var7;
               if (var6 < 2048) {
                  var4 = var6;
                  var5 = var7;
                  if (var15[var6] == 10) {
                     var4 = var6 + 1;
                     var5 = var7;
                  }
               }
            }

            return var13;
         }
      }
   }
}
