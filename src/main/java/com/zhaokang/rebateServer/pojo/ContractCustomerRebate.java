package com.zhaokang.rebateServer.pojo;

import lombok.Data;

@Data
public class ContractCustomerRebate {
    private int id;
    private String  symbol;
    private String  productionType;
    private String  productionBatch;
    private String  seasonReturn;
    private String  monthReturn;
    private String  finishTaskAward;
    private String  fuzzyReward;
    private String  excessReward;
    private String  remark;
}
