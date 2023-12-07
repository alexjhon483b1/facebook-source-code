package X;

import android.os.SystemClock;

public final class 050 implements 075 {
   public long A00;
   public Integer A01;

   public _50/* $FF was: 050*/(Integer var1, long var2) {
      this.A01 = var1;
      this.A00 = var2;
   }

   public final Integer ABy() {
      return 04j.A0W;
   }

   public final void AVJ(02h var1, 02Z var2) {
      long var3 = System.currentTimeMillis();
      long var7 = SystemClock.uptimeMillis();
      long var5 = this.A00;
      Integer var9 = this.A01;
      07b var10;
      if (var9 == 04j.A00) {
         02h.A00(072.A2n, var1, var3);
         var10 = 072.A2p;
      } else {
         if (var9 != 04j.A01) {
            return;
         }

         02h.A00(072.A1v, var1, var3);
         var10 = 072.A1w;
      }

      02h.A00(var10, var1, var7 - var5);
   }
}
