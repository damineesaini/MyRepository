package com.multithreading;

public class Question13 {

    public void doWork(){
        Thread thread1 = new Thread(() -> {
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

        Thread thread2 = new Thread(() ->{
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

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Question13 object = new Question13();
        object.doWork();
        System.out.println("\nEnd of Program");
    }
}
