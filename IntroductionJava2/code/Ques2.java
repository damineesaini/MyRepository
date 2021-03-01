package com.IntroductionJava2;

public class Ques2 {

    public static char[] sortString(char[] chArray){
        int size = chArray.length;

        for (int i = 1; i < size; i++) {
            char key = chArray[i];
            int j = i - 1;

            while (j >= 0 && key < chArray[j]) {
                chArray[j + 1] = chArray[j];
                --j;
            }
            chArray[j + 1] = key;
        }
        return chArray;
    }

    public static void main(String[] args){
        String input="ghtefhdgyhddsay";
        char[] unsorted = input.toCharArray();
        String sorted = String.valueOf(sortString(unsorted));
        System.out.println("\n Unsorted string is : \""+input+"\"");
        System.out.println("\n Sorted string is : \""+ sorted+"\"");
    }
}
