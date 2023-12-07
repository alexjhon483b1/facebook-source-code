package X;

import java.io.File;
import java.io.FileFilter;

public final class 00H implements FileFilter {
   public final boolean accept(File var1) {
      return var1.getName().endsWith(".dmp");
   }
}
