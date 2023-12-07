package X;

import android.content.Context;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Process;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public final class 00j {
   public final Map A00;
   public final Set A01;

   public _0j/* $FF was: 00j*/(Map var1) {
      HashSet var3 = new HashSet();
      HashMap var2 = new HashMap();
      Iterator var4 = var1.entrySet().iterator();

      while(true) {
         while(var4.hasNext()) {
            Entry var5 = (Entry)var4.next();
            Object var7 = var5.getKey();
            Set var6 = (Set)var5.getValue();
            if (var6 != null && var6.contains("*|all_packages|*")) {
               var3.add(var7);
            } else {
               if (!var2.containsKey(var7)) {
                  var2.put(var7, new HashSet());
               }

               ((Set)var2.get(var7)).addAll(var6);
            }
         }

         this.A01 = Collections.unmodifiableSet(var3);
         this.A00 = Collections.unmodifiableMap(var2);
         return;
      }
   }

   @Deprecated
   public static 02S A00(Context var0, int var1) {
      String[] var4 = 00l.A05(var0, var1);
      List var6 = Collections.unmodifiableList(Arrays.asList(var4));
      Signature var5 = 00l.A00(00l.A01(var0, var4[0]));
      int var3 = var4.length;
      int var2 = 1;
      if (var3 > 1) {
         do {
            if (!var5.equals(00l.A00(00l.A01(var0, var4[var2])))) {
               StringBuilder var7 = new StringBuilder();
               var7.append("packageName=");
               var7.append(Arrays.toString(var4));
               throw new 0AP(var7.toString());
            }

            ++var2;
         } while(var2 < var3);
      }

      return new 02S((String)null, (String)null, var6, Collections.singletonList(00i.A00(var5.toByteArray())), var1);
   }

   public static boolean A01(00i var0, 00i var1, boolean var2) {
      if (!var0.equals(var1)) {
         if (var2) {
            Set var3 = (Set)00h.A1G.get(var1);
            Set var4 = var3;
            if (var3 == null) {
               var4 = 00h.A00(00h.A0Y);
            }

            if (var4.contains(var0)) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   @Deprecated
   public final void A02(Context var1) {
      if (Binder.getCallingPid() != Process.myPid()) {
         if (!this.A04(A00(var1, Binder.getCallingUid()), 00l.A03(var1))) {
            throw new SecurityException("Access denied.");
         }
      } else {
         throw new IllegalStateException("This method should be called on behalf of an IPC transaction from binder thread.");
      }
   }

   @Deprecated
   public final boolean A03(Context var1) {
      if (var1 == null) {
         return false;
      } else if (Binder.getCallingPid() != Process.myPid()) {
         return this.A04(A00(var1, Binder.getCallingUid()), 00l.A03(var1));
      } else {
         throw new IllegalStateException("This method should be called on behalf of an IPC transaction from binder thread.");
      }
   }

   public final boolean A04(02S var1, boolean var2) {
      if (var1 != null && var1.A02() != null) {
         00i var3 = var1.A02();
         if (var3 != null) {
            Iterator var4 = this.A01.iterator();

            while(var4.hasNext()) {
               if (A01(var3, (00i)var4.next(), var2)) {
                  return true;
               }
            }

            Map var7 = this.A00;
            var4 = var7.keySet().iterator();

            while(true) {
               00i var8;
               do {
                  if (!var4.hasNext()) {
                     return false;
                  }

                  var8 = (00i)var4.next();
               } while(!A01(var3, var8, var2));

               Iterator var6 = var1.A03.iterator();

               while(var6.hasNext()) {
                  Object var5 = var6.next();
                  if (((Set)var7.get(var8)).contains(var5)) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   public final boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (!(var1 instanceof 00j)) {
            return false;
         }

         00j var4 = (00j)var1;
         Set var6 = var4.A01;
         Set var5 = this.A01;
         if (var6 != null) {
            var2 = var6.equals(var5);
         } else {
            var2 = false;
            if (var5 == null) {
               var2 = true;
            }
         }

         Map var8 = var4.A00;
         Map var7 = this.A00;
         boolean var3;
         if (var8 != null) {
            var3 = var8.equals(var7);
         } else {
            var3 = false;
            if (var7 == null) {
               var3 = true;
            }
         }

         if (var2 && var3) {
            return true;
         }

         var2 = false;
      }

      return var2;
   }

   public final int hashCode() {
      int var1 = VERSION.SDK_INT;
      Object[] var3 = new Object[]{this.A01, this.A00};
      Object[] var2 = var3;
      if (var1 <= 18) {
         var2 = Arrays.asList(var3).toArray(new Object[0]);
      }

      return Arrays.hashCode(var2);
   }
}
