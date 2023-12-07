package X;

import android.net.http.X509TrustManagerExtensions;
import java.security.cert.X509Certificate;
import java.util.List;

public final class 04C extends 04B implements 048 {
   public final X509TrustManagerExtensions A00;

   public _4C/* $FF was: 04C*/(long var1) {
      this((04A)null, var1);
   }

   public _4C/* $FF was: 04C*/(04A var1, long var2) {
      super(var1, var2);
      this.A00 = new X509TrustManagerExtensions(super.A02);
   }

   public final void A3d(String var1, String var2, X509Certificate[] var3) {
      this.A00(this.A00.checkServerTrusted(var3, "ECDHE_ECDSA", var2));
   }

   public final void A3e(String var1, String var2, X509Certificate[] var3, boolean var4) {
      List var5 = this.A00.checkServerTrusted(var3, "ECDHE_ECDSA", var2);
      if (var4) {
         this.A00(var5);
      }

   }
}
