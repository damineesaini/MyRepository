package com.IntroductionJava1;

public class ques2demo {
    public static void main(String[] args) {
        String string = "Whoever too is happy will make others happy too happy too.";
        String[] words_arr = string.split("\\W");
        int count;
        for(int i=0; i<words_arr.length-1;i++)
        {   count =1;
            for(int j=i+1; j<words_arr.length;j++)
            {
                if(words_arr[i].equals(words_arr[j]) && !(words_arr[i].equals("")))
                {
                    count++;
                    words_arr[j]="";
                }

            }
            if(count>1)
            {
                System.out.println(words_arr[i]+" : "+count);
                words_arr[i]="";
            }
        }

    }
}
