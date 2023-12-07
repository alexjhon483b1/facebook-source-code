package X;

public enum 02Z {
   public static final 02Z[] A01;
   A02,
   A03;

   public String A00;

   static {
      02Z var1 = new 02Z("CRITICAL_REPORT", 0, "critical_");
      A02 = var1;
      02Z var0 = new 02Z("LARGE_REPORT", 1, "large_");
      A03 = var0;
      A01 = new 02Z[]{var1, var0};
   }

   public _2Z/* $FF was: 02Z*/(String var3) {
      this.A00 = var3;
   }
}
