package com.IntroductionJava2;

public abstract class Book {
    protected String title;
    protected String ISBN_NO;

    protected void addBook(String title,String ISBN_NO){
        this.title=title;
        this.ISBN_NO=ISBN_NO;
    }

    protected abstract void viewBook();

}
