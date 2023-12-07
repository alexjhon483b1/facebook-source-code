package X;

public final class 04f {
   public static final String[] A00;

   static {
      String[] var0 = new String[15];
      A00 = var0;
      var0[0] = "pgpgin";
      var0[1] = "pgpgout";
      var0[2] = "pgmajfault";
      var0[3] = "allocstall";
      var0[4] = "allocstall_high";
      var0[5] = "allocstall_dma";
      var0[6] = "allocstall_dma32";
      var0[7] = "allocstall_normal";
      var0[8] = "allocstall_movable";
      var0[9] = "pgsteal_kswapd_normal";
      var0[10] = "pgsteal_kswapd_high";
      var0[11] = "pgsteal_kswapd_movable";
      var0[12] = "pgsteal_direct_normal";
      var0[13] = "pgsteal_direct_high";
      var0[14] = "pgsteal_direct_movable";
   }

   public static final 04g A00() {
      String[] var11 = A00;
      long[] var10 = new long[var11.length];
      06g.A00.AWX("/proc/vmstat", var10, var11);
      04g var13 = new 04g();
      long var0 = var10[0];
      var13.A02 = var0;
      long var2 = var10[1];
      var13.A03 = var2;
      long var4 = var10[2];
      long var6 = var13.A00 + var10[3];
      var13.A00 = var6;
      var6 += var10[4];
      var13.A00 = var6;
      var6 += var10[5];
      var13.A00 = var6;
      var6 += var10[6];
      var13.A00 = var6;
      var6 += var10[7];
      var13.A00 = var6;
      var6 += var10[8];
      var13.A00 = var6;
      long var8 = var13.A01 + var10[9];
      var13.A01 = var8;
      var8 += var10[10];
      var13.A01 = var8;
      var8 += var10[11];
      var13.A01 = var8;
      var8 += var10[12];
      var13.A01 = var8;
      var8 += var10[13];
      var13.A01 = var8;
      var8 += var10[14];
      var13.A01 = var8;
      04g var12 = var13;
      if (var0 == 0L) {
         var12 = var13;
         if (var2 == 0L) {
            var12 = var13;
            if (var4 == 0L) {
               var12 = var13;
               if (var6 == 0L) {
                  var12 = var13;
                  if (var8 == 0L) {
                     var12 = new 04g(-1);
                  }
               }
            }
         }
      }

      return var12;
   }
}
