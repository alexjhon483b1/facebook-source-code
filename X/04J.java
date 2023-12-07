package X;

import java.io.File;
import java.io.FileFilter;

// $FF: synthetic class
public final class 04J implements FileFilter {
   public final 02Z A00;

   // $FF: synthetic method
   public _4J/* $FF was: 04J*/(02Z var1) {
      this.A00 = var1;
   }

   public final boolean accept(File var1) {
      02Z var4 = this.A00;
      boolean var2;
      if (var1 != null && (var1.getName().startsWith(var4.A00) || var4 == 02Z.A03) && var1.getName().contains("suppl_")) {
         boolean var3 = var1.getName().endsWith("_prop.txt");
         var2 = true;
         if (var3) {
            return var2;
         }
      }

      var2 = false;
      return var2;
   }
}
