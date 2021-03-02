package com.Java8;

interface FunctionalInterfaceToReturnInt{
    int returnInt(int num1,int num2);
}

public class Ques3 {
    public int add(int num1,int num2){
        return num1+num2;
    }

    public int subtract(int num1,int num2){
        return num1-num2;
    }

    public static int multiplication(int num1,int num2){
        return num1*num2;
    }

    public static void main(String[] args){
        int number1 = 10;
        int number2 = 7;

        Ques3 methodRef = new Ques3();
        FunctionalInterfaceToReturnInt reference = methodRef::add;
        System.out.println("Calling instance add method; result we get : "+reference.returnInt(number1,number2));

        reference = methodRef::subtract;
        System.out.println("Calling instance subtract method; result we get : "+reference.returnInt(number1,number2));

        reference = Ques3::multiplication;
        System.out.println("Calling static multiplication method; result we get : "+reference.returnInt(number1,number2));

    }
}
