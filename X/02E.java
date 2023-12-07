package X;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicBoolean;

public final class 02E {
   public static AtomicBoolean A00 = new AtomicBoolean(false);

   public static void A00() {
      boolean var0 = Trace.isEnabled();
      if (A00.compareAndSet(var0 ^ true, var0)) {
         00z.A00(4);
      }

   }
}
