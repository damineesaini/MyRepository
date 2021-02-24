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
        ExecutorService cached_es = Executors.newCachedThreadPool();
        ExecutorService fixed_es = Executors.newFixedThreadPool(1);

        ThreadPoolExecutor pool1 = (ThreadPoolExecutor) cached_es;
        ThreadPoolExecutor pool2 = (ThreadPoolExecutor) fixed_es;

        cached_es.submit(new ScheduleTask());
        cached_es.submit(new ScheduleTask());

        System.out.println("Executor Size: "+pool1.getPoolSize());

        fixed_es.submit(new ScheduleTask());

        System.out.println("Executor Size: "+pool2.getPoolSize());

        cached_es.shutdown();
        fixed_es.shutdown();

    }
}
