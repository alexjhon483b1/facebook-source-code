package X;

import java.io.File;
import java.util.Comparator;

// $FF: synthetic class
public final class 04L implements Comparator {
   public final int compare(Object var1, Object var2) {
      File var3 = (File)var1;
      File var4 = (File)var2;
      return (int)(var3.lastModified() - var4.lastModified());
   }
}
