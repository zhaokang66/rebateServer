package com.zhaokang.rebateServer.util;

public class Page {

  private int start;
  private int count;
  private int last;
  private int total;

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public int getStart() {
    return start;
  }

  public void setStart(int start) {
    this.start = start;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public int getLast() {
    return last;
  }

  public void setLast(int last) {
    this.last = last;
  }

  public void caculateLast(int total) {
    // 假设总数是50，是能够被5整除的，那么最后一页的开始就是45
    if (0 == total % count) last = total - count;
    // 假设总数是51，不能够被5整除的，那么最后一页的开始就是50
    else last = total - total % count;
  }

  @Override
  public String toString() {
    return "Page [start="
        + start
        + ", count="
        + count
        + ", last="
        + last
        + ", total="
        + total
        + "]";
  }
}
