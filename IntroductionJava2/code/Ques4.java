package com.IntroductionJava2;

class Singleton{
    String name;
    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }

    public void setMethod(String name){
        this.name = name;
        System.out.println("setMethod called....");
    }

    public String getMethod(){
        System.out.println("getMethod called....");
        return this.name;
    }

}

public class Ques4 {

    public static void main(String[] args)
    {
        Singleton obj1 = Singleton.getInstance();
        obj1.setMethod("this is for obj1");
        System.out.println("Calling getMethod() using obj1 reference variable");
        System.out.println(obj1.getMethod());

        Singleton obj2 = Singleton.getInstance();
        System.out.println("\nCalling getMethod() using obj2 reference variable without calling setMethod for obj2 refrence");
        System.out.println(obj2.getMethod());

    }
}
