package X;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.X509TrustManager;

public class 04B implements X509TrustManager {
   public 04A A00;
   public final Set A01;
   public final X509TrustManager A02;
   public final long A03;
   public final boolean A04;

   public _4B/* $FF was: 04B*/(long var1) {
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

      this(var3, var1);
   }

   public _4B/* $FF was: 04B*/(04A var1, long var2) {
      this.A01 = new HashSet();
      this.A00 = var1;

      X509TrustManager var9;
      try {
         var9 = 04D.A00();
      } catch (NullPointerException var8) {
         var9 = 04D.A01();
      }

      this.A02 = var9;
      boolean var6 = false;
      if (var2 > 0L) {
         var6 = true;
      }

      this.A04 = var6;
      this.A03 = var2 + 31536000000L;
      String[] var7 = 04E.A00;
      int var5 = var7.length;

      for(int var4 = 0; var4 < var5; ++var4) {
         byte[] var10 = Base64.decode(var7[var4], 0);
         this.A01.add(ByteBuffer.wrap(var10));
      }

   }

   public final void A00(List var1) {
      if (!this.A04 || System.currentTimeMillis() <= this.A03) {
         if (var1.isEmpty()) {
            throw new CertificateException("pinning error: certificate chain empty");
         } else {
            Iterator var2 = var1.iterator();

            while(var2.hasNext()) {
               Certificate var3 = (Certificate)var2.next();

               try {
                  byte[] var7 = MessageDigest.getInstance("SHA-256").digest(var3.getPublicKey().getEncoded());
                  if (this.A01.contains(ByteBuffer.wrap(var7))) {
                     return;
                  }
               } catch (NoSuchAlgorithmException var4) {
                  throw new CertificateException(var4);
               }
            }

            StringBuilder var6 = new StringBuilder();
            var6.append("pinning error, trusted chain: ");
            Iterator var5 = var1.iterator();

            while(var5.hasNext()) {
               var6.append(Base64.encodeToString(((Certificate)var5.next()).getEncoded(), 0));
               var6.append("\n");
            }

            throw new CertificateException(var6.toString());
         }
      }
   }

   public final void A01(X509Certificate[] var1) {
      04A var8 = this.A00;
      if (var8 == null) {
         throw new CertificateException("SystemKeystore is not intialized.");
      } else {
         boolean var2;
         LinkedList var7;
         X509Certificate var9;
         HashMap var15;
         label56: {
            var7 = new LinkedList();
            var9 = var1[0];
            var15 = var8.A01;
            Certificate var10 = (Certificate)var15.get(var9.getSubjectX500Principal());
            if (var10 != null) {
               boolean var6 = var10.getPublicKey().equals(var9.getPublicKey());
               var2 = true;
               if (var6) {
                  break label56;
               }
            }

            var2 = false;
         }

         var7.add(var9);
         int var4 = 1;

         boolean var5;
         while(true) {
            var5 = var2;
            if (var4 >= var1.length) {
               break;
            }

            var9 = var1[var4];
            X509Certificate var17 = var1[var4 - 1];
            Certificate var11 = (Certificate)var15.get(var9.getSubjectX500Principal());
            boolean var3 = var2;
            if (var11 != null) {
               var3 = var2;
               if (var11.getPublicKey().equals(var9.getPublicKey())) {
                  var3 = true;
               }
            }

            var5 = var3;
            if (!var9.getSubjectX500Principal().equals(var17.getIssuerX500Principal())) {
               break;
            }

            try {
               var17.verify(var9.getPublicKey());
            } catch (GeneralSecurityException var13) {
               var5 = var3;
               break;
            }

            var7.add(var9);
            ++var4;
            var2 = var3;
         }

         label40: {
            X509Certificate var14 = var1[var4 - 1];
            X509Certificate var16 = (X509Certificate)var15.get(var14.getIssuerX500Principal());
            if (var16 != null && !var16.getSubjectX500Principal().equals(var14.getSubjectX500Principal())) {
               label37: {
                  try {
                     var14.verify(var16.getPublicKey());
                  } catch (GeneralSecurityException var12) {
                     break label37;
                  }

                  var7.add(var16);
                  break label40;
               }
            }

            if (!var5) {
               throw new CertificateException("Didn't find a trust anchor in chain cleanup!");
            }
         }

         this.A00(Arrays.asList(var7.toArray(new X509Certificate[var7.size()])));
      }
   }

   public final void checkClientTrusted(X509Certificate[] var1, String var2) {
      throw new CertificateException("Client certificates not supported!");
   }

   public final void checkServerTrusted(X509Certificate[] var1, String var2) {
      this.A02.checkServerTrusted(var1, var2);
      this.A01(var1);
   }

   public final X509Certificate[] getAcceptedIssuers() {
      return this.A02.getAcceptedIssuers();
   }
}
