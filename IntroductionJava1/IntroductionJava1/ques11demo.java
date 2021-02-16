package com.IntroductionJava1;

class bank{
   public void getDetails(String name,float roi){
        System.out.println("\nDetails of bank are: ");
        System.out.println("Bank name: State Bank of India"+name);
        System.out.println("Rate of interest: "+ roi);
    }
}

class SBI extends bank{
    public void getDetails(String name , float roi){
        super.getDetails(name,roi);
    }
}

class BOI extends bank{
    public void getDetails(String name , float roi){
        super.getDetails(name,roi);
    }
}

class ICICI extends bank{
   public void getDetails(String name , float roi){
       super.getDetails(name,roi);
    }
}

public class ques11demo {

    public static void main(String[] args)
    {
        SBI obj_sbi = new SBI();
        obj_sbi.getDetails("State Bank of India",6.5f);

        BOI obj_boi = new BOI();
        obj_boi.getDetails("Bank of India",5.9f);

        ICICI obj_icici = new ICICI();
        obj_icici.getDetails("ICICI Bank", 6.9f);
    }
}
