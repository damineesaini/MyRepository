package com.IntroductionJava2.Ques10;

public class Cashier extends Order{
    private int token;
    Barista baristaObj = new Barista();
    public void createOrder(String orderdetails) // creates a new order
    {
        token = addOrder(orderdetails); // add it into the order queue and gets a token in return
    }

    public int makePayment(float amount){//takes payment from the customer and returns the token to customer
            setPaymentStatus(true); // sets payment status as success
        return token;
    }
    public void setPaymentStatus(boolean paymentStatus){}//to set payment status

    public boolean getPaymentStatus(){ return paymentStatus;}//return payment status

    public  String notifyCust() //asks barista for order completed or not. till then notifies customer to wait
    {
        System.out.println("wait please..");
        return baristaObj.notifyOrder();
    }

}
