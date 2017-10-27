package com.ysr.lucky.base

import android.support.v7.app.AppCompatActivity

/**
 * @author ysr
 * @data 2017/10/20 下午5:57.
 * 邮箱 yfeng1023@gmail.com
 */

open class BaseActivity<T : BasePresenter<*, *>, E : BaseModel> : AppCompatActivity()
