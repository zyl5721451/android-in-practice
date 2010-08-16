package com.manning.aip.dealdroid;

import android.app.AlarmManager;
import android.os.SystemClock;

public class Constants {

   public static final String LOG_TAG = "DealDroid";

   // In real life, use AlarmManager.INTERVALs with longer periods of time 
   // for dev you can shorten this to 10000 or such, but deals don't change often anyway
   // (better yet, allow user to set and use PreferenceActivity)
   ///public static final long ALARM_INTERVAL = AlarmManager.INTERVAL_HOUR;
   public static final long ALARM_INTERVAL = 5000;

   public static final long ALARM_TRIGGER_AT_TIME = SystemClock.elapsedRealtime() + 30000;

}
