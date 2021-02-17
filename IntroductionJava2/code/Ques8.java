package com.IntroductionJava2;

import java.util.Scanner;
public class Ques8 {

    static void using_while(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = keyboard.next();
        while(!word.equals("done"))
        {
            if(word.charAt(0) == word.charAt(word.length() - 1))
            {
                System.out.println("First and last character are equals for the word: " + word);
            }
            else
            {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = keyboard.next();
        }
    }

    static void using_doWhile(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = keyboard.next();
        do
        {
            if(word.charAt(0) == word.charAt(word.length() - 1))
            {
                System.out.println("First and last character are equals for the word: " + word);
            }
            else
            {
                System.out.println("First and last character are NOT equals for the word: " + word);
            }
            word = keyboard.next();
        }while(!word.equals("done"));
    }

    public static void main(String[] args){
        System.out.println("Using while loop: ");
        Ques8.using_while();

        System.out.println("Using do-while loop: ");
        Ques8.using_doWhile();

    }

}
