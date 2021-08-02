package com.zhaokang.rebateServer.mapper;

import com.zhaokang.rebateServer.pojo.ContractCustomerRebate;

import java.util.List;

public interface ContractCustomerRebateMapper {
  void addContractCustomerRebate(ContractCustomerRebate data);

  List<ContractCustomerRebate> getContractCustomerRebate();

  void deleteContractCustomerRebate(List<ContractCustomerRebate> data);
}
