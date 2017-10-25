package com.taohf.libpublishtest;

import android.app.Application;

import com.taohf.library.common.LibPublish;

/**
 * Application
 * Created by hongfei.tao on 2017/10/25.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        LibPublish.init(this);
    }
}
