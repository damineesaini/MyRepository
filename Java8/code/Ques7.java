package com.Java8;

interface DefaultMethod{
   default void printMessage(){
        System.out.println("This is a default method of interface DefaultMethod");
    }
}

public class Ques7 implements DefaultMethod{
    @Override
    public void printMessage(){
        System.out.println("We have overridden the default method of interface DefaultMethod");
    }

    public static void main(String[] args){
        DefaultMethod refer = new Ques7();
        refer.printMessage();
    }
}
