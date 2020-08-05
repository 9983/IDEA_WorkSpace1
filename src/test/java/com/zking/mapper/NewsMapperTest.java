package com.zking.mapper;

import com.zking.model.News;
import com.zking.service.INewsCategoryMapperService;
import com.zking.service.INewsMapperService;
import com.zking.util.BaseTestBean;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;


public class NewsMapperTest extends BaseTestBean {

    @Autowired
    private INewsMapperService nms;
    private News n;

    @Autowired
    private INewsCategoryMapperService ncms;



    @Before
    public void before()  throws Exception  {

        n = new News();

        super.setUp();
    }

    @Test
    public void delNews() {

        int i = ncms.delNews_CateGory(2);
        int i1 = nms.delNews(2);
        System.out.println(i);
        System.out.println("---------------------------");
        System.out.println(i1);

    }

    @Test
    public void Select(){

        n.setNewsId(3);

        News news = nms.SelectNewsAndCateGory(n);

        System.out.println(news);

        System.out.println("---------------------------------------------");

        news = nms.SelectNewsAndCateGory(n);

        System.out.println(news);

    }


    /*二级缓存*/

    @Autowired
    private RedisTemplate redisTemplate;

    @Test
    public void createKey(){

        redisTemplate.opsForValue().set("a","zs");

    }


}