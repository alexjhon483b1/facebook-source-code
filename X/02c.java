package X;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import org.json.JSONObject;

public abstract class 02c implements 075 {
   public final Context A00;

   public _2c/* $FF was: 02c*/(Context var1) {
      this.A00 = var1;
   }

   public final Integer ABy() {
      return 04j.A07;
   }

   public final void AVJ(02h var1, 02Z var2) {
      var1.A04(072.A50, (String)((02d)this).A01.A0L.get());
      var1.A04(072.A52, Build.MODEL);
      var1.A04(072.A53, Build.DEVICE);
      var1.A04(072.A4y, Build.BRAND);
      var1.A04(072.A55, VERSION.RELEASE);
      var1.A04(072.A54, "Android");
      07Y var5 = 072.A3Q;
      int var3 = VERSION.SDK_INT;
      String var4 = "DALVIK";
      String var6 = var4;
      if (var3 >= 19) {
         label31: {
            var6 = System.getProperty("java.boot.class.path");
            if (var6 != null) {
               if (var6.contains("/system/framework/core-libart.jar")) {
                  var6 = "ART";
                  break label31;
               }

               if (var6.contains("/system/framework/core.jar")) {
                  var6 = var4;
                  break label31;
               }
            }

            var6 = "UNKNOWN";
         }
      }

      var1.A04(var5, var6);
      var1.A04(072.A3R, VERSION.RELEASE);
      07Y var7 = 072.A8r;
      02q var8 = new 02q();
      StringBuilder var10 = new StringBuilder();
      var10.append(var8.A00);
      var10.append(":");
      var10.append(var8.A01);
      var1.A04(var7, var10.toString());
      if (var3 >= 30) {
         JSONObject var9 = 07F.A00();
         if (var9.length() > 0) {
            var1.A04(072.A8k, var9.toString());
         }
      } else if (var3 < 23) {
         return;
      }

      02r.A00(var1);
      if (var3 >= 27) {
         02s.A00(this.A00, var1);
      }

   }
}
