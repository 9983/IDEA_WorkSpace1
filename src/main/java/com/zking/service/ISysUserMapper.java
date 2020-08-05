package com.zking.service;

import com.zking.model.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Transactional
public interface ISysUserMapper {
    /*int deleteByPrimaryKey(Integer userid);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);


*/

    @Transactional(readOnly = true)
    SysUser  userlogin(String username);

    /**
     * 查询角色
     * @param username
     * @return
     */
    @Transactional(readOnly = true)
    Set<String> findrole(String username);


    /**
     * 查询权限
     * @param username
     * @return
     */
    @Transactional(readOnly = true)
    Set<String> findpermission(  String username);


}