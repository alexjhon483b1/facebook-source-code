package X;

import java.lang.reflect.Method;

public final class 01z {
   public static 01z A04;
   public Class A00;
   public Method A01;
   public Method A02;
   public boolean A03;

   public _1z/* $FF was: 01z*/() {
      Class var1;
      boolean var10001;
      try {
         var1 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
         this.A00 = var1;
      } catch (ClassNotFoundException var4) {
         try {
            var1 = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            this.A00 = var1;
         } catch (NoSuchMethodException | ClassNotFoundException var3) {
            var10001 = false;
            return;
         }
      } catch (NoSuchMethodException var5) {
         var10001 = false;
         return;
      }

      try {
         this.A02 = var1.getMethod("setUseSessionTickets", Boolean.TYPE);
         this.A01 = this.A00.getMethod("setHostname", String.class);
         this.A03 = true;
      } catch (NoSuchMethodException | ClassNotFoundException var2) {
         var10001 = false;
      }

   }
}
