package X;

public final class 04i {
   public static final String[] A07 = new String[]{"rchar:", "wchar:", "syscr:", "syscw:", "read_bytes:", "write_bytes:", "cancelled_write_bytes:"};
   public final long A00;
   public final long A01;
   public final long A02;
   public final long A03;
   public final long A04;
   public final long A05;
   public final long A06;

   public _4i/* $FF was: 04i*/(long var1, long var3, long var5, long var7, long var9, long var11, long var13) {
      this.A02 = var1;
      this.A05 = var3;
      this.A03 = var5;
      this.A06 = var7;
      this.A01 = var9;
      this.A04 = var11;
      this.A00 = var13;
   }

   public static 04i A00() {
      String[] var1 = A07;
      long[] var0 = new long[var1.length];
      return 06g.A00.AWX("/proc/self/io", var0, var1) ? new 04i(var0[0], var0[1], var0[2], var0[3], var0[4], var0[5], var0[6]) : null;
   }
}
