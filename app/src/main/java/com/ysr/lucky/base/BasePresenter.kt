package com.ysr.lucky.base

import android.content.Context

/**
 * @author ysr
 * @data 2017/10/20 下午5:57.
 * 邮箱 yfeng1023@gmail.com
 */

class BasePresenter<T, E> {
    var mContext: Context? = null
    var mModel: E? = null
    var mView: T? = null


    fun setVM(v: T, m: E) {
        this.mView = v
        this.mModel = m
        this.onStart()
    }

    fun onStart() {}
    fun onDestroy() {

    }
}
