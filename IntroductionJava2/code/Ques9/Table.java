package com.IntroductionJava2;

public class Table extends Furniture{

        int stressScore;
        int fireScore;
        public void stressTest(){
            System.out.println("Stress Test score is "+this.stressScore);
        }

        public void fireTest() {
            System.out.println("Stress Test score is "+this.fireScore);
        }

        public void setDetails(String type,float cost,int stressScore,int fireScore){
            super.setDetails(type,cost);
            this.fireScore=fireScore;
            this.stressScore=stressScore;
        }

        public void display(){
            System.out.println("\nDetails of table: ");
            System.out.println("Type: "+this.type);
            System.out.println("Cost: "+this.cost);
            this.stressTest();
            this.fireTest();
        }
}
