package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import kotlin.collections.builders.AbstractMapBuilderEntrySet;

public final class 051<K, V> extends AbstractMapBuilderEntrySet<Entry<K, V>, K, V> {
   public final 0Am A00;

   public _51/* $FF was: 051*/() {
   }

   public _51/* $FF was: 051*/(0Am var1) {
      this.A00 = var1;
   }

   public final int A00() {
      return this.A00.size();
   }

   public final boolean addAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   public final void clear() {
      this.A00.clear();
   }

   public final boolean containsAll(Collection var1) {
      09E.A08(var1, 0);
      return this.A00.A06(var1);
   }

   public final boolean isEmpty() {
      return this.A00.isEmpty();
   }

   public final Iterator iterator() {
      return new 085(this.A00);
   }

   public final boolean removeAll(Collection var1) {
      09E.A08(var1, 0);
      this.A00.A05();
      return super.removeAll(var1);
   }

   public final boolean retainAll(Collection var1) {
      09E.A08(var1, 0);
      this.A00.A05();
      return super.retainAll(var1);
   }
}
