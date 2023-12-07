package X;

import java.io.Serializable;
import java.util.Map;

public final class 01I implements Map, Serializable, 01H {
   public final void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final boolean containsKey(Object var1) {
      return false;
   }

   public final boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof Map) {
         boolean var3 = ((Map)var1).isEmpty();
         var2 = true;
         if (var3) {
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   public final int hashCode() {
      return 0;
   }

   public final boolean isEmpty() {
      return true;
   }

   public final void putAll(Map var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final String toString() {
      return "{}";
   }
}
