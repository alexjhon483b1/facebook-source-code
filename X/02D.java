package X;

import java.util.Iterator;

public final class 02D {
   public final int A00;
   public final 022 A01;

   public _2D/* $FF was: 02D*/(022 var1, int var2) {
      this.A01 = var1;
      this.A00 = var2;
   }

   public final void A00(Integer var1, String var2, int var3) {
      if (this.A00 != 0 && var2 != null && !var2.startsWith("com.facebook.lite")) {
         Iterator var4 = 00m.A04.iterator();

         do {
            if (!var4.hasNext()) {
               var4 = 00m.A03.iterator();

               do {
                  if (!var4.hasNext()) {
                     022 var7 = this.A01;
                     String var6;
                     if (var1.intValue() != 0) {
                        var6 = "QUERY";
                     } else {
                        var6 = "ACQUIRE_CONTENT_PROVIDER_CLIENT";
                     }

                     StringBuilder var5 = new StringBuilder();
                     var5.append("xapp comm to ");
                     var5.append(var2);
                     var7.AXi(var6, var2, var5.toString(), var3);
                     return;
                  }
               } while(!var2.startsWith((String)var4.next()));

               return;
            }
         } while(!var2.equals(var4.next()));
      }

   }
}
