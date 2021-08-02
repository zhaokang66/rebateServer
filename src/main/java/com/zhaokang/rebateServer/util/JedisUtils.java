package com.zhaokang.rebateServer.util;

import redis.clients.jedis.Jedis;

public class JedisUtils {
  private static Jedis jedis;
  private static String tokenName = "hygy_";
  private static int second = 60 * 60 * 2; // 过期时间，默认为2小时

  private static void init() {
    jedis = new Jedis("localhost");
  }

  /**
   * @param id
   * @param token
   */
  public static void setToken(String id, String token) {
    JedisUtils.init();
    jedis.set(String.valueOf(tokenName + id), token); // 根据id存储token
    jedis.expire(String.valueOf(tokenName + id), second); // 设置token持续时间
  }

  /**
   * @param id
   * @return
   */
  public static String getToken(String id) {
    JedisUtils.init();
    String token = jedis.get(String.valueOf(tokenName + id)); // 获取token
    return token;
  }

  public static void delToken(String id) {
    JedisUtils.init();
    jedis.del(tokenName + id);
  }
  /** @param id */
  public static void setExpire(String id) {
    JedisUtils.init();
    jedis.expire(String.valueOf(tokenName + id), second);
  }

  public static void setResource(String dataResource) {
    JedisUtils.init();
    jedis.set("hygyDataResource", dataResource);
  }

  public static String getResource() {
    JedisUtils.init();
    String resource = jedis.get("hygyDataResource");
    return resource;
  }

  public static void delResource() {
    JedisUtils.init();
    jedis.del("hygyDataResource");
  }
}
