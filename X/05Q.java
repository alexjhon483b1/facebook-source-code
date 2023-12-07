package X;

import android.content.Context;
import android.os.Parcel;
import java.io.File;
import java.io.IOException;

public final class 05Q extends 05z {
   public 0B8 A00;
   public boolean A01 = true;
   public final String A02;
   public final File A03;
   public final File A04;
   public final String A05;
   public final String A06;

   public _5Q/* $FF was: 05Q*/(Context var1, 0B8 var2) {
      super(var1, 000.A04(new File(var1.getApplicationInfo().dataDir), "lib-compressed"));
      this.A02 = "";
      File var3 = 000.A01(super.A01);
      this.A03 = var3;
      this.A04 = var3;
      this.A00 = var2;
      this.A06 = var2.A00;
      this.A05 = "assets/lib/metadata.txt";
   }

   public _5Q/* $FF was: 05Q*/(Context var1, 0B8 var2, File var3, File var4, String var5, String var6, String var7) {
      super(var1, var3);
      this.A02 = var5;
      this.A03 = 000.A01(var1);
      this.A04 = var4;
      this.A00 = var2;
      this.A06 = var6;
      this.A05 = var7;
   }

   public final String A05() {
      return "CompressedAssetSoSource";
   }

   public final 04U A08(boolean var1) {
      return new 04V(this, this);
   }

   public final byte[] A09() {
      File var2 = this.A03;
      Parcel var1 = Parcel.obtain();
      var2.getCanonicalFile();

      byte[] var5;
      try {
         var1.writeLong((long)06G.A01());
         var1.writeString(this.A02);
         var5 = var1.marshall();
      } finally {
         var1.recycle();
      }

      return var5;
   }

   public final String toString() {
      String var1;
      try {
         var1 = String.valueOf(super.A01.getCanonicalPath());
      } catch (IOException var3) {
         var1 = super.A01.getName();
      }

      StringBuilder var2 = 000.A0B();
      var2.append("CompressedAssetSoSource");
      var2.append("[root = ");
      var2.append(var1);
      var2.append(" flags = ");
      var2.append(super.A00);
      var2.append(" zipSource = ");
      var2.append(this.A04.getPath());
      var2.append(" compressedPath = ");
      var2.append(this.A06);
      var2.append(']');
      return var2.toString();
   }
}
