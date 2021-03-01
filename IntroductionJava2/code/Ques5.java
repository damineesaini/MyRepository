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
        Fruits orangeObj = new Fruits(10,"Orange");

        //object cloning in java using cloneable
        try {
            Fruits orangeObj2 = orangeObj.clone();
            System.out.println("Object copied using clone() :");
            orangeObj2.display();
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        //object cloning in java using copy constructor
        Fruits orangeObj3 = new Fruits(orangeObj);
        System.out.println("Object copied using copy constructor :");
        orangeObj3.display();
    }
}
