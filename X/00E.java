package X;

public enum 00E {
   public static final 00E A02;
   public static final 00E[] A03;
   A04,
   A05;

   public final String A00;
   public final String A01;

   static {
      00E var1 = new 00E("MINI", 0, "192.0.2.1", "edge-fblite-dev-mini");
      A04 = var1;
      00E var0 = new 00E("POOL1", 1, "203.0.113.2", "edge-fblite-dev-p1");
      A05 = var0;
      A03 = new 00E[]{var1, var0, new 00E("INSTAGRAM_P42", 2, "192.0.2.5", "edge-iglite-dev-p42"), new 00E("INSTAGRAM_P3", 3, "203.0.113.5", "edge-iglite-dev-p3")};
      A02 = var0;
   }

   public _0E/* $FF was: 00E*/(String var3, String var4) {
      this.A01 = var3;
      this.A00 = var4;
   }
}
