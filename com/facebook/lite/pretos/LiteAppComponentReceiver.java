package com.facebook.lite.pretos;

import X.000;
import X.02A;
import X.09n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.appcomponentmanager.AppComponentManagerService;

public class LiteAppComponentReceiver extends BroadcastReceiver {
   public final void onReceive(Context var1, Intent var2) {
      var2.getAction();
      if ("android.intent.action.MY_PACKAGE_REPLACED".equals(var2.getAction())) {
         String[] var3 = 000.A04(000.A02(var1, "app_appcomponents"), "versions").list();
         if (var3 != null && var3.length != 0 || 09n.A02.A00() != 0L) {
            02A.A00(var1, new Intent("com.facebook.appcomponentmanager.ACTION_ENABLE_COMPONENTS"), AppComponentManagerService.class, 137875812);
         }
      }

   }
}
