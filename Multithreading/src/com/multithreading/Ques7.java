package com.multithreading;

import java.util.concurrent.*;

class WaitCompletion implements Runnable{
    @Override
    public void run() {
        System.out.println("Currently running thread: "+Thread.currentThread().getName());
            try{
                Thread.sleep(50);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
    }
}
public class Ques7 {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future obj1 = ((ExecutorService) executorService).submit(new WaitCompletion());
        Future obj2 = executorService.submit(new WaitCompletion());
        executorService.shutdown();
        System.out.println("Is 1st task done : "+obj1.isDone());
        System.out.println("Is 2nd task done : "+obj2.isDone());
        System.out.println("\tWaiting for termination......");
        try {
            executorService.awaitTermination(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Is 1st task done : "+obj1.isDone());
        System.out.println("Is 2nd task done : "+obj2.isDone());
    }
}
