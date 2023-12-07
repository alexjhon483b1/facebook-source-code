package X;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public final class 03S {
   public final Map A00 = Collections.synchronizedMap(new HashMap());
   public final Map A01 = Collections.synchronizedMap(new HashMap());
   public final Map A02 = Collections.synchronizedMap(new HashMap());
   public final Map A03 = Collections.synchronizedMap(new HashMap());
   public final Random A04;

   public _3S/* $FF was: 03S*/(Random var1) {
      this.A04 = var1;
   }
}
