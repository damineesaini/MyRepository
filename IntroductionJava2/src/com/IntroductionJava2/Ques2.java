package com.IntroductionJava2;

import java.util.Scanner;

public class Ques2 {

    public static char[] sortStringAlphabeticalOrder(String unsorted){
        char[] characterArray = unsorted.toCharArray();
        int size = characterArray.length;

        for (int i = 1; i < size; i++) {
            char key = characterArray[i];
            int j = i - 1;

            while (j >= 0 && key < characterArray[j]) {
                characterArray[j + 1] = characterArray[j];
                --j;
            }
            characterArray[j + 1] = key;
        }
        return characterArray;
    }

    public static void main(String[] args){
        String input="ghtefhdgyhddsay";
        
        if(!(input.equals(""))){
            String sorted = String.valueOf(sortStringAlphabeticalOrder(input));
            System.out.println("\n Unsorted string is : \""+input+"\"");
            System.out.println("\n Sorted string is : \""+ sorted+"\"");
        }
        else
            System.out.println("Invalid input!!!");

    }
}
