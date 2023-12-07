package X;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build.VERSION;
import java.util.List;

public final class 04I {
   public final int A00;
   public final int A01;
   public final int A02;
   public final int A03;
   public final long A04;
   public final long A05;
   public final long A06;
   public final String A07;
   public final String A08;
   public final boolean A09;

   public _4I/* $FF was: 04I*/(ApplicationExitInfo var1, boolean var2) {
      this.A01 = var1.getPid();
      this.A07 = var1.getDescription();
      this.A02 = var1.getReason();
      this.A03 = var1.getStatus();
      this.A00 = var1.getImportance();
      this.A06 = var1.getTimestamp();
      this.A09 = var2;
      this.A04 = var1.getPss();
      this.A05 = var1.getRss();
      int var3 = VERSION.SDK_INT;
      Object var6 = null;
      String var5 = (String)var6;
      if (var3 != 30) {
         String var7 = var1.toString();
         int var4 = var7.indexOf("subreason=");
         var5 = (String)var6;
         if (var4 != -1) {
            var3 = var7.indexOf(" status=", var4);
            var4 += 10;
            if (var3 == -1) {
               var7 = var7.substring(var4);
            } else {
               var7 = var7.substring(var4, var3);
            }

            var4 = var7.indexOf(40);
            var5 = var7;
            if (var4 != -1) {
               var3 = var7.indexOf(41, var4);
               var5 = var7;
               if (var3 != -1) {
                  var5 = var7.substring(var4 + 1, var3);
               }
            }
         }
      }

      this.A08 = var5;
   }

   public static 04I A00(Context var0, int var1) {
      ActivityManager var5 = (ActivityManager)var0.getSystemService(ActivityManager.class);
      Object var4 = null;
      04I var3 = (04I)var4;
      if (var5 != null) {
         String var6 = var0.getPackageName();
         int var2 = var1;
         if (var1 == -1) {
            var2 = 0;
         }

         List var7 = var5.getHistoricalProcessExitReasons(var6, var2, 1);
         var3 = (04I)var4;
         if (var7 != null) {
            var3 = (04I)var4;
            if (!var7.isEmpty()) {
               ApplicationExitInfo var8 = (ApplicationExitInfo)var7.get(0);
               var3 = (04I)var4;
               if (var8 != null) {
                  var3 = new 04I(var8, ActivityManager.isLowMemoryKillReportSupported());
               }
            }
         }
      }

      return var3;
   }

   public static final String A01() {
      return null;
   }

   public final int A02() {
      return this.A00;
   }

   public final int A03() {
      return this.A01;
   }

   public final int A04() {
      return this.A02;
   }

   public final int A05() {
      return this.A03;
   }

   public final long A06() {
      return this.A04;
   }

   public final long A07() {
      return this.A05;
   }

   public final long A08() {
      return this.A06;
   }

   public final String A09() {
      return this.A07;
   }

   public final String A0A() {
      return this.A08;
   }

   public final boolean A0B() {
      return this.A09;
   }
}
