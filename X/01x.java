package X;

import android.os.ParcelFileDescriptor;
import java.net.Socket;
import java.util.Map;

public final class 01x {
   public final ParcelFileDescriptor A00;
   public final 09A A01;
   public final 03v A02;
   public final Integer A03;
   public final Integer A04;
   public final String A05;
   public final Socket A06;
   public final ParcelFileDescriptor A07;
   public final Map A08;

   public _1x/* $FF was: 01x*/(ParcelFileDescriptor var1, ParcelFileDescriptor var2, 09A var3, 03v var4, Integer var5, Integer var6, String var7, Socket var8, Map var9) {
      this.A04 = var5;
      this.A03 = var6;
      this.A02 = var4;
      this.A06 = var8;
      this.A08 = var9;
      this.A00 = var1;
      this.A07 = var2;
      this.A05 = var7;
      this.A01 = var3;
   }

   public _1x/* $FF was: 01x*/(Integer var1, Map var2) {
      this((ParcelFileDescriptor)null, (ParcelFileDescriptor)null, 09A.A02, (03v)null, 04j.A01, var1, "", (Socket)null, var2);
   }

   public final long A00(099 var1) {
      Number var2 = (Number)this.A08.get(var1);
      return var2 != null ? var2.longValue() : -1L;
   }

   public final void A01() {
      // $FF: Couldn't be decompiled
   }
}
