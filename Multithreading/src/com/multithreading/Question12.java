package com.multithreading;

import java.util.concurrent.*;
import java.util.concurrent.atomic.*;

class AtomicClass{
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
        AtomicClass atomicClassObject = new AtomicClass();

        for(int i = 0; i < 1000; i++) {
            executorService.submit(atomicClassObject::incrementAndGet);
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(60, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Count is : " +atomicClassObject.getCount());
    }
}
