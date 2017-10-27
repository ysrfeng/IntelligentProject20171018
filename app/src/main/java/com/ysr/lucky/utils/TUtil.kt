package com.ysr.lucky.utils

import java.lang.reflect.ParameterizedType

/**
 * 类转换初始化
 * @author ysr
 * @data 2017/10/21 下午1:57.
 * 邮箱 yfeng1023@gmail.com
 */

object TUtil {
    fun <T> getT(o: Any, i: Int): T? {
        try {
            return ((o.javaClass
                    .genericSuperclass as ParameterizedType).actualTypeArguments[i] as Class<T>)
                    .newInstance()
        } catch (e: InstantiationException) {
        } catch (e: IllegalAccessException) {
        } catch (e: ClassCastException) {
        }

        return null
    }

    fun forName(className: String): Class<*>? {
        try {
            return Class.forName(className)
        } catch (e: ClassNotFoundException) {
            e.printStackTrace()
        }

        return null
    }
}
