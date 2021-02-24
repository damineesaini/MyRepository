package com.multithreading;

public class Question10 {
    private  int count=0;

    public synchronized void increment(){
        count++;
    }

    public static void main(String[] args){
        Question10 obj = new Question10();
        obj.doWork();
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

        System.out.println(count);
    }
}
