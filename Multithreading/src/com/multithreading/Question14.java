package com.multithreading;

public class Question14 {

    public synchronized void waitMethod(){
        System.out.println(Thread.currentThread().getName() + " running... \n");
        System.out.println("Start waiting for the Thread2 to start and complete its work");
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nResumed "+Thread.currentThread().getName());
    }

    public void doWork(){
        Thread thread1 = new Thread(this::waitMethod);

        Thread thread2 = new Thread(this::waitMethod);

        Thread thread3 = new Thread(() ->{
            synchronized (this){
                System.out.println(Thread.currentThread().getName() + " running... \n");
                System.out.println("Sleeping for 100 milliseconds");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Notifying both the threads that thread 2 has finished its work");
                notifyAll();
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args){
        Question14 object = new Question14();
        object.doWork();
        System.out.println("\nEnd of Program");
    }
}
