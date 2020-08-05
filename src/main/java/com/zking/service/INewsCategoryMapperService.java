package com.zking.service;

import com.zking.model.NewsCategory;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface INewsCategoryMapperService {

    @Transactional
    int delNews_CateGory(Integer newsId);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsCategory record);

    int insertSelective(NewsCategory record);

    NewsCategory selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(NewsCategory record);

    int updateByPrimaryKey(NewsCategory record);
}