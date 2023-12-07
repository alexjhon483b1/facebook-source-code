package X;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;

public final class 02F {
   public static ContentProviderClient A00(ContentResolver var0, Uri var1, int var2) {
      Integer var4 = 04j.A00;
      String var3;
      if (var1 != null) {
         var3 = var1.getAuthority();
      } else {
         var3 = null;
      }

      00m.A00(var4, var3, var2);
      return var0.acquireUnstableContentProviderClient(var1);
   }

   public static Cursor A01(ContentResolver var0, Uri var1, Bundle var2, String[] var3, int var4) {
      Integer var6 = 04j.A01;
      String var5;
      if (var1 != null) {
         var5 = var1.getAuthority();
      } else {
         var5 = null;
      }

      00m.A00(var6, var5, var4);
      return var0.query(var1, var3, var2, (CancellationSignal)null);
   }

   public static Cursor A02(ContentResolver var0, Uri var1, String var2, String var3, String[] var4, String[] var5, int var6) {
      Integer var8 = 04j.A01;
      String var7;
      if (var1 != null) {
         var7 = var1.getAuthority();
      } else {
         var7 = null;
      }

      00m.A00(var8, var7, var6);
      return var0.query(var1, var4, var2, var5, var3);
   }
}
