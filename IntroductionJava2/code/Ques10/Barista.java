package com.IntroductionJava2;

public class Barista extends Order {

    public void getnextOrder() {
        //takes next order from the order queue
    }

    public void completed_order() {
        //puts the completed order in the completeorder queue
    }

    public String notify_order() {
        return "order completed"; // to notify about order completion
    }
}
