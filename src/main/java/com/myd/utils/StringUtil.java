package com.myd.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zhugp on 2017/3/10.
 */
public class StringUtil {
    private static final String tag = "StringUtil";
    private static final Logger logger = LoggerFactory.getLogger(StringUtil.class);

    public static boolean isNotEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static boolean validateParam(String str) {

        return true;
    }

    /**
     * 是否可以转换成对应类型
     * @param str
     * @return
     */
    public static boolean castableToInteger(String str,String type) {
        if(str.length()==0) {
            logger.error("参数不能为空");
            return false;
        }
        if(type.equals("Integer") || type.equals("int")){
            try {
                Integer.parseInt(str);
            } catch (NumberFormatException e) {
                logger.error(tag,"str无法转换为int类型");
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        System.out.println(Integer.parseInt("s"));
    }
}
