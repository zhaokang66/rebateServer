package com.zhaokang.rebateServer.service;

import com.zhaokang.rebateServer.pojo.ContractCustomerRebate;
import com.zhaokang.rebateServer.pojo.CustomRebate;
import com.zhaokang.rebateServer.pojo.SupermarketRebate;

import java.util.List;

public interface RebateManagerService {
  void addContractCustomerRebate(ContractCustomerRebate data);

  List<ContractCustomerRebate> getContractCustomerRebate();

  void deleteContractCustomerRebate(List<ContractCustomerRebate> data);

  void addCustomRebate(CustomRebate data);

  List<CustomRebate> getCustomRebate();

  void deleteCustomRebate(List<CustomRebate> data);

  List<SupermarketRebate> getSupermarketRebate();

  void addSupermarketRebate(SupermarketRebate data);

  void deleteSupermarketRebate(List<SupermarketRebate> data);
}
