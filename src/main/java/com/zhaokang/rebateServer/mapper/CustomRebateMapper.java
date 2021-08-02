package com.zhaokang.rebateServer.mapper;

import com.zhaokang.rebateServer.pojo.CustomRebate;

import java.util.List;

public interface CustomRebateMapper {
  void addCustomRebate(CustomRebate data);

  List<CustomRebate> getCustomRebate();

  void deleteCustomRebate(List<CustomRebate> data);
}
