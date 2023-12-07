package X;

import android.os.Build.VERSION;
import javax.net.ssl.X509TrustManager;

public class 047 {
   public final X509TrustManager[] A00;

   public _47/* $FF was: 047*/(long var1) {
      X509TrustManager[] var4 = new X509TrustManager[1];
      this.A00 = var4;
      Object var3;
      if (VERSION.SDK_INT >= 24) {
         var3 = new 049(var1);
      } else {
         var3 = new 04B(var1);
      }

      var4[0] = (X509TrustManager)var3;
   }

   public _47/* $FF was: 047*/(boolean var1, long var2) {
      X509TrustManager[] var5 = new X509TrustManager[1];
      this.A00 = var5;
      Object var4;
      if (VERSION.SDK_INT >= 17) {
         var4 = new 04C(var2);
      } else {
         var4 = new 04B(var2);
      }

      var5[0] = (X509TrustManager)var4;
   }
}
