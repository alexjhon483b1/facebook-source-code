package X;

// $FF: synthetic class
public final class 02i implements Runnable {
   public static final String __redex_internal_original_name = "CollectorManager$$ExternalSyntheticLambda1";
   public final 02h A00;
   public final 077 A01;
   public final 02Z A02;
   public final 08R A03;

   // $FF: synthetic method
   public _2i/* $FF was: 02i*/(02h var1, 077 var2, 02Z var3, 08R var4) {
      this.A01 = var2;
      this.A03 = var4;
      this.A02 = var3;
      this.A00 = var1;
   }

   public final void run() {
      077 var3 = this.A01;
      08R var1 = this.A03;
      02Z var4 = this.A02;
      02h var2 = this.A00;

      try {
         var3.A0B(var4, var1);
         var3.A07(var2, var4, var1, var1.ABF(), 0);
         var3.A0A(var4, var1);
      } catch (Throwable var6) {
         08Y.A00();
         06i.A0G("lacrima", "Failed to apply collectors: %s", var6, var1.ABx());
         return;
      }
   }
}
