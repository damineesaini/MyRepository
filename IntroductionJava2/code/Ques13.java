package com.IntroductionJava2;

class MyException extends Exception{
    public MyException(String s,Throwable cause,boolean enableSuppression, boolean writableStackTrace){
        super(s,cause,enableSuppression,writableStackTrace);
    }
}

public class Ques13 {

    public static int divideByZero(){
        return 18/0;
    }

    public static void main(String[] args) throws MyException{
        try{
            int result = Ques13.divideByZero();
            System.out.println(result);
        } catch (ArithmeticException e) {
            throw new MyException("caught an exception", e,true,false);
        }
    }
}
