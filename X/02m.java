package X;

import android.os.Handler;
import android.os.HandlerThread;
import java.io.File;
import java.util.Properties;

public final class 02m {
   public char A00 = '!';
   public final Handler A01;
   public final File A02;
   public final Properties A03 = new Properties();

   public _2m/* $FF was: 02m*/(File var1) {
      this.A02 = var1;
      HandlerThread var2 = new HandlerThread("ForegroundEntityMapper");
      var2.start();
      this.A01 = new Handler(var2.getLooper());
   }
}
