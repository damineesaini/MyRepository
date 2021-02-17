package com.IntroductionJava2;

class Class1 {
    Class1() {
        System.out.println("This is constructor of Class1");
    }
}

public class Ques3 {

    public static void main(String[] args)
    {
        Class1 obj = new Class1();

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
