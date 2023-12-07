package X;

import java.io.File;
import java.io.FileFilter;

// $FF: synthetic class
public final class 04K implements FileFilter {
   public final 02Z A00;
   public final boolean A01;

   // $FF: synthetic method
   public _4K/* $FF was: 04K*/(02Z var1, boolean var2) {
      this.A00 = var1;
      this.A01 = var2;
   }

   public final boolean accept(File var1) {
      02Z var4 = this.A00;
      boolean var2 = this.A01;
      if (var1 != null && (var1.getName().startsWith(var4.A00) || var4 == 02Z.A03) && (!var2 || var1.getName().contains("suppl_"))) {
         boolean var3 = var1.getName().endsWith("_attach.txt");
         var2 = true;
         if (var3) {
            return var2;
         }
      }

      var2 = false;
      return var2;
   }
}
