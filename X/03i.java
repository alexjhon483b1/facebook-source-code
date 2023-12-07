package X;

import java.net.HttpURLConnection;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;

public final class 03i implements 03h {
   public 047 A00;

   public final HttpURLConnection A8r(URL var1) {
      HttpURLConnection var3 = (HttpURLConnection)var1.openConnection();
      if (var3 instanceof HttpsURLConnection) {
         HttpsURLConnection var4 = (HttpsURLConnection)var3;
         047 var2 = this.A00;
         047 var6 = var2;
         if (var2 == null) {
            var6 = new 047(0L);
            this.A00 = var6;
         }

         try {
            SSLContext var7 = SSLContext.getInstance("TLS");
            var7.init((KeyManager[])null, var6.A00, (SecureRandom)null);
            var4.setSSLSocketFactory(var7.getSocketFactory());
         } catch (NoSuchAlgorithmException | KeyManagementException var5) {
            06i.A0B("lacrima", "Pinning failed", var5);
            08Y.A00();
         }
      }

      var3.setConnectTimeout(30000);
      var3.setReadTimeout(30000);
      return var3;
   }
}
