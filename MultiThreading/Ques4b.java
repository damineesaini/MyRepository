package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutingTasks implements Runnable{
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

public class Ques4b {

    public static void main(String[] args){

        System.out.println("\tCreating Executor Service\n");
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        Thread thread3 = new Thread(new ExecutingTasks());
        Thread thread4 = new Thread(new ExecutingTasks());
        thread3.start();

        System.out.println("\n\tSubmitting the tasks thread 3 for execution...");
        executorService2.submit(thread3);

        System.out.println("\tShut down using shutdownNow()");
        executorService2.shutdownNow();

        System.out.println("\n\tAgain submitting the tasks thread 4 for execution...");
        thread4.start();
        executorService2.submit(thread4);
    }
}
