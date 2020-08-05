package com.zking.model;


import org.springframework.stereotype.Repository;

@Repository
public class NewsCategory {
    private Integer roleid;

    private Integer perid;

    public NewsCategory(Integer roleid, Integer perid) {
        this.roleid = roleid;
        this.perid = perid;
    }

    public NewsCategory() {
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