package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ExecutingTasksClass implements Runnable{
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

        Thread thread3 = new Thread(new ExecutingTasksClass());

        thread3.start();

        System.out.println("\n\tSubmitting the tasks thread 3 for execution...");
        executorService2.submit(thread3);

        System.out.println("\tShut down using shutdownNow() ... will show sleep interrupted exception as wil forcefully try to exit");
        executorService2.shutdownNow();

    }
}
