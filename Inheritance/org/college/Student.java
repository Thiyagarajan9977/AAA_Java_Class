package org.college;

public class Student {

	public void studentName() {
		System.out.println("The student name is : THIYAGARAJAN");
	}

	public void studentDept() {
		System.out.println("The student dept is : C/S ");
	}

	public void studentId() {
		System.out.println("The student id is : 45679 ");
	}

	public static void main(String[] args) {

		College co = new College();
		co.collegeName();
		co.collegeCode();
		co.collegeRank();		

		Student st = new Student();
		st.studentName();
		st.studentId();
		st.studentDept();

		Hostel ho = new Hostel();
		ho.hostelName();

		Dept de = new Dept();
		de.deptName();
	}

}
