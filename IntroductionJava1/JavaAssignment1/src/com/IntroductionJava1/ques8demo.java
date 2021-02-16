package com.IntroductionJava1;

import java.util.Scanner;

public class ques8demo {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer();

        System.out.print("Enter a string: ");
        string.append(scan.nextLine());
        string.reverse();
        System.out.println("Reversed string is: \""+string.toString()+"\"");

        string.delete(4,9);
        System.out.println("string after removing character from index 4 to index 9 tis: \""+string.toString()+"\"");
    }
}
