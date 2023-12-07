package com.facebook.errorreporting.lacrima.detector.lifecycle;

import X.02w;
import X.04j;
import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Build.VERSION;

public class ApplicationLifecycleDetector$ActivityCallbacks implements ActivityLifecycleCallbacks {
   public final 02w A00;

   public ApplicationLifecycleDetector$ActivityCallbacks(02w var1) {
      this.A00 = var1;
   }

   public final void A00(Activity param1, Integer param2) {
      // $FF: Couldn't be decompiled
   }

   public final void A01(Activity var1, Integer var2) {
      02w var4 = this.A00;
      Object var3 = var4.A0C;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label183: {
         label182: {
            try {
               if (VERSION.SDK_INT >= 29 && !var2.equals(04j.A01)) {
                  break label182;
               }
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label183;
            }

            try {
               02w.A00(var4);
               var4.A06.A00(04j.A0j, var1);
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label183;
            }
         }

         label173:
         try {
            02w.A01(var4, var2, true);
            return;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label173;
         }
      }

      while(true) {
         Throwable var25 = var10000;

         try {
            throw var25;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }

   public final void A02(Activity var1, Integer var2) {
      02w var4 = this.A00;
      Object var3 = var4.A0C;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label183: {
         label182: {
            try {
               if (VERSION.SDK_INT >= 29 && !var2.equals(04j.A01)) {
                  break label182;
               }
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label183;
            }

            try {
               02w.A00(var4);
               var4.A06.A00(04j.A0U, var1);
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label183;
            }
         }

         label173:
         try {
            02w.A01(var4, var2, var1.isFinishing());
            return;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label173;
         }
      }

      while(true) {
         Throwable var25 = var10000;

         try {
            throw var25;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }

   public final void A03(Activity var1, Integer var2) {
      02w var4 = this.A00;
      Object var3 = var4.A0C;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label183: {
         label182: {
            try {
               if (VERSION.SDK_INT >= 29 && !var2.equals(04j.A01)) {
                  break label182;
               }
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label183;
            }

            try {
               02w.A00(var4);
               var4.A06.A00(04j.A00, var1);
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label183;
            }
         }

         label173:
         try {
            02w.A01(var4, var2, false);
            return;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label173;
         }
      }

      while(true) {
         Throwable var25 = var10000;

         try {
            throw var25;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }

   public final void A04(Activity var1, Integer var2) {
      02w var4 = this.A00;
      Object var3 = var4.A0C;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label183: {
         label182: {
            try {
               if (VERSION.SDK_INT >= 29 && !var2.equals(04j.A01)) {
                  break label182;
               }
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label183;
            }

            try {
               02w.A00(var4);
               var4.A06.A00(04j.A0C, var1);
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label183;
            }
         }

         label173:
         try {
            02w.A01(var4, var2, false);
            return;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label173;
         }
      }

      while(true) {
         Throwable var25 = var10000;

         try {
            throw var25;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }

   public final void A05(Activity var1, Integer var2) {
      02w var4 = this.A00;
      Object var3 = var4.A0C;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label183: {
         label182: {
            try {
               if (VERSION.SDK_INT >= 29 && !var2.equals(04j.A01)) {
                  break label182;
               }
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label183;
            }

            try {
               02w.A00(var4);
               var4.A06.A00(04j.A0b, var1);
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label183;
            }
         }

         label173:
         try {
            02w.A01(var4, var2, var1.isFinishing());
            return;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label173;
         }
      }

      while(true) {
         Throwable var25 = var10000;

         try {
            throw var25;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }

   public final void onActivityCreated(Activity var1, Bundle var2) {
      this.A00(var1, 04j.A0C);
   }

   public final void onActivityDestroyed(Activity var1) {
      this.A01(var1, 04j.A0C);
   }

   public final void onActivityPaused(Activity var1) {
      this.A02(var1, 04j.A0C);
   }

   public final void onActivityResumed(Activity var1) {
      this.A03(var1, 04j.A0C);
   }

   public final void onActivitySaveInstanceState(Activity var1, Bundle var2) {
   }

   public final void onActivityStarted(Activity var1) {
      this.A04(var1, 04j.A0C);
   }

   public final void onActivityStopped(Activity var1) {
      this.A05(var1, 04j.A0C);
   }
}
