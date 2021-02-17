package com.IntroductionJava2;

public class Customer {
    int token;
    public void placeOrder( String orderdetails){ //places coffee order
       token = Cashier.makePayment(amount); //do the payment n gets a token in return
    }
     public void getNotification()
     {
         Cashier.notify_cust(s);//waits for the cashier to notify
     }

}
