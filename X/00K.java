package X;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class 00K {
   public int A00;
   public int A01 = 0;
   public long A02;
   public long A03;
   public long A04;
   public long A05;
   public long A06;
   public long A07;
   public long A08;
   public File A09;
   public String A0A;
   public String A0B;
   public String A0C;
   public String A0D;
   public String A0E;
   public String A0F;
   public String A0G;
   public boolean A0H;
   public boolean A0I;
   public boolean A0J;
   public boolean A0K;
   public final 08l A0L;
   public final List A0M = new ArrayList();
   public final 079 A0N;
   public final 079 A0O;
   public final 079 A0P;

   public _0K/* $FF was: 00K*/(08l var1, 079 var2, 079 var3, 079 var4) {
      this.A0L = var1;
      this.A0P = var2;
      this.A0O = var3;
      this.A0N = var4;
      File var6 = var1.A05;
      04r.A01(var6, "Did you call SessionManager.init()?");
      StringBuilder var5 = new StringBuilder();
      var5.append("anr_report_");
      var5.append(0);
      var5.append(".dmp");
      this.A09 = new File(var6, var5.toString());
   }

   public static void A00(00K param0) {
      // $FF: Couldn't be decompiled
   }
}
