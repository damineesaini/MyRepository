package com.IntroductionJava2;

public abstract class Furniture {
    protected String type;
    protected float cost;
    protected abstract void stressTest();
    protected abstract void fireTest();
    protected void setDetails(String typeOf,float costing){
        this.type=typeOf;
        this.cost=costing;
    }
}
