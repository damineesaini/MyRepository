package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class ExecuteTaskClass implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Currently running thread: "+Thread.currentThread().getName());
        }
    }
}

public class Ques9 {
    public static void main(String[] args){
        ExecutorService cachedExecutorService = Executors.newCachedThreadPool();
        ExecutorService fixedExecutorService = Executors.newFixedThreadPool(1);

        ThreadPoolExecutor pool1 = (ThreadPoolExecutor) cachedExecutorService;
        ThreadPoolExecutor pool2 = (ThreadPoolExecutor) fixedExecutorService;

        cachedExecutorService.submit(new ExecuteTaskClass());
        cachedExecutorService.submit(new ExecuteTaskClass());

        System.out.println("Executor Size: "+pool1.getPoolSize());

        fixedExecutorService.submit(new ExecuteTaskClass());
        fixedExecutorService.submit(new ExecuteTaskClass());

        System.out.println("Executor Size: "+pool2.getPoolSize());

        cachedExecutorService.shutdown();
        fixedExecutorService.shutdown();

    }
}
