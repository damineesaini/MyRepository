package com.Java8;

interface GreaterThan{
    boolean isGreater(int num1, int num2);
}

interface IncrementBy1{
    int increment(int num);
}

interface Concatenate {
        String concatenation(String str1, String str2);
}

interface UpperCase{
    String toUpper(String str);
}

public class Ques1 {
    public static void main(String[] args){
        int number1 = 8;
        int number2 = 10;
        String string1 = "Daminee";
        String string2 = "Saini";
        GreaterThan greaterThanObject = (int num1,int num2) -> num1>num2;

        boolean ans = greaterThanObject.isGreater(number1,number2);
        System.out.println(number1+" > "+number2+ " = " +ans);

        IncrementBy1 IncrementBy1Object = (int num)-> num+1;
        System.out.println("Increment of "+number1+" = "+IncrementBy1Object.increment(number1));

        Concatenate concatenateObject = (String str1, String str2)-> str1+str2;
        System.out.println("Concatenate of 2 strings - \""+string1+"\" and \""+string2+"\"= "+concatenateObject.concatenation(string1,string2));

        UpperCase upperCaseObject = (String str)-> str.toUpperCase();
        System.out.println("Uppercase string \""+string1+"\" :"+ upperCaseObject.toUpper(string1));
    }
}
