package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.PackageManager.ComponentInfoFlags;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.PackageInfoFlags;
import android.os.Build.VERSION;

public final class 00A {
   public static final ProviderInfo A00(Context var0, String var1, int var2) {
      09E.A08(var1, 1);
      PackageManager var3 = var0.getPackageManager();
      return VERSION.SDK_INT >= 33 ? var3.resolveContentProvider(var1, ComponentInfoFlags.of((long)var2)) : var3.resolveContentProvider(var1, var2);
   }

   public static final 00B A01(Context var0, String var1, int var2) {
      PackageInfo var7;
      label23: {
         09E.A08(var0, 0);
         09E.A08(var1, 1);
         PackageManager var6 = var0.getPackageManager();
         int var5 = VERSION.SDK_INT;
         int var3;
         if (var5 >= 28) {
            int var4 = var2;
            if ((var2 & 64) == 64) {
               var4 = var2 & -65 | 134217728;
            }

            var3 = var4;
            if (var5 >= 33) {
               var7 = var6.getPackageInfo(var1, PackageInfoFlags.of((long)var4));
               break label23;
            }
         } else {
            var3 = var2;
            if ((var2 & 134217728) == 134217728) {
               var3 = var2 & -134217729 | 64;
            }
         }

         var7 = var6.getPackageInfo(var1, var3);
      }

      if (var7 != null) {
         return new 00B(var7);
      } else {
         StringBuilder var8 = new StringBuilder();
         var8.append("PackageManager returned null PackageInfo for ");
         var8.append(var1);
         throw new NameNotFoundException(var8.toString());
      }
   }
}
