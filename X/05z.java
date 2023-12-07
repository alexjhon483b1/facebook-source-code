package X;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

public abstract class 05z extends 0Af implements 0Aa {
   public String[] A00;
   public final Context A01;

   public _5z/* $FF was: 05z*/(Context var1, File var2) {
      super(var2, 1);
      this.A01 = var1;
   }

   public _5z/* $FF was: 05z*/(Context var1, String var2) {
      StringBuilder var3 = 000.A0B();
      var3.append(var1.getApplicationInfo().dataDir);
      super(new File(000.A08("/", var2, var3)), 1);
      this.A01 = var1;
   }

   public static void A00(File var0, byte var1, boolean var2) {
      SyncFailedException var10000;
      label182: {
         RandomAccessFile var3;
         boolean var10001;
         try {
            var3 = new RandomAccessFile(var0, "rw");
         } catch (SyncFailedException var27) {
            var10000 = var27;
            var10001 = false;
            break label182;
         }

         label183: {
            Throwable var30;
            label184: {
               try {
                  var3.seek(0L);
                  var3.write(var1);
                  var3.setLength(var3.getFilePointer());
               } catch (Throwable var26) {
                  var30 = var26;
                  var10001 = false;
                  break label184;
               }

               if (!var2) {
                  break label183;
               }

               label171:
               try {
                  var3.getFD().sync();
                  break label183;
               } catch (Throwable var25) {
                  var30 = var25;
                  var10001 = false;
                  break label171;
               }
            }

            Throwable var28 = var30;

            label160:
            try {
               var3.close();
            } finally {
               break label160;
            }

            try {
               throw var28;
            } catch (SyncFailedException var23) {
               var10000 = var23;
               var10001 = false;
               break label182;
            }
         }

         try {
            var3.close();
            return;
         } catch (SyncFailedException var24) {
            var10000 = var24;
            var10001 = false;
         }
      }

      SyncFailedException var29 = var10000;
      Log.w("fb-UnpackingSoSource", "state file sync failed", var29);
   }

   public final void A07(int param1) {
      // $FF: Couldn't be decompiled
   }

   public abstract 04U A08(boolean var1);

   public byte[] A09() {
      Parcel var3 = Parcel.obtain();
      int var1 = 0;
      04U var4 = this.A08(false);

      Throwable var10000;
      label146: {
         int var2;
         04X[] var5;
         boolean var10001;
         try {
            var5 = var4.A02();
            var2 = var5.length;
            var3.writeInt(var2);
         } catch (Throwable var18) {
            var10000 = var18;
            var10001 = false;
            break label146;
         }

         while(true) {
            if (var1 >= var2) {
               var4.close();
               byte[] var20 = var3.marshall();
               var3.recycle();
               return var20;
            }

            04X var6 = var5[var1];

            try {
               var3.writeString(var6.A01);
               var3.writeString(var6.A00);
            } catch (Throwable var17) {
               var10000 = var17;
               var10001 = false;
               break;
            }

            ++var1;
         }
      }

      Throwable var19 = var10000;

      try {
         var4.close();
      } finally {
         throw var19;
      }

      throw var19;
   }

   public final void AdG() {
      File var1 = super.A01;
      File var2 = 000.A04(var1, "dso_lock");

      try {
         0Ay.A00(var1, var2).close();
      } catch (Exception var4) {
         StringBuilder var3 = 000.A0B();
         var3.append("Encountered exception during wait for unpacking trying to acquire file lock for ");
         var3.append(this.getClass().getName());
         var3.append(" (");
         var3.append(var1);
         Log.e("fb-UnpackingSoSource", 000.A09("): ", var3), var4);
      }
   }
}
