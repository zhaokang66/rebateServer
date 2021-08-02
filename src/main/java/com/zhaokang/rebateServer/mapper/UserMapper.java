package com.zhaokang.rebateServer.mapper;

import com.zhaokang.rebateServer.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    void addUser(User data);
    List<User> selectUser();

    int selectphone(@Param("phone") String phone);
    int deletuser(@Param("id") int id);
}
