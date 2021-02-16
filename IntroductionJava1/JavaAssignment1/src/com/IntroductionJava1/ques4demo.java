package com.IntroductionJava1;

public class ques4demo {
    public static void main(String[] args) {
        String string="Life is what Happens 1 when You're bu$y making Other plans.";
        int uppercase=0, lowercase=0, number=0, special_char=0;

        for (int i=0; i<string.length();i++)
        {
            char character = string.charAt(i);

            if(character >= 'A' && character <= 'Z')
                uppercase++;
            else if(character >= 'a' && character <= 'z')
                lowercase++;
            else if(character >= '0' && character <= '9')
                number++;
            else
                special_char++;
        }

        System.out.println("String is :\""+ string+"\"\n");
        System.out.println("Uppercase :"+uppercase+ "  Percentage : "+(uppercase * 100/string.length())+"%");
        System.out.println("Lowercase :"+lowercase+ "  Percentage : "+(lowercase * 100/string.length())+"%");
        System.out.println("Numbers :"+number+ "  Percentage : "+(number * 100/string.length())+"%");
        System.out.println("Special Character :"+special_char+ "  Percentage : "+(special_char * 100/string.length())+"%");
    }
}
