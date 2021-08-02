package com.zhaokang.rebateServer.util;

public class ReturnData {
  private Object data;
  private int code;
  private String msg;

  private ReturnData(Object data, int code, String msg) {
    this.data = data;
    this.code = code;
    this.msg = msg;
  }

  private ReturnData(Object data) {
    this.data = data;
    this.code = ReturnMsg.SUCCESS.getCode();
    this.msg = ReturnMsg.SUCCESS.getMsg();
  }

  private ReturnData(int code, String msg) {
    this.code = code;
    this.msg = msg;
  }

  private ReturnData() {
    this.code = ReturnMsg.ERROR.getCode();
    this.msg = ReturnMsg.ERROR.getMsg();
  }

  public static ReturnData success(Object data, int code, String msg) {
    return new ReturnData(data, code, msg);
  }

  public static ReturnData success(Object data) {
    return new ReturnData(data);
  }

  public static ReturnData success() {
    return new ReturnData("");
  }

  public static ReturnData error() {
    return new ReturnData();
  }

  public static ReturnData error(int code, String msg) {
    return new ReturnData(code, msg);
  }
  // getter setter
  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
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
