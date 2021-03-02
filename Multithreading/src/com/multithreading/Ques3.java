package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutorExample implements Runnable{
    @Override
    public void run() {
        System.out.println("Started executing new task in thread: "+Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class Ques3 {
    public static void main(String[] args){

        System.out.println("Inside the main thread");

        System.out.println("Creating Executor Service");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Thread thread1 = new Thread(new ExecutorExample());
        thread1.start();

        System.out.println("Submitting the tasks for execution...");
        executorService.submit(thread1);

    }
}
