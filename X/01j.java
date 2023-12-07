package X;

import android.os.ConditionVariable;
import java.util.HashMap;
import java.util.Map;

public final class 01j {
   public static final ConditionVariable A00 = new ConditionVariable(true);
   public static final Map A01 = new HashMap();

   public static void A00() {
      ConditionVariable var2 = A00;
      boolean var0 = var2.block(-1L);
      Object[] var1 = new Object[1];
      String var3;
      if (var0) {
         var1[0] = var2.hashCode();
         var3 = "Not blocking Provider (%s)";
      } else {
         var1[0] = var2.hashCode();
         06i.A0J("InitStatus", "Blocking Provider (%s)", var1);
         var2.block();
         var1 = new Object[]{var2.hashCode()};
         var3 = "Unblocked Provider (%s)";
      }

      06i.A0J("InitStatus", var3, var1);
   }
}
