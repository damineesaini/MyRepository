package com.multithreading;

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

class Atomic{
    private final AtomicInteger count = new AtomicInteger(0);

    public int incrementAndGet() {
        return count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }
}

public class Question12 {
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Atomic atomicObj = new Atomic();

        for(int i = 0; i < 1000; i++) {
            executorService.submit(atomicObj::incrementAndGet);
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count is : " + atomicObj.getCount());
    }
}
