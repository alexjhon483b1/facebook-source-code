package com.facebook.appcomponentmanager;

import java.io.Serializable;

public class AppComponentManagerProfiledRun implements Serializable {
   public static final long serialVersionUID = 1L;
   public long mDurationInMilliseconds;
   public String mTrigger;
   public int mUpdatedComponents;

   public AppComponentManagerProfiledRun() {
   }

   public AppComponentManagerProfiledRun(String var1, int var2, long var3) {
      this.mTrigger = var1;
      this.mUpdatedComponents = var2;
      this.mDurationInMilliseconds = var3;
   }

   public long getDurationInMilliseconds() {
      return this.mDurationInMilliseconds;
   }

   public String getTrigger() {
      return this.mTrigger;
   }

   public int getUpdatedComponents() {
      return this.mUpdatedComponents;
   }

   public void setDurationInMilliseconds(int var1) {
      this.mDurationInMilliseconds = (long)var1;
   }

   public void setTrigger(String var1) {
      this.mTrigger = var1;
   }

   public void setUpdatedComponents(int var1) {
      this.mUpdatedComponents = var1;
   }
}
