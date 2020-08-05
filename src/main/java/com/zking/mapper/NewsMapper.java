package com.zking.mapper;

import com.zking.model.News;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface NewsMapper {

    News SelectNewsAndCateGory (News news);

    int delNews (Integer newsId);

    int deleteByPrimaryKey(Integer newsId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    int add (News News);
}