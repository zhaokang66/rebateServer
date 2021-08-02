package com.zhaokang.rebateServer.controller;

import com.zhaokang.rebateServer.pojo.ContractCustomerRebate;
import com.zhaokang.rebateServer.pojo.CustomRebate;
import com.zhaokang.rebateServer.pojo.SupermarketRebate;
import com.zhaokang.rebateServer.service.RebateManagerService;
import com.zhaokang.rebateServer.util.ReturnData;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@ContextConfiguration("classpath:applicationContext.xml")
@Controller
@RequestMapping("/rebateManager")
@RunWith(SpringJUnit4ClassRunner.class)
public class RebateManagerController {

  @Autowired RebateManagerService rebateManagerService;

  @ResponseBody
  @RequestMapping("addContractCustomerRebate")
  public ReturnData contractCustomerRebate(@RequestBody ContractCustomerRebate data) {
    rebateManagerService.addContractCustomerRebate(data);
    return ReturnData.success();
  }

  @ResponseBody
  @RequestMapping("getContractCustomerRebate")
  public ReturnData getContractCustomerRebate() {
    List<ContractCustomerRebate> res = rebateManagerService.getContractCustomerRebate();
    return ReturnData.success(res);
  }

  @ResponseBody
  @RequestMapping("deleteContractCustomerRebate")
  public ReturnData deleteContractCustomerRebate(@RequestBody List<ContractCustomerRebate> data) {
    rebateManagerService.deleteContractCustomerRebate(data);
    return ReturnData.success();
  }

  @ResponseBody
  @RequestMapping("addCustomRebate")
  public ReturnData addCustomRebate(@RequestBody CustomRebate data) {
    rebateManagerService.addCustomRebate(data);
    return ReturnData.success();
  }

  @ResponseBody
  @RequestMapping("getCustomRebate")
  public ReturnData getCustomRebate() {
    System.out.println("1");
    List<CustomRebate> res = rebateManagerService.getCustomRebate();
    return ReturnData.success(res);
  }

  @ResponseBody
  @RequestMapping("deleteCustomRebate")
  public ReturnData deleteCustomRebate(@RequestBody List<CustomRebate> data) {
    rebateManagerService.deleteCustomRebate(data);
    return ReturnData.success();
  }

  @ResponseBody
  @RequestMapping("addSupermarketRebate")
  public ReturnData addSupermarketRebate(@RequestBody SupermarketRebate data) {
    rebateManagerService.addSupermarketRebate(data);
    return ReturnData.success();
  }

  @ResponseBody
  @RequestMapping("getSupermarketRebate")
  public ReturnData getSupermarketRebate() {
    System.out.println("1");
    List<SupermarketRebate> res = rebateManagerService.getSupermarketRebate();
    return ReturnData.success(res);
  }

  @ResponseBody
  @RequestMapping("deleteSupermarketRebate")
  public ReturnData deleteSupermarketRebate(@RequestBody List<SupermarketRebate> data) {
    rebateManagerService.deleteSupermarketRebate(data);
    return ReturnData.success();
  }
}
