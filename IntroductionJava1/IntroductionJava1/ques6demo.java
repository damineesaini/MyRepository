package com.IntroductionJava1;

public class ques6demo {

    public static void main(String[] args) {

        int[] array={1,1,2,2,3,3,4,4,5,5,6,6,7,7,8};

        int result = -1;

        for (int i = 0; i < array.length-1; i += 2)
        {
            if (array[i] != array[i + 1])
            {
                result = array[i];
                break;
            }
        }

        //checking for last 2 elements in the array
            if(array[array.length-1] != array[array.length-2])
                result = array[array.length-1];

        System.out.println("The non-repeated element is "+ result);
    }
}

