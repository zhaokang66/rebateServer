package com.zhaokang.rebateServer.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SimpleCORSFilter implements Filter {

  @Override
  public void destroy() {}

  @Override
  public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
      throws IOException, ServletException {
    HttpServletRequest httpServletRequest = (HttpServletRequest) request;
    HttpServletResponse httpServletResponse = (HttpServletResponse) response;
    System.out.println("拦截请求: " + httpServletRequest.getServletPath());
    httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
    httpServletResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
    httpServletResponse.setHeader("Access-Control-Max-Age", "0");
    httpServletResponse.setHeader(
        "Access-Control-Allow-Headers",
        "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Authorization, Cache-Control, Expires, Content-Type, X-E4M-With,userId, Accept");
    httpServletResponse.setHeader("Access-Control-Allow-Credentials", "true");
    httpServletResponse.setHeader("XDomainRequestAllowed", "1");
    chain.doFilter(httpServletRequest, httpServletResponse);
  }

  @Override
  public void init(FilterConfig arg0) throws ServletException {}
}
