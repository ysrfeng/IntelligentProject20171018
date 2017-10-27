package com.ysr.lucky.utils;

import java.lang.reflect.ParameterizedType;

/**
 * 类转换初始化
 * @author ysr
 * @data 2017/10/21 下午1:57.
 * 邮箱 yfeng1023@gmail.com
 */

public class TUtil {
    public static <T> T getT(Object o, int i) {
        try {
            return ((Class<T>) ((ParameterizedType) (o.getClass()
                    .getGenericSuperclass())).getActualTypeArguments()[i])
                    .newInstance();
        } catch (InstantiationException e) {
        } catch (IllegalAccessException e) {
        } catch (ClassCastException e) {
        }
        return null;
    }

    public static Class<?> forName(String className) {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
