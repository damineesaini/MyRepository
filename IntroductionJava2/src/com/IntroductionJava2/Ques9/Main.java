package com.IntroductionJava2.Ques9;

public class Main {

    public static void main(String[] args) {
	    Chairs chairObj1 = new Chairs();
	    chairObj1.setDetails("wooden",2345.90f,8,6,10);
	    chairObj1.display();

		Table tableObj1 = new Table();
		tableObj1.setDetails("wooden",2000.90f,8,6);
		tableObj1.display();

		Chairs chairObj2 = new Chairs();
		chairObj2.setDetails("metal",4345.90f,9,9,10);
		chairObj2.display();

		Table tableObj2 = new Table();
		tableObj2.setDetails("metal",5000.90f,9,9);
		tableObj2.display();
    }
}
