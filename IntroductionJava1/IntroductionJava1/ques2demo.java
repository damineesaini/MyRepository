package com.IntroductionJava1;

public class ques2demo {
    public static void main(String[] args) {
        String string = "Whoever too is happy will make others happy too happy too.";
        String[] wordsArr = string.split("\\W");
        int count;
        for(int i=0; i<wordsArr.length-1;i++)
        {   count =1;
            for(int j=i+1; j<wordsArr.length;j++)
            {
                if(wordsArr[i].equals(wordsArr[j]) && !(wordsArr[i].equals("")))
                {
                    count++;
                    wordsArr[j]="";
                }

            }
            if(count>1)
            {
                System.out.println(wordsArr[i]+" : "+count);
                wordsArr[i]="";
            }
        }

    }
}
