package X;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Build.VERSION;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class 00t {
   public int A00 = 0;
   public long A01 = 0L;
   public ClipData A02 = null;
   public ComponentName A03 = null;
   public Intent A04 = null;
   public Rect A05 = null;
   public Uri A06 = null;
   public 008 A07;
   public String A08 = null;
   public String A09 = null;
   public boolean A0A = false;
   public Bundle A0B = null;
   public String A0C = null;
   public final Set A0D = new HashSet();

   public final int A00(int var1) {
      int var3 = VERSION.SDK_INT;
      int var2 = var1;
      if (var3 >= 23) {
         long var4 = this.A01;
         boolean var6 = false;
         if ((8L & var4) != 0L) {
            var6 = true;
         }

         if (!var6) {
            var2 = var1;
            if (var3 > 30) {
               var2 = var1 & -33554433;
            }

            var3 = 67108864;
            var1 = var2;
            var2 = var3;
         } else {
            var1 &= -67108865;
            var2 = var1;
            if (var3 <= 30) {
               return var2;
            }

            var2 = 33554432;
         }

         var2 |= var1;
      }

      return var2;
   }

   public final PendingIntent A01(Context var1, int var2, int var3) {
      return PendingIntent.getActivity(var1, var2, this.A04(var1), this.A00(var3));
   }

   public final PendingIntent A02(Context var1, int var2, int var3) {
      return PendingIntent.getBroadcast(var1, var2, this.A04(var1), this.A00(var3));
   }

   public final PendingIntent A03(Context var1, int var2, int var3) {
      return PendingIntent.getService(var1, var2, this.A04(var1), this.A00(var3));
   }

   public Intent A04(Context var1) {
      Intent var6 = new Intent();
      var6.setComponent(this.A03);
      var6.setFlags(this.A00);
      String var7;
      if (this.A0A) {
         var6.setComponent(new ComponentName(var1, "com.facebook.invalid_class.f4c3b00c"));
         var7 = var1.getPackageName();
      } else {
         var6.setAction(this.A08);
         var6.setDataAndType(this.A06, this.A09);
         var6.setSourceBounds(this.A05);
         var6.setSelector(this.A04);
         if (VERSION.SDK_INT >= 16) {
            00w.A01(this.A02, var6);
         }

         Iterator var4 = this.A0D.iterator();

         while(var4.hasNext()) {
            var6.addCategory((String)var4.next());
         }

         if (this.A0B != null) {
            var6.setExtrasClassLoader(var1.getClassLoader());
            var6.putExtras(this.A0B);
         }

         long var2 = this.A01;
         if ((1L & var2) != 0L) {
            if ((4L & var2) != 0L) {
               return var6;
            }

            String var5 = this.A0C;
            String var9 = var5;
            if (var5 == null) {
               var9 = var1.getPackageName();
               this.A0C = var9;
            }

            var6.setPackage(var9);
            008 var8;
            if ((2L & this.A01) != 0L) {
               if (this.A0C.equals(var1.getPackageName())) {
                  return var6;
               }

               var8 = this.A07;
               if (var8 == null) {
                  throw new IllegalArgumentException("Please set reporter for SecurePendingIntent library");
               }

               var8.AXU("SecurePendingIntent is configured to allow only implicit intent going to the same app, but detected intent for a different app.");
            }

            if (var6.getAction() != null && !var6.getAction().startsWith("android")) {
               return var6;
            }

            if (var6.getCategories() != null && !var6.getCategories().isEmpty()) {
               return var6;
            }

            var8 = this.A07;
            if (var8 != null) {
               var8.AXU("SecurePendingIntent is configured to allow implicit intent with either customized action or categories");
               return var6;
            }

            throw new IllegalArgumentException("Please set reporter for SecurePendingIntent library");
         }

         if (var6.getComponent() == null) {
            throw new SecurityException("Must generate PendingIntent based on an explicit intent.");
         }

         var7 = var6.getComponent().getPackageName();
      }

      var6.setPackage(var7);
      return var6;
   }

   public 00t A05(Intent var1, ClassLoader var2) {
      this.A03 = var1.getComponent();
      this.A08 = var1.getAction();
      this.A06 = var1.getData();
      this.A09 = var1.getType();
      this.A05 = var1.getSourceBounds();
      this.A04 = var1.getSelector();
      if (VERSION.SDK_INT >= 16) {
         this.A02 = 00w.A00(var1);
      }

      Set var3 = var1.getCategories();
      if (var3 != null) {
         this.A0D.addAll(var3);
      }

      this.A00 = var1.getFlags();
      if (var1.getExtras() != null) {
         if (var2 != null) {
            var1.setExtrasClassLoader(var2);
         }

         this.A06(var1.getExtras(), var2);
      }

      return this;
   }

   public 00t A06(Bundle var1, ClassLoader var2) {
      Bundle var4 = this.A0B;
      Bundle var3 = var4;
      if (var4 == null) {
         var3 = new Bundle();
         this.A0B = var3;
      }

      if (var2 != null) {
         var3.setClassLoader(var2);
      }

      this.A0B.putAll(var1);
      return this;
   }
}
