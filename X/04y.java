package X;

import android.app.Application;
import android.os.Build.VERSION;
import org.json.JSONException;
import org.json.JSONObject;

public final class 04y implements 075 {
   public static final String[] A01 = new String[]{"android.permission.READ_CALENDAR", "android.permission.CAMERA", "android.permission.READ_CONTACTS", "android.permission.ACCESS_FINE_LOCATION", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE", "android.permission.BODY_SENSORS", "android.permission.SEND_SMS", "android.permission.READ_EXTERNAL_STORAGE"};
   public final Application A00;

   public _4y/* $FF was: 04y*/(Application var1) {
      this.A00 = var1;
   }

   public final Integer ABy() {
      return 04j.A0T;
   }

   public final void AVJ(02h var1, 02Z var2) {
      if (VERSION.SDK_INT >= 23) {
         07Y var9 = 072.A8i;
         JSONObject var8 = new JSONObject();
         int var3 = 0;

         while(true) {
            String[] var10 = A01;
            if (var3 >= var10.length) {
               var1.A04(var9, var8.toString());
               break;
            }

            String var7;
            String var13;
            label99: {
               label98: {
                  label123: {
                     label95: {
                        label124: {
                           label92: {
                              label91: {
                                 var7 = var10[var3];
                                 switch(var7.hashCode()) {
                                 case -2062386608:
                                    var13 = "android.permission.READ_SMS";
                                    break label91;
                                 case -1928411001:
                                    var13 = "android.permission.READ_CALENDAR";
                                    break label92;
                                 case -1921431796:
                                    var13 = "android.permission.READ_CALL_LOG";
                                    break label123;
                                 case -1888586689:
                                    var13 = "android.permission.ACCESS_FINE_LOCATION";
                                    break;
                                 case -1479758289:
                                    var13 = "android.permission.RECEIVE_WAP_PUSH";
                                    break label91;
                                 case -1238066820:
                                    if (var7.equals("android.permission.BODY_SENSORS")) {
                                       var13 = "android.permission-group.SENSORS";
                                       break label99;
                                    }
                                    break label98;
                                 case -895673731:
                                    var13 = "android.permission.RECEIVE_SMS";
                                    break label91;
                                 case -406040016:
                                    var13 = "android.permission.READ_EXTERNAL_STORAGE";
                                    break label124;
                                 case -63024214:
                                    var13 = "android.permission.ACCESS_COARSE_LOCATION";
                                    break;
                                 case -5573545:
                                    var13 = "android.permission.READ_PHONE_STATE";
                                    break label123;
                                 case 52602690:
                                    var13 = "android.permission.SEND_SMS";
                                    break label91;
                                 case 112197485:
                                    var13 = "android.permission.CALL_PHONE";
                                    break label123;
                                 case 214526995:
                                    var13 = "android.permission.WRITE_CONTACTS";
                                    break label95;
                                 case 463403621:
                                    if (var7.equals("android.permission.CAMERA")) {
                                       var13 = "android.permission-group.CAMERA";
                                       break label99;
                                    }
                                    break label98;
                                 case 603653886:
                                    var13 = "android.permission.WRITE_CALENDAR";
                                    break label92;
                                 case 610633091:
                                    var13 = "android.permission.WRITE_CALL_LOG";
                                    break label123;
                                 case 784519842:
                                    var13 = "android.permission.USE_SIP";
                                    break label123;
                                 case 952819282:
                                    var13 = "android.permission.PROCESS_OUTGOING_CALLS";
                                    break label123;
                                 case 1271781903:
                                    var13 = "android.permission.GET_ACCOUNTS";
                                    break label95;
                                 case 1365911975:
                                    var13 = "android.permission.WRITE_EXTERNAL_STORAGE";
                                    break label124;
                                 case 1831139720:
                                    if (var7.equals("android.permission.RECORD_AUDIO")) {
                                       var13 = "android.permission-group.MICROPHONE";
                                       break label99;
                                    }
                                    break label98;
                                 case 1977429404:
                                    var13 = "android.permission.READ_CONTACTS";
                                    break label95;
                                 case 2133799037:
                                    var13 = "com.android.voicemail.permission.ADD_VOICEMAIL";
                                    break label123;
                                 default:
                                    break label98;
                                 }

                                 if (var7.equals(var13)) {
                                    var13 = "android.permission-group.LOCATION";
                                    break label99;
                                 }
                                 break label98;
                              }

                              if (var7.equals(var13)) {
                                 var13 = "android.permission-group.SMS";
                                 break label99;
                              }
                              break label98;
                           }

                           if (var7.equals(var13)) {
                              var13 = "android.permission-group.CALENDAR";
                              break label99;
                           }
                           break label98;
                        }

                        if (var7.equals(var13)) {
                           var13 = "android.permission-group.STORAGE";
                           break label99;
                        }
                        break label98;
                     }

                     if (var7.equals(var13)) {
                        var13 = "android.permission-group.CONTACTS";
                        break label99;
                     }
                     break label98;
                  }

                  if (var7.equals(var13)) {
                     var13 = "android.permission-group.PHONE";
                     break label99;
                  }
               }

               var13 = "";
            }

            int var4 = var13.lastIndexOf(46);
            var7 = var13;
            if (var4 >= 0) {
               var7 = var13.substring(var4 + 1);
            }

            var13 = var10[var3];
            boolean var6 = false;
            boolean var5 = var6;

            label109: {
               try {
                  if (this.A00.checkCallingOrSelfPermission(var13) != 0) {
                     break label109;
                  }
               } catch (RuntimeException var12) {
                  08Y.A00();
                  var5 = var6;
                  break label109;
               }

               var5 = true;
            }

            try {
               var8.put(var7, var5);
            } catch (JSONException var11) {
               06i.A0A("lacrima", "Caught JSONException", var11);
               08Y.A00();
            }

            ++var3;
         }
      }

   }
}
