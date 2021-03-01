package com.IntroductionJava1;

public class ques1demo {

    public static void main(String[] args) {
        String mainString = "Hi this is a string. We will modify it later.";
        String changeSubstr = "will modify it later";
        String changedWith = "have modified it";

        System.out.println("Original string is: \""+mainString + "\"");
        System.out.println("Substring string to replace: \""+changeSubstr + "\"");
        System.out.println("Substring string to replace with: \""+ changedWith + "\"");

        mainString = main_string.replaceAll(changeSubstr,changedWith);

        System.out.println("Modified string is: \""+mainString + "\"");
    }
}

