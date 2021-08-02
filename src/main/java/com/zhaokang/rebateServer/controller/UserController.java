package com.zhaokang.rebateServer.controller;

import com.zhaokang.rebateServer.pojo.User;
import com.zhaokang.rebateServer.service.UserService;
import com.zhaokang.rebateServer.util.Encryption;
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
// 存储操作员
@ContextConfiguration("classpath:applicationContext.xml")
@Controller
@RequestMapping("/user")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserController {
  @Autowired UserService userService;

  @ResponseBody
  @RequestMapping("addUser")
  public ReturnData addUser(@RequestBody User data) {
    //        System.out.println(data);
    data.setPassword(Encryption.MD5(data.getPassword()));
    userService.addUser(data);
    return ReturnData.success();
  }
  //    查询操作员
  @ResponseBody
  @RequestMapping("selectUser")
  public ReturnData selectUser() {
    List<User> res = userService.selectUser();
    return ReturnData.success(res);
  }
  //    验证手机号是否已注册
  @ResponseBody
  @RequestMapping("selectphone")
  public ReturnData selectphone(@RequestBody User data) {
    int res = userService.selectphone(data.getPhone());
    return ReturnData.success(res);
  }
  //    删除操作员
  @ResponseBody
  @RequestMapping("deletuser")
  public ReturnData deletuser(@RequestBody User data) {
    System.out.println(data);

    userService.deletuser(data.getId());
    return ReturnData.success();
  }
}
