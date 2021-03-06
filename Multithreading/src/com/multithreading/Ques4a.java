package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecuteTasksClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Started executing new task in thread: "+Thread.currentThread().getName());
        try {
            System.out.println("Sleeping for 100 milliseconds");
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class Ques4a {
    public static void main(String[] args){

        System.out.println("\tInside the main thread\n");

        Thread thread1 = new Thread(new ExecuteTasksClass());
        thread1.start();

        System.out.println("\tCreating Executor Service\n");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        System.out.println("\tSubmitting the tasks thread 1 execution...");
        executorService.submit(thread1);

        System.out.println("\tShut down using shutdown()\n");
        executorService.shutdown();

    }
}
