package com.song.jeremy.utils;

import java.util.List;

/**
 * @Description 参数判断工具类
 * @Date 2021/1/10 11:39
 * @Created by Jeremy
 */
public class StringUtil {
    /**
     * 参数是否是null或者空串
     * @param str 目标对象
     * @return true: 是null或空串,false: 不是null和空串
     */
    public static boolean isNullOrBlank(String str){
        return str == null || "".equals(str.trim());
    }

    /**
     * 参数是否是null或者空串
     * @param obj 目标对象
     * @return true: 是null或空串,false: 不是null和空串
     */
    public static boolean isNullOrBlank(Object obj){
        return obj == null || "".equals(obj.toString().trim());
    }

    /**
     * 参数是否是null或者空串
     * @param list 目标对象
     * @return true: 是null或空集合,false: 不是null和空集合
     */
    public static boolean isNullOrBlank(List list){
        return list == null || list.isEmpty();
    }
}
