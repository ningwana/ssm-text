package com.nw.service.impl;

import com.nw.dao.AppointmentDao;
import com.nw.dao.BookDao;
import com.nw.entity.Appointment;
import com.nw.enums.AppointStateEnum;
import com.nw.exception.AppointException;
import com.nw.exception.NoNumberException;
import com.nw.exception.RepeatAppointException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.nw.dto.AppointExecution;
import com.nw.entity.Book;
import com.nw.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookServiceImpl.class);

    // 注入Service依赖
    @Autowired
    private BookDao bookDao;

    @Autowired
    private AppointmentDao appointmentDao;

    @Override
    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    @Override
    public List<Book> getList() {
        return bookDao.queryAll(0, 1000);
    }

    @Override
    @Transactional
    public AppointExecution appoint(long bookId, long studentId) {
        try {
            // 开始减库存
            int update = bookDao.reduceNumber(bookId);
            if (update <= 0) {// 库存不足
                throw new NoNumberException("no number");
            } else {
                // 执行预约操作
                int insert = appointmentDao.insertAppointment(bookId, studentId);
                System.out.println("**********************："+insert);
                if (insert <= 0) { //重复预约
                    throw new RepeatAppointException("repeat appoint");
                } else { // 预约成功
                    Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
                    return new AppointExecution(bookId, AppointStateEnum.SUCCESS, appointment);
                }
            }
        // 要先于catch Exception异常前先catch住再抛出，不然自定义的异常也会被转换为AppointException，导致控制层无法具体识别是哪个异常
        } catch (NoNumberException | RepeatAppointException e1) {
            throw e1;
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
            throw new AppointException("appoint inner error：" + e.getMessage());
        }
    }
}
