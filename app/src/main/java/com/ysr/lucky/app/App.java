package com.ysr.lucky.app;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * @author ysr
 * @data 2017/10/20 下午5:53.
 * 邮箱 yfeng1023@gmail.com
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //初始化LeakCanary
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
