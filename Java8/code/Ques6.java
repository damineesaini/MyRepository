package com.Java8;

interface Message{
    default void defaultMessage(){
        System.out.println("This is a default method of interface Message");
    }

    static void staticMessage(){
        System.out.println("This is a static method of interface Message");
    }
}
public class Ques6 implements Message{
    public static void main(String[] args){
        Ques6 obj = new Ques6();
        obj.defaultMessage();
        Message.staticMessage();
    }
}
