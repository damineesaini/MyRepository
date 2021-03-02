package com.Java8;

interface DefaultMethodInterface{
   default void printMessage(){
        System.out.println("This is a default method of interface DefaultMethod");
    }
}

public class Ques7 implements DefaultMethodInterface{
    @Override
    public void printMessage(){
        System.out.println("We have overridden the default method of interface DefaultMethod");
    }

    public static void main(String[] args){
        DefaultMethodInterface reference = new Ques7();
        reference.printMessage();
    }
}
