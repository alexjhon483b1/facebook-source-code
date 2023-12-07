package X;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

public final class 02h {
   public Throwable A00;
   public final Map A01;
   public final Map A02;
   public final Map A03;
   public final Map A04;
   public final Map A05;
   public final Map A06;
   public final Map A07;

   public _2h/* $FF was: 02h*/() {
      this((Throwable)null);
   }

   public _2h/* $FF was: 02h*/(Throwable var1) {
      this.A03 = new HashMap();
      this.A07 = new HashMap();
      this.A06 = new HashMap();
      this.A01 = new HashMap();
      this.A05 = new HashMap();
      this.A02 = new HashMap();
      this.A04 = new HashMap();
      this.A00 = var1;
   }

   public static void A00(07b var0, 02h var1, long var2) {
      var1.A03(var0, var2);
   }

   public final void A01(07g var1, boolean var2) {
      this.A01.put(var1, var2);
   }

   public final void A02(07b var1, int var2) {
      this.A03(var1, (long)var2);
   }

   public final void A03(07b var1, Long var2) {
      Map var3 = this.A06;
      if (var2 == null) {
         var3.remove(var1);
      } else {
         var3.put(var1, var2);
      }
   }

   public final void A04(07Y var1, String var2) {
      Map var4 = this.A07;
      String var3 = var2;
      if (var2 == null) {
         var3 = "unknown";
      }

      var4.put(var1, var3);
   }

   public final void A05(074 var1, 02Z var2, File var3) {
      String var6;
      Map var7;
      label15: {
         String var4;
         StringBuilder var5;
         if (var2 == 02Z.A02) {
            var7 = this.A02;
            var4 = var1.A01;
            if (var4.equals("__")) {
               var6 = var1.A00;
               break label15;
            }

            var5 = new StringBuilder();
         } else {
            var7 = this.A04;
            var5 = new StringBuilder();
            var4 = var1.A01;
         }

         var5.append(var4);
         var5.append(var1.A00);
         var6 = var5.toString();
      }

      var7.put(var6, var3.getPath());
   }

   public final void A06(Properties var1) {
      var1.putAll(this.A03);
      Iterator var2 = this.A07.entrySet().iterator();

      Entry var3;
      while(var2.hasNext()) {
         var3 = (Entry)var2.next();
         var1.put(((06z)var3.getKey()).A00, var3.getValue());
      }

      Iterator var6 = this.A06.entrySet().iterator();

      while(var6.hasNext()) {
         Entry var5 = (Entry)var6.next();
         var1.put(((06z)var5.getKey()).A00, var5.getValue().toString());
      }

      var2 = this.A01.entrySet().iterator();

      while(var2.hasNext()) {
         var3 = (Entry)var2.next();
         var1.put(((06z)var3.getKey()).A00, var3.getValue().toString());
      }

      Iterator var4 = this.A05.entrySet().iterator();
      if (var4.hasNext()) {
         ((Entry)var4.next()).getKey();
         throw new NullPointerException("getName");
      }
   }
}
