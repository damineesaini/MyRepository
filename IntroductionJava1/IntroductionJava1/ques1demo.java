package com.IntroductionJava1;

public class ques1demo {

    public static void main(String[] args) {
        String main_string = "Hi this is a string. We will modify it later.";
        String change_substr = "will modify it later";
        String changed_with = "have modified it";

        System.out.println("Original string is: \""+main_string + "\"");
        System.out.println("Substring string to replace: \""+change_substr + "\"");
        System.out.println("Substring string to replace with: \""+ changed_with + "\"");

        main_string = main_string.replaceAll(change_substr,changed_with);

        System.out.println("Modified string is: \""+main_string + "\"");
    }
}

