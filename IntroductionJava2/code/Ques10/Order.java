package com.IntroductionJava2;

public class Order {
    private int orderid;
    private String customer_name;
    private String Cshier_name;
    private String Coffe_type;
    float amount;
    boolean paymentStatus;

    public int addOrder(){ //adds a new order created by cashier into the next order queue

       return this.setToken(); //returns the token
    }

    public void deleteOrder(){ // to delete the order

    }

    protected int setToken(){ return orderid;} // sets the order id as token

}
