package com.Java8;

interface FunctionalInterface{
    int returnInt(int num1,int num2);
}

public class Ques2 {
    public static void main(String[] args){
        int number1=78;
        int number2=67;

        FunctionalInterface obj = (int num1,int num2)->num1;
        System.out.println("return we get out of "+number1+" and "+number2+" is "+obj.returnInt(number1,number2));
    }
}
