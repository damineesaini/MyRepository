package com.multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class FindSquare implements Callable<Double>{
    private final double number;
    FindSquare(double number){
        this.number=number;
        }
    public Double call() throws Exception {
            System.out.println("Calculating Square with "+Thread.currentThread().getName());
            Thread.sleep(2000);
            return number*number;
        }
}

public class Ques6 {
    public static void main(String[] args){
        ExecutorService executorservice = Executors.newSingleThreadExecutor();
        FindSquare findSquareObject = new FindSquare(20);
        Future<Double> futureObject = executorservice.submit(findSquareObject);
        try {
            System.out.println("Square of " + 20 + " : " + futureObject.get());
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("Is this squaring task done : "+futureObject.isDone());
        System.out.println("Is this squaring task cancelled : "+futureObject.isCancelled());
        executorservice.shutdown();

    }
}
