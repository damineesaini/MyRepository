package com.IntroductionJava2;

public class Librarian extends Book{
    protected void viewBook(){
        System.out.println("\nTitle : "+this.title);
        System.out.println("ISBN No.: "+this.ISBN_NO);
    }

}
