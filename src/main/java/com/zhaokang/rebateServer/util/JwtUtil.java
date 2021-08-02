package com.zhaokang.rebateServer.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.apache.commons.lang.time.DateUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class JwtUtil {

  // 私钥
  private static final String TOKEN_SECRET = "hygy";
  /**
   * 生成签名，有效期为24小时
   *
   * @param userId
   * @return token
   */
  public static String genToken(long userId) {
    try {
      // 设置过期时间
      Date date = DateUtils.addSeconds(new Date(), 24 * 60 * 60);
      // 设置私钥加密算法
      Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);

      // 设置头部信息
      Map<String, Object> header = new HashMap<>(2);
      header.put("Type", "JWT");
      header.put("alg", "HS256");
      // 返回token字符串
      return JWT.create()
          .withHeader(header)
          .withIssuedAt(new Date())
          .withClaim("userId", userId)
          .withExpiresAt(date)
          .sign(algorithm);
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
  /**
   * 检验token是否正确
   *
   * @param token
   * @return
   */
  public static Long verify(String token) {
    try {
      Algorithm algorithm = Algorithm.HMAC256(TOKEN_SECRET);
      JWTVerifier verifier = JWT.require(algorithm).build();
      DecodedJWT jwt = verifier.verify(token);
      Long userId = jwt.getClaim("userId").asLong();
      return userId;
    } catch (Exception e) {
      return 0L;
    }
  }
}
