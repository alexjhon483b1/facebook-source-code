package X;

import com.facebook.systrace.Systrace;

public final class 052 {
   public static volatile boolean A00;

   public static long A00(long var0) {
      if ((1L & 00z.A01) != 0L && !A00) {
         A00 = true;
         Systrace.A03("fburl.com/fbsystrace");
         Systrace.A03("USE fbsystrace");
         Systrace.A03("DO NOT USE systrace");
      } else if (A00 && (1L & 00z.A01) == 0L) {
         A00 = false;
      }

      return var0 - System.nanoTime();
   }
}
