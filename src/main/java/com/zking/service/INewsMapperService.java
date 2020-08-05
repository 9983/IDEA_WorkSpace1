package com.zking.service;

import com.zking.model.News;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

@Transactional
public interface INewsMapperService {

    @Transactional
    int delNews(Integer newsId);

    @Transactional
    News SelectNewsAndCateGory (News news);

    int deleteByPrimaryKey(Integer newsId);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(Integer newsId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    int Add (News News);


}