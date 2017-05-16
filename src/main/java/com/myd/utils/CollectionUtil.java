package com.myd.utils;

import java.util.List;

/**
 * Created by zhugp on 2017/3/10.
 */
public class CollectionUtil {
    public static boolean isNotEmpty(List<?> list){
        if(list.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
}
