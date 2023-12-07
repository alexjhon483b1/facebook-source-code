package X;

import java.io.File;

public final class 03L implements 08R {
   public final 077 A00;
   public final 08l A01;
   public final 079 A02;
   public final 0BI A03;

   public _3L/* $FF was: 03L*/(077 var1, 08l var2, 0BI var3, 079 var4) {
      this.A03 = var3;
      this.A01 = var2;
      this.A00 = var1;
      this.A02 = var4;
   }

   // $FF: synthetic method
   public final 02v ABF() {
      return null;
   }

   public final 02Y ABx() {
      return 02Y.A0F;
   }

   public final void start() {
      03R var4 = (03R)this.A02.get();
      if (var4.A07) {
         boolean var2 = var4.A06;
         if (var2) {
            String var5 = 05v.A02("fb.report_source");
            String var6;
            if ("jest_e2e".equals(var5)) {
               var6 = "Ignore ufads on jest test runs.";
            } else {
               if (!"sapienz".equals(var5) || var4.A02 != 'f') {
                  var4.A01();
                  boolean var3 = var4.A01();
                  08l var8 = this.A01;
                  File var9 = var8.A01(var8.A07);
                  char var1 = var4.A01;
                  if (03Q.A01(04j.A01, var1) && !(new File(var9, "critical_suppl_java_detect_prop.txt")).exists() && !(new File(var9, "critical_java_prop.txt")).exists() && !(new File(var9, "critical_java_detect_prop.txt")).exists()) {
                     06i.A07("lacrima", "Java state with no java report, reporting as fad");
                  } else if (!var3) {
                     return;
                  }

                  var9 = new File(var9, "state.txt");
                  02h var7 = new 02h((Throwable)null);
                  var7.A03(072.A31, var9.lastModified() / 1000L);
                  var7.A03(072.A1M, System.currentTimeMillis() / 1000L);
                  var7.A04(072.A4e, "unexplained");
                  077 var10 = this.A00;
                  var10.A06(var7, 02Z.A02, this);
                  if (var2) {
                     var10.A06(var7, 02Z.A03, this);
                     return;
                  }

                  return;
               }

               var6 = "Ignore f states on sapienz runs.";
            }

            06i.A07("lacrima", var6);
         }
      }

   }
}
