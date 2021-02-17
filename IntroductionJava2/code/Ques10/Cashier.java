package com.IntroductionJava2;

public class Cashier extends Order{
    int token;

    public void createOrder(String orderdetails) // creates a new order
    {
        token = Order.addOrder(orderdetails); // add it into the order queue and gets a token in return
    }

    public int makePayment(float amount){//takes payment from the customer and returns the token to customer

        setPaymentStatus(boolean); // sets payment status as success
        return token;
    }
    public void setPaymentStatus(boolean){}//to set payment status

    public boolean getpaymentStatus(){ return paymentStatus;}//return payment status

    public String notify_cust() //asks barista for order completed or not. till then notifies customer to wait
    {
        System.out.println("wait please..");
        return Barista.notify_order();
    }

}
