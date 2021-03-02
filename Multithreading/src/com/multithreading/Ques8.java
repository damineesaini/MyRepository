package com.multithreading;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduleTaskClass implements Runnable{

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

public class Ques8 {
    public static void main(String[] args){
        ScheduledExecutorService scheduleService = Executors.newSingleThreadScheduledExecutor();
        LocalDateTime currentTime = LocalDateTime.now();

        Future futureObject1 = scheduleService.schedule(new ScheduleTaskClass(),Duration.between(currentTime,currentTime.plusSeconds(2)).toMillis(),TimeUnit.MILLISECONDS);

        Future futureObject2 = scheduleService.scheduleAtFixedRate(new ScheduleTaskClass(),2,1,TimeUnit.MILLISECONDS);

        Future futureObject3 = scheduleService.scheduleWithFixedDelay(new ScheduleTaskClass(),1,1,TimeUnit.MILLISECONDS);

        scheduleService.shutdown();
        try {
            scheduleService.awaitTermination(100000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Is 1st task done : "+futureObject1.isDone());
        System.out.println("Is 2nd task done : "+futureObject2.isDone());
        System.out.println("Is 3rd task done : "+futureObject3.isDone());
    }
}
