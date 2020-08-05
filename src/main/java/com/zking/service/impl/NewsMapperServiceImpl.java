package com.zking.service.impl;

import com.zking.mapper.NewsMapper;
import com.zking.model.News;
import com.zking.service.INewsMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class NewsMapperServiceImpl implements INewsMapperService {

    @Autowired
    private NewsMapper nms;


    @Override
    public int delNews(Integer newsId) {
        return nms.delNews(newsId);
    }

    @Cacheable(value = "load",key = "'id='+#news.getNewsId()",condition = "#news.getNewsId()>5")//先进入缓存查找没有则进入数据库查找并重建新的缓存
//    @CachePut(value = "loadput")   每次都会进入数据库并重建新的缓存
    @Override
    public News SelectNewsAndCateGory(News news) {
        return nms.SelectNewsAndCateGory(news);
    }

    @Override
    public int deleteByPrimaryKey(Integer newsId) {
        return 0;
    }

    @Override
    public int insert(News record) {
        return 0;
    }

    @Override
    public int insertSelective(News record) {
        return 0;
    }

    @Override
    public News selectByPrimaryKey(Integer newsId) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(News record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(News record) {
        return 0;
    }

    @Override
    public int Add(News News) {
        return nms.add(News);
    }
}
