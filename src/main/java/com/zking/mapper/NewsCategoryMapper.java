package com.zking.mapper;

import com.zking.model.NewsCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsCategoryMapper {
    int insert(NewsCategory record);

    int insertSelective(NewsCategory record);

    int delNews_CateGory(int newsId);
}