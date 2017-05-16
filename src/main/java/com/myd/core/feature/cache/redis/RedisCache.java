package com.myd.core.feature.cache.redis;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;

/**
 * RedisCache : redis 缓存 插件
 *
 */
@Component(value = "redisCache")
public class RedisCache {
    private int port = 6379;
    private String host = "127.0.0.1";
    private Jedis jedis = new Jedis(host, port);

    public String cache(String key, String value, int seconds) {
        String result = jedis.set(key, value);
        jedis.expire(key, seconds);
        return result;
    }

    public String get(String key) {
        return jedis.get(key);
    }

    public void deleteToken(String key){
        jedis.del(key);
    }

    public static void main(String args[]){
        RedisCache rc = new RedisCache();
        System.out.println(rc.get("b7850f9420ad4f198236ed4d62827519"));
    }
}
