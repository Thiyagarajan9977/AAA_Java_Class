package org.sington;

public class Employee2 {
	
	public static void main(String[] args) {
		Employee e2 = Employee.getinstance();
		e2.empid();
		
		Employee e1 = Employee.getinstance();
		System.out.println(System.identityHashCode(e2));
		System.out.println(System.identityHashCode(e1));
	}
}
