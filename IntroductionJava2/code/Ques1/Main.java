package com.IntroductionJava2;

public class Main {

    public static void main(String[] args) {
	 Book obj_lib = new Librarian();
	 obj_lib.addBook("LOLITA","IB22008");
	 obj_lib.viewBook();

	 Student obj_st = new Student("Daminee",12);
	 obj_st.showDetails();
	 obj_st.fineDetails();
    }
}
