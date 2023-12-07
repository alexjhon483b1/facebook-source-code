package X;

public abstract class 04u implements 079 {
   public Object A00;

   public abstract Object A00();

   public final Object get() {
      synchronized(this){}

      Throwable var10000;
      label75: {
         boolean var10001;
         Object var2;
         try {
            var2 = this.A00;
         } catch (Throwable var8) {
            var10000 = var8;
            var10001 = false;
            break label75;
         }

         Object var1 = var2;
         if (var2 != null) {
            return var1;
         }

         label66:
         try {
            var1 = this.A00();
            this.A00 = var1;
            return var1;
         } catch (Throwable var7) {
            var10000 = var7;
            var10001 = false;
            break label66;
         }
      }

      Throwable var9 = var10000;
      throw var9;
   }
}
