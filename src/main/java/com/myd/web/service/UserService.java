package com.myd.web.service;

import com.myd.core.generic.GenericService;
import com.myd.web.model.User;

import java.util.Map;

/**
 * 用户 业务 接口
 * 
 **/
public interface UserService extends GenericService<User, Long> {

    /**
     * 用户验证
     * 
     * @param user
     * @return
     */
    User authentication(User user);

    /**
     * 根据用户名查询用户
     * 
     * @param username
     * @return
     */
    User selectByUsername(String username);

    Map selectByLoginName(String loginName, String password);
}
