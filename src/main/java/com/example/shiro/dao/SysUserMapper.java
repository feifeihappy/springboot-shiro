package com.example.shiro.dao;

import com.example.shiro.entity.SysUser;


public interface SysUserMapper {
    SysUser findByUserName(String userName);
}
