package com.multithreading;

public class Question11 {
    private  int count=0;

    public void increment(){

        synchronized(this){
            count++;
        }
    }

    public void doWork(){

        Thread t1 = new Thread(() -> {
            for(int i=0;i<10000;i++){
                increment();
            }
        });

        Thread t2 = new Thread(() ->{
            for(int i=0;i<10000;i++){
                increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("count is: " + count);
    }

    public static void main(String[] args){
        Question11 obj = new Question11();
        obj.doWork();
    }
}
