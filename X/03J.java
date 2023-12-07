package X;

import com.facebook.errorreporting.lacrima.detector.javacrash.JavaCrashDetector;

public final class 03J implements 03I {
   public final JavaCrashDetector A00;

   public _3J/* $FF was: 03J*/(JavaCrashDetector var1) {
      this.A00 = var1;
   }

   public final int AGM(024 var1, Thread var2, Throwable var3) {
      JavaCrashDetector var4 = this.A00;
      if (var4.A01.A1m(var2, var3)) {
         var4.A00(var2, var3);
      }

      return 0;
   }
}
