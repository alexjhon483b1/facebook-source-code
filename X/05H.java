package X;

public final class 05H implements Runnable {
   public static final String __redex_internal_original_name = "ProcessErrorMonitorANRDetector$1";
   public final 00W A00;

   public _5H/* $FF was: 05H*/(00W var1) {
      this.A00 = var1;
   }

   public final void run() {
      00W var1 = this.A00;
      synchronized(var1){}

      try {
         if (var1.A03) {
            var1.A03 = false;
            05I var3 = new 05I(var1);
            Thread var2 = new Thread(var3, "ProcessErrorMonitorANRDetectorThread");
            var2.start();
         }
      } finally {
         ;
      }

   }
}
