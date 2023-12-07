package X;

import android.content.Context;
import android.os.Process;
import java.io.PrintWriter;

public final class 00X {
   public long A00;
   public 00a A01;
   public Integer A02;
   public final int A03;
   public final int A04;
   public final Context A05;
   public final String A06;

   public _0X/* $FF was: 00X*/(Context var1, String var2, int var3) {
      this.A05 = var1;
      this.A06 = var2;
      this.A02 = 04j.A00;
      this.A04 = var3;
      this.A03 = Process.myUid();
   }

   public static void A00(PrintWriter var0, Thread var1, StackTraceElement[] var2) {
      var0.print(var1);
      var0.print(" ");
      var0.print(var1.getState());
      var0.println(":");
      int var4 = var2.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         var0.println(var2[var3]);
      }

      var0.println();
   }

   public final void A01(00W param1, Integer param2, String param3, String param4) {
      // $FF: Couldn't be decompiled
   }
}
