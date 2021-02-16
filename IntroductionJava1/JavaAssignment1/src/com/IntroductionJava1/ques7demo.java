package com.IntroductionJava1;

import java.util.Scanner;

public class ques7demo {
    static Scanner scan = new Scanner(System.in);

    // static variables
    static String FirstName;
    static String LastName;
    static int age;

    //static block
    static
    {
        System.out.println("Enter first name:");
        FirstName=scan.nextLine();
        System.out.println("Enter last name:");
        LastName=scan.nextLine();
        System.out.println("Enter age:");
        age = scan.nextInt();
    }

    static void display()
    {
        System.out.println("\nDetails entered by you are : ");
        System.out.println("First Name : " + FirstName);
        System.out.println("Last Name : " + LastName);
        System.out.println("Age : " + age);
    }

    public static void main(String[] args) {
        display();
    }
}
