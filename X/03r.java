package X;

import java.io.File;
import java.io.FileFilter;

// $FF: synthetic class
public final class 03r implements FileFilter {
   public final 02Z A00;

   // $FF: synthetic method
   public _3r/* $FF was: 03r*/(02Z var1) {
      this.A00 = var1;
   }

   public final boolean accept(File var1) {
      02Z var4 = this.A00;
      boolean var2;
      if (var1 != null && var1.isDirectory()) {
         boolean var3 = var1.getName().startsWith(var4.A00);
         var2 = true;
         if (var3) {
            return var2;
         }
      }

      var2 = false;
      return var2;
   }
}
