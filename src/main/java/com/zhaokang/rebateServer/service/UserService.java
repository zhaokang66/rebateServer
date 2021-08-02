package com.zhaokang.rebateServer.service;

import com.zhaokang.rebateServer.pojo.User;

import java.util.List;

public interface UserService {
    void addUser(User data);

    List<User> selectUser();

    int selectphone(String phone);

    void deletuser(int id);
}
