package com.myd.web.tokens.serviceImpl;

import com.myd.config.Constants;
import com.myd.core.feature.cache.redis.RedisCache;
import com.myd.web.tokens.model.TerminalToken;
import com.myd.web.tokens.service.TerminalTokenService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * Created by zhugp on 2017/5/15.
 */
@Service
public class TerminalTokenServiceImpl implements TerminalTokenService {

    @Resource
    private RedisCache redis;

    @Override
    public TerminalToken createToken(String ptId) {
        ptId = "ptId-" + ptId;
        //使用uuid作为源token
        String token = UUID.randomUUID().toString().replace("-", "");
        TerminalToken model = new TerminalToken(ptId, token);
        //存储到redis并设置过期时间
        redis.cache(ptId,token, Constants.TOKEN_EXPIRES_HOUR);
        return model;
    }

    @Override
    public TerminalToken getToken(String authentication) {
        if (authentication == null || authentication.length() == 0) {
            return null;
        }
        String[] param = authentication.split("_");
        if (param.length != 2) {
            return null;
        }
        String ptId = param[0];
        String token = param[1];
        return new TerminalToken(ptId, token);
    }

    @Override
    public boolean checkToken(TerminalToken terminalToken) {
        if (terminalToken == null) {
            return false;
        }
        String token = redis.get(terminalToken.getPtId());
        if (token == null || !token.equals(terminalToken.getToken())) {
            return false;
        }
        redis.cache(terminalToken.getPtId(), token, Constants.TOKEN_EXPIRES_HOUR);
        return true;
    }

    @Override
    public void deleteToken(String ptId) {
        redis.deleteToken(ptId);
    }


}
