package com.zhaokang.rebateServer.serviceImpl;

import com.zhaokang.rebateServer.mapper.UserMapper;
import com.zhaokang.rebateServer.pojo.User;
import com.zhaokang.rebateServer.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class UserServiceImpl implements UserService {
        @Autowired
    UserMapper userMapper;
    @Override
    public void addUser(User data) {

        userMapper.addUser(data);
    }

    @Override
    public List<User> selectUser() {
        return userMapper.selectUser();
    }

    @Override
    public int selectphone(String phone) {
        return userMapper.selectphone(phone);
    }
    @Override
    public void deletuser(int id) {
         userMapper.deletuser(id);
    }
}
