package com.myd.web.service.impl;

import com.myd.config.Constants;
import com.myd.core.feature.cache.redis.RedisCache;
import com.myd.web.model.Token;
import com.myd.web.service.TokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by zhugp on 2017/3/28.
 */
@Service
public class TokenServiceImpl implements TokenService{

    @Resource
    private RedisCache redis;

    public Token createToken(String Id) {
        //使用uuid作为源token
        String token = UUID.randomUUID().toString().replace("-", "");
        Token model = new Token(Id, token);
        //存储到redis并设置过期时间
        redis.cache(Id,token, Constants.TOKEN_EXPIRES_HOUR);
        return model;
    }

    public Token getToken(String authentication) {
        if (authentication == null || authentication.length() == 0) {
            return null;
        }
        String[] param = authentication.split("_");
        if (param.length != 2) {
            return null;
        }
        //使用userId和源token简单拼接成的token，可以增加加密措施
        String ptId = param[0];
        String token = param[1];
        return new Token(ptId, token);
    }

    public boolean checkToken(Token model) {
        if (model == null) {
            return false;
        }
        String token = redis.get(model.getPtId());
        if (token == null || !token.equals(model.getToken())) {
            return false;
        }
        //如果验证成功，说明此用户进行了一次有效操作，延长token的过期时间
        redis.cache(model.getPtId(), token, Constants.TOKEN_EXPIRES_HOUR);
        return true;
    }

    @Override
    public void deleteToken(String ptId) {
        redis.deleteToken(ptId);
    }
}
