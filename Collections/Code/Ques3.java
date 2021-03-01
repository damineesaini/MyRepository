package com.Collections;

import java.util.*;

public class Ques3 {
    //method that takes a string and print the number of occurrence of each character characters in the string.
    public static void countChar(String str) {
        char[] chArray = str.toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        //in HasMap key is the character from the string and value will be the character's frequency
        for (char ch : chArray) {
            if (charMap.containsKey(ch)) // if character already exist in map , then increase its frequency by 1
                charMap.computeIfPresent(ch, (key, val) -> val + 1);
            else
                charMap.put(ch, 1); // else add the character as key and value will be 1 (frequency)
        }
        for (Map.Entry m : charMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some text:");
        String input = scan.nextLine();
        Ques3.countChar(input);
    }
}

