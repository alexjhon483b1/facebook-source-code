package X;

import java.nio.MappedByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

public final class 04t {
   public static AtomicReference A03 = new AtomicReference();
   public String A00;
   public final 09t A01;
   public final Object A02;

   public _4t/* $FF was: 04t*/(09t param1) {
      // $FF: Couldn't be decompiled
   }

   public static void A00(04t param0) {
      // $FF: Couldn't be decompiled
   }

   public static void A01(04t var0, Integer var1, Integer var2, Integer var3, char var4, char var5, boolean var6, boolean var7) {
      char var9 = 05q.A00(var1);
      if (var4 >= 0 && var4 <= 127) {
         Object var10 = var0.A02;
         synchronized(var10){}

         Throwable var10000;
         boolean var10001;
         label1004: {
            MappedByteBuffer var11;
            try {
               var11 = var0.A01.A00;
               var11.put(1, (byte)var9);
               var11.put(196, (byte)var5);
               var11.put(2, (byte)var4);
            } catch (Throwable var121) {
               var10000 = var121;
               var10001 = false;
               break label1004;
            }

            byte var123 = 48;
            if (var6) {
               var123 = 49;
            }

            try {
               var11.put(198, (byte)var123);
            } catch (Throwable var120) {
               var10000 = var120;
               var10001 = false;
               break label1004;
            }

            label986: {
               if (!var7) {
                  try {
                     if (var1.compareTo(04j.A0U) >= 0) {
                        break label986;
                     }
                  } catch (Throwable var119) {
                     var10000 = var119;
                     var10001 = false;
                     break label1004;
                  }
               }

               try {
                  var11.put(202, (byte)48);
                  var11.put(200, (byte)48);
               } catch (Throwable var118) {
                  var10000 = var118;
                  var10001 = false;
                  break label1004;
               }
            }

            byte var8 = -1;
            byte var124 = 127;
            int var125;
            int var126;
            if (var2 != null) {
               try {
                  var126 = var2.intValue();
               } catch (Throwable var117) {
                  var10000 = var117;
                  var10001 = false;
                  break label1004;
               }

               var125 = var126;
               if (var126 > 127) {
                  var125 = 127;
               }

               try {
                  var11.put(203, (byte)var125);
               } catch (Throwable var116) {
                  var10000 = var116;
                  var10001 = false;
                  break label1004;
               }
            } else {
               try {
                  var11.put(203, (byte)-1);
               } catch (Throwable var115) {
                  var10000 = var115;
                  var10001 = false;
                  break label1004;
               }
            }

            if (var3 != null) {
               try {
                  var126 = var3.intValue();
               } catch (Throwable var114) {
                  var10000 = var114;
                  var10001 = false;
                  break label1004;
               }

               var125 = var124;
               if (var126 <= 127) {
                  var125 = var126;
               }

               var8 = (byte)var125;
            }

            label965:
            try {
               var11.put(204, var8);
               A00(var0);
               return;
            } catch (Throwable var113) {
               var10000 = var113;
               var10001 = false;
               break label965;
            }
         }

         while(true) {
            Throwable var122 = var10000;

            try {
               throw var122;
            } catch (Throwable var112) {
               var10000 = var112;
               var10001 = false;
               continue;
            }
         }
      } else {
         throw new IllegalStateException("State byte should be ASCII");
      }
   }

   public final void A02(07G param1) {
      // $FF: Couldn't be decompiled
   }

   public final void A03(String var1, int var2, int var3) {
      int var5 = var1.length();
      byte var4 = 0;
      String var6 = var1;
      if (var5 > var3) {
         var6 = var1.substring(0, var3);
      }

      Object var38 = this.A02;
      synchronized(var38){}

      Throwable var10000;
      boolean var10001;
      label294: {
         MappedByteBuffer var7;
         byte[] var40;
         try {
            var7 = this.A01.A00;
            var7.put(var2, (byte)0);
            var40 = var6.getBytes();
         } catch (Throwable var37) {
            var10000 = var37;
            var10001 = false;
            break label294;
         }

         var3 = var4;

         while(true) {
            int var39;
            try {
               var39 = var40.length;
            } catch (Throwable var35) {
               var10000 = var35;
               var10001 = false;
               break;
            }

            if (var3 >= var39) {
               try {
                  var7.put(var2, (byte)var39);
                  return;
               } catch (Throwable var34) {
                  var10000 = var34;
                  var10001 = false;
                  break;
               }
            }

            try {
               var7.put(var2 + 1 + var3, var40[var3]);
            } catch (Throwable var36) {
               var10000 = var36;
               var10001 = false;
               break;
            }

            ++var3;
         }
      }

      while(true) {
         Throwable var41 = var10000;

         try {
            throw var41;
         } catch (Throwable var33) {
            var10000 = var33;
            var10001 = false;
            continue;
         }
      }
   }
}
