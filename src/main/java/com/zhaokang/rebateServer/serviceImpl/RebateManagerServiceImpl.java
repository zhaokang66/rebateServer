package com.zhaokang.rebateServer.serviceImpl;

import com.zhaokang.rebateServer.mapper.ContractCustomerRebateMapper;
import com.zhaokang.rebateServer.mapper.CustomRebateMapper;
import com.zhaokang.rebateServer.mapper.SupermarketRebateMapper;
import com.zhaokang.rebateServer.pojo.ContractCustomerRebate;
import com.zhaokang.rebateServer.pojo.CustomRebate;
import com.zhaokang.rebateServer.pojo.SupermarketRebate;
import com.zhaokang.rebateServer.service.RebateManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RebateManagerServiceImpl implements RebateManagerService {
  @Autowired ContractCustomerRebateMapper contractCustomerRebateMapper;
  @Autowired CustomRebateMapper customRebateMapper;
  @Autowired SupermarketRebateMapper supermarketRebateMapper;

  @Override
  public void addContractCustomerRebate(ContractCustomerRebate data) {
    contractCustomerRebateMapper.addContractCustomerRebate(data);
  }

  @Override
  public List<ContractCustomerRebate> getContractCustomerRebate() {
    return contractCustomerRebateMapper.getContractCustomerRebate();
  }

  @Override
  public void deleteContractCustomerRebate(List<ContractCustomerRebate> data) {
    contractCustomerRebateMapper.deleteContractCustomerRebate(data);
  }

  @Override
  public void addCustomRebate(CustomRebate data) {
    customRebateMapper.addCustomRebate(data);
  }

  @Override
  public List<CustomRebate> getCustomRebate() {
    System.out.println("2");
    return customRebateMapper.getCustomRebate();
  }

  @Override
  public void deleteCustomRebate(List<CustomRebate> data) {
    customRebateMapper.deleteCustomRebate(data);
  }

  @Override
  public List<SupermarketRebate> getSupermarketRebate() {
    return supermarketRebateMapper.getSupermarketRebate();
  }

  @Override
  public void addSupermarketRebate(SupermarketRebate data) {
    supermarketRebateMapper.addSupermarketRebate(data);
  }

  @Override
  public void deleteSupermarketRebate(List<SupermarketRebate> data) {
    supermarketRebateMapper.deleteSupermarketRebate(data);
  }
}
