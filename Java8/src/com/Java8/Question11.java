package com.Java8;

import java.util.Arrays;
import java.util.List;

public class Question11 {
    public static void main(String[] args){
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

            double average = numberList.stream()
                    .mapToInt(number-> number * number)
                    .average()
                    .getAsDouble();


        System.out.println("Average of numbers after doubling them is: "+average);
    }
}
