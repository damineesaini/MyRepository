package com.Java8;

import java.util.Arrays;
import java.util.List;

public class Question10 {
    public static void main(String[] args){
        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int sum=numberList.stream()
                .filter(number-> number>5)
                .reduce(0, Integer::sum);

        System.out.println("Sum of numbers > 5 is: "+sum);
    }
}
