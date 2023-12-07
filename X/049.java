package X;

import java.net.Socket;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.X509ExtendedTrustManager;

public final class 049 extends X509ExtendedTrustManager implements 048 {
   public final 04C A00;

   public _49/* $FF was: 049*/(long var1) {
      synchronized(04A.class){}

      04A var3;
      label71: {
         Throwable var10000;
         label75: {
            boolean var10001;
            04A var4;
            try {
               var4 = 04A.A02;
            } catch (Throwable var10) {
               var10000 = var10;
               var10001 = false;
               break label75;
            }

            var3 = var4;
            if (var4 != null) {
               break label71;
            }

            label66:
            try {
               var3 = new 04A();
               04A.A02 = var3;
               break label71;
            } catch (Throwable var9) {
               var10000 = var9;
               var10001 = false;
               break label66;
            }
         }

         Throwable var11 = var10000;
         throw var11;
      }

      super();
      this.A00 = new 04C(var3, var1);
   }

   public final void A3d(String var1, String var2, X509Certificate[] var3) {
      this.A00.A3d("ECDHE_ECDSA", var2, var3);
   }

   public final void A3e(String var1, String var2, X509Certificate[] var3, boolean var4) {
      this.A00.A3e("ECDHE_ECDSA", var2, var3, var4);
   }

   public final void checkClientTrusted(X509Certificate[] var1, String var2) {
      throw new CertificateException("Client certificates not supported!");
   }

   public final void checkClientTrusted(X509Certificate[] var1, String var2, Socket var3) {
      throw new CertificateException("Client certificates not supported!");
   }

   public final void checkClientTrusted(X509Certificate[] var1, String var2, SSLEngine var3) {
      throw new CertificateException("Client certificates not supported!");
   }

   public final void checkServerTrusted(X509Certificate[] var1, String var2) {
      this.A00.checkServerTrusted(var1, var2);
   }

   public final void checkServerTrusted(X509Certificate[] var1, String var2, Socket var3) {
      04C var4 = this.A00;
      ((X509ExtendedTrustManager)var4.A02).checkServerTrusted(var1, var2, var3);
      var4.A01(var1);
   }

   public final void checkServerTrusted(X509Certificate[] var1, String var2, SSLEngine var3) {
      04C var4 = this.A00;
      ((X509ExtendedTrustManager)var4.A02).checkServerTrusted(var1, var2, var3);
      var4.A01(var1);
   }

   public final X509Certificate[] getAcceptedIssuers() {
      return this.A00.getAcceptedIssuers();
   }
}
