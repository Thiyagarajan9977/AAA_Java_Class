package org.cons;

public class Employee {

	public Employee() {
		this(1532);
		System.out.println("default constructor");
	}

	public Employee(int a) {
		System.out.println("Int Parameterized Constructor");
	}

	public static void main(String[] args) {

		Employee c = new Employee();
		
		

	}

}
