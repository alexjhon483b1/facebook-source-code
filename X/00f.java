package X;

import java.io.File;
import java.io.FileFilter;

// $FF: synthetic class
public final class 00f implements FileFilter {
   public final 02Z A00;
   public final 02Y A01;

   // $FF: synthetic method
   public _0f/* $FF was: 00f*/(02Z var1, 02Y var2) {
      this.A00 = var1;
      this.A01 = var2;
   }

   public final boolean accept(File var1) {
      02Z var5 = this.A00;
      02Y var4 = this.A01;
      boolean var2;
      if (var1 != null && var1.getName().startsWith(var5.A00)) {
         String var7 = var1.getName();
         StringBuilder var6 = new StringBuilder();
         var6.append(var4.A00);
         var6.append("_prop.txt");
         boolean var3 = var7.endsWith(var6.toString());
         var2 = true;
         if (var3) {
            return var2;
         }
      }

      var2 = false;
      return var2;
   }
}
