package com.zking.mapper;

import com.zking.model.SysUser;
import com.zking.service.ISysUserMapper;
import com.zking.util.BaseTestBean;
import org.junit.After;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


public class SysUserMapperTest extends BaseTestBean {


    @Autowired
    private ISysUserMapper iSysUserMapper;
    SysUser sysUser = new SysUser();

    @Test
    public void userlogin() {


            SysUser admin = iSysUserMapper.userlogin("admin");
            System.out.println(admin);


    }
}