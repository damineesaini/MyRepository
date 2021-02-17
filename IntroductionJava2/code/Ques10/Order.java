package com.IntroductionJava2;

public class Order {
    int orderid;
    String customer_name;
    String Cshier_name;
    String Coffe_type;
    float amount;
    boolean paymentStatus;

    public int addOrder(){ //adds a new order created by cashier into the next order queue

       return this.setToken(); //returns the token
    }

    public void deleteOrder(){ // to delete the order

    }

    protected int setToken(){ return orderid;} // sets the order id as token

}
