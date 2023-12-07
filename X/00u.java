package X;

import android.content.Context;
import android.content.Intent;

public final class 00u extends 00t {
   public 00j A00 = null;
   public boolean A01 = false;

   public final Intent A04(Context var1) {
      Intent var4 = super.A04(var1);
      if (this.A01) {
         boolean var3 = false;
         boolean var2 = var3;
         if ((4L & super.A01) == 0L) {
            String var5 = var4.getPackage();
            var2 = var3;
            if (var5 != null) {
               if (var5.equals(var1.getPackageName())) {
                  var2 = true;
               } else {
                  var2 = var3;
                  if (this.A00 != null) {
                     try {
                        02S var6 = 02S.A01(00l.A01(var1, var5));
                        var2 = this.A00.A04(var6, 00l.A03(var1));
                     } catch (Exception var10) {
                        008 var8 = super.A07;
                        var2 = var3;
                        if (var8 != null) {
                           StringBuilder var7 = new StringBuilder();
                           var7.append("Exception checking identity of package=");
                           var7.append(var5);
                           var7.append(": ");
                           var7.append(var10.toString());
                           var8.AXU(var7.toString());
                           var2 = var3;
                        }
                     }
                  }
               }
            }
         }

         if (var2) {
            008 var11 = super.A07;
            if (var11 != null) {
               02U.A01(var1, var4, var11, (String)null);
            } else {
               try {
                  02U.A02(var1, var4, (String)null);
                  return var4;
               } catch (00v var9) {
               }
            }
         }
      }

      return var4;
   }

   public final void A07() {
      super.A01 |= 1L;
   }

   public final void A08(Intent var1, ClassLoader var2) {
      super.A05(var1, var2);
   }
}
