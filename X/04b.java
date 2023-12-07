package X;

import java.io.Closeable;
import java.io.InputStream;

public final class 04b implements Closeable {
   public final 04X A00;
   public final InputStream A01;

   public _4b/* $FF was: 04b*/(04X var1, InputStream var2) {
      this.A00 = var1;
      this.A01 = var2;
   }

   public final void close() {
      this.A01.close();
   }
}
