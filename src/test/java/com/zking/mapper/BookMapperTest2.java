package com.zking.mapper;

import com.zking.model.Book;
import com.zking.service.IBookMapperService;
import com.zking.util.PageBean;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class BookMapperTest2 {



    @Autowired
    private IBookMapperService BookMapperService;
    private PageBean pageBean;
    private Book b;


    @Before
    public void setUp() throws Exception {

        b = new Book();
        pageBean = new PageBean();

    }

    @Test
    public void selectAll() {

        pageBean.setPage(1);
        pageBean.setRows(3);

        List<Book> books = BookMapperService.SelectAll(b,pageBean);

        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println(pageBean);

    }


    @Test
    public void Pager_Test01(){

        pageBean.setRows(10);

        List<Book> books = BookMapperService.SelectAll(b,pageBean);

        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println(pageBean);


    }




}