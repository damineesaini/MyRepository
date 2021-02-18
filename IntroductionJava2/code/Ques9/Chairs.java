package com.IntroductionJava2;

public class Chairs extends Furniture {
    private int stressScore;
    private int fireScore;
    private int count;
    protected void stressTest(){
        System.out.println("Stress Test score is"+this.stressScore);
    }

    protected void fireTest() {
        System.out.println("Stress Test score is"+this.fireScore);
    }

    public void setDetails(String type,float cost,int stressScore,int fireScore,int count){
        super.setDetails(type,cost);
        this.fireScore=fireScore;
        this.stressScore=stressScore;
        this.count=count;
    }

    public void display(){
        System.out.println("\nDetails of chair: ");
        System.out.println("Type: "+this.type);
        System.out.println("Cost: "+this.cost);
        System.out.println("No. of chairs: "+this.count);
        this.stressTest();
        this.fireTest();
    }
}
