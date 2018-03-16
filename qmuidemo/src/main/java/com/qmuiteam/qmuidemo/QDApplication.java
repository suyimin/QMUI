package com.qmuiteam.qmuidemo;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;

import com.qmuiteam.qmuidemo.manager.QDUpgradeManager;

/**
 * Demo 的 Application 入口。
 */
public class QDApplication extends Application {

    @SuppressLint("StaticFieldLeak") private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        QDUpgradeManager.getInstance(this).check();
    }
}
