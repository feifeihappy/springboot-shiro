package com.example.shiro.service;

import com.example.shiro.dao.UserMapper;
import com.example.shiro.entity.User;
import com.github.pagehelper.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public Page<User> getUsers() {
        return userMapper.getUsers();
    }

    public User selectById(long id){
        return userMapper.selectByPrimaryKey(id);
    }
}
