package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;

public final class 060 {
   public static int A00(Context param0, PackageManager param1, Integer[] param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   public static ComponentInfo A01(ComponentName var0, PackageManager var1, int var2, boolean var3) {
      char var4 = '舀';
      if (var3) {
         var4 = '芀';
      }

      boolean var10001;
      if (var2 != 1) {
         if (var2 != 2) {
            if (var2 != 4) {
               if (var2 != 8) {
                  return null;
               }

               try {
                  return var1.getProviderInfo(var0, var4);
               } catch (NameNotFoundException var7) {
                  var10001 = false;
               }
            } else {
               try {
                  return var1.getServiceInfo(var0, var4);
               } catch (NameNotFoundException var8) {
                  var10001 = false;
               }
            }
         } else {
            try {
               return var1.getReceiverInfo(var0, var4);
            } catch (NameNotFoundException var9) {
               var10001 = false;
            }
         }
      } else {
         try {
            return var1.getActivityInfo(var0, var4);
         } catch (NameNotFoundException var10) {
            var10001 = false;
         }
      }

      boolean var14;
      label47: {
         if (var3) {
            label45: {
               ComponentInfo var12;
               try {
                  var12 = A01(var0, var1, var2, false);
               } catch (Exception var6) {
                  break label45;
               }

               var14 = true;
               if (var12 != null) {
                  break label47;
               }
            }
         }

         var14 = false;
      }

      String var13 = var0.getClassName();
      String var5 = A02(var2);
      String var11;
      if (var3 && var14) {
         var11 = ", BUT succeeded without asking for metadata.";
      } else {
         var11 = ".";
      }

      06i.A0I("AppComponentManager", "getComponentInfo couldn't find component name[%s] type[%s] getMetaData[%s]%s", var13, var5, var3, var11);
      return null;
   }

   public static String A02(int var0) {
      if (var0 != 1) {
         if (var0 != 2) {
            if (var0 != 4) {
               if (var0 != 8) {
                  StringBuilder var1 = 000.A0B();
                  var1.append("Unknown (type = ");
                  var1.append(var0);
                  return 000.A09(")", var1);
               } else {
                  return "Provider";
               }
            } else {
               return "Service";
            }
         } else {
            return "Receiver";
         }
      } else {
         return "Activity";
      }
   }

   public static void A03(Context param0, String param1) {
      // $FF: Couldn't be decompiled
   }
}
