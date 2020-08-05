package com.zking.mapper;

import com.zking.model.SysRolePermission;
import org.springframework.stereotype.Repository;

@Repository
public interface SysRolePermissionMapper {
    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);
}