package com.Java8;

interface ConstructorReference{
    Employee getEmployee(String name,int age,String city);
}

class Employee{
    private String name;
    private int age;
    private String city;

    Employee(String name,int age,String city){
        this.name=name;
        this.age=age;
        this.city=city;
    }

    public void displayDetails(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("City: "+this.city);
    }
}

public class Ques4 {
    public static void main(String[] args){
        ConstructorReference constructorReference = Employee::new;
        Employee employee = constructorReference.getEmployee("Daminee", 23, "Delhi");
        employee.displayDetails();
    }
}
