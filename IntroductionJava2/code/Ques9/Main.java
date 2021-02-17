package com.IntroductionJava2;

public class Main {

    public static void main(String[] args) {
	    Chairs chair_obj1 = new Chairs();
	    chair_obj1.setDetails("wooden",2345.90f,8,6,10);
	    chair_obj1.display();

		Table table_obj1 = new Table();
		table_obj1.setDetails("wooden",2000.90f,8,6);
		table_obj1.display();

		Chairs chair_obj2 = new Chairs();
		chair_obj2.setDetails("metal",4345.90f,9,9,10);
		chair_obj2.display();

		Table table_obj2 = new Table();
		table_obj2.setDetails("metal",5000.90f,9,9);
		table_obj2.display();
    }
}
