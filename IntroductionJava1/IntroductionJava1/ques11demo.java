package com.IntroductionJava1;

//parent class bank
class bank{
    float interest_rate;

   bank(float roi){
       this.interest_rate=roi;
   }

    public  float getDetails() {
        return this.interest_rate;
    }
}

//child class of bank - SBI
class SBI extends bank{
    SBI(float roi){
        super(roi);
    }
    public float getDetails(){
        return super.getDetails();
    }
}

//child class of bank - BOI
class BOI extends bank{

    BOI(float roi){
        super(roi);
    }
    public float getDetails(){
        return super.getDetails();
    }
}

//child class of bank - ICICI
class ICICI extends bank{

    ICICI(float roi){
        super(roi);
    }
   public float getDetails(){
       return super.getDetails();
    }
}

public class ques11demo {

    public static void main(String[] args)
    {
        SBI obj_sbi = new SBI(6.5f);
        System.out.println("Details of SBI bank: "+obj_sbi.getDetails() +"%");

        BOI obj_boi = new BOI(5.9f);
        System.out.println("Details of BOI bank: "+obj_boi.getDetails() +"%");

        ICICI obj_icici = new ICICI(6.9f);
        System.out.println("Details of ICICI bank: "+obj_icici.getDetails() +"%");
    }
}
