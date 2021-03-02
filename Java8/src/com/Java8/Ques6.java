package com.Java8;

interface MessageInterface {
    default void defaultMessageInterface(){
        System.out.println("This is a default method of interface MessageInterface");
    }

    static void staticMessageInterface(){
        System.out.println("This is a static method of interface MessageInterface");
    }
}
public class Ques6 implements MessageInterface {
    public static void main(String[] args){
        Ques6 obj = new Ques6();
        obj.defaultMessageInterface();
        MessageInterface.staticMessageInterface();
    }
}
