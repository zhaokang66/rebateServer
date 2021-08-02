package com.zhaokang.rebateServer.mapper;

import com.zhaokang.rebateServer.pojo.SupermarketRebate;

import java.util.List;

public interface SupermarketRebateMapper {
  List<SupermarketRebate> getSupermarketRebate();

  void addSupermarketRebate(SupermarketRebate data);

  void deleteSupermarketRebate(List<SupermarketRebate> data);
}
