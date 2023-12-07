package X;

import java.io.File;
import java.io.FileFilter;

// $FF: synthetic class
public final class 00o implements FileFilter {
   public final boolean accept(File var1) {
      08n.A00(var1);
      return var1.getName().endsWith(".dmp");
   }
}
