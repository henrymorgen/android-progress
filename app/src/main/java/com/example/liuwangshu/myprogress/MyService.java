package com.example.liuwangshu.myprogress;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    private static final String TAG = "wangshu";
    @Override
    public void onCreate() {
        Log.i(TAG,"MyService is oncreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "MyProcessActivity is created: ");
        return START_STICKY;
    }
    @Override
    public void onDestroy() {
        Log.i(TAG,"OnDestory");
    }
    @Override
    public IBinder onBind(Intent arg0) {
        return null;
    }

}