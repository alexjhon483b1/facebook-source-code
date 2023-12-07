package X;

import android.app.Application;
import android.content.Context;

public final class 00C {
   public static volatile Application A00;
   public static volatile Context A01;

   public static Application A00() {
      Application var0 = A00;
      if (var0 != null) {
         return var0;
      } else {
         throw new IllegalStateException("AppContext.set has not been invoked");
      }
   }

   public static Context A01() {
      Context var0 = A01;
      if (var0 != null) {
         return var0;
      } else {
         throw new IllegalStateException("AppContext.set has not been invoked");
      }
   }
}
