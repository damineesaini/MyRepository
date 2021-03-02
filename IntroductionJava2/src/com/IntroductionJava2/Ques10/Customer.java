package com.IntroductionJava2.Ques10;

public class Customer {
    private int token;
    private int amount;
    Cashier cashierObj;

    public void placeOrder( String orderdetails){ //places coffee order
        Cashier cashierObj = new Cashier();
       token = cashierObj.makePayment(amount); //do the payment n gets a token in return
    }
     public void getNotification()
     {
         cashierObj.notifyCust();//waits for the cashier to notify
     }

}
