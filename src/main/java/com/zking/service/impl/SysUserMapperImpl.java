package com.zking.service.impl;

import com.zking.mapper.SysUserMapper;
import com.zking.model.SysUser;
import com.zking.service.ISysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SysUserMapperImpl implements ISysUserMapper {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUser userlogin(String username) {
        SysUser userlogin = sysUserMapper.userlogin(username);
        return userlogin;
    }

    @Override
    public Set<String> findrole(String username) {
        return sysUserMapper.findrole(username);
    }

    @Override
    public Set<String> findpermission(String username) {
        return sysUserMapper.findpermission(username);
    }
}
