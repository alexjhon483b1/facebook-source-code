package X;

import android.app.ActivityManager.MemoryInfo;
import android.os.Process;
import android.os.SystemClock;

public final class 04N implements 04M {
   public int A00;
   public int A01;
   public int A02;
   public long A03;
   public long A04;
   public long A05;
   public long A06;
   public long A07;
   public long A08;
   public long A09;
   public long A0A;
   public long A0B;
   public MemoryInfo A0C;
   public 04i A0D;
   public 01d A0E;
   public 04h A0F;
   public String A0G;
   public boolean A0H;
   public boolean A0I;

   public _4N/* $FF was: 04N*/() {
      this.A00();
   }

   public _4N/* $FF was: 04N*/(04M var1) {
      this.A00();
      04N var2 = (04N)var1;
      this.A02 = var2.A02;
      this.A00 = var2.A00;
      this.A07 = var2.A07;
      this.A0A = var2.A0A;
      this.A09 = var2.A09;
      this.A08 = var2.A08;
      this.A0B = var2.A0B;
      this.A03 = var2.A03;
      this.A04 = var2.A04;
      this.A05 = var2.A05;
      if (var1 instanceof 04N) {
         this.A0E = var2.A0E;
         this.A0D = var2.A0D;
         this.A0F = var2.A0F;
      }

      this.A0G = var2.A0G;
      this.A0C = var2.A0C;
      this.A0I = true;
   }

   public final void A00() {
      this.A0I = false;
      this.A0H = false;
      this.A02 = -1;
      this.A00 = -1;
      this.A01 = -1;
      this.A0G = "not set";
      this.A07 = -1L;
      this.A0A = -1L;
      this.A09 = -1L;
      this.A08 = -1L;
      this.A0B = -1L;
      this.A03 = -1L;
      this.A04 = -1L;
      this.A05 = -1L;
      this.A0E = null;
      this.A0C = null;
      this.A0D = null;
      this.A0F = null;
   }

   public final void A7J(int var1) {
      var1 = Process.myTid();
      this.A02 = var1;
      this.A00 = Process.getThreadPriority(var1);
      this.A07 = Process.getElapsedCpuTime();
      this.A0A = SystemClock.currentThreadTimeMillis();
      this.A0I = true;
      this.A0H = false;
      long[] var2 = 04e.A00("/proc/self/stat");
      this.A09 = var2[0];
      this.A08 = var2[2];
      this.A06 = var2[5];
      var1 = Process.myTid();
      StringBuilder var3 = new StringBuilder();
      var3.append("/proc/self/task/");
      var3.append(var1);
      var3.append("/stat");
      this.A0B = 04e.A00(var3.toString())[2];
      04g var4 = 04f.A00();
      this.A03 = var4.A00;
      this.A04 = var4.A02;
      this.A05 = var4.A03;
      this.A0D = 04i.A00();
      this.A0F = new 04h(0At.A06.size());
      this.A0I = true;
      this.A0H = false;
      this.A01 = -1;
      this.A0I = true;
      this.A0H = false;
   }
}
