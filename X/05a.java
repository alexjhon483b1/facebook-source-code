package X;

import android.os.Build.VERSION;
import dalvik.system.VMRuntime;

public final class 05a {
   public static final int A00() {
      return VERSION.SDK_INT;
   }

   public static final String A01() {
      return VMRuntime.getRuntime().vmInstructionSet();
   }
}
