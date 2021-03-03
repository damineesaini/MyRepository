package com.IntroductionJava2;

class DefinitionNotFoundClass {
    DefinitionNotFoundClass() {
        System.out.println("This is a constructor of class ClassDefinitionNotFound");
    }
}

public class Ques3 {

    public static void main(String[] args)
    {
        System.out.println("For NoClassDefFoundError to occur delete the DefinitionNotFoundClass.class file created after compilation and " +
            "then run the program.");
        DefinitionNotFoundClass definitionNotFoundClassObj = new DefinitionNotFoundClass();

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }

    }
}
