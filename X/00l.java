package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.Signature;
import android.content.pm.PackageManager.NameNotFoundException;
import java.util.List;

public final class 00l {
   public static Signature A00(00B var0) {
      02T var1 = var0.A01();
      if (var1 != null) {
         List var2 = var1.A00;
         if (var2.size() <= 1) {
            return (Signature)var2.get(0);
         } else {
            throw new 0AP(var0.A01);
         }
      } else {
         throw new 0AR(var0.A01);
      }
   }

   public static 00B A01(Context var0, String var1) {
      00B var6;
      try {
         var6 = 00A.A01(var0, var1, 64);
      } catch (NameNotFoundException var3) {
         StringBuilder var5 = new StringBuilder();
         var5.append(var1);
         var5.append(" not found by PackageManager.");
         throw new 01B(var5.toString());
      } catch (RuntimeException var4) {
         throw new SecurityException(var4);
      }

      String var2 = var6.A01;
      if (var1.equals(var2)) {
         return var6;
      } else {
         throw new 0AQ(var1, var2);
      }
   }

   public static 00i A02(Context var0, String var1) {
      return 00i.A00(A00(A01(var0, var1)).toByteArray());
   }

   public static boolean A03(Context var0) {
      00i var1 = A02(var0, var0.getPackageName());
      return 00h.A1H.contains(var1);
   }

   public static boolean A04(Context var0, ApplicationInfo var1, ApplicationInfo var2) {
      int var4 = var1.uid;
      int var5 = var2.uid;
      boolean var3 = false;
      if (var4 == var5) {
         var3 = true;
      }

      if (!var3) {
         try {
            if (var0.getPackageManager().checkSignatures(var4, var5) != 0) {
               return false;
            }
         } catch (RuntimeException var6) {
            throw new SecurityException(var6);
         }
      }

      return true;
   }

   public static String[] A05(Context var0, int var1) {
      String[] var3;
      try {
         09E.A08(var0, 0);
         var3 = var0.getPackageManager().getPackagesForUid(var1);
      } catch (RuntimeException var2) {
         throw new SecurityException(var2);
      }

      if (var3 != null && var3.length != 0) {
         return var3;
      } else {
         StringBuilder var4 = new StringBuilder();
         var4.append("No packageName associated with uid=");
         var4.append(var1);
         throw new 01B(var4.toString());
      }
   }
}
