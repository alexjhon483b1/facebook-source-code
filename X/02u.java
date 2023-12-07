package X;

import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public final class 02u implements Runnable {
   public static final String __redex_internal_original_name = "ProcessImportanceProvider";
   public final RunningAppProcessInfo A00;
   public final Context A01;
   public final Object A02 = new Object();
   public final String A03;
   public final List A04 = new CopyOnWriteArrayList();
   public volatile boolean A05;

   public _2u/* $FF was: 02u*/(Context var1, String var2) {
      this.A01 = var1;
      this.A03 = var2;
      RunningAppProcessInfo var3 = new RunningAppProcessInfo();
      this.A00 = var3;
      var3.importance = 0;
   }

   public final void run() {
      // $FF: Couldn't be decompiled
   }
}
