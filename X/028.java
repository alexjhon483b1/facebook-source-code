package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class 028 {
   public final long A00;
   public final 00j A01;
   public final ArrayList A02;
   public final ArrayList A03;

   public _28/* $FF was: 028*/(00j var1, ArrayList var2, ArrayList var3, long var4) {
      this.A01 = var1;
      this.A02 = var2;
      this.A03 = var3;
      this.A00 = var4;
      if (var1 == null && var3.isEmpty() && (1L & var4) == 0L) {
         throw new IllegalArgumentException("TrustedCaller needs to be configured with at least 1 security check");
      }
   }

   public final void A00(Context var1, Intent var2, 008 var3) {
      long var17 = this.A00;
      int var4;
      if ((16L & var17) != 0L) {
         var4 = Integer.MAX_VALUE;
      } else {
         var4 = 60000;
         if ((8L & var17) != 0L) {
            var4 = 86400000;
         }
      }

      02S var23 = 0AD.A00(var1, var2, var3, var4, var17);
      if (var23 != null) {
         ArrayList var1048 = this.A02;
         StringBuilder var1049;
         if (!var1048.isEmpty() && !var1048.contains(var23.A01)) {
            var1049 = new StringBuilder();
            var1049.append("Missing required Caller Domains ");
            var1049.append(var1048);
            var1049.append(" from caller ");
            var1049.append(var23);
            throw new SecurityException(var1049.toString());
         } else {
            Throwable var1047;
            Throwable var10000;
            label4626: {
               label4670: {
                  if ((1L & var17) == 0L || !var1.getPackageName().equals(var23.A03())) {
                     00i var1050 = 0Ar.A00(var1).A01(var1.getPackageName()).A00.A02();
                     boolean var13;
                     if (var1050 == null) {
                        var13 = false;
                     } else {
                        var13 = 00h.A1H.contains(var1050);
                     }

                     00j var25 = this.A01;
                     if (var25 != null && !var25.A04(var23, var13)) {
                        var1049 = new StringBuilder();
                        var1049.append("Caller Identity '");
                        var1049.append(var23);
                        var1049.append("' is not trusted");
                        throw new SecurityException(var1049.toString());
                     }

                     ArrayList var24 = this.A03;
                     if (!var24.isEmpty()) {
                        boolean var5 = false;
                        if ((4L & var17) != 0L) {
                           var5 = true;
                        }

                        int var6;
                        Object var19;
                        if (var13) {
                           var1048 = new ArrayList();
                           String[] var20 = 00l.A05(var1, var23.A00);
                           var6 = var20.length;
                           var4 = 0;

                           while(true) {
                              var19 = var1048;
                              if (var4 >= var6) {
                                 break;
                              }

                              var1048.addAll(0AJ.A00(var1, var20[var4]));
                              ++var4;
                           }
                        } else {
                           var19 = Collections.emptyList();
                        }

                        0AJ var1052;
                        0AJ var1071;
                        boolean var10001;
                        if (var3 != null) {
                           synchronized(0AJ.class){}

                           label4638: {
                              label4639: {
                                 try {
                                    var1071 = 0AJ.A01;
                                 } catch (Throwable var1046) {
                                    var10000 = var1046;
                                    var10001 = false;
                                    break label4639;
                                 }

                                 var1052 = var1071;
                                 if (var1071 != null) {
                                    break label4638;
                                 }

                                 label4602:
                                 try {
                                    var1052 = new 0AJ();
                                    0AJ.A01 = var1052;
                                    break label4638;
                                 } catch (Throwable var1045) {
                                    var10000 = var1045;
                                    var10001 = false;
                                    break label4602;
                                 }
                              }

                              var1047 = var10000;

                              try {
                                 throw var1047;
                              } catch (Throwable var903) {
                                 var10000 = var903;
                                 var10001 = false;
                                 break label4626;
                              }
                           }

                           try {
                              var1052.A00 = var3;
                           } catch (Throwable var904) {
                              var10000 = var904;
                              var10001 = false;
                              break label4626;
                           }

                           var1071 = var1052;
                        } else {
                           synchronized(0AJ.class){}

                           0AJ var1051;
                           try {
                              var1051 = 0AJ.A01;
                           } catch (Throwable var906) {
                              var10000 = var906;
                              var10001 = false;
                              break label4670;
                           }

                           var1052 = var1051;
                           if (var1051 == null) {
                              try {
                                 var1052 = new 0AJ();
                                 0AJ.A01 = var1052;
                              } catch (Throwable var905) {
                                 var10000 = var905;
                                 var10001 = false;
                                 break label4670;
                              }
                           }

                           var1071 = var1052;
                        }

                        Iterator var26 = var24.iterator();
                        boolean var1057 = false;

                        label4596:
                        do {
                           label4594: {
                              do {
                                 if (!var26.hasNext()) {
                                    if (var1057) {
                                       break label4596;
                                    }
                                    break;
                                 }

                                 boolean var14;
                                 String var28;
                                 boolean var1059;
                                 label4590: {
                                    var28 = (String)var26.next();
                                    if (var13) {
                                       var14 = ((List)var19).contains(var28);
                                       var1059 = true;
                                       if (var14) {
                                          break label4590;
                                       }
                                    }

                                    var1059 = false;
                                 }

                                 var1057 = false;
                                 if ((2L & var17) != 0L) {
                                    var1057 = true;
                                 }

                                 if (var1059) {
                                    break label4594;
                                 }

                                 008 var27 = var1071.A00;
                                 int var11 = var23.A00;
                                 String[] var29 = 00l.A05(var1, var11);
                                 int var10 = var29.length;
                                 StringBuilder var1056;
                                 if (var10 > 1) {
                                    var1056 = new StringBuilder();
                                    var1056.append("UID '");
                                    var1056.append(var11);
                                    var1056.append("' is shared by multiple packages: '");
                                    var1056.append(Arrays.toString(var29));
                                    var1056.append("'");
                                    var27.AXU(var1056.toString());
                                 }

                                 var6 = 0;

                                 boolean var7;
                                 boolean var8;
                                 StringBuilder var1055;
                                 String var1060;
                                 for(var7 = false; var6 < var10; var7 = var8) {
                                    String var22 = var29[var6];

                                    label4643: {
                                       label4579: {
                                          label4578: {
                                             label4644: {
                                                try {
                                                   var1050 = 00l.A02(var1, var1.getPackageName());
                                                   if (00h.A1H.contains(var1050)) {
                                                      var14 = 0AJ.A00(var1, var22).isEmpty();
                                                      break label4578;
                                                   }
                                                } catch (IOException | NameNotFoundException var1044) {
                                                   var10001 = false;
                                                   break label4644;
                                                }

                                                String[] var1058;
                                                try {
                                                   var1058 = var1.createPackageContext(var22, 0).getAssets().list("");
                                                } catch (IOException | NameNotFoundException var1043) {
                                                   var10001 = false;
                                                   break label4644;
                                                }

                                                var8 = var7;
                                                if (var1058 == null) {
                                                   break label4643;
                                                }

                                                int var12;
                                                try {
                                                   var12 = var1058.length;
                                                } catch (IOException | NameNotFoundException var1042) {
                                                   var10001 = false;
                                                   break label4644;
                                                }

                                                int var9 = 0;

                                                while(true) {
                                                   var8 = var7;
                                                   if (var9 >= var12) {
                                                      break label4643;
                                                   }

                                                   try {
                                                      if (var1058[var9].equals("fbpermissions.json")) {
                                                         break label4579;
                                                      }
                                                   } catch (IOException | NameNotFoundException var1041) {
                                                      var10001 = false;
                                                      break;
                                                   }

                                                   ++var9;
                                                }
                                             }

                                             var8 = var7;
                                             break label4643;
                                          }

                                          if (!(var14 ^ true)) {
                                             var8 = var7;
                                             break label4643;
                                          }
                                       }

                                       var1060 = var1.getPackageName();
                                       HashSet var21 = new HashSet();
                                       HashSet var1053 = new HashSet();
                                       byte var1068 = 0;

                                       label4646: {
                                          String var1054;
                                          int var1067;
                                          String var1074;
                                          label4552: {
                                             label4551: {
                                                Object var1062;
                                                StringBuilder var1072;
                                                label4550: {
                                                   NameNotFoundException var1093;
                                                   label4549: {
                                                      IOException var1092;
                                                      label4548: {
                                                         JSONException var1091;
                                                         label4547: {
                                                            BufferedReader var1073;
                                                            StringBuilder var1076;
                                                            try {
                                                               InputStream var30 = var1.createPackageContext(var22, 0).getAssets().open("fbpermissions.json");
                                                               InputStreamReader var31 = new InputStreamReader(var30);
                                                               var1073 = new BufferedReader(var31);
                                                               var1076 = new StringBuilder();
                                                            } catch (NameNotFoundException var1038) {
                                                               var1093 = var1038;
                                                               var10001 = false;
                                                               break label4549;
                                                            } catch (IOException var1039) {
                                                               var1092 = var1039;
                                                               var10001 = false;
                                                               break label4548;
                                                            } catch (JSONException var1040) {
                                                               var1091 = var1040;
                                                               var10001 = false;
                                                               break label4547;
                                                            }

                                                            label4545:
                                                            while(true) {
                                                               String var32;
                                                               try {
                                                                  var32 = var1073.readLine();
                                                               } catch (NameNotFoundException var1032) {
                                                                  var1093 = var1032;
                                                                  var10001 = false;
                                                                  break label4549;
                                                               } catch (IOException var1033) {
                                                                  var1092 = var1033;
                                                                  var10001 = false;
                                                                  break label4548;
                                                               } catch (JSONException var1034) {
                                                                  var1091 = var1034;
                                                                  var10001 = false;
                                                                  break;
                                                               }

                                                               if (var32 == null) {
                                                                  try {
                                                                     var1073.close();
                                                                     var1067 = var1076.length();
                                                                  } catch (NameNotFoundException var1029) {
                                                                     var1093 = var1029;
                                                                     var10001 = false;
                                                                     break label4549;
                                                                  } catch (IOException var1030) {
                                                                     var1092 = var1030;
                                                                     var10001 = false;
                                                                     break label4548;
                                                                  } catch (JSONException var1031) {
                                                                     var1091 = var1031;
                                                                     var10001 = false;
                                                                     break;
                                                                  }

                                                                  if (var1067 == 0) {
                                                                     try {
                                                                        var1056 = new StringBuilder();
                                                                        var1056.append("Consumer app '");
                                                                        var1056.append(var22);
                                                                        var1056.append("' has an empty FbPermissions asset file");
                                                                        var27.AXU(var1056.toString());
                                                                        break label4551;
                                                                     } catch (NameNotFoundException var1011) {
                                                                        var1093 = var1011;
                                                                        var10001 = false;
                                                                        break label4549;
                                                                     } catch (IOException var1012) {
                                                                        var1092 = var1012;
                                                                        var10001 = false;
                                                                        break label4548;
                                                                     } catch (JSONException var1013) {
                                                                        var1091 = var1013;
                                                                        var10001 = false;
                                                                        break;
                                                                     }
                                                                  } else {
                                                                     JSONObject var1075;
                                                                     JSONObject var1078;
                                                                     JSONArray var1079;
                                                                     try {
                                                                        var1074 = var1076.toString();
                                                                        var1078 = new JSONObject(var1074);
                                                                        if (!var1078.has(var1060)) {
                                                                           break label4551;
                                                                        }

                                                                        var1075 = var1078.getJSONObject(var1060);
                                                                        var1079 = var1075.getJSONArray("permissions");
                                                                        if (var1079.length() == 0) {
                                                                           var1055 = new StringBuilder();
                                                                           var1055.append("Consumer app '");
                                                                           var1055.append(var22);
                                                                           var1055.append("' has an empty permissions list for '");
                                                                           var1055.append(var1060);
                                                                           var1055.append("' provider");
                                                                           var27.AXU(var1055.toString());
                                                                           break label4551;
                                                                        }
                                                                     } catch (NameNotFoundException var1026) {
                                                                        var1093 = var1026;
                                                                        var10001 = false;
                                                                        break label4549;
                                                                     } catch (IOException var1027) {
                                                                        var1092 = var1027;
                                                                        var10001 = false;
                                                                        break label4548;
                                                                     } catch (JSONException var1028) {
                                                                        var1091 = var1028;
                                                                        var10001 = false;
                                                                        break;
                                                                     }

                                                                     var1067 = 0;

                                                                     while(true) {
                                                                        try {
                                                                           if (var1067 >= var1079.length()) {
                                                                              break;
                                                                           }

                                                                           var21.add(var1079.getString(var1067));
                                                                        } catch (NameNotFoundException var1023) {
                                                                           var1093 = var1023;
                                                                           var10001 = false;
                                                                           break label4549;
                                                                        } catch (IOException var1024) {
                                                                           var1092 = var1024;
                                                                           var10001 = false;
                                                                           break label4548;
                                                                        } catch (JSONException var1025) {
                                                                           var1091 = var1025;
                                                                           var10001 = false;
                                                                           break label4545;
                                                                        }

                                                                        ++var1067;
                                                                     }

                                                                     JSONArray var1061;
                                                                     label4650: {
                                                                        label4519: {
                                                                           try {
                                                                              if (!var1075.has("signatures")) {
                                                                                 break label4519;
                                                                              }

                                                                              var1061 = var1075.getJSONArray("signatures");
                                                                           } catch (NameNotFoundException var1020) {
                                                                              var1093 = var1020;
                                                                              var10001 = false;
                                                                              break label4549;
                                                                           } catch (IOException var1021) {
                                                                              var1092 = var1021;
                                                                              var10001 = false;
                                                                              break label4548;
                                                                           } catch (JSONException var1022) {
                                                                              var1091 = var1022;
                                                                              var10001 = false;
                                                                              break;
                                                                           }

                                                                           var1067 = var1068;
                                                                           break label4650;
                                                                        }

                                                                        try {
                                                                           var1061 = new JSONArray();
                                                                           var1061.put(var1075.getJSONObject("signature"));
                                                                        } catch (NameNotFoundException var1017) {
                                                                           var1093 = var1017;
                                                                           var10001 = false;
                                                                           break label4549;
                                                                        } catch (IOException var1018) {
                                                                           var1092 = var1018;
                                                                           var10001 = false;
                                                                           break label4548;
                                                                        } catch (JSONException var1019) {
                                                                           var1091 = var1019;
                                                                           var10001 = false;
                                                                           break;
                                                                        }

                                                                        var1067 = var1068;
                                                                     }

                                                                     while(true) {
                                                                        try {
                                                                           if (var1067 >= var1061.length()) {
                                                                              break label4552;
                                                                           }

                                                                           var1078 = var1061.getJSONObject(var1067);
                                                                           0AI var1077 = new 0AI();
                                                                           var1077.A00 = var1078.getString("algorithm");
                                                                           var1077.A01 = var1078.getString("value");
                                                                           var1053.add(var1077);
                                                                        } catch (NameNotFoundException var1014) {
                                                                           var1093 = var1014;
                                                                           var10001 = false;
                                                                           break label4549;
                                                                        } catch (IOException var1015) {
                                                                           var1092 = var1015;
                                                                           var10001 = false;
                                                                           break label4548;
                                                                        } catch (JSONException var1016) {
                                                                           var1091 = var1016;
                                                                           var10001 = false;
                                                                           break label4545;
                                                                        }

                                                                        ++var1067;
                                                                     }
                                                                  }
                                                               }

                                                               try {
                                                                  var1076.append(var32);
                                                               } catch (NameNotFoundException var1035) {
                                                                  var1093 = var1035;
                                                                  var10001 = false;
                                                                  break label4549;
                                                               } catch (IOException var1036) {
                                                                  var1092 = var1036;
                                                                  var10001 = false;
                                                                  break label4548;
                                                               } catch (JSONException var1037) {
                                                                  var1091 = var1037;
                                                                  var10001 = false;
                                                                  break;
                                                               }
                                                            }
                                                         }

                                                         var1062 = var1091;
                                                         var1072 = new StringBuilder();
                                                         var1072.append("Failed to decode FBPermission asset file from package '");
                                                         var1072.append(var22);
                                                         var1054 = "' due to JSON exception: ";
                                                         break label4550;
                                                      }

                                                      var1062 = var1092;
                                                      var1072 = new StringBuilder();
                                                      var1072.append("Failed to read FBPermission asset file from package '");
                                                      var1072.append(var22);
                                                      var1054 = "': ";
                                                      break label4550;
                                                   }

                                                   NameNotFoundException var1065 = var1093;
                                                   var1055 = new StringBuilder();
                                                   var1055.append("Cannot create package context for '");
                                                   var1055.append(var22);
                                                   var1055.append("'");
                                                   var27.AXV("FbPermission", var1055.toString(), var1065);
                                                   break label4551;
                                                }

                                                var1072.append(var1054);
                                                var1072.append(((Throwable)var1062).getMessage());
                                                var27.AXV("FbPermission", var1072.toString(), (Throwable)var1062);
                                             }

                                             var1056 = new StringBuilder();
                                             var1056.append("Failed to read fb permissions from '");
                                             var1056.append(var22);
                                             var1056.append("' asset");
                                             break label4646;
                                          }

                                          label4490: {
                                             if (!var21.contains(var28)) {
                                                var1056 = new StringBuilder();
                                                var1056.append("Missing FBPermission '");
                                                var1056.append(var28);
                                                var1056.append("' in '");
                                                var1056.append(var22);
                                                var1056.append("' required by '");
                                                var1054 = var1.getPackageName();
                                             } else {
                                                if (!var1053.isEmpty()) {
                                                   try {
                                                      var1074 = 00l.A02(var1, var22).A01;
                                                   } catch (SecurityException var908) {
                                                      var1055 = new StringBuilder();
                                                      var1055.append("Invalid developer key for package '");
                                                      var1055.append(var22);
                                                      var1055.append("' while verifying '");
                                                      var1055.append(var28);
                                                      var1055.append("'");
                                                      var27.AXV("FbPermission", var1055.toString(), var908);
                                                      var8 = var7;
                                                      break label4643;
                                                   }

                                                   if (var1074 == null) {
                                                      var1056 = new StringBuilder();
                                                      var1054 = "Invalid key hash for package '";
                                                   } else {
                                                      long var15;
                                                      try {
                                                         var15 = 00A.A01(var1, var22, 0).A00();
                                                      } catch (RuntimeException | NameNotFoundException var907) {
                                                         var1056 = new StringBuilder();
                                                         var1056.append("Exception in getting version code for package '");
                                                         var1056.append(var22);
                                                         var1056.append("' while verifying '");
                                                         var1056.append(var28);
                                                         var1056.append("'");
                                                         var27.AXU(var1056.toString());
                                                         var8 = var7;
                                                         break label4643;
                                                      }

                                                      if (var15 > 0L) {
                                                         Iterator var1081 = var1053.iterator();

                                                         while(true) {
                                                            label4394:
                                                            while(true) {
                                                               var8 = var7;
                                                               if (!var1081.hasNext()) {
                                                                  break label4643;
                                                               }

                                                               0AI var1063 = (0AI)var1081.next();
                                                               var1060 = var1063.A00;
                                                               var1054 = var1063.A01;
                                                               if (!TextUtils.isEmpty(var1054) && !TextUtils.isEmpty(var1060)) {
                                                                  String var33 = var1.getPackageName();

                                                                  Object var1066;
                                                                  label4475: {
                                                                     CertificateException var1097;
                                                                     label4474: {
                                                                        InvalidKeyException var1096;
                                                                        label4473: {
                                                                           NoSuchAlgorithmException var1095;
                                                                           label4472: {
                                                                              SignatureException var1094;
                                                                              label4471: {
                                                                                 label4470: {
                                                                                    SecurityException var1099;
                                                                                    label4469: {
                                                                                       0AK var1098;
                                                                                       label4468: {
                                                                                          0AK var1069;
                                                                                          label4655: {
                                                                                             label4466: {
                                                                                                ArrayList var36;
                                                                                                TreeSet var37;
                                                                                                Iterator var38;
                                                                                                PublicKey var1083;
                                                                                                ByteArrayOutputStream var1086;
                                                                                                try {
                                                                                                   Signature var34 = 00l.A00(00l.A01(var1, var33));
                                                                                                   CertificateFactory var1082 = CertificateFactory.getInstance("X.509");
                                                                                                   byte[] var1085 = var34.toByteArray();
                                                                                                   ByteArrayInputStream var35 = new ByteArrayInputStream(var1085);
                                                                                                   var1083 = var1082.generateCertificate(var35).getPublicKey();
                                                                                                   var1086 = new ByteArrayOutputStream();
                                                                                                   var1086.write(-5);
                                                                                                   var1086.write(0);
                                                                                                   var37 = new TreeSet(var21);
                                                                                                   if (var37.size() > 255) {
                                                                                                      break label4466;
                                                                                                   }

                                                                                                   var36 = new ArrayList();
                                                                                                   var38 = var37.iterator();
                                                                                                } catch (SecurityException var1005) {
                                                                                                   var1099 = var1005;
                                                                                                   var10001 = false;
                                                                                                   break label4469;
                                                                                                } catch (0AK var1006) {
                                                                                                   var1098 = var1006;
                                                                                                   var10001 = false;
                                                                                                   break label4468;
                                                                                                } catch (CertificateException var1007) {
                                                                                                   var1097 = var1007;
                                                                                                   var10001 = false;
                                                                                                   break label4474;
                                                                                                } catch (InvalidKeyException var1008) {
                                                                                                   var1096 = var1008;
                                                                                                   var10001 = false;
                                                                                                   break label4473;
                                                                                                } catch (NoSuchAlgorithmException var1009) {
                                                                                                   var1095 = var1009;
                                                                                                   var10001 = false;
                                                                                                   break label4472;
                                                                                                } catch (SignatureException var1010) {
                                                                                                   var1094 = var1010;
                                                                                                   var10001 = false;
                                                                                                   break label4471;
                                                                                                }

                                                                                                while(true) {
                                                                                                   label4657: {
                                                                                                      byte[] var1087;
                                                                                                      try {
                                                                                                         if (var38.hasNext()) {
                                                                                                            var1087 = ((String)var38.next()).getBytes(0AL.A00);
                                                                                                            if (var1087.length > 255) {
                                                                                                               break label4657;
                                                                                                            }

                                                                                                            var36.add(var1087);
                                                                                                            continue;
                                                                                                         }
                                                                                                      } catch (SecurityException var999) {
                                                                                                         var1099 = var999;
                                                                                                         var10001 = false;
                                                                                                         break label4469;
                                                                                                      } catch (0AK var1000) {
                                                                                                         var1098 = var1000;
                                                                                                         var10001 = false;
                                                                                                         break label4468;
                                                                                                      } catch (CertificateException var1001) {
                                                                                                         var1097 = var1001;
                                                                                                         var10001 = false;
                                                                                                         break label4474;
                                                                                                      } catch (InvalidKeyException var1002) {
                                                                                                         var1096 = var1002;
                                                                                                         var10001 = false;
                                                                                                         break label4473;
                                                                                                      } catch (NoSuchAlgorithmException var1003) {
                                                                                                         var1095 = var1003;
                                                                                                         var10001 = false;
                                                                                                         break label4472;
                                                                                                      } catch (SignatureException var1004) {
                                                                                                         var1094 = var1004;
                                                                                                         var10001 = false;
                                                                                                         break label4471;
                                                                                                      }

                                                                                                      Iterator var1089;
                                                                                                      try {
                                                                                                         var1086.write(1);
                                                                                                         var1086.write(var37.size() & 255);
                                                                                                         var1089 = var36.iterator();
                                                                                                      } catch (SecurityException var981) {
                                                                                                         var1099 = var981;
                                                                                                         var10001 = false;
                                                                                                         break label4469;
                                                                                                      } catch (0AK var982) {
                                                                                                         var1098 = var982;
                                                                                                         var10001 = false;
                                                                                                         break label4468;
                                                                                                      } catch (CertificateException var983) {
                                                                                                         var1097 = var983;
                                                                                                         var10001 = false;
                                                                                                         break label4474;
                                                                                                      } catch (InvalidKeyException var984) {
                                                                                                         var1096 = var984;
                                                                                                         var10001 = false;
                                                                                                         break label4473;
                                                                                                      } catch (NoSuchAlgorithmException var985) {
                                                                                                         var1095 = var985;
                                                                                                         var10001 = false;
                                                                                                         break label4472;
                                                                                                      } catch (SignatureException var986) {
                                                                                                         var1094 = var986;
                                                                                                         var10001 = false;
                                                                                                         break label4471;
                                                                                                      }

                                                                                                      while(true) {
                                                                                                         try {
                                                                                                            if (!var1089.hasNext()) {
                                                                                                               break;
                                                                                                            }

                                                                                                            var1087 = (byte[])var1089.next();
                                                                                                            var1067 = var1087.length;
                                                                                                            var1086.write(var1067 & 255);
                                                                                                            var1086.write(var1087, 0, var1067);
                                                                                                         } catch (SecurityException var993) {
                                                                                                            var1099 = var993;
                                                                                                            var10001 = false;
                                                                                                            break label4469;
                                                                                                         } catch (0AK var994) {
                                                                                                            var1098 = var994;
                                                                                                            var10001 = false;
                                                                                                            break label4468;
                                                                                                         } catch (CertificateException var995) {
                                                                                                            var1097 = var995;
                                                                                                            var10001 = false;
                                                                                                            break label4474;
                                                                                                         } catch (InvalidKeyException var996) {
                                                                                                            var1096 = var996;
                                                                                                            var10001 = false;
                                                                                                            break label4473;
                                                                                                         } catch (NoSuchAlgorithmException var997) {
                                                                                                            var1095 = var997;
                                                                                                            var10001 = false;
                                                                                                            break label4472;
                                                                                                         } catch (SignatureException var998) {
                                                                                                            var1094 = var998;
                                                                                                            var10001 = false;
                                                                                                            break label4471;
                                                                                                         }
                                                                                                      }

                                                                                                      Charset var1088;
                                                                                                      byte[] var1090;
                                                                                                      try {
                                                                                                         var1088 = 0AL.A00;
                                                                                                         var1090 = var22.getBytes(var1088);
                                                                                                         var1067 = var1090.length;
                                                                                                      } catch (SecurityException var975) {
                                                                                                         var1099 = var975;
                                                                                                         var10001 = false;
                                                                                                         break label4469;
                                                                                                      } catch (0AK var976) {
                                                                                                         var1098 = var976;
                                                                                                         var10001 = false;
                                                                                                         break label4468;
                                                                                                      } catch (CertificateException var977) {
                                                                                                         var1097 = var977;
                                                                                                         var10001 = false;
                                                                                                         break label4474;
                                                                                                      } catch (InvalidKeyException var978) {
                                                                                                         var1096 = var978;
                                                                                                         var10001 = false;
                                                                                                         break label4473;
                                                                                                      } catch (NoSuchAlgorithmException var979) {
                                                                                                         var1095 = var979;
                                                                                                         var10001 = false;
                                                                                                         break label4472;
                                                                                                      } catch (SignatureException var980) {
                                                                                                         var1094 = var980;
                                                                                                         var10001 = false;
                                                                                                         break label4471;
                                                                                                      }

                                                                                                      if (var1067 <= 255) {
                                                                                                         try {
                                                                                                            var1086.write(2);
                                                                                                            var1086.write(var1067 & 255);
                                                                                                            var1086.write(var1090, 0, var1067);
                                                                                                            var1090 = String.valueOf(var15).getBytes(var1088);
                                                                                                            var1067 = var1090.length;
                                                                                                         } catch (SecurityException var969) {
                                                                                                            var1099 = var969;
                                                                                                            var10001 = false;
                                                                                                            break label4469;
                                                                                                         } catch (0AK var970) {
                                                                                                            var1098 = var970;
                                                                                                            var10001 = false;
                                                                                                            break label4468;
                                                                                                         } catch (CertificateException var971) {
                                                                                                            var1097 = var971;
                                                                                                            var10001 = false;
                                                                                                            break label4474;
                                                                                                         } catch (InvalidKeyException var972) {
                                                                                                            var1096 = var972;
                                                                                                            var10001 = false;
                                                                                                            break label4473;
                                                                                                         } catch (NoSuchAlgorithmException var973) {
                                                                                                            var1095 = var973;
                                                                                                            var10001 = false;
                                                                                                            break label4472;
                                                                                                         } catch (SignatureException var974) {
                                                                                                            var1094 = var974;
                                                                                                            var10001 = false;
                                                                                                            break label4471;
                                                                                                         }

                                                                                                         if (var1067 <= 255) {
                                                                                                            try {
                                                                                                               var1086.write(3);
                                                                                                               var1086.write(var1067 & 255);
                                                                                                               var1086.write(var1090, 0, var1067);
                                                                                                               var1090 = var1074.getBytes(var1088);
                                                                                                               var1067 = var1090.length;
                                                                                                            } catch (SecurityException var963) {
                                                                                                               var1099 = var963;
                                                                                                               var10001 = false;
                                                                                                               break label4469;
                                                                                                            } catch (0AK var964) {
                                                                                                               var1098 = var964;
                                                                                                               var10001 = false;
                                                                                                               break label4468;
                                                                                                            } catch (CertificateException var965) {
                                                                                                               var1097 = var965;
                                                                                                               var10001 = false;
                                                                                                               break label4474;
                                                                                                            } catch (InvalidKeyException var966) {
                                                                                                               var1096 = var966;
                                                                                                               var10001 = false;
                                                                                                               break label4473;
                                                                                                            } catch (NoSuchAlgorithmException var967) {
                                                                                                               var1095 = var967;
                                                                                                               var10001 = false;
                                                                                                               break label4472;
                                                                                                            } catch (SignatureException var968) {
                                                                                                               var1094 = var968;
                                                                                                               var10001 = false;
                                                                                                               break label4471;
                                                                                                            }

                                                                                                            if (var1067 <= 255) {
                                                                                                               byte[] var1084;
                                                                                                               try {
                                                                                                                  var1086.write(4);
                                                                                                                  var1086.write(var1067 & 255);
                                                                                                                  var1086.write(var1090, 0, var1067);
                                                                                                                  var1084 = var33.getBytes(var1088);
                                                                                                                  var1067 = var1084.length;
                                                                                                               } catch (SecurityException var933) {
                                                                                                                  var1099 = var933;
                                                                                                                  var10001 = false;
                                                                                                                  break label4469;
                                                                                                               } catch (0AK var934) {
                                                                                                                  var1098 = var934;
                                                                                                                  var10001 = false;
                                                                                                                  break label4468;
                                                                                                               } catch (CertificateException var935) {
                                                                                                                  var1097 = var935;
                                                                                                                  var10001 = false;
                                                                                                                  break label4474;
                                                                                                               } catch (InvalidKeyException var936) {
                                                                                                                  var1096 = var936;
                                                                                                                  var10001 = false;
                                                                                                                  break label4473;
                                                                                                               } catch (NoSuchAlgorithmException var937) {
                                                                                                                  var1095 = var937;
                                                                                                                  var10001 = false;
                                                                                                                  break label4472;
                                                                                                               } catch (SignatureException var938) {
                                                                                                                  var1094 = var938;
                                                                                                                  var10001 = false;
                                                                                                                  break label4471;
                                                                                                               }

                                                                                                               if (var1067 <= 255) {
                                                                                                                  try {
                                                                                                                     var1086.write(5);
                                                                                                                     var1086.write(var1067 & 255);
                                                                                                                     var1086.write(var1084, 0, var1067);
                                                                                                                     var1084 = var1086.toByteArray();
                                                                                                                  } catch (SecurityException var915) {
                                                                                                                     var1099 = var915;
                                                                                                                     var10001 = false;
                                                                                                                     break label4469;
                                                                                                                  } catch (0AK var916) {
                                                                                                                     var1098 = var916;
                                                                                                                     var10001 = false;
                                                                                                                     break label4468;
                                                                                                                  } catch (CertificateException var917) {
                                                                                                                     var1097 = var917;
                                                                                                                     var10001 = false;
                                                                                                                     break label4474;
                                                                                                                  } catch (InvalidKeyException var918) {
                                                                                                                     var1096 = var918;
                                                                                                                     var10001 = false;
                                                                                                                     break label4473;
                                                                                                                  } catch (NoSuchAlgorithmException var919) {
                                                                                                                     var1095 = var919;
                                                                                                                     var10001 = false;
                                                                                                                     break label4472;
                                                                                                                  } catch (SignatureException var920) {
                                                                                                                     var1094 = var920;
                                                                                                                     var10001 = false;
                                                                                                                     break label4471;
                                                                                                                  }

                                                                                                                  var1084[1] = (byte)5;

                                                                                                                  try {
                                                                                                                     byte[] var1064 = Base64.decode(var1054, 10);
                                                                                                                     java.security.Signature var1070 = java.security.Signature.getInstance(var1060);
                                                                                                                     var1070.initVerify(var1083);
                                                                                                                     var1070.update(var1084);
                                                                                                                     if (!var1070.verify(var1064)) {
                                                                                                                        continue label4394;
                                                                                                                     }
                                                                                                                     break label4470;
                                                                                                                  } catch (SecurityException var909) {
                                                                                                                     var1099 = var909;
                                                                                                                     var10001 = false;
                                                                                                                     break label4469;
                                                                                                                  } catch (0AK var910) {
                                                                                                                     var1098 = var910;
                                                                                                                     var10001 = false;
                                                                                                                     break label4468;
                                                                                                                  } catch (CertificateException var911) {
                                                                                                                     var1097 = var911;
                                                                                                                     var10001 = false;
                                                                                                                     break label4474;
                                                                                                                  } catch (InvalidKeyException var912) {
                                                                                                                     var1096 = var912;
                                                                                                                     var10001 = false;
                                                                                                                     break label4473;
                                                                                                                  } catch (NoSuchAlgorithmException var913) {
                                                                                                                     var1095 = var913;
                                                                                                                     var10001 = false;
                                                                                                                     break label4472;
                                                                                                                  } catch (SignatureException var914) {
                                                                                                                     var1094 = var914;
                                                                                                                     var10001 = false;
                                                                                                                     break label4471;
                                                                                                                  }
                                                                                                               }

                                                                                                               try {
                                                                                                                  var1069 = new 0AK("String size (UTF-8 encoded) cannot exceed 255");
                                                                                                                  break label4655;
                                                                                                               } catch (SecurityException var927) {
                                                                                                                  var1099 = var927;
                                                                                                                  var10001 = false;
                                                                                                                  break label4469;
                                                                                                               } catch (0AK var928) {
                                                                                                                  var1098 = var928;
                                                                                                                  var10001 = false;
                                                                                                                  break label4468;
                                                                                                               } catch (CertificateException var929) {
                                                                                                                  var1097 = var929;
                                                                                                                  var10001 = false;
                                                                                                                  break label4474;
                                                                                                               } catch (InvalidKeyException var930) {
                                                                                                                  var1096 = var930;
                                                                                                                  var10001 = false;
                                                                                                                  break label4473;
                                                                                                               } catch (NoSuchAlgorithmException var931) {
                                                                                                                  var1095 = var931;
                                                                                                                  var10001 = false;
                                                                                                                  break label4472;
                                                                                                               } catch (SignatureException var932) {
                                                                                                                  var1094 = var932;
                                                                                                                  var10001 = false;
                                                                                                                  break label4471;
                                                                                                               }
                                                                                                            } else {
                                                                                                               try {
                                                                                                                  var1069 = new 0AK("String size (UTF-8 encoded) cannot exceed 255");
                                                                                                                  break label4655;
                                                                                                               } catch (SecurityException var957) {
                                                                                                                  var1099 = var957;
                                                                                                                  var10001 = false;
                                                                                                                  break label4469;
                                                                                                               } catch (0AK var958) {
                                                                                                                  var1098 = var958;
                                                                                                                  var10001 = false;
                                                                                                                  break label4468;
                                                                                                               } catch (CertificateException var959) {
                                                                                                                  var1097 = var959;
                                                                                                                  var10001 = false;
                                                                                                                  break label4474;
                                                                                                               } catch (InvalidKeyException var960) {
                                                                                                                  var1096 = var960;
                                                                                                                  var10001 = false;
                                                                                                                  break label4473;
                                                                                                               } catch (NoSuchAlgorithmException var961) {
                                                                                                                  var1095 = var961;
                                                                                                                  var10001 = false;
                                                                                                                  break label4472;
                                                                                                               } catch (SignatureException var962) {
                                                                                                                  var1094 = var962;
                                                                                                                  var10001 = false;
                                                                                                                  break label4471;
                                                                                                               }
                                                                                                            }
                                                                                                         } else {
                                                                                                            try {
                                                                                                               var1069 = new 0AK("String size (UTF-8 encoded) cannot exceed 255");
                                                                                                               break label4655;
                                                                                                            } catch (SecurityException var951) {
                                                                                                               var1099 = var951;
                                                                                                               var10001 = false;
                                                                                                               break label4469;
                                                                                                            } catch (0AK var952) {
                                                                                                               var1098 = var952;
                                                                                                               var10001 = false;
                                                                                                               break label4468;
                                                                                                            } catch (CertificateException var953) {
                                                                                                               var1097 = var953;
                                                                                                               var10001 = false;
                                                                                                               break label4474;
                                                                                                            } catch (InvalidKeyException var954) {
                                                                                                               var1096 = var954;
                                                                                                               var10001 = false;
                                                                                                               break label4473;
                                                                                                            } catch (NoSuchAlgorithmException var955) {
                                                                                                               var1095 = var955;
                                                                                                               var10001 = false;
                                                                                                               break label4472;
                                                                                                            } catch (SignatureException var956) {
                                                                                                               var1094 = var956;
                                                                                                               var10001 = false;
                                                                                                               break label4471;
                                                                                                            }
                                                                                                         }
                                                                                                      } else {
                                                                                                         try {
                                                                                                            var1069 = new 0AK("String size (UTF-8 encoded) cannot exceed 255");
                                                                                                            break label4655;
                                                                                                         } catch (SecurityException var945) {
                                                                                                            var1099 = var945;
                                                                                                            var10001 = false;
                                                                                                            break label4469;
                                                                                                         } catch (0AK var946) {
                                                                                                            var1098 = var946;
                                                                                                            var10001 = false;
                                                                                                            break label4468;
                                                                                                         } catch (CertificateException var947) {
                                                                                                            var1097 = var947;
                                                                                                            var10001 = false;
                                                                                                            break label4474;
                                                                                                         } catch (InvalidKeyException var948) {
                                                                                                            var1096 = var948;
                                                                                                            var10001 = false;
                                                                                                            break label4473;
                                                                                                         } catch (NoSuchAlgorithmException var949) {
                                                                                                            var1095 = var949;
                                                                                                            var10001 = false;
                                                                                                            break label4472;
                                                                                                         } catch (SignatureException var950) {
                                                                                                            var1094 = var950;
                                                                                                            var10001 = false;
                                                                                                            break label4471;
                                                                                                         }
                                                                                                      }
                                                                                                   }

                                                                                                   try {
                                                                                                      var1069 = new 0AK("String size (UTF-8 encoded) cannot exceed 255");
                                                                                                      break label4655;
                                                                                                   } catch (SecurityException var987) {
                                                                                                      var1099 = var987;
                                                                                                      var10001 = false;
                                                                                                      break label4469;
                                                                                                   } catch (0AK var988) {
                                                                                                      var1098 = var988;
                                                                                                      var10001 = false;
                                                                                                      break label4468;
                                                                                                   } catch (CertificateException var989) {
                                                                                                      var1097 = var989;
                                                                                                      var10001 = false;
                                                                                                      break label4474;
                                                                                                   } catch (InvalidKeyException var990) {
                                                                                                      var1096 = var990;
                                                                                                      var10001 = false;
                                                                                                      break label4473;
                                                                                                   } catch (NoSuchAlgorithmException var991) {
                                                                                                      var1095 = var991;
                                                                                                      var10001 = false;
                                                                                                      break label4472;
                                                                                                   } catch (SignatureException var992) {
                                                                                                      var1094 = var992;
                                                                                                      var10001 = false;
                                                                                                      break label4471;
                                                                                                   }
                                                                                                }
                                                                                             }

                                                                                             try {
                                                                                                var1069 = new 0AK("Collection size (duplicates removed) cannot exceed 255");
                                                                                             } catch (SecurityException var939) {
                                                                                                var1099 = var939;
                                                                                                var10001 = false;
                                                                                                break label4469;
                                                                                             } catch (0AK var940) {
                                                                                                var1098 = var940;
                                                                                                var10001 = false;
                                                                                                break label4468;
                                                                                             } catch (CertificateException var941) {
                                                                                                var1097 = var941;
                                                                                                var10001 = false;
                                                                                                break label4474;
                                                                                             } catch (InvalidKeyException var942) {
                                                                                                var1096 = var942;
                                                                                                var10001 = false;
                                                                                                break label4473;
                                                                                             } catch (NoSuchAlgorithmException var943) {
                                                                                                var1095 = var943;
                                                                                                var10001 = false;
                                                                                                break label4472;
                                                                                             } catch (SignatureException var944) {
                                                                                                var1094 = var944;
                                                                                                var10001 = false;
                                                                                                break label4471;
                                                                                             }
                                                                                          }

                                                                                          try {
                                                                                             throw var1069;
                                                                                          } catch (SecurityException var921) {
                                                                                             var1099 = var921;
                                                                                             var10001 = false;
                                                                                             break label4469;
                                                                                          } catch (0AK var922) {
                                                                                             var1098 = var922;
                                                                                             var10001 = false;
                                                                                          } catch (CertificateException var923) {
                                                                                             var1097 = var923;
                                                                                             var10001 = false;
                                                                                             break label4474;
                                                                                          } catch (InvalidKeyException var924) {
                                                                                             var1096 = var924;
                                                                                             var10001 = false;
                                                                                             break label4473;
                                                                                          } catch (NoSuchAlgorithmException var925) {
                                                                                             var1095 = var925;
                                                                                             var10001 = false;
                                                                                             break label4472;
                                                                                          } catch (SignatureException var926) {
                                                                                             var1094 = var926;
                                                                                             var10001 = false;
                                                                                             break label4471;
                                                                                          }
                                                                                       }

                                                                                       var1066 = var1098;
                                                                                       var1060 = "Failed to encode data using FbPermissionEncoder";
                                                                                       break label4475;
                                                                                    }

                                                                                    var1066 = var1099;
                                                                                    var1060 = "Failed to get provider package signature";
                                                                                    break label4475;
                                                                                 }

                                                                                 var8 = true;
                                                                                 break label4643;
                                                                              }

                                                                              var1066 = var1094;
                                                                              var1060 = "Signature type wrong or improperly encoded";
                                                                              break label4475;
                                                                           }

                                                                           var1066 = var1095;
                                                                           var1060 = "Unsupported signature algorithm";
                                                                           break label4475;
                                                                        }

                                                                        var1066 = var1096;
                                                                        var1060 = "Invalid public key";
                                                                        break label4475;
                                                                     }

                                                                     var1066 = var1097;
                                                                     var1060 = "Failed to get public key due to certificate exception";
                                                                  }

                                                                  var27.AXV("FbPermission", var1060, (Throwable)var1066);
                                                               } else {
                                                                  StringBuilder var1080 = new StringBuilder();
                                                                  var1080.append("Invalid signature for package '");
                                                                  var1080.append(var22);
                                                                  var1080.append("' while verifying '");
                                                                  var1080.append(var28);
                                                                  var1080.append("': algorithm(");
                                                                  var1080.append(var1060);
                                                                  var1080.append("), value(");
                                                                  var1080.append(var1054);
                                                                  var1080.append(")");
                                                                  var27.AXU(var1080.toString());
                                                               }
                                                            }
                                                         }
                                                      }

                                                      var1056 = new StringBuilder();
                                                      var1054 = "Invalid version code for package '";
                                                   }

                                                   var1056.append(var1054);
                                                   var1056.append(var22);
                                                   var1056.append("' while verifying '");
                                                   var1056.append(var28);
                                                   break label4490;
                                                }

                                                var1056 = new StringBuilder();
                                                var1056.append("Missing signature entry while verifying '");
                                                var1056.append(var28);
                                                var1056.append("' from package '");
                                                var1054 = var22;
                                             }

                                             var1056.append(var1054);
                                          }

                                          var1056.append("'");
                                       }

                                       var27.AXU(var1056.toString());
                                       var8 = var7;
                                    }

                                    ++var6;
                                 }

                                 if (var7) {
                                    break label4594;
                                 }

                                 var1056 = new StringBuilder();
                                 var1056.append("FBPermission '");
                                 var1056.append(var28);
                                 var1056.append("' was not granted to UID '");
                                 var1056.append(var11);
                                 var1056.append("' (packages: '");
                                 var1056.append(Arrays.toString(var29));
                                 var1056.append("')");
                                 var27.AXU(var1056.toString());
                                 var1056 = new StringBuilder();
                                 var1056.append("FBPermission '");
                                 var1056.append(var28);
                                 var1056.append("' was not granted to '");
                                 var1056.append(var23);
                                 var1056.append("'");
                                 var1060 = var1056.toString();
                                 var1055 = new StringBuilder();
                                 if (var1057) {
                                    var1055.append(var1060);
                                    var1060 = "; request is allowed for fail-open";
                                 } else {
                                    var1055.append(var1060);
                                    var1060 = "; request is denied for fail-close";
                                 }

                                 var1055.append(var1060);
                                 var27.AXU(var1055.toString());
                                 if (var1057) {
                                    break label4594;
                                 }

                                 var1057 = false;
                              } while(var5);

                              var1049 = new StringBuilder();
                              var1049.append("Missing at least one required FBPermission ");
                              var1049.append(var24);
                              var1049.append(" from caller ");
                              var1049.append(var23);
                              throw new SecurityException(var1049.toString());
                           }

                           var1057 = true;
                        } while(!var5);
                     }

                     if (var24.isEmpty() && var25 == null) {
                        throw new SecurityException("Calling app is not the same package, and no other identity checks were performed.");
                     }
                  }

                  return;
               }

               var1047 = var10000;
               throw var1047;
            }

            var1047 = var10000;
            throw var1047;
         }
      } else {
         throw new SecurityException("Invalid Caller Identity (null)");
      }
   }
}
