package com.testing.service;

import com.testing.domain.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class EmailServiceTest {

    @Test
    void getInstance() {
        //given
        EmailService emailServiceObj = EmailService.getInstance();
        EmailService emailServiceObj2 = EmailService.getInstance();
        //then
        assertEquals(emailServiceObj,emailServiceObj2);
    }

    @Test
    void sendEmail() {
        //given
        EmailService emailServiceObj =new EmailService();
        Order orderObj = new Order();
        Executable executable = () -> emailServiceObj.sendEmail(orderObj);
        //then
        assertThrows(RuntimeException.class, executable);
    }

    @Test
    void testSendEmail() {
        //given
        EmailService emailServiceObj = new EmailService();
        Order orderObj = new Order();
        String cc = "Hi";
        //when
        boolean result = emailServiceObj.sendEmail(orderObj,cc);
        //then
        assertTrue(result);
    }
}
