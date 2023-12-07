package X;

import android.os.SystemProperties;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class 02q {
   public static final List A02;
   public static final List A03;
   public static final List A04;
   public static final String[] A05;
   public String A00 = "N/A";
   public String A01 = "others";

   static {
      ArrayList var0 = new ArrayList();
      A04 = var0;
      var0.add("msmnile");
      var0.add("trinket");
      var0.add("kona");
      var0.add("atoll");
      var0.add("lito");
      var0.add("bengal");
      var0.add("lahaina");
      var0.add("holi");
      var0.add("taro");
      var0 = new ArrayList();
      A02 = var0;
      var0.add("tensor");
      var0.add("gs201");
      var0 = new ArrayList();
      A03 = var0;
      var0.add("orlando");
      A05 = new String[]{"ro.soc.model", "ro.board.platform", "ro.mediatek.platform", "ro.mediatek.hardware"};
   }

   public _2q/* $FF was: 02q*/() {
      String[] var4 = A05;
      int var2 = var4.length;
      String var3 = null;
      int var1 = 0;

      while(true) {
         if (var1 >= var2) {
            if (var3 == null) {
               return;
            }
            break;
         }

         var3 = SystemProperties.get(var4[var1]);
         if (var3 != null && !var3.isEmpty()) {
            break;
         }

         ++var1;
      }

      if (!var3.isEmpty()) {
         String var6;
         label113: {
            String var5 = var3.toLowerCase(Locale.ENGLISH);
            if (!var5.startsWith("msm") && !var5.startsWith("apq") && !var5.startsWith("sdm") && !var5.startsWith("sm") && !A04.contains(var5)) {
               if (var5.startsWith("exynos") || var5.startsWith("universal") || var5.startsWith("erd") || var5.startsWith("s5e")) {
                  label61: {
                     this.A01 = "samsung";
                     var6 = SystemProperties.get("ro.chipname");
                     if (var6 != null) {
                        var3 = var6;
                        if (!var6.isEmpty()) {
                           break label61;
                        }
                     }

                     var3 = SystemProperties.get("ro.hardware.chipname");
                     var6 = var5;
                     if (var3 == null) {
                        break label113;
                     }
                  }

                  var6 = var5;
                  if (!var3.isEmpty()) {
                     var6 = var3;
                  }
                  break label113;
               }

               if (var5.startsWith("mt")) {
                  var3 = "mediatek";
               } else if (!var5.startsWith("sc") && !var5.startsWith("sp9") && !var5.startsWith("sp7") && !var5.startsWith("ums")) {
                  if (!var5.startsWith("hi") && !var5.startsWith("kirin") && !A03.contains(var5)) {
                     if (var5.startsWith("rk")) {
                        var3 = "rockchip";
                     } else if (var5.startsWith("bcm")) {
                        var3 = "broadcom";
                     } else if (A02.contains(var5)) {
                        var3 = "google";
                     } else if (!var5.startsWith("t6") && !var5.startsWith("t3")) {
                        if (!var5.startsWith("n4")) {
                           var6 = var5;
                           if (!var5.startsWith("n3")) {
                              break label113;
                           }
                        }

                        var3 = "intel";
                     } else {
                        var3 = "unisoc";
                     }
                  } else {
                     var3 = "hisilicon";
                  }
               } else {
                  var3 = "spreadtrum";
               }
            } else {
               var3 = "qualcomm";
            }

            this.A01 = var3;
            var6 = var5;
         }

         this.A00 = var6;
      }

   }
}
