package X;

import java.io.File;
import java.io.FilenameFilter;

public final class 04T implements FilenameFilter {
   public final 05z A00;

   public _4T/* $FF was: 04T*/(05z var1) {
      this.A00 = var1;
   }

   public final boolean accept(File var1, String var2) {
      boolean var3;
      if (!var2.equals("dso_state") && !var2.equals("dso_lock")) {
         boolean var4 = var2.equals("dso_deps");
         var3 = true;
         if (!var4) {
            return var3;
         }
      }

      var3 = false;
      return var3;
   }
}
