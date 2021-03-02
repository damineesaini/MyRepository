package com.IntroductionJava2.Ques1;

interface Fine {
    void fineDetails();
}

public class Student implements Fine {
    private String name;
    private int id;

    Student(String name,int id){
        this.name=name;
        this.id=id;
    }

    public void showStudentDetails(){
        System.out.println("\nID: "+this.id);
        System.out.println("Name: "+this.name);
    }

    @Override
    public void fineDetails() {
        System.out.println("No fine pending....");
    }
}
