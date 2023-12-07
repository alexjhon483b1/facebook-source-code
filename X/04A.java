package X;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;

public final class 04A {
   public static 04A A02;
   public final KeyStore A00;
   public final HashMap A01;

   public _4A/* $FF was: 04A*/() {
      KeyStore var1;
      try {
         var1 = KeyStore.getInstance("AndroidCAStore");
         var1.load((InputStream)null, (char[])null);
      } catch (NoSuchAlgorithmException var5) {
         throw new AssertionError(var5);
      } catch (KeyStoreException var6) {
         throw new AssertionError(var6);
      } catch (CertificateException var7) {
         throw new AssertionError(var7);
      } catch (FileNotFoundException var8) {
         throw new AssertionError(var8);
      } catch (IOException var9) {
         throw new AssertionError(var9);
      }

      HashMap var4;
      label47: {
         KeyStoreException var10000;
         label46: {
            Enumeration var2;
            boolean var10001;
            try {
               var4 = new HashMap();
               var2 = var1.aliases();
            } catch (KeyStoreException var12) {
               var10000 = var12;
               var10001 = false;
               break label46;
            }

            while(true) {
               X509Certificate var3;
               try {
                  if (!var2.hasMoreElements()) {
                     break label47;
                  }

                  var3 = (X509Certificate)var1.getCertificate((String)var2.nextElement());
               } catch (KeyStoreException var11) {
                  var10000 = var11;
                  var10001 = false;
                  break;
               }

               if (var3 != null) {
                  try {
                     var4.put(var3.getSubjectX500Principal(), var3);
                  } catch (KeyStoreException var10) {
                     var10000 = var10;
                     var10001 = false;
                     break;
                  }
               }
            }
         }

         KeyStoreException var13 = var10000;
         throw new AssertionError(var13);
      }

      this.A01 = var4;
      this.A00 = var1;
   }
}
