package com.axmf.jttest;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Created by feng on 2018/3/9.
 */

//github上的一个注释，注释
public class CcbApp extends Application {
    private RefWatcher refWatcher;
    @Override
    public void onCreate() {
        super.onCreate();
       refWatcher =  LeakCanary.install(this);
    }

    public static RefWatcher getRefWatcher(Context context) {
        CcbApp application = (CcbApp) context.getApplicationContext();
        return application.refWatcher;
    }
}
