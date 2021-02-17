package com.IntroductionJava2;

public class Ques2 {

    public static char[] sortString(char[] ch_array){
        int size = ch_array.length;

        for (int i = 1; i < size; i++) {
            char key = ch_array[i];
            int j = i - 1;

            while (j >= 0 && key < ch_array[j]) {
                ch_array[j + 1] = ch_array[j];
                --j;
            }
            ch_array[j + 1] = key;
        }
        return ch_array;
    }

    public static void main(String[] args){
        String input="ghtefhdgyhddsay";
        char[] unsorted = input.toCharArray();
        String sorted = String.valueOf(sortString(unsorted));
        System.out.println("\n Unsorted string is : \""+input+"\"");
        System.out.println("\n Sorted string is : \""+ sorted+"\"");
    }
}
