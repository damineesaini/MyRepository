package com.IntroductionJava2;

class SingletonClass{
    private String name;
    private static final SingletonClass instance = new SingletonClass();

    private SingletonClass(){}

    public static SingletonClass getInstance(){
        return instance;
    }

    public void setNameMethod(String name){
        this.name = name;
        System.out.println("setMethod called....");
    }

    public String getNameMethod(){
        System.out.println("getMethod called....");
        return this.name;
    }

}

public class Ques4 {

    public static void main(String[] args)
    {
        SingletonClass singletonClassObj1 = SingletonClass.getInstance();
        singletonClassObj1.setNameMethod("this is for obj1");
        System.out.println("Calling getMethod() using obj1 reference variable");
        System.out.println(singletonClassObj1.getNameMethod());

        SingletonClass singletonClassObj2 = SingletonClass.getInstance();
        System.out.println("\nCalling getMethod() using obj2 reference variable without calling setMethod for obj2 refrence");
        System.out.println(singletonClassObj2.getNameMethod());
    }
}
