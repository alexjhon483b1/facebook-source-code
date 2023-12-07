package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;

public abstract class 01k {
   public final 006 A00;

   public _1k/* $FF was: 01k*/(006 var1) {
      01j.A00();
      this.A00 = var1;
   }

   public ParcelFileDescriptor A05(Uri var1, String var2) {
      return this.A00.A03(var1, var2);
   }

   public abstract int A06(Uri var1, ContentValues var2, String var3, String[] var4);

   public abstract int A07(Uri var1, String var2, String[] var3);

   public abstract Cursor A08(Uri var1, String[] var2, String var3, String[] var4, String var5);

   public abstract Uri A09(Uri var1, ContentValues var2);

   public Bundle A0A(String var1, String var2, Bundle var3) {
      return this.A00.A02(var1, var2, var3);
   }

   public abstract String A0B(Uri var1);
}
