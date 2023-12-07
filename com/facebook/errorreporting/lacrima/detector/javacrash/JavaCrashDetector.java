package com.facebook.errorreporting.lacrima.detector.javacrash;

import X.02Y;
import X.02v;
import X.03J;
import X.05B;
import X.05F;
import X.06T;
import X.077;
import X.08R;
import X.08V;
import X.08l;
import X.0BL;

public class JavaCrashDetector implements 08R {
   public static final 08V A05 = new 05B();
   public 05F A00;
   public 08V A01;
   public final 077 A02;
   public final 08V A03;
   public final 08l A04;
   public byte[] mOomReservation;

   public JavaCrashDetector(077 var1, 05F var2, 08V var3, 08V var4, 08l var5) {
      this.A04 = var5;
      this.A02 = var1;
      this.A00 = var2;
      this.A01 = var3;
      this.A03 = var4;
   }

   public final void A00(Thread param1, Throwable param2) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   public final 02v ABF() {
      return null;
   }

   public final 02Y ABx() {
      return 02Y.A07;
   }

   public final void start() {
      if (06T.A01() != null) {
         06T.A03(new 03J(this), 100);
      } else {
         Thread.setDefaultUncaughtExceptionHandler(new 0BL(0, this, Thread.getDefaultUncaughtExceptionHandler()));
      }

      this.mOomReservation = new byte[65536];
   }
}
