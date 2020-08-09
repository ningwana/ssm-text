package com.nw.dao;

import com.nw.BaseTest;
import com.nw.entity.Appointment;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class AppointmentDaoTest extends BaseTest {

    @Autowired
    private AppointmentDao appointmentDao;

    @Test
    public void insertAppointment() {
        long bookId = 1000;
        long studentId = 2016117241;
        int insert = appointmentDao.insertAppointment(bookId, studentId);
        System.out.println("insert=" + insert);
    }

    @Test
    public void queryByKeyWithBook() {
        long bookId = 1000;
        long studentId = 2016117241;
        Appointment appointment = appointmentDao.queryByKeyWithBook(bookId, studentId);
        System.out.println(appointment);
        System.out.println(appointment.getBook());
    }
}