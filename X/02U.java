package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.os.Build.VERSION;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import org.json.JSONException;
import org.json.JSONObject;

public final class 02U {
   public static final String A00;

   static {
      StringBuilder var0 = new StringBuilder();
      var0.append("Null metadata in caller identity, API=");
      var0.append(VERSION.SDK_INT);
      A00 = var0.toString();
   }

   public static 02S A00(Context var0, Intent var1, 008 var2, int var3) {
      if (var1 == null) {
         A03(var2, "Missing caller identity intent extra.", (Throwable)null);
         return null;
      } else {
         int var5 = VERSION.SDK_INT;
         if (var5 < 17) {
            A03(var2, "Skipping caller identity metadata check on API <= 17.", (Throwable)null);
         }

         String var15 = null;
         Object var16 = null;
         if (!var1.hasExtra("_ci_")) {
            A03(var2, "Missing caller identity intent extra.", (Throwable)null);
            return null;
         } else {
            PendingIntent var18 = (PendingIntent)var1.getParcelableExtra("_ci_");
            if (var18 == null) {
               A03(var2, "Null caller identity intent extra.", (Throwable)null);
               return null;
            } else {
               int var4;
               String var59;
               if (var5 >= 17) {
                  var59 = 0AE.A01(var18);
                  var4 = 0AE.A00(var18);
               } else {
                  var59 = var18.getTargetPackage();
                  var4 = 00l.A01(var0, var59).A00.uid;
               }

               if (var59 == null) {
                  return null;
               } else {
                  00i var17;
                  try {
                     var17 = 00l.A02(var0, var59);
                  } catch (SecurityException var19) {
                     A03(var2, "Failed to get signature.", var19);
                     return null;
                  }

                  label204: {
                     boolean var10001;
                     String var56;
                     Object var58;
                     label203: {
                        label202: {
                           IllegalAccessException var10000;
                           label201: {
                              NoSuchMethodException var61;
                              label200: {
                                 InvocationTargetException var60;
                                 if (var5 >= 24) {
                                    try {
                                       var56 = (String)PendingIntent.class.getMethod("getTag", String.class).invoke(var18, "");
                                       break label203;
                                    } catch (NoSuchMethodException var47) {
                                       var61 = var47;
                                       var10001 = false;
                                       break label200;
                                    } catch (InvocationTargetException var48) {
                                       var60 = var48;
                                       var10001 = false;
                                    } catch (IllegalAccessException var49) {
                                       var10000 = var49;
                                       var10001 = false;
                                       break label201;
                                    }
                                 } else {
                                    label217: {
                                       if (var5 < 18) {
                                          break label204;
                                       }

                                       Intent var57;
                                       try {
                                          var57 = (Intent)PendingIntent.class.getMethod("getIntent", (Class[])Collections.emptyList().toArray(new Class[0])).invoke(var18);
                                       } catch (NoSuchMethodException var53) {
                                          var61 = var53;
                                          var10001 = false;
                                          break label200;
                                       } catch (InvocationTargetException var54) {
                                          var60 = var54;
                                          var10001 = false;
                                          break label217;
                                       } catch (IllegalAccessException var55) {
                                          var10000 = var55;
                                          var10001 = false;
                                          break label201;
                                       }

                                       if (var57 == null) {
                                          break label204;
                                       }

                                       try {
                                          var56 = var57.getAction();
                                          break label203;
                                       } catch (NoSuchMethodException var50) {
                                          var61 = var50;
                                          var10001 = false;
                                          break label200;
                                       } catch (InvocationTargetException var51) {
                                          var60 = var51;
                                          var10001 = false;
                                       } catch (IllegalAccessException var52) {
                                          var10000 = var52;
                                          var10001 = false;
                                          break label201;
                                       }
                                    }
                                 }

                                 var58 = var60;
                                 break label202;
                              }

                              var58 = var61;
                              break label202;
                           }

                           var58 = var10000;
                        }

                        A03(var2, "Error extracting metadata from caller identity.", (Throwable)var58);
                        break label204;
                     }

                     if (var56 != null) {
                        label180: {
                           UnsupportedEncodingException var66;
                           label179: {
                              JSONException var65;
                              label178: {
                                 IllegalArgumentException var64;
                                 label218: {
                                    JSONObject var63;
                                    try {
                                       byte[] var62 = Base64.decode(var56, 11);
                                       var56 = new String(var62, "UTF-8");
                                       var63 = new JSONObject(var56);
                                    } catch (UnsupportedEncodingException var44) {
                                       var66 = var44;
                                       var10001 = false;
                                       break label179;
                                    } catch (JSONException var45) {
                                       var65 = var45;
                                       var10001 = false;
                                       break label178;
                                    } catch (IllegalArgumentException var46) {
                                       var64 = var46;
                                       var10001 = false;
                                       break label218;
                                    }

                                    var56 = (String)var16;

                                    try {
                                       if (var63.has("d")) {
                                          var56 = var63.getString("d");
                                       }
                                    } catch (UnsupportedEncodingException var41) {
                                       var66 = var41;
                                       var10001 = false;
                                       break label179;
                                    } catch (JSONException var42) {
                                       var65 = var42;
                                       var10001 = false;
                                       break label178;
                                    } catch (IllegalArgumentException var43) {
                                       var64 = var43;
                                       var10001 = false;
                                       break label218;
                                    }

                                    try {
                                       if (var63.has("v")) {
                                          var15 = var63.getString("v");
                                       }
                                    } catch (UnsupportedEncodingException var38) {
                                       var66 = var38;
                                       var10001 = false;
                                       break label179;
                                    } catch (JSONException var39) {
                                       var65 = var39;
                                       var10001 = false;
                                       break label178;
                                    } catch (IllegalArgumentException var40) {
                                       var64 = var40;
                                       var10001 = false;
                                       break label218;
                                    }

                                    boolean var14;
                                    try {
                                       var14 = var63.has("t");
                                    } catch (UnsupportedEncodingException var35) {
                                       var66 = var35;
                                       var10001 = false;
                                       break label179;
                                    } catch (JSONException var36) {
                                       var65 = var36;
                                       var10001 = false;
                                       break label178;
                                    } catch (IllegalArgumentException var37) {
                                       var64 = var37;
                                       var10001 = false;
                                       break label218;
                                    }

                                    long var8 = -1L;
                                    long var6;
                                    if (var14) {
                                       try {
                                          var6 = Long.parseLong(var63.getString("t"));
                                       } catch (UnsupportedEncodingException var32) {
                                          var66 = var32;
                                          var10001 = false;
                                          break label179;
                                       } catch (JSONException var33) {
                                          var65 = var33;
                                          var10001 = false;
                                          break label178;
                                       } catch (IllegalArgumentException var34) {
                                          var64 = var34;
                                          var10001 = false;
                                          break label218;
                                       }
                                    } else {
                                       var6 = -1L;
                                    }

                                    try {
                                       if (var63.has("r")) {
                                          var8 = Long.parseLong(var63.getString("r"));
                                       }
                                    } catch (UnsupportedEncodingException var29) {
                                       var66 = var29;
                                       var10001 = false;
                                       break label179;
                                    } catch (JSONException var30) {
                                       var65 = var30;
                                       var10001 = false;
                                       break label178;
                                    } catch (IllegalArgumentException var31) {
                                       var64 = var31;
                                       var10001 = false;
                                       break label218;
                                    }

                                    long var10;
                                    try {
                                       var10 = System.currentTimeMillis();
                                    } catch (UnsupportedEncodingException var26) {
                                       var66 = var26;
                                       var10001 = false;
                                       break label179;
                                    } catch (JSONException var27) {
                                       var65 = var27;
                                       var10001 = false;
                                       break label178;
                                    } catch (IllegalArgumentException var28) {
                                       var64 = var28;
                                       var10001 = false;
                                       break label218;
                                    }

                                    long var12 = (long)var3;
                                    if (var10 - var6 >= var12) {
                                       try {
                                          if (SystemClock.elapsedRealtime() - var8 >= var12) {
                                             A03(var2, "Caller identity has expired.", (Throwable)null);
                                             return null;
                                          }
                                       } catch (UnsupportedEncodingException var23) {
                                          var66 = var23;
                                          var10001 = false;
                                          break label179;
                                       } catch (JSONException var24) {
                                          var65 = var24;
                                          var10001 = false;
                                          break label178;
                                       } catch (IllegalArgumentException var25) {
                                          var64 = var25;
                                          var10001 = false;
                                          break label218;
                                       }
                                    }

                                    try {
                                       return new 02S(var15, var56, Collections.singletonList(var59), Collections.singletonList(var17), var4);
                                    } catch (UnsupportedEncodingException var20) {
                                       var66 = var20;
                                       var10001 = false;
                                       break label179;
                                    } catch (JSONException var21) {
                                       var65 = var21;
                                       var10001 = false;
                                       break label178;
                                    } catch (IllegalArgumentException var22) {
                                       var64 = var22;
                                       var10001 = false;
                                    }
                                 }

                                 var58 = var64;
                                 break label180;
                              }

                              var58 = var65;
                              break label180;
                           }

                           var58 = var66;
                        }

                        A03(var2, "Error parsing metadata from caller identity.", (Throwable)var58);
                        return null;
                     }
                  }

                  A03(var2, A00, (Throwable)null);
                  return var5 >= 17 ? null : new 02S((String)null, (String)null, Collections.singletonList(var59), Collections.singletonList(var17), var4);
               }
            }
         }
      }
   }

   public static void A01(Context var0, Intent var1, 008 var2, String var3) {
      try {
         A02(var0, var1, var3);
      } catch (00v var4) {
         var2.AXV("CallerInfoHelper", "Error attaching caller info to Intent.", var4);
      }
   }

   public static void A02(Context param0, Intent param1, String param2) {
      // $FF: Couldn't be decompiled
   }

   public static void A03(008 var0, String var1, Throwable var2) {
      if (var0 != null) {
         var0.AXV("CallerInfoHelper", var1, var2);
      }

   }
}
