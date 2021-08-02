package com.zhaokang.rebateServer.filter;

import com.zhaokang.rebateServer.util.JedisUtils;
import com.zhaokang.rebateServer.util.JwtUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class VerifySignFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {}

  /**
   * 对所有的前端请求进行身份验证,依据为token，由后端生成
   *
   * @param request
   * @param response
   * @param chain
   * @throws IOException
   * @throws ServletException
   */
  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    chain.doFilter(request, response);
//    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
//    HttpServletResponse httpServletResponse = (HttpServletResponse) response;
//    String url = httpServletRequest.getServletPath();
//    String token = httpServletRequest.getHeader("Authorization");
//    System.out.println("my token is =" + token);
//    // 如果请求的是登录登出路径则直接放行
//    if ("/user/login".equalsIgnoreCase(url)
//        || "/user/logout".equalsIgnoreCase(url)
//        || "/index.jsp".equalsIgnoreCase(url)
//        || "/user/getDbList".equalsIgnoreCase(url)
//        || "/user/confirmLogin".equalsIgnoreCase(url)) {
//      chain.doFilter(httpServletRequest, httpServletResponse);
//      return;
//    }
//
//    if (token != null && !"".equalsIgnoreCase(token)) {
//      long userId = JwtUtil.verify(token);
//      if (userId != 0L) { // 判断当前登录用户是否是自己，若不是，则重新登录//所谓的单点登录
//        System.out.println("本次请求用户的id：" + userId);
//        String LoginToken = JedisUtils.getToken(Long.toString(userId));
//        if (token.equalsIgnoreCase(LoginToken)) {
//          JedisUtils.setExpire(Long.toString(userId));
//          chain.doFilter(httpServletRequest, httpServletResponse);
//          return;
//        } else {
//          System.out.println("1");
//          ((HttpServletResponse) response).setStatus(205);
//        }
//        chain.doFilter(httpServletRequest, httpServletResponse);
//      } else {
//        System.out.println("2");
//        ((HttpServletResponse) response).setStatus(205);
//      }
//
//    } else {
//      System.out.println("3");
//      ((HttpServletResponse) response).setStatus(205);
//    }
  }

  @Override
  public void destroy() {}
}
