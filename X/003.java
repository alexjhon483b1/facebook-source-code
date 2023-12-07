package X;

import java.io.File;
import java.io.FileFilter;

public final class 003 implements FileFilter {
   public final 001 A00;

   public _03/* $FF was: 003*/(001 var1) {
      this.A00 = var1;
   }

   public final boolean accept(File var1) {
      boolean var2;
      if (var1.getName().startsWith("anr_report_")) {
         boolean var3 = var1.getName().endsWith(".dmp");
         var2 = true;
         if (var3) {
            return var2;
         }
      }

      var2 = false;
      return var2;
   }
}
