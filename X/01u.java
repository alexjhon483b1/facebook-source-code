package X;

import java.io.InputStream;
import java.io.OutputStream;

public interface 01u {
   String ADV();

   09G AFD();

   void close();

   String getEarlyDataType();

   InputStream getInputStream();

   OutputStream getOutputStream();

   int getTransportType();

   boolean isClosed();

   boolean isConnected();

   void setKeepAlive(boolean var1);

   void setTcpNoDelay(boolean var1);
}
