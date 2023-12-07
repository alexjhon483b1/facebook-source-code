package X;

import android.text.TextUtils;
import android.util.Base64;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class 03u {
   public static String A00(List var0) {
      ArrayList var1 = new ArrayList(var0.size());
      Iterator var2 = var0.iterator();

      while(var2.hasNext()) {
         var1.add(Base64.encodeToString(((InetAddress)var2.next()).getAddress(), 3));
      }

      return TextUtils.join(";", var1);
   }

   public static List A01(String var0, String var1) {
      Object var4;
      if (TextUtils.isEmpty(var1)) {
         var4 = Collections.emptyList();
      } else {
         String[] var10 = var1.split(";");
         int var3 = var10.length;
         ArrayList var5 = new ArrayList(var3);

         for(int var2 = 0; var2 < var3; ++var2) {
            String var12 = var10[var2];

            InetAddress var15;
            try {
               byte[] var14;
               try {
                  var14 = Base64.decode(var12, 3);
               } catch (IllegalArgumentException var8) {
                  UnknownHostException var13 = new UnknownHostException("Failed to decodeSingleAddress an InetAddress");
                  throw var13;
               }

               var15 = InetAddress.getByAddress(var0, var14);
            } catch (UnknownHostException var9) {
               continue;
            }

            var5.add(var15);
         }

         var4 = var5;
         if (var3 == 1) {
            var4 = var5;
            if (var5.size() == 0) {
               String var6 = var10[0];
               var4 = null;
               InetAddress var11 = (InetAddress)var4;
               if (var6 != null) {
                  var11 = (InetAddress)var4;
                  if (!var6.isEmpty()) {
                     try {
                        var11 = InetAddress.getByAddress(var0, InetAddress.getByName(var6).getAddress());
                     } catch (UnknownHostException var7) {
                        var11 = (InetAddress)var4;
                     }
                  }
               }

               var4 = var5;
               if (var11 != null) {
                  return Collections.singletonList(var11);
               }
            }
         }
      }

      return (List)var4;
   }
}
