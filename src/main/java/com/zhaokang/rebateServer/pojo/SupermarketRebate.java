package com.zhaokang.rebateServer.pojo;

import lombok.Data;

@Data
public class SupermarketRebate {
  private int id;
  private String symbol;
  private String productSeries;
  private String monthlyReward;
  private String annualAward;
  private String remark;
}
