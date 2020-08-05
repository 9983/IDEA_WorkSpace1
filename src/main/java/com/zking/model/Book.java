package com.zking.model;


import org.springframework.stereotype.Repository;

@Repository
public class Book {
    private Integer id;

    private String bookname;

    private Float price;

    private String booktype;

    public Book(Integer id, String bookname, Float price, String booktype) {
        this.id = id;
        this.bookname = bookname;
        this.price = price;
        this.booktype = booktype;
    }

    public Book() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getBooktype() {
        return booktype;
    }

    public void setBooktype(String booktype) {
        this.booktype = booktype;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", price=" + price +
                ", booktype='" + booktype + '\'' +
                '}';
    }
}