package X;

public final class 02C {
   public static void A00(Throwable var0) {
      Class var1 = Error.class;
      if (!Error.class.isInstance(var0)) {
         var1 = RuntimeException.class;
         if (!RuntimeException.class.isInstance(var0)) {
            throw new RuntimeException(var0);
         }
      }

      throw (Throwable)var1.cast(var0);
   }
}
