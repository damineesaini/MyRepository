package com.Java8;
// First number is greater than second number or not             Parameter (int ,int ) Return boolean
//(2) Increment the number by 1 and return incremented value    Parameter (int) Return int
//(3) Concatenation of 2 string                                  Parameter (String , String ) Return (String)
//(4) Convert a string to uppercase and return .                                Parameter (String) Return (String)

import java.util.Locale;

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
        GreaterThan obj = (int num1,int num2) -> num1>num2;

        boolean ans = obj.isGreater(number1,number2);
        System.out.println(number1+" > "+number2+ " = " +ans);

        IncrementBy1 obj_incr = (int num)-> num+1;
        System.out.println("Increment of "+number1+" = "+obj_incr.increment(number1));

        Concatenate obj_concat = (String str1, String str2)-> str1+str2;
        System.out.println("Concatenate of 2 strings - \""+string1+"\" and \""+string2+"\"= "+obj_concat.concatenation(string1,string2));

        UpperCase obj_up = (String str)-> str.toUpperCase();
        System.out.println("Uppercase string \""+string1+"\" :"+ obj_up.toUpper(string1));
    }
}
