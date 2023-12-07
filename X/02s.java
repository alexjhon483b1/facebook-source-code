package X;

import android.content.Context;
import android.content.pm.PackageManager;

public final class 02s {
   public static void A00(Context var0, 02h var1) {
      PackageManager var2 = var0.getPackageManager();
      if (var2 != null) {
         var1.A01(072.A06, var2.hasSystemFeature("android.hardware.ram.low"));
      }

   }
}
