package com.IntroductionJava2;

public abstract class Furniture {
    String type;
    float cost;
    protected abstract void stressTest();
    protected abstract void fireTest();
    protected void setDetails(String type,float cost){
        this.type=type;
        this.cost=cost;
    }
}
