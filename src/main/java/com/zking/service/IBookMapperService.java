package com.zking.service;

import com.zking.model.Book;
import com.zking.util.PageBean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface IBookMapperService {

    int deleteByPrimaryKey(Integer id);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);


    @Transactional
    List<Book> SelectAll(Book book ,PageBean PageBean);

    List<Book> LikeSekectbyName(Book Book);

    int Add(Book book);

    List<Book> SelectByBetween(List<Integer> list);



}
