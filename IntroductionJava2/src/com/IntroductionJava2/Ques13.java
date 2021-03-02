package com.IntroductionJava2;

class CustomExceptionClass extends Exception{
    private boolean suppressStacktrace = false;
    public CustomExceptionClass(String s,boolean suppressStacktrace){
      super(s,null,suppressStacktrace, !suppressStacktrace);
      this.suppressStacktrace = suppressStacktrace;
    }
    public String toString() {
        if (suppressStacktrace) {
            return getLocalizedMessage();
        } else {
            return super.toString();
        }
    }
}

public class Ques13 {
    public static void main(String[] args) throws CustomExceptionClass{
        try {
            throw new CustomExceptionClass("Caught an exception without stack trace", true);
        } catch (CustomExceptionClass e) {
            e.printStackTrace();
        }
    }
}
