package com.myd.web.tokens.serviceImpl;

import com.myd.config.Constants;
import com.myd.core.feature.cache.redis.RedisCache;
import com.myd.web.tokens.model.UserToken;
import com.myd.web.tokens.service.UserTokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by zhugp on 2017/5/15.
 */
@Service
public class UserTokenServiceImpl implements UserTokenService {

    @Resource
    private RedisCache redis;

    @Override
    public UserToken createToken(String userId) {
        userId = "userId-" + userId;
        //使用uuid作为源token
        String token = UUID.randomUUID().toString().replace("-", "");
        UserToken model = new UserToken(userId, token);
        //存储到redis并设置过期时间
        redis.cache(userId,token, Constants.TOKEN_EXPIRES_HOUR);
        return model;
    }

    @Override
    public boolean checkToken(UserToken userToken) {
        if (userToken == null) {
            return false;
        }
        String token = redis.get(userToken.getUserId());
        if (token == null || !token.equals(userToken.getToken())) {
            return false;
        }
        redis.cache(userToken.getUserId(), token, Constants.TOKEN_EXPIRES_HOUR);
        return true;
    }

    @Override
    public UserToken getToken(String authentication) {
        if (authentication == null || authentication.length() == 0) {
            return null;
        }
        String[] param = authentication.split("_");
        if (param.length != 2) {
            return null;
        }
        String UserId = param[0];
        String token = param[1];
        return new UserToken(UserId, token);
    }

    @Override
    public void deleteToken(String userId) {
        redis.deleteToken(userId);

    }
}
