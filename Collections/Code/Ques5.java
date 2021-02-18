package com.Collections;

import java.util.ArrayList;
import java.util.Comparator;

class Student implements Comparable<Student>{
    private final String name;
    private final double score;
    private final double age;

    Student(double age,double score,String name){
        this.age=age;
        this.score=score;
        this.name=name;
    }

    public double getScore(){
        return this.score;
    }

    public String geName(){
        return this.name;
    }

    public String toString(){
        return this.name + "\t\t" + this.age + "\t\t" + this.score;
    }

    @Override
    public int compareTo(Student student) {
        return 0;
    }
}

public class Ques5 {
    public static void main(String[] args){
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(28,90,"Minal"));
        studentList.add(new Student(23,78,"Nitin"));
        studentList.add(new Student(25,89,"Priya"));
        studentList.add(new Student(22,90,"Jatin"));
        studentList.add(new Student(24,89,"Sahil"));

        System.out.println("\nBefore Sort:");
        System.out.println("\nName         Age       Score");
        studentList.forEach(System.out::println);

        studentList.sort(Comparator.comparingDouble(Student::getScore).thenComparing(Student::geName));

        System.out.println("\nAfter Sort:");
        System.out.println("\nName         Age       Score");
        studentList.forEach(System.out::println);

    }
}
