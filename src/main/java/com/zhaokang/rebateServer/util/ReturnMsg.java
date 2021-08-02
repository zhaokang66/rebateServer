package com.zhaokang.rebateServer.util;

public enum ReturnMsg {
  SUCCESS(200, "操作成功"),
  EXCEPTION1(10001, "未知异常"),
  EXCEPTION2(10002, "操作失败"),
  EXCEPTION3(10003, "上传失败"),
  EXCEPTION4(10004, "账号或密码错误"),
  EXCEPTION5(10005, "自定义异常"),
  EXCEPTION6(10006, "当前用户已登录"),
  EXCEPTION7(10007, "当前用户已被禁用，请联系管理员进行解除"),
  ERROR(-1, "失败");

  private int code;
  private String msg;

  private ReturnMsg(int code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}
