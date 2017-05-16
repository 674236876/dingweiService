package com.myd.web.service;

import com.myd.web.model.Token;

/**
 * Created by zhugp on 2017/3/28.
 */
public interface TokenService{
    /**
     * 创建一个token关联上指定用户
     * @param id 指定用户的id
     * @return 生成的token
     */
    Token createToken(String id);

    /**
     * 检查token是否有效
     * @param model token
     * @return 是否有效
     */
    boolean checkToken(Token model);

    /**
     * 从字符串中解析token
     * @param authentication 加密后的字符串
     * @return
     */
    Token getToken(String authentication);

    /**
     * 清除token
     * @param ptId 登录用户的id
     */
    void deleteToken(String ptId);
}
