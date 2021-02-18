package com.Collections;

import java.util.ArrayList;
import java.util.Comparator;

class Employee implements Comparable<Employee>{
    private final double age;
    private final double salary;
    private final String name;

    Employee(double age,double salary,String name){
        this.age=age;
        this.salary=salary;
        this.name=name;
    }
    
    public double getSalary(){
        return this.salary;
    } 

    public String toString(){
        return this.name + "\t\t" + this.age + "\t\t" + this.salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return 0;
    }
}


public class Ques4 {

    public static void main(String[] args){
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(23,15000,"Nitin"));
        employeeList.add(new Employee(25,40000,"Priya"));
        employeeList.add(new Employee(22,14000,"Jatin"));
        employeeList.add(new Employee(28,50000,"Minal"));
        employeeList.add(new Employee(24,30000,"Sahil"));

        System.out.println("\nBefore Sort:");
        System.out.println("\nName         Age       Salary");
        employeeList.forEach(System.out::println);

        //SORTING THE Employee object on the basis of salary
        employeeList.sort(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("\nAfter Sort:");
        System.out.println("\nName         Age       Salary");
        employeeList.forEach(System.out::println);

    }
}
