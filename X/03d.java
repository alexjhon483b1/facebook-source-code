package X;

import android.net.Uri;
import android.net.Uri.Builder;
import java.net.URI;
import java.net.URISyntaxException;

public final class 03d {
   public static final 03e A00 = new 03f();
   public static volatile boolean A01;

   public static Uri A00(008 var0, String var1, boolean var2) {
      if (var1 == null) {
         throw new IllegalArgumentException("Url string is null");
      } else if (var0 != null) {
         try {
            return A01(var1);
         } catch (SecurityException var5) {
            StringBuilder var4 = new StringBuilder();
            var4.append("Parse uri <sanitized \"");
            var4.append(A00.AYN(var1));
            var4.append("\"> failed. Fail open: ");
            var4.append(var2);
            var0.AXV("UriParser", var4.toString(), var5);
            return var2 ? Uri.parse(var1) : null;
         }
      } else {
         throw new IllegalArgumentException("reporter is null");
      }
   }

   public static Uri A01(String var0) {
      Uri var5 = Uri.parse(var0);
      if (!A01 || !Boolean.TRUE.equals(01m.A00.get(var0))) {
         boolean var2;
         if (var5.getScheme() == null) {
            var2 = true;
         } else {
            var2 = var5.getScheme().matches("([a-zA-Z][a-zA-Z0-9+.-]*)?");
         }

         URI var4;
         boolean var10001;
         if (!var2) {
            label85: {
               try {
                  var4 = new URI(var0);
               } catch (URISyntaxException var12) {
                  var10001 = false;
                  break label85;
               }

               if (var4.isOpaque()) {
                  var5 = (new Builder()).scheme(var4.getScheme()).encodedOpaquePart(var4.getRawSchemeSpecificPart()).encodedFragment(var4.getRawFragment()).build();
                  A02(var5, var0, var4);
                  return var5;
               }

               Uri var17 = (new Builder()).scheme(var4.getScheme()).encodedAuthority(var4.getRawAuthority()).encodedPath(var4.getRawPath()).encodedQuery(var4.getRawQuery()).encodedFragment(var4.getRawFragment()).build();
               A03(var17, var4, false);
               return var17;
            }
         } else {
            label94: {
               if (var5.isOpaque()) {
                  try {
                     var4 = new URI(var5.getScheme(), var5.getSchemeSpecificPart(), var5.getFragment());
                  } catch (URISyntaxException var16) {
                     var10001 = false;
                     break label94;
                  }

                  A02(var5, var0, var4);
               } else {
                  String var6;
                  try {
                     String var7 = var5.getScheme();
                     String var11 = var5.getUserInfo();
                     var6 = var5.getHost();
                     int var1 = var5.getPort();
                     String var8 = var5.getPath();
                     String var9 = var5.getQuery();
                     String var10 = var5.getFragment();
                     var4 = new URI(var7, var11, var6, var1, var8, var9, var10);
                  } catch (URISyntaxException var15) {
                     try {
                        var6 = var5.toString();
                        var4 = new URI(var6);
                        var6 = var5.getHost();
                        if (var4.getHost() != null) {
                           break label94;
                        }
                     } catch (URISyntaxException var14) {
                        var10001 = false;
                        break label94;
                     }

                     if (var6 == null) {
                        break label94;
                     }

                     try {
                        if (!var6.contains("_")) {
                           break label94;
                        }
                     } catch (URISyntaxException var13) {
                        var10001 = false;
                        break label94;
                     }
                  }

                  label59: {
                     var6 = var5.getHost();
                     if (var4.getHost() == null && var6 != null) {
                        boolean var3 = var6.contains("_");
                        var2 = true;
                        if (var3) {
                           break label59;
                        }
                     }

                     var2 = false;
                  }

                  A03(var5, var4, var2);
               }

               if (A01) {
                  01m.A00.put(var0, true);
                  return var5;
               }

               return var5;
            }
         }

         StringBuilder var18 = new StringBuilder();
         var18.append("Parsing url <sanitized \"");
         var18.append(A00.AYN(var0));
         var18.append("\"> caused exception");
         throw new SecurityException(var18.toString());
      } else {
         return var5;
      }
   }

   public static void A02(Uri var0, String var1, URI var2) {
      boolean var4 = A04(var2.getScheme(), var0.getScheme());
      boolean var3 = A04(var2.getSchemeSpecificPart(), var0.getSchemeSpecificPart());
      if (!var4 || !var3) {
         StringBuilder var5 = new StringBuilder();
         var5.append("java uri <sanitized \"");
         String var6 = var2.toString();
         03e var7 = A00;
         var5.append(var7.AYN(var6));
         var5.append("\"> not equal to android uri <sanitized \"");
         var5.append(var7.AYN(var0.toString()));
         var5.append("\"> from original <sanitized \"");
         var5.append(var7.AYN(var1));
         var5.append("\">");
         throw new SecurityException(var5.toString());
      }
   }

   public static void A03(Uri var0, URI var1, boolean var2) {
      boolean var5 = A04(var1.getScheme(), var0.getScheme());
      boolean var3 = A04(var1.getAuthority(), var0.getAuthority());
      boolean var4 = A04(var1.getPath(), var0.getPath());
      if (!var5 || !var3 || !var4) {
         String var7 = "";
         StringBuilder var6;
         if (!var5) {
            var6 = new StringBuilder();
            var6.append("");
            var6.append("javaUri scheme: \"");
            var6.append(var1.getScheme());
            var6.append("\". androidUri scheme: \"");
            var6.append(var0.getScheme());
            var6.append("\".");
            var7 = var6.toString();
         }

         String var10 = var7;
         if (!var2) {
            var10 = var7;
            if (!var3) {
               var6 = new StringBuilder();
               var6.append(var7);
               var6.append("javaUri authority: \"");
               var6.append(var1.getAuthority());
               var6.append("\". androidUri authority: \"");
               var6.append(var0.getAuthority());
               var6.append("\".");
               var10 = var6.toString();
            }
         }

         var7 = var10;
         if (!var4) {
            StringBuilder var11 = new StringBuilder();
            var11.append(var10);
            var11.append("javaUri path: \"");
            var11.append(var1.getPath());
            var11.append("\". androidUri path: \"");
            var11.append(var0.getPath());
            var11.append("\".");
            var7 = var11.toString();
         }

         var6 = new StringBuilder();
         var6.append("java uri <sanitized \"");
         String var9 = var1.toString();
         03e var8 = A00;
         var6.append(var8.AYN(var9));
         var6.append("\"> not equal to android uri <sanitized \"");
         var6.append(var8.AYN(var0.toString()));
         var6.append("\">. Debug info ");
         var6.append(var7);
         var6.append(".");
         throw new SecurityException(var6.toString());
      }
   }

   public static boolean A04(String var0, String var1) {
      boolean var2;
      if (var0 != null && !var0.equals("")) {
         var2 = var0.equals(var1);
         return var2;
      } else {
         if (var1 != null) {
            boolean var3 = var1.equals("");
            var2 = false;
            if (!var3) {
               return var2;
            }
         }

         return true;
      }
   }
}
