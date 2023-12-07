package X;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Build.VERSION;

public final class 05s {
   public static boolean A00(AlarmManager var0, Context var1) {
      int var3 = var1.getApplicationInfo().targetSdkVersion;
      boolean var2 = false;
      if (var3 > 30) {
         var2 = true;
      }

      int var4 = VERSION.SDK_INT;
      boolean var6 = false;
      if (var4 > 30) {
         var6 = true;
      }

      if (var2 && var6) {
         try {
            return var0.canScheduleExactAlarms();
         } catch (RuntimeException var5) {
            06i.A0A("AndroidCompat", "failed to check canScheduleExactAlarms. Reverting to false", var5);
            return false;
         }
      } else {
         return true;
      }
   }
}
