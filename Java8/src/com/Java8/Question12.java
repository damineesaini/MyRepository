package com.Java8;

import java.util.Arrays;
import java.util.List;

public class Question12 {

    public static Integer returnFirstEven(List<Integer> numberList){
        return numberList.stream()
                .filter(number -> number%2==0)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args){
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("First even number in the list is: "+returnFirstEven(numberList));
    }
}
