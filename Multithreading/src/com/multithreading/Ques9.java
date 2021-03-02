package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

class ExecuteTask implements Runnable{

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
        ExecutorService cachedEs = Executors.newCachedThreadPool();
        ExecutorService fixedEs = Executors.newFixedThreadPool(1);

        ThreadPoolExecutor pool1 = (ThreadPoolExecutor) cachedEs;
        ThreadPoolExecutor pool2 = (ThreadPoolExecutor) fixedEs;

        cachedEs.submit(new ExecuteTask());
        cachedEs.submit(new ExecuteTask());

        System.out.println("Executor Size: "+pool1.getPoolSize());

        fixedEs.submit(new ExecuteTask());
        fixedEs.submit(new ExecuteTask());

        System.out.println("Executor Size: "+pool2.getPoolSize());

        cachedEs.shutdown();
        fixedEs.shutdown();

    }
}
