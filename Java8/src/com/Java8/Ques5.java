package com.Java8;

import java.util.function.*;

public class Ques5 {
    public static void main(String[] args){

        Consumer<Integer> consumer = (value)->System.out.println("I am a consumer, I take a value but do not return any value");
        consumer.accept(12);

        Supplier<Integer> supplier = ()-> 12;
        System.out.println("Implementing Supplier interface (so that it can supply us a value): " + supplier.get());

        Predicate<Integer> isEven = (value)->value%2==0;
        System.out.println("Implementing Predicate interface (to test if a number is even): " + isEven.test(12));

        Function<Integer,Integer> increment = (value)->value+1;
        System.out.println("Implementing Function interface (to increment a given number): " + increment.apply(12));
    }
}
