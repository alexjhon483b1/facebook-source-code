package X;

import android.content.ClipData;
import android.content.Intent;

public final class 00w {
   public static ClipData A00(Intent var0) {
      return var0.getClipData();
   }

   public static void A01(ClipData var0, Intent var1) {
      var1.setClipData(var0);
   }
}
