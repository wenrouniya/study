package com.study.redis;

import  redis.clients.jedis.Jedis;
public class testJedis {
    public static void main(String[] args) {
        Jedis jedis =new Jedis("42.93.238.44",6379);
        System.out.println(jedis.ping());
    }
}
