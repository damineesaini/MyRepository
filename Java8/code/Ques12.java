package com.Java8;

import java.util.Arrays;
import java.util.List;

public class Ques12 {

    public static Integer firstEven(List<Integer> numbers){
        return numbers.stream()
                .filter(number -> number%2==0)
                .findFirst()
                .orElse(null);
    }

    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("First even number in the list is: "+firstEven(numbers));
    }
}
