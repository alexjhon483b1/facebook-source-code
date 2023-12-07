package X;

import android.content.Context;
import java.io.File;

public final class 05L extends 05S {
   public _5L/* $FF was: 05L*/(Context var1) {
      super(var1, 000.A01(var1), "lib-assets", "^assets/lib/([^/]+)/([^/]+\\.so)$");
   }

   public final String A05() {
      return "PlainAssetSoSource";
   }

   public final byte[] A09() {
      File var1 = super.A00;
      return 0Ay.A0A(super.A01, var1);
   }
}
