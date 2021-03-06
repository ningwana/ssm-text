package com.nw.dao;

import com.nw.BaseTest;
import com.nw.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class BookDaoTest extends BaseTest {

    @Autowired
    private BookDao bookDao;

    @Test
    public void queryById() {
        long bookId = 1000;
        Book book = bookDao.queryById(bookId);
        System.out.println(book);
    }

    @Test
    public void queryAll() {
        List<Book> bookList = bookDao.queryAll(0, 4);
        for (Book book : bookList) {
            System.out.println(book);
        }
    }

    @Test
    public void reduceNumber() {
        long bookId = 1000;
        int update = bookDao.reduceNumber(bookId);
        System.out.println("update：" + update);
    }
}