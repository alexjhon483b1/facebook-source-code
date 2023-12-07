package X;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public final class 05g {
   public Queue A00;

   public _5g/* $FF was: 05g*/() {
      synchronized(this){}

      try {
         LinkedList var1 = new LinkedList();
         this.A00 = var1;
      } finally {
         ;
      }

   }

   public final String toString() {
      synchronized(this){}

      String var8;
      try {
         StringBuilder var1 = 000.A0B();
         Iterator var2 = this.A00.iterator();
         if (var2.hasNext()) {
            var2.next();
            NullPointerException var9 = new NullPointerException("toString");
            throw var9;
         }

         var8 = var1.toString();
      } finally {
         ;
      }

      return var8;
   }
}
