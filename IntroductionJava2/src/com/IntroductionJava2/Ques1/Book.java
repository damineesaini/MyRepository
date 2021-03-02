package com.IntroductionJava2.Ques1;

public abstract class Book {
    protected String title;
    protected String ISBNNO;

    protected void addBookDetails(String title,String ISBNNO){
        this.title=title;
        this.ISBNNO=ISBNNO;
    }

    protected abstract void viewBookDetails();

}
