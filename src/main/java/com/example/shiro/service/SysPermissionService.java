package com.example.shiro.service;

import com.example.shiro.dao.SysPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SysPermissionService {
    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    public List<String> selectPermissionByUserId(long userId) {
        return sysPermissionMapper.selectPermissionByUserId(userId);
    }
}
