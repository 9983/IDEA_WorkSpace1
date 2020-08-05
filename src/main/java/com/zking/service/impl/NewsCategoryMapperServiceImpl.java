package com.zking.service.impl;

import com.zking.mapper.NewsCategoryMapper;
import com.zking.model.NewsCategory;
import com.zking.service.INewsCategoryMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewsCategoryMapperServiceImpl implements INewsCategoryMapperService {

    @Autowired
    private  NewsCategoryMapper ncms;

    @Override
    public int delNews_CateGory(Integer newsId) {
        return ncms.delNews_CateGory(newsId);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(NewsCategory record) {
        return 0;
    }

    @Override
    public int insertSelective(NewsCategory record) {
        return 0;
    }

    @Override
    public NewsCategory selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(NewsCategory record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(NewsCategory record) {
        return 0;
    }
}
