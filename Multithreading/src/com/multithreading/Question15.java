package com.multithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Question15 {

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public synchronized void waitMethod(){
        System.out.println(Thread.currentThread().getName() + " running... \n");
        lock.lock();
        System.out.println("Start waiting for the other threads to start and complete its work");
        try {
            condition.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
        System.out.println("\nResumed "+Thread.currentThread().getName());
    }

    public void doWork(){

        Thread thread1 = new Thread(this::waitMethod);

        Thread thread2 = new Thread(this::waitMethod);

        Thread thread3 = new Thread(() ->{
                System.out.println(Thread.currentThread().getName() + " running... \n");
                try{
                    Thread.sleep(50);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                lock.lock();
                System.out.println("Signal one thread that thread 2 has finished its work");
                condition.signal();
                lock.unlock();
        });

        Thread thread4 = new Thread(() ->{
                System.out.println(Thread.currentThread().getName() + " running... \n");
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                lock.lock();
                System.out.println("Signal all the threads that thread 3 has finished its work");
                condition.signalAll();
                lock.unlock();
        });


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        Question15 obj = new Question15();
        obj.doWork();
        System.out.println("\nEnd of Program");
    }
}
