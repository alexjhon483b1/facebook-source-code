package X;

import java.util.HashMap;
import java.util.regex.Pattern;

public final class 021 {
   public static final Pattern A00 = Pattern.compile("^(?!.*-fallback\\.facebook\\.com$)(.*?)\\.facebook\\.com$");
   public static final HashMap A01 = new HashMap();

   public static String A00(String var0) {
      HashMap var3 = A01;
      String var2 = (String)var3.get(var0);
      String var1 = var2;
      if (var2 == null) {
         var1 = A00.matcher(var0).replaceAll("$1-fallback.facebook.com");
         var3.put(var0, var1);
      }

      return var1;
   }
}
