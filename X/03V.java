package X;

import android.app.Application;
import android.text.TextUtils;
import java.io.File;

public final class 03V implements 08R {
   public final Application A00;
   public final 077 A01;
   public final 08l A02;

   public _3V/* $FF was: 03V*/(Application var1, 077 var2, 08l var3) {
      this.A00 = var1;
      this.A02 = var3;
      this.A01 = var2;
   }

   // $FF: synthetic method
   public final 02v ABF() {
      return null;
   }

   public final 02Y ABx() {
      return 02Y.A0C;
   }

   public final void start() {
      String var1;
      String var2;
      label46: {
         var2 = 05v.A02("fb.report_source");
         if (var2 != null) {
            var1 = var2;
            if (!var2.equals("")) {
               break label46;
            }
         }

         var1 = System.getProperty("fb.report_source");
      }

      02h var3 = new 02h((Throwable)null);
      074 var5;
      File var7;
      if (!TextUtils.isEmpty(var1)) {
         var3.A04(072.A8Y, var1);
         var1 = 05v.A02("fb.test_name");
         String var4 = 05v.A02("fb.test_execution_uuid");
         if (TextUtils.isEmpty(var1) && TextUtils.isEmpty(var4)) {
            var7 = new File(this.A02.A06, "report_source");
            var7.mkdir();
            var5 = 074.A0E;
            var7 = new File(var7, "report_source_ref.txt");
            var3.A05(var5, 02Z.A02, var7);
         } else {
            StringBuilder var6 = new StringBuilder();
            var6.append('{');
            var6.append("\"test_name\":");
            var6.append('"');
            var6.append(var1);
            var6.append("\",");
            var6.append("\"test_execution_uuid\":");
            var6.append('"');
            var6.append(var4);
            var6.append('"');
            var6.append('}');
            var3.A04(072.A8a, var6.toString());
         }
      }

      var1 = 05v.A02("fb.testing.build_target");
      if (var1 != null && !var1.equals("")) {
         var3.A04(072.A6n, var1);
      }

      var2 = 05v.A02("fb.fury_stacktraces_filename");
      if (!TextUtils.isEmpty(var2)) {
         File var8 = this.A00.getFilesDir();
         var5 = 074.A09;
         var7 = new File(var8, var2);
         var3.A05(var5, 02Z.A02, var7);
      }

      label32: {
         label31: {
            var2 = 05v.A02("ig.ig_server_rev_hash");
            if (var2 != null) {
               var1 = var2;
               if (!var2.equals("")) {
                  break label31;
               }
            }

            var1 = System.getProperty("ig.ig_server_rev_hash");
            if (var1 == null) {
               break label32;
            }
         }

         if (!var1.equals("")) {
            var3.A04(072.A5c, var1);
         }
      }

      077 var9 = this.A01;
      var9.A06(var3, 02Z.A02, this);
      var9.A06(var3, 02Z.A03, this);
   }
}
