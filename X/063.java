package X;

import java.io.DataInputStream;
import java.io.EOFException;
import java.nio.ByteOrder;

public final class 063 {
   public int A00;
   public int A01;
   public final 063 A02;
   public final DataInputStream A03;

   public _63/* $FF was: 063*/(063 var1) {
      this.A03 = null;
      this.A02 = var1;
   }

   public _63/* $FF was: 063*/(DataInputStream var1) {
      this.A03 = var1;
      this.A02 = null;
   }

   private void A00() {
      int var1 = this.A01;
      if (var1 >= 0) {
         int var2 = this.A00;
         if (var2 > var1) {
            StringBuilder var3 = 000.A0B();
            var3.append("Invalid access: limit=");
            var3.append(var1);
            throw new EOFException(000.A0A(", consumed=", var3, var2));
         }
      }

   }

   public final byte A01() {
      ++this.A00;
      this.A00();
      DataInputStream var1 = this.A03;
      if (var1 != null) {
         return var1.readByte();
      } else {
         063 var2 = this.A02;
         if (var2 != null) {
            return var2.A01();
         } else {
            throw new NullPointerException("Source input stream was not setup.");
         }
      }
   }

   public final int A02() {
      this.A00 += 4;
      this.A00();
      DataInputStream var3 = this.A03;
      if (var3 != null) {
         int var2 = var3.readInt();
         int var1 = var2;
         if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
            var1 = Integer.reverseBytes(var2);
         }

         return var1;
      } else {
         063 var4 = this.A02;
         if (var4 != null) {
            return var4.A02();
         } else {
            throw new NullPointerException("Source input stream was not setup.");
         }
      }
   }

   public final short A03() {
      this.A00 += 2;
      this.A00();
      DataInputStream var3 = this.A03;
      if (var3 != null) {
         short var2 = var3.readShort();
         short var1 = var2;
         if (ByteOrder.nativeOrder().equals(ByteOrder.LITTLE_ENDIAN)) {
            var1 = Short.reverseBytes(var2);
         }

         return var1;
      } else {
         063 var4 = this.A02;
         if (var4 != null) {
            return var4.A03();
         } else {
            throw new NullPointerException("Source input stream was not setup.");
         }
      }
   }

   public final void A04(int var1) {
      this.A00 += var1;
      this.A00();
      DataInputStream var2 = this.A03;
      if (var2 != null) {
         var2.skipBytes(var1);
      } else {
         063 var3 = this.A02;
         if (var3 != null) {
            var3.A04(var1);
         } else {
            throw new NullPointerException("Source input stream was not setup.");
         }
      }
   }

   public final void A05(byte[] var1) {
      this.A00 += var1.length;
      this.A00();
      DataInputStream var2 = this.A03;
      if (var2 != null) {
         var2.readFully(var1);
      } else {
         063 var3 = this.A02;
         if (var3 != null) {
            var3.A05(var1);
         } else {
            throw new NullPointerException("Source input stream was not setup.");
         }
      }
   }
}
