package com.example.shiro.service;

import com.example.shiro.dao.SysUserMapper;
import com.example.shiro.entity.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SysUserService {
    @Autowired
    private SysUserMapper userMapper;

    public SysUser findByUserName(String userName) {
        SysUser byUserName = userMapper.findByUserName(userName);
        return byUserName;
    }
}
