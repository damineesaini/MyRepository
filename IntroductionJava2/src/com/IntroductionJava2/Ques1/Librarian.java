package com.IntroductionJava2.Ques1;

public class Librarian extends Book{
    protected void viewBookDetails(){
        System.out.println("\nTitle : "+this.title);
        System.out.println("ISBN No.: "+this.ISBNNO);
    }

}
