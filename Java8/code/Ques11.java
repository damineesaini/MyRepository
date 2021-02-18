package com.Java8;

import java.util.Arrays;
import java.util.List;

public class Ques11 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum=numbers.stream()
                .map(number-> number * number)
                .reduce(0,(num1,num2)->num1+num2);

        System.out.println("Average of numbers after doubling them is: "+sum/ numbers.size());
    }
}
