package X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public final class 037 {
   public static String A04;
   public static final Object A05 = new Object();
   public static final File[] A06 = new File[0];
   public final 08l A00;
   public final File A01;
   public final List A02;
   public final 07c A03;

   public _37/* $FF was: 037*/(07c var1, 08l var2) {
      this.A00 = var2;
      this.A03 = var1;
      File var3 = new File(var2.A06, "reports");
      this.A01 = var3;
      var3.mkdirs();
      this.A02 = new ArrayList();
   }

   public static void A00(02Z param0, 037 param1, File param2, File param3) {
      // $FF: Couldn't be decompiled
   }

   public static final void A01(File var0, String var1) {
      Object var2 = A05;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label193: {
         label187: {
            try {
               try {
                  StringBuilder var3 = new StringBuilder();
                  var3.append(var1);
                  var3.append("_done");
                  String var31 = var3.toString();
                  File var30 = new File(var0, var31);
                  var30.createNewFile();
                  break label187;
               } catch (IOException var27) {
               }
            } catch (Throwable var28) {
               var10000 = var28;
               var10001 = false;
               break label193;
            }

            try {
               06i.A06("lacrima", "Marking session dir failed");
               08Y.A00();
            } catch (Throwable var26) {
               var10000 = var26;
               var10001 = false;
               break label193;
            }
         }

         label179:
         try {
            return;
         } catch (Throwable var25) {
            var10000 = var25;
            var10001 = false;
            break label179;
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

   public static final boolean A02(File param0, String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void A03(02h param1, File param2, String param3, List param4) {
      // $FF: Couldn't be decompiled
   }
}
