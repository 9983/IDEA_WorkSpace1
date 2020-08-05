package com.zking.mapper;

import com.zking.model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookMapper<list> {
    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> SelectAll(Book book);

    List<Book> LikeSekectbyName(Book Book);

    int Add(Book book);

    List<Book> SelectByBetween(List<Integer> list);






}