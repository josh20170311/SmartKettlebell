package com.josh.smartkettlebell.service;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

import androidx.annotation.Nullable;

public class CounterService extends Service {

    CounterService mService = this;
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new LocalBinder();
    }
    public class LocalBinder extends Binder {

        public CounterService getService(){
            return mService;
        }
    }
}
