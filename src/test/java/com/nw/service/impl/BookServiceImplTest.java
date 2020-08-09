package com.nw.service.impl;

import com.nw.BaseTest;
import com.nw.dto.AppointExecution;
import com.nw.exception.AppointException;
import com.nw.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class BookServiceImplTest extends BaseTest {

    @Autowired
    private BookService bookService;

    @Test
    public void appoint() {
        long bookId = 1001;
        long studentId = 12345678910L;
        AppointExecution appointException = bookService.appoint(bookId, studentId);
        System.out.println(appointException);
    }
}