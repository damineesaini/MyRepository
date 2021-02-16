package com.IntroductionJava1;

import java.util.Arrays;

public class ques5demo {
    public static void main(String[] args) {
        int[] array1 = {34,65,12,13,45,67,88,97};
        int[] array2 = {1,43,56,90,32,45,13};

        Arrays.sort(array1);
        Arrays.sort(array2);

        for(int i=0;i<array1.length;i++)
        {
            for (int j=0;j<array2.length;j++)
            {
                if(array1[i]==array2[j] && array1[i]!=-1)
                {
                    System.out.println(array1[i]);
                    array2[j]=array1[i]=-1;
                }
            }

        }

    }
}
