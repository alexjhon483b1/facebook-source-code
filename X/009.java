package X;

import android.util.Log;

public final class 009 implements 008 {
   public final void AXU(String var1) {
      Log.e("Security-LocalReporter", var1);
   }

   public final void AXV(String var1, String var2, Throwable var3) {
      StringBuilder var4 = new StringBuilder();
      var4.append("category=");
      var4.append(var1);
      var4.append(", message=");
      var4.append(var2);
      if (var3 != null) {
         var4.append(", cause=");
         var4.append(var3.toString());
      }

      Log.e("Security-LocalReporter", var4.toString());
   }
}
