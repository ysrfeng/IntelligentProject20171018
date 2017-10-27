package com.ysr.lucky.base;

import android.content.Context;

/**
 * @author ysr
 * @data 2017/10/20 下午5:57.
 * 邮箱 yfeng1023@gmail.com
 */

public class BasePresenter <T,E>{
    public Context mContext;
    public E mModel;
    public T mView;


    public void setVM(T v, E m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }
    public void onStart(){
    };
    public void onDestroy() {

    }
}
