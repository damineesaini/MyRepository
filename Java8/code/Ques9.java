package com.Java8;

import java.util.*;
import java.util.stream.Collectors;

public class Ques9 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);

        List<Integer> even_numbers=numbers.stream()
                .filter(number->number%2==0)
                .collect(Collectors.toList());

        even_numbers.forEach(System.out::println);
    }
}
