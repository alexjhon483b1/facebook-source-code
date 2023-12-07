package X;

import android.content.ContentProvider;
import android.content.ContentProviderResult;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Build.VERSION;
import java.util.ArrayList;

public abstract class 006 extends ContentProvider {
   public static String A03;
   public 01k A00;
   public boolean A01 = false;
   public volatile ProviderInfo A02;

   public static 01k A00(006 param0) {
      // $FF: Couldn't be decompiled
   }

   private void A01() {
      if (VERSION.SDK_INT >= 19) {
         try {
            this.getCallingPackage();
         } catch (SecurityException var2) {
         }
      }
   }

   public final Bundle A02(String var1, String var2, Bundle var3) {
      return super.call(var1, var2, var3);
   }

   public final ParcelFileDescriptor A03(Uri var1, String var2) {
      return super.openFile(var1, var2);
   }

   public void A04(Context var1, ProviderInfo var2) {
   }

   public final ContentProviderResult[] applyBatch(ArrayList var1) {
      this.getContext();
      this.A01();
      return A00(this).A00.applyBatch(var1);
   }

   public final void attachInfo(Context var1, ProviderInfo var2) {
      this.A02 = var2;
      super.attachInfo(var1, var2);
      this.A04(var1, var2);
   }

   public final int bulkInsert(Uri var1, ContentValues[] var2) {
      this.getContext();
      this.A01();
      return A00(this).A00.bulkInsert(var1, var2);
   }

   public final Bundle call(String var1, String var2, Bundle var3) {
      this.getContext();
      this.A01();
      return A00(this).A0A(var1, var2, var3);
   }

   public final int delete(Uri var1, String var2, String[] var3) {
      this.getContext();
      this.A01();
      return A00(this).A07(var1, var2, var3);
   }

   public final String[] getStreamTypes(Uri var1, String var2) {
      return A00(this).A00.getStreamTypes(var1, var2);
   }

   public final String getType(Uri var1) {
      return A00(this).A0B(var1);
   }

   public final Uri insert(Uri var1, ContentValues var2) {
      this.getContext();
      this.A01();
      return A00(this).A09(var1, var2);
   }

   public final boolean isTemporary() {
      return A00(this).A00.isTemporary();
   }

   public final void onConfigurationChanged(Configuration var1) {
      A00(this).A00.onConfigurationChanged(var1);
   }

   public final boolean onCreate() {
      return true;
   }

   public final void onLowMemory() {
      if (01j.A00.block(-1L)) {
         A00(this).A00.onLowMemory();
      }

   }

   public final void onTrimMemory(int var1) {
      if (01j.A00.block(-1L)) {
         A00(this).A00.onTrimMemory(var1);
      }

   }

   public final AssetFileDescriptor openAssetFile(Uri var1, String var2) {
      this.getContext();
      this.A01();
      return A00(this).A00.openAssetFile(var1, var2);
   }

   public final ParcelFileDescriptor openFile(Uri var1, String var2) {
      this.getContext();
      this.A01();
      return A00(this).A05(var1, var2);
   }

   public final AssetFileDescriptor openTypedAssetFile(Uri var1, String var2, Bundle var3) {
      this.getContext();
      this.A01();
      return A00(this).A00.openTypedAssetFile(var1, var2, var3);
   }

   public final Cursor query(Uri var1, String[] var2, String var3, String[] var4, String var5) {
      this.getContext();
      this.A01();
      return A00(this).A08(var1, var2, var3, var4, var5);
   }

   public final Cursor query(Uri var1, String[] var2, String var3, String[] var4, String var5, CancellationSignal var6) {
      this.getContext();
      this.A01();
      return A00(this).A08(var1, var2, var3, var4, var5);
   }

   public final void shutdown() {
      A00(this).A00.shutdown();
   }

   public final int update(Uri var1, ContentValues var2, String var3, String[] var4) {
      this.getContext();
      this.A01();
      return A00(this).A06(var1, var2, var3, var4);
   }
}
