package X;

import android.app.Application;
import android.os.SystemClock;
import java.util.Calendar;

public final class 03D implements 075 {
   public Application A00;

   public _3D/* $FF was: 03D*/(Application var1) {
      this.A00 = var1;
   }

   public final Integer ABy() {
      return 04j.A0V;
   }

   public final void AVJ(02h var1, 02Z var2) {
      Application var5 = this.A00;
      if (08a.A01 == null) {
         label273: {
            synchronized(08a.class){}

            Throwable var10000;
            boolean var10001;
            label265: {
               try {
                  if (08a.A01 == null) {
                     08a var30 = new 08a(var5);
                     08a.A01 = var30;
                  }
               } catch (Throwable var28) {
                  var10000 = var28;
                  var10001 = false;
                  break label265;
               }

               label262:
               try {
                  break label273;
               } catch (Throwable var27) {
                  var10000 = var27;
                  var10001 = false;
                  break label262;
               }
            }

            while(true) {
               Throwable var29 = var10000;

               try {
                  throw var29;
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  continue;
               }
            }
         }
      }

      08a var7 = 08a.A01;
      long var3 = (Calendar.getInstance().getTimeInMillis() - SystemClock.elapsedRealtime()) / 1000L;
      var1.A03(072.A1i, var3);
      07b var8 = 072.A1h;
      String var6 = var8.A00;
      String var32 = "0";
      String var31 = "0";

      label252: {
         label272: {
            try {
               var6 = var7.A00.getString(var6, "0");
            } catch (Exception var26) {
               06i.A06("lacrima", "Failed to read from SharedPreferences");
               08Y.A00();
               break label272;
            }

            if (var6 == null) {
               break label252;
            }

            var31 = var6;
         }

         var1.A03(var8, Long.parseLong(var31));
      }

      07b var33 = 072.A1j;
      var31 = var33.A00;

      label242: {
         try {
            var31 = var7.A00.getString(var31, "0");
         } catch (Exception var25) {
            06i.A06("lacrima", "Failed to read from SharedPreferences");
            08Y.A00();
            var31 = var32;
            break label242;
         }

         if (var31 == null) {
            return;
         }
      }

      var1.A03(var33, Long.parseLong(var31));
   }
}
