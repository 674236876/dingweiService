package com.myd.web.tokens.service;

/**
 * Created by zhugp on 2017/3/28.
 */
public interface TokenService<Model> {
    /**
     * 创建一个token关联上指定用户
     * @param ptId 指定用户的id
     * @return 生成的token
     */
    Model createToken(String ptId);

    /**
     * 检查token是否有效
     * @param model token
     * @return 是否有效
     */
    boolean checkToken(Model model);

    /**
     * 从字符串中解析token
     * @param authentication 加密后的字符串
     * @return
     */
    Model getToken(String authentication);

    /**
     * 清除token
     * @param ptId 登录用户的id
     */
    void deleteToken(String ptId);
}
