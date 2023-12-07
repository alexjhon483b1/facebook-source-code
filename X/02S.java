package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.Signature;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class 02S {
   public final int A00;
   public final String A01;
   public final String A02;
   public final List A03;
   public final List A04;

   public _2S/* $FF was: 02S*/(String var1, String var2, List var3, List var4, int var5) {
      this.A00 = var5;
      this.A03 = Collections.unmodifiableList(var3);
      this.A04 = var4;
      this.A02 = var1;
      this.A01 = var2;
      if (var3.isEmpty()) {
         throw new IllegalArgumentException("At least one package name is required");
      }
   }

   public static 02S A00(Context var0, String var1) {
      try {
         return A01(00A.A01(var0, var1, 64));
      } catch (NameNotFoundException var2) {
         StringBuilder var3 = new StringBuilder();
         var3.append("Unable to get packageInfo for package ");
         var3.append(var1);
         throw new 01B(var3.toString());
      }
   }

   public static 02S A01(00B var0) {
      02T var2 = var0.A01();
      if (var2 == null) {
         throw new 0AR("Unable to construct AppIdentity -- signingInfo was null. Make sure you called getPackageInfo() with GET_SIGNATURES or GET_CERTIFICATES flag.");
      } else {
         List var4 = var2.A00;
         if (var4.isEmpty()) {
            throw new 0AR("Unable to construct AppIdentity -- packageInfo does not have any signatures. Make sure you called getPackageInfo() with GET_SIGNATURES or GET_CERTIFICATES flag.");
         } else {
            ApplicationInfo var3 = var0.A00;
            if (var3 == null) {
               throw new SecurityException("Unable to construct AppIdentity -- package applicationInfo is null");
            } else {
               ArrayList var5 = new ArrayList(var4.size());
               Iterator var7 = var4.iterator();

               while(var7.hasNext()) {
                  var5.add(00i.A00(((Signature)var7.next()).toByteArray()));
               }

               int var1 = var3.uid;
               List var6 = Collections.singletonList(var0.A01);
               return new 02S(var0.A02, (String)null, var6, var5, var1);
            }
         }
      }
   }

   public final 00i A02() {
      List var1 = this.A04;
      return var1.isEmpty() ? null : (00i)var1.get(0);
   }

   public final String A03() {
      List var1 = this.A03;
      if (!var1.isEmpty()) {
         return (String)var1.iterator().next();
      } else {
         throw new IllegalStateException("Invalid AppIdentity object: no package names");
      }
   }

   public final boolean equals(Object var1) {
      if (this != var1) {
         if (var1 == null || this.getClass() != var1.getClass()) {
            return false;
         }

         02S var4 = (02S)var1;
         if (this.A00 != var4.A00 || !this.A03.equals(var4.A03)) {
            return false;
         }

         List var3 = this.A04;
         List var2 = var4.A04;
         if (var3 != var2 && (var3 == null || !var3.equals(var2))) {
            return false;
         }

         String var7 = this.A02;
         String var6 = var4.A02;
         if (var7 != var6 && (var7 == null || !var7.equals(var6))) {
            return false;
         }

         var6 = this.A01;
         String var5 = var4.A01;
         if (var6 != var5 && (var6 == null || !var6.equals(var5))) {
            return false;
         }
      }

      return true;
   }

   public final int hashCode() {
      return Arrays.hashCode(new Object[]{this.A00, this.A03, this.A04, this.A02, this.A01});
   }

   public final String toString() {
      00i var1 = this.A02();
      StringBuilder var4 = new StringBuilder();
      var4.append("AppIdentity{uid=");
      var4.append(this.A00);
      var4.append(", packageNames=");
      var4.append(this.A03);
      var4.append(", sha2=");
      String var2 = "null";
      String var5;
      if (var1 == null) {
         var5 = "null";
      } else {
         var5 = var1.A01;
      }

      var4.append(var5);
      var4.append(", version=");
      String var3 = this.A02;
      var5 = var3;
      if (var3 == null) {
         var5 = "null";
      }

      var4.append(var5);
      var4.append(", domain=");
      var3 = this.A01;
      var5 = var2;
      if (var3 != null) {
         var5 = var3;
      }

      var4.append(var5);
      var4.append('}');
      return var4.toString();
   }
}
