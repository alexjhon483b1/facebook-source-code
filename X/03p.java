package X;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class 03p implements 03o {
   public File A00;
   public FileInputStream A01;
   public FileChannel A02;

   public _3p/* $FF was: 03p*/(File var1) {
      this.A00 = var1;
      FileInputStream var2 = new FileInputStream(var1);
      this.A01 = var2;
      this.A02 = var2.getChannel();
   }

   public final int AWL(ByteBuffer var1, long var2) {
      return this.A02.read(var1, var2);
   }

   public final void close() {
      this.A01.close();
   }

   public final boolean isOpen() {
      return this.A02.isOpen();
   }

   public final int read(ByteBuffer var1) {
      return this.A02.read(var1);
   }

   public final long size() {
      return this.A02.size();
   }

   public final int write(ByteBuffer var1) {
      return this.A02.write(var1);
   }
}
