package X;

import android.app.ActivityManager;
import android.content.Context;

public final class 02e implements 075 {
   public Context A00;

   public _2e/* $FF was: 02e*/(Context var1) {
      this.A00 = var1;
   }

   public final Integer ABy() {
      return 04j.A0J;
   }

   public final void AVJ(02h var1, 02Z var2) {
      ActivityManager var3 = (ActivityManager)this.A00.getSystemService("activity");
      if (var3 != null) {
         var1.A02(072.A23, var3.getMemoryClass());
         var1.A02(072.A1g, var3.getLargeMemoryClass());
      }

   }
}
