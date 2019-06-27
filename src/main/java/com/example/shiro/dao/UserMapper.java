package com.example.shiro.dao;

import com.example.shiro.core.BaseMapper;
import com.example.shiro.entity.User;
import com.github.pagehelper.Page;


public interface UserMapper extends BaseMapper<User> {

    Page<User> getUsers();
}
