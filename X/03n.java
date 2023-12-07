package X;

import android.content.Context;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class 03n {
   public static final Map A00 = Collections.synchronizedMap(new HashMap());

   public static void A00(Context var0, int var1) {
      try {
         File var2 = var0.getFilesDir();
         File var3 = new File(var2, "GkBootstrap");
         if (!var3.exists() && !var3.mkdir()) {
            return;
         }
      } catch (SecurityException var22) {
         06i.A0F("GkBootstrap", "Unable to create %s directory", var22, "GkBootstrap");
         return;
      }

      File var23 = new File(new File(var0.getFilesDir(), "GkBootstrap"), "breakpad_write_only_crash_thread");

      IOException var10000;
      label144: {
         boolean var10001;
         DataOutputStream var26;
         try {
            FileOutputStream var24 = new FileOutputStream(var23);
            var26 = new DataOutputStream(var24);
         } catch (SecurityException | IOException var21) {
            var10000 = var21;
            var10001 = false;
            break label144;
         }

         boolean var16 = false;

         try {
            var16 = true;
            var26.writeInt(var1);
            var16 = false;
         } finally {
            if (var16) {
               label121:
               try {
                  var26.close();
               } finally {
                  break label121;
               }

               try {
                  ;
               } catch (SecurityException | IOException var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label144;
               }
            }
         }

         try {
            var26.close();
            return;
         } catch (SecurityException | IOException var19) {
            var10000 = var19;
            var10001 = false;
         }
      }

      IOException var25 = var10000;
      06i.A0G("GkBootstrap", "Unable to persist GK value to %s", var25, var23);
   }
}
