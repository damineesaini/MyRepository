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

     public void display()
     {
         System.out.println("Fruit name: "+this.name+" and quantity: "+this.quantity);
     }
}

public class Ques5 {

    public static void main(String[] args)
    {
        Fruits orange_obj = new Fruits(10,"Orange");

        //object cloning in java using cloneable
        try {
            Fruits orange_obj2 = orange_obj.clone();
            System.out.println("Object copied using clone() :");
            orange_obj2.display();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        //object cloning in java using copy constructor
        Fruits orange_obj3 = new Fruits(orange_obj);
        System.out.println("Object copied using copy constructor :");
        orange_obj3.display();
    }
}
