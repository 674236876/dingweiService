package com.myd.utils;

import com.google.common.collect.Maps;

import java.util.Map;

/**
 * Created by zhugp on 2017/4/5.
 */
public class ReturnFormat {
    private static Map<String,String> messageMap = Maps.newHashMap();
    //初始化状态码与文字说明
    static {
        messageMap.put("0", "");

        messageMap.put("400", "Bad Request!");
        messageMap.put("401", "NotAuthorization");
        messageMap.put("405", "Method Not Allowed");
        messageMap.put("406", "Not Acceptable");
        messageMap.put("500", "Internal Server Error");

        messageMap.put("1000", "[服务器]运行时异常");
        messageMap.put("1001", "[服务器]空值异常");
        messageMap.put("1002", "[服务器]数据类型转换异常");
        messageMap.put("1003", "[服务器]IO异常");
        messageMap.put("1004", "[服务器]未知方法异常");
        messageMap.put("1005", "[服务器]数组越界异常");
        messageMap.put("1006", "[服务器]网络异常");
        messageMap.put("1007", "[服务器]保存数据异常");

        messageMap.put("1010", "用户未注册");
        messageMap.put("1011", "用户已注册");
        messageMap.put("1012", "用户名或密码错误");
        messageMap.put("1013", "用户帐号冻结");
        messageMap.put("1014", "用户信息编辑失败");
        messageMap.put("1015", "用户信息失效，请重新获取");

        messageMap.put("2010", "缺少参数或值为空");

        messageMap.put("2029", "参数不合法");
        messageMap.put("2020", "无效的Token");
        messageMap.put("2021", "无操作权限");
        messageMap.put("2022", "请重新登录");

        messageMap.put("3001", "根据ptId未查询到对应终端");
        messageMap.put("3002", "该终端未设置分组");
        messageMap.put("3003", "终端不存在");
        messageMap.put("3004", "终端未激活");
        messageMap.put("3005", "终端未分配企业");

    }
    public static Response retParam(int status) {
        return new Response().failure(messageMap.get(String.valueOf(status)), status);
    }
}
