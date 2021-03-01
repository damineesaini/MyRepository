package com.IntroductionJava1;

//parent class bank
class bank{
    float interestRate;

   bank(float roi){
       this.interestRate=roi;
   }

    public  float getDetails() {
        return this.interestRate;
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

public class question11demo {

    public static void main(String[] args)
    {
        SBI objSbi = new SBI(6.5f);
        System.out.println("Details of SBI bank: "+objSbi.getDetails() +"%");

        BOI objBoi = new BOI(5.9f);
        System.out.println("Details of BOI bank: "+objBoi.getDetails() +"%");

        ICICI objIcici = new ICICI(6.9f);
        System.out.println("Details of ICICI bank: "+objIcici.getDetails() +"%");
    }
}
