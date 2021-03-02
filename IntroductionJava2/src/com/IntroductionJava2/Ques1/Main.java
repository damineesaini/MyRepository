package com.IntroductionJava2.Ques1;

public class Main {

    public static void main(String[] args) {
	 Book LibrarianObj = new Librarian();
	 LibrarianObj.addBookDetails("LOLITA","IB22008");
	 LibrarianObj.viewBookDetails();

	 Student objSt = new Student("Daminee",12);
	 objSt.showStudentDetails();
	 objSt.fineDetails();
    }
}
