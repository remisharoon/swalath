package com.remis.swalath;

import android.app.Application;
import android.content.Context;


public class SwalathApplication extends Application {
    private static SwalathApplication mSwalathApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mSwalathApplication = this;
    }


    public static SwalathApplication getApplication() {
        return mSwalathApplication;
    }

    public static Context getApplicationCtx() {
        return mSwalathApplication.getApplicationContext();
    }
}
