package X;

import java.io.File;
import java.io.FileFilter;

public final class 00g implements FileFilter {
   public final 002 A00;

   public _0g/* $FF was: 00g*/(002 var1) {
      this.A00 = var1;
   }

   public final boolean accept(File var1) {
      boolean var2;
      if (var1.getName().startsWith("large_")) {
         boolean var3 = var1.getName().endsWith("_anr_prop.txt");
         var2 = true;
         if (var3) {
            return var2;
         }
      }

      var2 = false;
      return var2;
   }
}
