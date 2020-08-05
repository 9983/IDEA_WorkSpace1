package com.zking.service.impl;

import com.github.pagehelper.PageHelper;
import com.zking.mapper.BookMapper;
import com.zking.model.Book;
import com.zking.service.IBookMapperService;
import com.zking.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookMapperServiceImpl implements IBookMapperService {


    @Autowired
    private BookMapper bm;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Book record) {
        return 0;
    }

    @Override
    public int insertSelective(Book record) {
        return 0;
    }

    @Override
    public Book selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return 0;
    }

    @Override
    public List SelectAll(Book book, PageBean pageBean) {

        PageHelper.startPage(pageBean.getPage(),pageBean.getRows());

        return bm.SelectAll(book);
    }

    @Override
    public List<Book> LikeSekectbyName(Book book) {return null;}

    @Override
    public int Add(Book book) {
        return 0;
    }

    @Override
    public List<Book> SelectByBetween(List<Integer> list) {
        return null;
    }
}
