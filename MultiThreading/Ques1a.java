package com.multithreading;

class Runner implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("\t"+i);
        }
    }
}


public class Ques1a {
    public static void main(String[] args){

        Thread thread1 = new Thread(new Runner());

        System.out.println("\tImplementing threads using Runnable interface: \n");

        System.out.println("\tStarting thread 1");
        thread1.start();

    }
}
