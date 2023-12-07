package X;

import android.os.Build.VERSION;
import com.facebook.common.build.Bit64Mode$LollipopSysdeps;
import com.facebook.common.build.Bit64Mode$MarshmallowSysdeps;

public final class 02o {
   public static final Boolean A00;

   static {
      int var0 = VERSION.SDK_INT;
      boolean var1;
      if (var0 >= 23) {
         var1 = Bit64Mode$MarshmallowSysdeps.is64Bit();
      } else if (var0 >= 21) {
         var1 = Bit64Mode$LollipopSysdeps.is64Bit();
      } else {
         var1 = false;
      }

      A00 = var1;
   }
}
