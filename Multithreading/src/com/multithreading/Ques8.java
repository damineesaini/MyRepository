package com.multithreading;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class ScheduleTask implements Runnable{

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

        Future obj1 = scheduleService.schedule(new ScheduleTask(),Duration.between(currentTime,currentTime.plusSeconds(2)).toMillis(),TimeUnit.MILLISECONDS);

        Future obj2 = scheduleService.scheduleAtFixedRate(new ScheduleTask(),2,1,TimeUnit.MILLISECONDS);

        Future obj3 = scheduleService.scheduleWithFixedDelay(new ScheduleTask(),1,1,TimeUnit.MILLISECONDS);

        scheduleService.shutdown();
        try {
            scheduleService.awaitTermination(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Is 1st task done : "+obj1.isDone());
        System.out.println("Is 2nd task done : "+obj2.isDone());
        System.out.println("Is 3rd task done : "+obj2.isDone());
    }
}
