package X;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.Build.VERSION;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class 02A extends Service {
   public static final Object A05 = new Object();
   public static final HashMap A06 = new HashMap();
   public 04m A00;
   public 04o A01;
   public boolean A02 = false;
   public 04l A03;
   public final ArrayList A04;

   public _2A/* $FF was: 02A*/() {
      ArrayList var1;
      if (VERSION.SDK_INT >= 26) {
         var1 = null;
      } else {
         var1 = new ArrayList();
      }

      this.A04 = var1;
   }

   public static void A00(Context var0, Intent var1, Class var2, int var3) {
      ComponentName var7 = new ComponentName(var0, var2);
      Object var5 = A05;
      synchronized(var5){}

      Throwable var10000;
      boolean var10001;
      label396: {
         04o var4;
         HashMap var6;
         try {
            var6 = A06;
            var4 = (04o)var6.get(var7);
         } catch (Throwable var49) {
            var10000 = var49;
            var10001 = false;
            break label396;
         }

         Object var52 = var4;
         if (var4 == null) {
            Object var50;
            label386: {
               08N var53;
               label398: {
                  try {
                     if (VERSION.SDK_INT >= 26) {
                        var53 = new 08N(var7, var0, var3);
                        break label398;
                     }
                  } catch (Throwable var48) {
                     var10000 = var48;
                     var10001 = false;
                     break label396;
                  }

                  try {
                     var50 = new 08S(var7, var0);
                     break label386;
                  } catch (Throwable var47) {
                     var10000 = var47;
                     var10001 = false;
                     break label396;
                  }
               }

               var50 = var53;
            }

            try {
               var6.put(var7, var50);
            } catch (Throwable var46) {
               var10000 = var46;
               var10001 = false;
               break label396;
            }

            var52 = var50;
         }

         label373:
         try {
            ((04o)var52).A03(var3);
            ((04o)var52).A04(var1);
            return;
         } catch (Throwable var45) {
            var10000 = var45;
            var10001 = false;
            break label373;
         }
      }

      while(true) {
         Throwable var51 = var10000;

         try {
            throw var51;
         } catch (Throwable var44) {
            var10000 = var44;
            var10001 = false;
            continue;
         }
      }
   }

   public 04n A02() {
      04m var2 = this.A00;
      04n var1 = null;
      Object var20;
      if (var2 != null) {
         try {
            return var2.A5Y();
         } catch (SecurityException var17) {
            String var3 = var17.getMessage();
            var20 = var17;
            if (var3 != null) {
               var20 = var17;
               if (var3.contains("Caller no longer running")) {
                  Log.e("JobIntentService", "Captured a \"Caller no longer running\"", var17);
                  return null;
               }
            }
         }
      } else {
         ArrayList var21 = this.A04;
         synchronized(var21){}

         Throwable var10000;
         boolean var10001;
         label165: {
            try {
               if (var21.size() > 0) {
                  var1 = (04n)var21.remove(0);
               }
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               break label165;
            }

            label162:
            try {
               return var1;
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break label162;
            }
         }

         while(true) {
            var20 = var10000;

            try {
               break;
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               continue;
            }
         }
      }

      throw var20;
   }

   public final void A03() {
      ArrayList var2 = this.A04;
      if (var2 != null) {
         synchronized(var2){}

         Throwable var10000;
         boolean var10001;
         label226: {
            label232: {
               try {
                  this.A03 = null;
                  if (var2.size() > 0) {
                     this.A04(false);
                     break label232;
                  }
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label226;
               }

               try {
                  if (!this.A02) {
                     this.A01.A00();
                  }
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label226;
               }
            }

            label214:
            try {
               return;
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label214;
            }
         }

         while(true) {
            Throwable var1 = var10000;

            try {
               throw var1;
            } catch (Throwable var19) {
               var10000 = var19;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public final void A04(boolean var1) {
      if (this.A03 == null) {
         this.A03 = new 04l(this);
         04o var2 = this.A01;
         if (var2 != null && var1) {
            var2.A01();
         }

         this.A03.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
      }

   }

   public abstract void A05(Intent var1);

   public final IBinder onBind(Intent var1) {
      04m var2 = this.A00;
      return var2 != null ? var2.A3s() : null;
   }

   public void onCreate() {
      super.onCreate();
      if (VERSION.SDK_INT >= 26) {
         this.A00 = new 08O(this);
         this.A01 = null;
      } else {
         this.A00 = null;
         ComponentName var4 = new ComponentName(this, this.getClass());
         HashMap var3 = A06;
         04o var2 = (04o)var3.get(var4);
         Object var1 = var2;
         if (var2 == null) {
            var1 = new 08S(var4, this);
            var3.put(var4, var1);
         }

         this.A01 = (04o)var1;
      }
   }

   public final void onDestroy() {
      // $FF: Couldn't be decompiled
   }

   public int onStartCommand(Intent var1, int var2, int var3) {
      ArrayList var5 = this.A04;
      if (var5 == null) {
         return 2;
      } else {
         Throwable var10000;
         boolean var10001;
         label122: {
            this.A01.A02();
            synchronized(var5){}
            Intent var4 = var1;
            if (var1 == null) {
               try {
                  var4 = new Intent();
               } catch (Throwable var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label122;
               }
            }

            label118:
            try {
               08Q var19 = new 08Q(var4, this, var3);
               var5.add(var19);
               this.A04(true);
               return 3;
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label118;
            }
         }

         while(true) {
            Throwable var18 = var10000;

            try {
               throw var18;
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               continue;
            }
         }
      }
   }
}
