package X;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class 00S {
   public final 08k A00;
   public final 00Q A01;
   public final Set A02 = new HashSet();
   public final Context A03;
   public final 00O A04;
   public final 00R A05;
   public final 00P A06;

   public _0S/* $FF was: 00S*/(Context var1, 08k var2, 00O var3, 00R var4, 00P var5, 00Q var6) {
      this.A03 = var1;
      this.A04 = var3;
      this.A06 = var5;
      this.A05 = var4;
      this.A01 = var6;
      this.A00 = var2;
   }

   public final void A00(String var1) {
      Set var6 = this.A02;
      if (!var6.contains(var1)) {
         00k var7 = this.A06.AY0(this.A05, var1);
         Iterator var8 = (new ArrayList(var7.A04)).iterator();

         while(var8.hasNext()) {
            this.A00((String)var8.next());
         }

         long var4 = SystemClock.uptimeMillis();
         synchronized(this){}

         label245: {
            Throwable var10000;
            label255: {
               boolean var10001;
               File var30;
               try {
                  var30 = var7.A00;
               } catch (Throwable var28) {
                  var10000 = var28;
                  var10001 = false;
                  break label255;
               }

               if (var30 != null) {
                  try {
                     this.A00.A26(var30, var7.A02);
                  } catch (Throwable var27) {
                     var10000 = var27;
                     var10001 = false;
                     break label255;
                  }
               }

               try {
                  if (var7.A01 != null) {
                     this.A01.AIz(var7);
                  }
               } catch (Throwable var26) {
                  var10000 = var26;
                  var10001 = false;
                  break label255;
               }

               label234:
               try {
                  var6.add(var7.A03);
                  break label245;
               } catch (Throwable var25) {
                  var10000 = var25;
                  var10001 = false;
                  break label234;
               }
            }

            Throwable var29 = var10000;
            throw var29;
         }

         long var2 = SystemClock.uptimeMillis();
         this.A04.AKV(var1, var2 - var4);
      }
   }
}
