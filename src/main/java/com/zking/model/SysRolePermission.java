package com.zking.model;


import org.springframework.stereotype.Repository;

@Repository
public class SysRolePermission {
    private Integer roleid;

    private Integer perid;

    public SysRolePermission(Integer roleid, Integer perid) {
        this.roleid = roleid;
        this.perid = perid;
    }

    public SysRolePermission() {
        super();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getPerid() {
        return perid;
    }

    public void setPerid(Integer perid) {
        this.perid = perid;
    }
}