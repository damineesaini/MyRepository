package com.IntroductionJava1;

public class ques3demo {
    public static void main(String[] args) {
        String string = "Tell me and I forget. Teach me and I remember. Involve me and I learn.";
        int occurance = string.length() - string.replaceAll("e","").length();
        System.out.println("occurances of \"e\" in \""+string+"\" are: "+occurance);
    }
}
