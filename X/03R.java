package X;

import java.io.File;

public final class 03R {
   public final char A00;
   public final char A01;
   public final char A02;
   public final char A03;
   public final char A04;
   public final File A05;
   public final boolean A06;
   public final boolean A07;

   public _3R/* $FF was: 03R*/() {
      this.A07 = false;
      this.A05 = null;
      this.A03 = 0;
      this.A04 = 0;
      this.A00 = 0;
      this.A01 = 0;
      this.A02 = 0;
      this.A06 = false;
   }

   public _3R/* $FF was: 03R*/(File var1, char var2, char var3, char var4, char var5, boolean var6) {
      char var7;
      label52: {
         super();
         this.A07 = true;
         this.A05 = var1;
         this.A03 = var2;
         this.A04 = var3;
         this.A00 = var4;
         if (var3 != '0' && var3 != 'i') {
            label50: {
               if (var3 == '9' && var2 == 'j') {
                  var7 = var2;
                  break label52;
               }

               if (var2 != 'R' && var2 != 'U' && var2 != 'r' && var2 != 'c' && var2 != 'u' && var2 != 'q' && var2 != 'm') {
                  var4 = var3;
                  if (var2 != 'j') {
                     break label50;
                  }
               }

               var4 = var3;
               if (var3 == 'Q') {
                  var7 = var2;
                  break label52;
               }
            }
         } else {
            var7 = var2;
            if (var4 == '0') {
               break label52;
            }

            var7 = var2;
            if (var4 == 'i') {
               break label52;
            }

            var4 = var4;
         }

         var7 = var4;
      }

      this.A01 = var7;
      this.A02 = var5;
      this.A06 = var6;
   }

   public final boolean A00() {
      boolean var2;
      label14: {
         char var1 = this.A03;
         Integer var4 = 04j.A0M;
         if (03Q.A01(var4, var1)) {
            var1 = this.A04;
            if (!03Q.A01(04j.A0C, var1)) {
               break label14;
            }
         }

         boolean var3 = 03Q.A01(var4, this.A00);
         var2 = false;
         if (!var3) {
            return var2;
         }
      }

      var2 = true;
      return var2;
   }

   public final boolean A01() {
      char var1 = this.A03;
      boolean var2;
      if (!03Q.A01(04j.A01, var1)) {
         Integer var4 = 04j.A0M;
         if (!03Q.A01(var4, var1)) {
            var1 = this.A04;
            if (!03Q.A01(04j.A0C, var1)) {
               boolean var3 = 03Q.A01(var4, this.A00);
               var2 = true;
               if (!var3) {
                  return var2;
               }
            }
         }
      }

      var2 = false;
      return var2;
   }
}
