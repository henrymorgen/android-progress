package com.example.liuwangshu.myprogress;

import android.app.ActivityManager;
import android.app.Application;
import android.util.Log;

/**
 * Created by Moon on 2015/12/22.
 */
public class MyApplication extends Application {
    private static final String TAG = "wangshu";

    @Override
    public void onCreate() {
        super.onCreate();
        int pid = android.os.Process.myPid();
        Log.i(TAG, "MyApplication is oncreate====" + "pid=" + pid);
//        String processNameString = "";
//        ActivityManager mActivityManager = (ActivityManager) this.getSystemService(getApplicationContext().ACTIVITY_SERVICE);
//        for (ActivityManager.RunningAppProcessInfo appProcess : mActivityManager.getRunningAppProcesses()) {
//            if (appProcess.pid == pid) {
//                processNameString = appProcess.processName;
//                Log.i(TAG, "processName=" + processNameString);
//            }
//        }
//        if ("com.example.liuwangshu.myprogress".equals(processNameString)) {
//            Log.i(TAG, "processName=" + processNameString + "-----work");
//        } else {
//            Log.i(TAG, "processName=" + processNameString + "-----work");
//        }
//
   }
}
