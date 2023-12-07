package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public final class 01v implements 01u {
   public final 03v A00;
   public final Socket A01;

   public _1v/* $FF was: 01v*/(03v var1, Socket var2) {
      this.A01 = var2;
      this.A00 = var1;
   }

   public final String ADV() {
      return null;
   }

   public final 09G AFD() {
      return this.A00.A00.A01;
   }

   public final void close() {
      this.A01.close();
   }

   public final String getEarlyDataType() {
      return "NOT_FIZZ_SOCKET";
   }

   public final InputStream getInputStream() {
      return this.A01.getInputStream();
   }

   public final OutputStream getOutputStream() {
      return this.A01.getOutputStream();
   }

   public final int getTransportType() {
      return 1;
   }

   public final boolean isClosed() {
      return this.A01.isClosed();
   }

   public final boolean isConnected() {
      return this.A01.isConnected();
   }

   public final void setKeepAlive(boolean var1) {
   }

   public final void setTcpNoDelay(boolean var1) {
   }
}
