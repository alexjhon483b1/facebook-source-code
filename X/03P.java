package X;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class 03P {
   public static char A00(File var0) {
      07G var23;
      if (var0.exists()) {
         label154: {
            IOException var10000;
            label158: {
               boolean var10001;
               RandomAccessFile var2;
               try {
                  var2 = new RandomAccessFile(var0, "rw");
               } catch (IOException var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label158;
               }

               boolean var15 = false;

               char var1;
               label148: {
                  try {
                     var15 = true;
                     if (var2.length() != 0L) {
                        var1 = (char)var2.readByte();
                        var15 = false;
                        break label148;
                     }

                     var15 = false;
                  } finally {
                     if (var15) {
                        label132:
                        try {
                           var2.close();
                        } finally {
                           break label132;
                        }

                        try {
                           ;
                        } catch (IOException var18) {
                           var10000 = var18;
                           var10001 = false;
                           break label158;
                        }
                     }
                  }

                  try {
                     var2.close();
                     break label154;
                  } catch (IOException var19) {
                     var10000 = var19;
                     var10001 = false;
                     break label158;
                  }
               }

               try {
                  var2.close();
                  return var1;
               } catch (IOException var17) {
                  var10000 = var17;
                  var10001 = false;
               }
            }

            IOException var22 = var10000;
            08Y.A00();
            06i.A0B("lacrima", "Reading AppStateNativeParser failed", var22);
         }

         var23 = 07G.A06;
      } else {
         var23 = 07G.A0A;
      }

      return var23.A01;
   }
}
