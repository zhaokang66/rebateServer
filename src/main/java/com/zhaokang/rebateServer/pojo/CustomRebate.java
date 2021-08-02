package com.zhaokang.rebateServer.pojo;

import lombok.Data;

@Data
public class CustomRebate {
  private int id;
  private String symbol;
  private String productionName;
  private double supplyPrice;
  private double saleAmount;
  private String promotions;
  private String remark;
}
