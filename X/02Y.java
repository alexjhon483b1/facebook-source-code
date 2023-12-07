package X;

public enum 02Y {
   public static final 02Y[] A02;
   A03,
   A04,
   A05,
   A06,
   A07,
   A08,
   A09,
   A0A,
   A0B,
   A0C,
   A0D,
   A0E,
   A0F,
   A0G;

   public final String A00;
   public final boolean A01;

   static {
      02Y var15 = new 02Y("ANR", "anr", 0, false);
      A03 = var15;
      02Y var12 = new 02Y("ANR_APP_DEATH", "anr_app_death", 1, false);
      A04 = var12;
      02Y var27 = new 02Y("APP_LIFECYCLE", "app_lifecycle", 2, true);
      A05 = var27;
      02Y var17 = new 02Y("ATTRIBUTION_ID", "attribution_id", 3, true);
      02Y var13 = new 02Y("BROADCAST", "broadcast", 4, true);
      02Y var6 = new 02Y("JAVA", "java", 5, false);
      A07 = var6;
      02Y var0 = new 02Y("JAVA_DETECT", "java_detect", 6, true);
      02Y var4 = new 02Y("JAVA_APP_DEATH", "java_app_death", 7, false);
      02Y var21 = new 02Y("JAVASCRIPT", "javascript", 8, false);
      02Y var9 = new 02Y("CRASHLOOP", "crashloop", 9, false);
      02Y var1 = new 02Y("NATIVE", "native", 10, false);
      A08 = var1;
      02Y var23 = new 02Y("HELIUM_RENDERER_CRASH", "helium_renderer_crash", 11, false);
      02Y var2 = new 02Y("LIGHT_MOBILE_CONFIG", "light_mobile_config", 12, true);
      02Y var30 = new 02Y("MOBILE_CONFIG", "mobile_config", 13, true);
      02Y var5 = new 02Y("NAVIGATION", "navigation", 14, true);
      A09 = var5;
      02Y var29 = new 02Y("PERIODIC_MEMORY", "periodic_memory", 15, true);
      A0B = var29;
      02Y var10 = new 02Y("LATE_STARTUP", "late_startup", 16, true);
      02Y var8 = new 02Y("AFTER_STARTUP", "after_startup", 17, true);
      02Y var16 = new 02Y("REPORT_SOURCE", "report_source", 18, true);
      A0C = var16;
      02Y var19 = new 02Y("SOFT_ERROR", "soft_error", 19, false);
      A0D = var19;
      02Y var20 = new 02Y("STARTUP", "startup", 20, true);
      A0E = var20;
      02Y var3 = new 02Y("UNEXPLAINED", "unexplained", 21, false);
      A0F = var3;
      02Y var24 = new 02Y("TEST_CRASH", "test", 22, false);
      02Y var28 = new 02Y("BUG_REPORT", "bug_report", 23, false);
      02Y var25 = new 02Y("EXTRA_COLLECTION", "extra_collection", 24, false);
      02Y var22 = new 02Y("CUSTOM_APP_DATA", "custom_app_data", 25, true);
      02Y var11 = new 02Y("CUSTOM_DATA", "custom_data", 26, true);
      A06 = var11;
      02Y var26 = new 02Y("FOREGROUND_TRANSITION", "foreground_transition", 27, true);
      02Y var7 = new 02Y("USER_PERCEPTIBLE_SCOPE", "user_perceptible_scope", 28, true);
      02Y var18 = new 02Y("USER_CHANGE", "user_change", 29, true);
      A0G = var18;
      02Y var14 = new 02Y("PERIODIC_BATTERY", "periodic_battery", 30, true);
      A0A = var14;
      A02 = new 02Y[]{var15, var12, var27, var17, var13, var6, var0, var4, var21, var9, var1, var23, var2, var30, var5, var29, var10, var8, var16, var19, var20, var3, var24, var28, var25, var22, var11, var26, var7, var18, var14, new 02Y("MEMORY_TRIM", "memory_trim", 31, true), new 02Y("BACKGROUND", "background", 32, true)};
   }

   public _2Y/* $FF was: 02Y*/(int var3, boolean var4) {
      this.A00 = var2;
      this.A01 = var4;
   }

   public final String toString() {
      return this.A00;
   }
}
