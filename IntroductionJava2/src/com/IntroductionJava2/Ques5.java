package com.IntroductionJava2;

class Fruits implements Cloneable{
    private int quantity;
    private String name;

    Fruits(int quantity,String name){
        this.name=name;
        this.quantity=quantity;
    }

    //clone method to create clone object of class Fruits
     public Fruits clone() throws CloneNotSupportedException{
        return (Fruits) super.clone();
     }

     //copy constructor
     Fruits(Fruits obj){
        this.quantity = obj.quantity;
        this.name = obj.name;
     }

     public void displayDetails()
     {
         System.out.println("Fruit name: "+this.name+" and quantity: "+this.quantity);
     }
}

public class Ques5 {

    public static void main(String[] args)
    {
        Fruits fruitsObject = new Fruits(10,"Orange");

        //object cloning in java using cloneable
        try {
            Fruits fruitsObject2 = fruitsObject.clone();
            System.out.println("Object copied using clone() :");
            fruitsObject2.displayDetails();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        //object cloning in java using copy constructor
        Fruits fruitsObject3 = new Fruits(fruitsObject);
        System.out.println("Object copied using copy constructor :");
        fruitsObject3.displayDetails();
    }
}
