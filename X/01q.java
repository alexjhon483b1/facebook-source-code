package X;

import java.util.regex.Matcher;

public final class 01q {
   public static String A00(String var0, Object... var1) {
      int var3 = var1.length;

      for(int var2 = 0; var2 < var3; ++var2) {
         Object var4 = var1[var2];
         String var5;
         if (var4 != null) {
            var5 = Matcher.quoteReplacement(var4.toString());
         } else {
            var5 = "null";
         }

         var0 = var0.replaceFirst("\\{\\}", var5);
      }

      return var0;
   }
}
