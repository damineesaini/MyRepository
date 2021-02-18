package com.Java8;

interface Message2{
    default void printMessage(){
        System.out.println("This is a default method of interface Message2");
    }
}

interface DefaultMethod2{
    default void defaultMessage(){
        System.out.println("This is a default method of interface DefaultMethod2");
    }
}

public class Ques8 implements Message2,DefaultMethod2{
    public static void main(String[] args){
        Message2 obj = new Ques8();
        obj.printMessage();

        DefaultMethod2 obj_dm = new Ques8();
        obj_dm.defaultMessage();
    }
}
