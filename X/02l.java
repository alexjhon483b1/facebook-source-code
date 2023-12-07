package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.Map.Entry;

public final class 02l {
   public static 02l A08;
   public int A00;
   public 031 A01;
   public WeakReference A02;
   public boolean A03;
   public final Object A04 = new Object();
   public final Object A05;
   public final List A06;
   public final WeakHashMap A07;

   public _2l/* $FF was: 02l*/() {
      int var1 = 0;
      this.A03 = false;
      this.A05 = new Object();
      this.A07 = new WeakHashMap();
      this.A06 = new ArrayList();
      this.A01 = null;
      Integer[] var4 = 04j.A01(12);

      for(int var2 = var4.length; var1 < var2; ++var1) {
         Integer var3 = var4[var1];
         this.A06.add(var3.intValue(), new WeakHashMap());
      }

   }

   public final void A00(Integer var1, Object var2) {
      synchronized(this){}

      Throwable var10000;
      Throwable var611;
      label5367: {
         int var3;
         boolean var10001;
         label5361: {
            label5368: {
               try {
                  this.A03 = true;
                  if (var1 == 04j.A0C) {
                     var3 = this.A00 + 1;
                     break label5368;
                  }
               } catch (Throwable var609) {
                  var10000 = var609;
                  var10001 = false;
                  break label5367;
               }

               try {
                  if (var1 != 04j.A0b) {
                     break label5361;
                  }

                  var3 = this.A00 - 1;
               } catch (Throwable var608) {
                  var10000 = var608;
                  var10001 = false;
                  break label5367;
               }
            }

            try {
               this.A00 = var3;
            } catch (Throwable var607) {
               var10000 = var607;
               var10001 = false;
               break label5367;
            }
         }

         label5369: {
            WeakReference var6;
            try {
               var6 = this.A02;
            } catch (Throwable var603) {
               var10000 = var603;
               var10001 = false;
               break label5369;
            }

            WeakHashMap var616;
            label5344: {
               label5343: {
                  if (var6 != null) {
                     Object var614;
                     try {
                        var614 = var6.get();
                     } catch (Throwable var602) {
                        var10000 = var602;
                        var10001 = false;
                        break label5369;
                     }

                     if (var614 != null) {
                        018 var7;
                        try {
                           var7 = (018)this.A07.get(var614);
                        } catch (Throwable var601) {
                           var10000 = var601;
                           var10001 = false;
                           break label5369;
                        }

                        if (var7 != null) {
                           Integer var615;
                           try {
                              var615 = var7.A00;
                           } catch (Throwable var600) {
                              var10000 = var600;
                              var10001 = false;
                              break label5369;
                           }

                           boolean var612 = false;
                           if (var614 == var2) {
                              var612 = true;
                           }

                           int var5;
                           try {
                              var5 = var1.compareTo(var615);
                           } catch (Throwable var599) {
                              var10000 = var599;
                              var10001 = false;
                              break label5369;
                           }

                           boolean var4 = false;
                           if (var5 < 0) {
                              var4 = true;
                           }

                           if (var612) {
                              if (var4 || var5 == 0) {
                                 break label5344;
                              }

                              List var8;
                              int var613;
                              try {
                                 var8 = this.A06;
                                 var3 = var615.intValue();
                                 var616 = (WeakHashMap)var8.get(var3);
                                 var613 = var616.size();
                              } catch (Throwable var598) {
                                 var10000 = var598;
                                 var10001 = false;
                                 break label5369;
                              }

                              var614 = null;
                              Object var618;
                              Entry var619;
                              if (var613 > 1) {
                                 Iterator var617;
                                 try {
                                    var617 = var616.entrySet().iterator();
                                 } catch (Throwable var597) {
                                    var10000 = var597;
                                    var10001 = false;
                                    break label5369;
                                 }

                                 try {
                                    while(true) {
                                       if (!var617.hasNext()) {
                                          break label5344;
                                       }

                                       var619 = (Entry)var617.next();
                                       if (var619.getKey() != var2) {
                                          var618 = var619.getKey();
                                          break;
                                       }
                                    }
                                 } catch (Throwable var605) {
                                    var10000 = var605;
                                    var10001 = false;
                                    break label5369;
                                 }
                              } else {
                                 try {
                                    var613 = var1.intValue();
                                 } catch (Throwable var596) {
                                    var10000 = var596;
                                    var10001 = false;
                                    break label5369;
                                 }

                                 ++var3;
                                 if (var613 == var3) {
                                    break label5344;
                                 }

                                 while(true) {
                                    var618 = var614;
                                    if (var3 >= var613) {
                                       break;
                                    }

                                    Iterator var9;
                                    try {
                                       var9 = ((WeakHashMap)var8.get(var3)).entrySet().iterator();
                                    } catch (Throwable var595) {
                                       var10000 = var595;
                                       var10001 = false;
                                       break label5369;
                                    }

                                    label5324: {
                                       while(true) {
                                          var618 = var614;

                                          try {
                                             if (!var9.hasNext()) {
                                                break label5324;
                                             }

                                             var619 = (Entry)var9.next();
                                             if (var619.getKey() != var2) {
                                                var614 = var619.getKey();
                                                break;
                                             }
                                          } catch (Throwable var606) {
                                             var10000 = var606;
                                             var10001 = false;
                                             break label5369;
                                          }
                                       }

                                       var618 = var614;
                                       if (var614 != null) {
                                          var618 = var614;
                                          break;
                                       }
                                    }

                                    ++var3;
                                    var614 = var618;
                                 }
                              }

                              if (var618 == null) {
                                 break label5344;
                              }

                              try {
                                 var6 = new WeakReference(var618);
                                 break label5343;
                              } catch (Throwable var594) {
                                 var10000 = var594;
                                 var10001 = false;
                                 break label5369;
                              }
                           }

                           if (!var4) {
                              break label5344;
                           }
                        }
                     }
                  }

                  try {
                     var6 = new WeakReference(var2);
                  } catch (Throwable var593) {
                     var10000 = var593;
                     var10001 = false;
                     break label5369;
                  }
               }

               try {
                  this.A02 = var6;
               } catch (Throwable var592) {
                  var10000 = var592;
                  var10001 = false;
                  break label5369;
               }
            }

            018 var620;
            try {
               var616 = this.A07;
               var620 = (018)var616.get(var2);
            } catch (Throwable var591) {
               var10000 = var591;
               var10001 = false;
               break label5369;
            }

            if (var620 != null) {
               try {
                  ((WeakHashMap)this.A06.get(var620.A00.intValue())).remove(var2);
               } catch (Throwable var590) {
                  var10000 = var590;
                  var10001 = false;
                  break label5369;
               }
            }

            018 var610;
            label5290: {
               label5375: {
                  label5288: {
                     label5287: {
                        try {
                           ((WeakHashMap)this.A06.get(var1.intValue())).put(var2, this.A04);
                           if (var1 != 04j.A0U) {
                              break label5287;
                           }
                        } catch (Throwable var604) {
                           var10000 = var604;
                           var10001 = false;
                           break label5369;
                        }

                        if (var620 == null) {
                           break label5375;
                        }
                        break label5288;
                     }

                     if (var620 == null) {
                        break label5375;
                     }
                  }

                  try {
                     var620.A00 = var1;
                  } catch (Throwable var589) {
                     var10000 = var589;
                     var10001 = false;
                     break label5369;
                  }

                  var610 = var620;
                  break label5290;
               }

               try {
                  var610 = new 018(var1);
               } catch (Throwable var588) {
                  var10000 = var588;
                  var10001 = false;
                  break label5369;
               }
            }

            label5256:
            try {
               var616.put(var2, var610);
               return;
            } catch (Throwable var587) {
               var10000 = var587;
               var10001 = false;
               break label5256;
            }
         }

         var611 = var10000;

         label5253:
         try {
            throw var611;
         } catch (Throwable var586) {
            var10000 = var586;
            var10001 = false;
            break label5253;
         }
      }

      var611 = var10000;
      throw var611;
   }
}
