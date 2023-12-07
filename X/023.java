package X;

public final class 023 {
   public static final String A00(01E var0) {
      String var1 = var0.getClass().getGenericInterfaces()[0].toString();
      String var2 = var1;
      if (var1.startsWith("kotlin.jvm.functions.")) {
         var2 = var1.substring(21);
      }

      return var2;
   }
}
