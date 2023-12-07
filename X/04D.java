package X;

import android.content.res.AssetManager;
import java.lang.reflect.InvocationTargetException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

public final class 04D {
   public static X509TrustManager A00() {
      try {
         TrustManagerFactory var0 = TrustManagerFactory.getInstance("X509");
         var0.init((KeyStore)null);
         TrustManager[] var2 = var0.getTrustManagers();
         if (var2.length == 1) {
            return (X509TrustManager)var2[0];
         } else {
            CertificateException var3 = new CertificateException("Unable to create system TrustManger");
            throw var3;
         }
      } catch (KeyStoreException | CertificateException | NoSuchAlgorithmException var1) {
         throw new IllegalStateException("Failure initializing TrustManager", var1);
      }
   }

   public static X509TrustManager A01() {
      try {
         AssetManager.class.getMethod("getSystem").invoke((Object)null);
         return A00();
      } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException var1) {
         throw new IllegalStateException("Failure reinitializing TrustManager", var1);
      }
   }
}
