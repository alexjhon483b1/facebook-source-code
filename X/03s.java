package X;

import java.io.File;
import java.util.Comparator;

// $FF: synthetic class
public final class 03s implements Comparator {
   public final int compare(Object var1, Object var2) {
      File var10 = (File)var1;
      File var11 = (File)var2;
      String var8 = var10.getName();
      String var7 = var11.getName();
      int var6 = var8.lastIndexOf(95);
      int var5 = var7.lastIndexOf(95);
      if (var6 >= 0 && var5 >= 0 && var6 < var8.length() - 1 && var5 < var7.length() - 1) {
         int var4 = var8.indexOf(45, var6);
         int var3 = var7.indexOf(45, var5);
         if (var4 >= 0 && var3 >= 0) {
            try {
               return (int)(Long.parseLong(var8.substring(var6 + 1, var4)) - Long.parseLong(var7.substring(var5 + 1, var3)));
            } catch (NumberFormatException var9) {
               08Y.A00();
            }
         }
      }

      return (int)(var10.lastModified() - var11.lastModified());
   }
}
