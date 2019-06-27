package com.example.shiro.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface SysPermissionMapper {
    List<String> selectPermissionByUserId(@Param("userId") long userId);
}
