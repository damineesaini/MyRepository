package com.multithreading;

class ThreadExample extends Thread{

    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println("\t"+i);
        }
    }
}

public class Ques1b {
    public static void main(String[] args){

        ThreadExample thread1 = new ThreadExample();

        System.out.println("\tImplementing threads using Thread class: \n");

        System.out.println("\tStarting thread 1");
        thread1.start();

    }
}