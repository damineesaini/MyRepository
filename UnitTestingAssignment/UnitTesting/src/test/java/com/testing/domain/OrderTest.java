package com.testing.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {

    @Test
    void getQuantity() {
        //given
        Order orderObj = new Order();
        orderObj.setQuantity(85);
        //when
        int quantity = orderObj.getQuantity();
        //then
        assertEquals(quantity,85);
    }

    @Test
    void setQuantity() {
        //given
        Order orderObj = new Order();
        //when
        Order returnObject = orderObj.setQuantity(4);
        //then
        assertEquals(returnObject,orderObj);
    }

    @Test
    void getItemName() {
        //given
        Order orderObj = new Order();
        orderObj.setItemName("Books");
        //when
        String name = orderObj.getItemName();
        //then
        assertEquals(name,"Books");
    }

    @Test
    void setItemName() {
        //given
        Order orderObj = new Order();
        //when
        Order returnObject = orderObj.setItemName("books");
        //then
        assertEquals(returnObject,orderObj);
    }

    @Test
    void getPrice() {
        //given
        Order orderObj = new Order();
        orderObj.setPrice(45.8);
        //when
        double price = orderObj.getPrice();
        //then
        assertEquals(price,45.8);

    }

    @Test
    void setPrice() {
        //given
        Order orderObj = new Order();
        //when
        Order returnObject = orderObj.setPrice(45.5);
        //then
        assertEquals(returnObject,orderObj);
    }

    @Test
    void getPriceWithTex() {
        //given
        Order orderObj = new Order();
        orderObj.setPriceWithTex(85.5);
        //when
        double priceWithTex = orderObj.getPriceWithTex();
        //then
        assertEquals(priceWithTex,85.5);

    }

    @Test
    void setPriceWithTex() {
        //given
        Order orderObj = new Order();
        //when
        Order returnObject = orderObj.setPriceWithTex(56.7);
        //then
        assertEquals(returnObject,orderObj);
    }
}

