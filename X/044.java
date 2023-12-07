package X;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;

public final class 044 {
   public static long A00;
   public static boolean A01;

   public static boolean A00(Context var0) {
      if (SystemClock.uptimeMillis() - A00 < 5000L) {
         return A01;
      } else {
         boolean var2 = false;
         boolean var3 = false;

         boolean var1;
         label260: {
            label259: {
               Throwable var10000;
               label266: {
                  boolean var10001;
                  ConnectivityManager var24;
                  try {
                     var24 = (ConnectivityManager)var0.getSystemService("connectivity");
                  } catch (Throwable var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label266;
                  }

                  var1 = var3;
                  if (var24 == null) {
                     break label259;
                  }

                  NetworkInfo var25;
                  try {
                     var25 = var24.getActiveNetworkInfo();
                  } catch (Throwable var22) {
                     var10000 = var22;
                     var10001 = false;
                     break label266;
                  }

                  var1 = var3;
                  if (var25 == null) {
                     break label259;
                  }

                  var1 = var3;

                  try {
                     if (!var25.isAvailable()) {
                        break label259;
                     }
                  } catch (Throwable var21) {
                     var10000 = var21;
                     var10001 = false;
                     break label266;
                  }

                  var1 = var3;

                  try {
                     if (!var25.isConnected()) {
                        break label259;
                     }
                  } catch (Throwable var20) {
                     var10000 = var20;
                     var10001 = false;
                     break label266;
                  }

                  var1 = true;
                  break label259;
               }

               Throwable var26 = var10000;
               06i.A09("lacrima", "Connectivity check failed", var26);
               08Y.A00();
               var1 = false;
               break label260;
            }

            var2 = var1;
            var1 = var1;
         }

         A01 = var2;
         A00 = SystemClock.uptimeMillis();
         return var1;
      }
   }
}
