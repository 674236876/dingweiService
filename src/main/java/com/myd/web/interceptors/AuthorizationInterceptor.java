package com.myd.web.interceptors;

import com.myd.config.Constants;
import com.myd.core.annotation.Authorization;
import com.myd.web.model.Token;
import com.myd.web.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 拦截器
 * 用于拦截发送上来的请求，验证是否有权限访问接口
 * Created by zhugp on 2017/3/28.
 */
public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

    @Autowired
    private TokenService tokenService;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //如果不是映射到方法直接通过
        if (!(handler instanceof HandlerMethod)) {
            return true;
        }
        System.out.println("拦截请求地址" + request.getRequestURI());
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        Method method = handlerMethod.getMethod();
        //得到token 由token_ptId组成
        String token = request.getParameter("access-token");
        //验证token
        Token model = tokenService.getToken(token);
        if (tokenService.checkToken(model)) {
            //如果token验证成功，将token对应的ptid存在request中，便于以后使用
            request.setAttribute(Constants.CURRENT_TERM_ID, model.getPtId());
            return true;
        }
        //如果验证token失败，并且方法注明了Authorization，返回401未授权
        if (method.getAnnotation(Authorization.class) != null) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return false;
        }
        return true;
    }
}
