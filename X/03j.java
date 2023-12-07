package X;

import android.net.Uri;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class 03j {
   public static final List A03;
   public final Uri A00;
   public final 03h A01;
   public final 03c A02;

   static {
      A03 = Arrays.asList("log_type", "build_id", "app_id", "user_id", "device_id", 072.A08.A00);
   }

   public _3j/* $FF was: 03j*/(Uri var1, 03h var2, 03c var3) {
      this.A00 = var1;
      this.A01 = var2;
      this.A02 = var3;
   }

   public static void A00(OutputStream var0, String var1, String var2, String var3) {
      var0.write(String.format("--%s\r\nContent-Disposition: %s\"%s\"\r\nContent-Type: application/binary\r\nContent-Transfer-Encoding: binary\r\n\r\n", var3, "form-data; name=", var1).getBytes());
      var0.write(var2.getBytes("UTF-8"));
      var0.write("\r\n".getBytes());
   }

   public final boolean A01(07i param1, Map param2, int param3) {
      // $FF: Couldn't be decompiled
   }
}
