package X;

import android.app.ActivityManager;
import java.util.HashSet;
import java.util.Set;

public final class 00a extends Thread {
   public static final String __redex_internal_original_name = "ProcessAnrErrorMonitor$MonitorThread";
   public boolean A00;
   public boolean A01;
   public boolean A02;
   public final long A03;
   public final ActivityManager A04;
   public final Object A05;
   public final Set A06;
   public volatile 00W A07;
   public final 00X A08;

   public _0a/* $FF was: 00a*/(ActivityManager var1, 00X var2, 00W var3, long var4) {
      StringBuilder var7;
      String var8;
      label11: {
         this.A08 = var2;
         var7 = new StringBuilder();
         var7.append("ProcessAnrErrorMonitorThread:");
         if (06v.A04 != null) {
            String var6 = 06v.A04.A02;
            var8 = var6;
            if (var6 != null) {
               break label11;
            }
         }

         var8 = "unknown";
      }

      var7.append(var8);
      super(var7.toString());
      this.A05 = new Object();
      this.A06 = new HashSet();
      this.A04 = var1;
      this.A07 = var3;
      this.A03 = var4;
      this.A00 = true;
   }

   public final void run() {
      // $FF: Couldn't be decompiled
   }
}
