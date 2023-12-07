package X;

import android.util.Base64;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class 00i implements Serializable {
   public String A00;
   public String A01;

   public _0i/* $FF was: 00i*/(String var1, String var2) {
      if (var1 != null) {
         if (var1.length() == 27) {
            this.A00 = var1;
            if (var2 != null) {
               if (var2.length() != 43) {
                  throw new SecurityException("Invalid SHA256 key hash - should be 256-bit.");
               }

               this.A01 = var2;
            }

         } else {
            throw new SecurityException("Invalid SHA1 key hash - should be 160-bit.");
         }
      } else {
         throw new SecurityException("Must provide SHA1 key hash.");
      }
   }

   public static 00i A00(byte[] var0) {
      String var4;
      String var5;
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-1");
         var1.update(var0);
         var5 = Base64.encodeToString(var1.digest(), 11);
         MessageDigest var2 = MessageDigest.getInstance("SHA-256");
         var2.update(var0);
         var4 = Base64.encodeToString(var2.digest(), 11);
      } catch (NoSuchAlgorithmException var3) {
         throw new SecurityException("Error obtaining SHA1/SHA256");
      }

      return new 00i(var5, var4);
   }

   public final boolean equals(Object var1) {
      boolean var4 = var1 instanceof 00i;
      boolean var3 = false;
      boolean var2 = var3;
      if (var4) {
         00i var7 = (00i)var1;
         String var5 = this.A01;
         String var6 = var7.A01;
         if (var5 != null && var6 != null) {
            return var5.equals(var6);
         }

         var5 = this.A00;
         String var8 = var7.A00;
         var2 = var3;
         if (var5 != null) {
            var2 = var3;
            if (var8 != null) {
               var2 = var3;
               if (var5.equals(var8)) {
                  var2 = true;
               }
            }
         }
      }

      return var2;
   }

   public final int hashCode() {
      String var2 = this.A01;
      String var1 = var2;
      if (var2 == null) {
         var1 = this.A00;
      }

      return var1.hashCode();
   }
}
