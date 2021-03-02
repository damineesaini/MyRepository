package com.Java8;

interface DefaultMethod1{
    default void printMessage(){
        System.out.println("This is a default method of interface DefaultMethod1");
    }
}

interface DefaultMethod2{
    default void defaultMessage(){
        System.out.println("This is a default method of interface DefaultMethod2");
    }
}

public class Ques8 implements DefaultMethod1,DefaultMethod2{
    public static void main(String[] args){
        DefaultMethod1 defaultMethod1Object = new Ques8();
        defaultMethod1Object.printMessage();

        DefaultMethod2 defaultMethod2Object = new Ques8();
        defaultMethod2Object.defaultMessage();
    }
}
