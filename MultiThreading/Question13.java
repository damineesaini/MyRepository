package com.multithreading;

public class Question13 {

    public void doWork(){
        Thread t1 = new Thread(() -> {
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + " running... \n");
                System.out.println("Start waiting for the other to start and complete its work");
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("\nResumed "+Thread.currentThread().getName());
            }
        });

        Thread t2 = new Thread(() ->{
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + " running... \n");
                System.out.println("Sleeping for 100 milliseconds");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                notify();
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
    }

    public static void main(String[] args){
        Question13 obj = new Question13();
        obj.doWork();
        System.out.println("\nEnd of Program");
    }
}
