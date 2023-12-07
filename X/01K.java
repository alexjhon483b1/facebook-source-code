package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 01K extends 01J {
   public static final ArrayList A00(Object... var0) {
      return var0.length == 0 ? new ArrayList() : new ArrayList(new 08B(var0, true));
   }

   public static final List A01(Object... var0) {
      if (var0.length > 0) {
         List var1 = Arrays.asList(var0);
         09E.A03(var1);
         return var1;
      } else {
         return 020.A00;
      }
   }

   public static final void A02() {
      throw new ArithmeticException("Index overflow has happened.");
   }
}
