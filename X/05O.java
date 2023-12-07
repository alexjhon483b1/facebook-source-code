package X;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;

public final class 05O implements 09B {
   public final 01u AKe(03v var1) {
      Socket var2 = new Socket();
      09F var3 = var1.A00;
      var2.connect(new InetSocketAddress((InetAddress)var1.A01.get(0), var3.A01.A00), var3.A00);
      var2.getOutputStream();
      return new 01v(var1, var2);
   }
}
