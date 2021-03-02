package com.multithreading;

public class Question11 {
    private  int count=0;

    public void increment(){

        synchronized(this){
            count++;
        }
    }

    public void doWork(){

        Thread thread1 = new Thread(() -> {
            for(int i=0;i<10000;i++){
                increment();
            }
        });

        Thread thread2 = new Thread(() ->{
            for(int i=0;i<10000;i++){
                increment();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("count is: " + count);
    }

    public static void main(String[] args){
        Question11 object = new Question11();
        object.doWork();
    }
}
