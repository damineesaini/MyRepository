package com.IntroductionJava1;


public class ques10demo {
    //Adding 2 integer number
    static int add(int num1,int num2)
    {
        return  num1+num2;
    }
    //Adding 2 double
    static double add(double num1, double num2)
    {
        return num1+num2;
    }

    // multiplying 2 float
    static float multiply(float num1, float num2)
    {
        return num1*num2;
    }
    // multiplying 2 int
    static int multiply(int num1, int num2)
    {
        return num1*num2;
    }

    // concate 2 string
    static String concat(String str1, String str2)
    {
        return str1+str2;
    }
    // Concate 3 String
    static String concat(String str1, String str2, String str3)
    {
        return str1+str2+str3;
    }

    public static void main(String[] args) {

        System.out.println("Adding 2 integers: 67 + 78 = "+ques10demo.add(67,78));
        System.out.println("Adding 2 doubles: 689.987 + 7877.9876 = "+ques10demo.add(689.987,7877.9876));

        System.out.println("Multiplying 2 floats: 67.9 * 78.7 = "+ques10demo.multiply(67.9f,78.7f));
        System.out.println("Multiplying 2 integers: 67 * 78 = "+ques10demo.multiply(67,78));

        System.out.println("Concatenate 2 strings: 'Daminee' , 'Saini' = "+ques10demo.concat("Daminee"," Saini"));
        System.out.println("Concatenate 3 strings: 'hello' , 'daminee' , 'saini' = "+ques10demo.concat("hello"," daminee"," saini"));
    }
}
