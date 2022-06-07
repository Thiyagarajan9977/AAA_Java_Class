package org.poly;

public class MethodOverloading {
	
	private void employee(String name) {
		System.out.println("string method");
		System.out.println("Emp Name is " +name);
	}
	
	// usind Datatype
	
	private void employee(int id) {
	System.out.println("Int method");
	System.out.println("Employee id is" + id);
	
	}
	
	//datatype order
	
	private void employee(String name, long phone) {
		System.out.println("String + Long Method");
		System.out.println("Emp name is :" +name);		
	}
	
	private void employee(float f, char c, boolean b) {
		System.out.println("Float + char + boolean method");
		System.out.println("emp " +f);
		System.out.println("emp " +c);
		System.out.println("emp " +b);
	}
	
	public static void main(String[] args) {
		
		MethodOverloading t = new MethodOverloading();
		t.employee(5412563);
		t.employee("Thyagu");
		t.employee("thiygua", 2748745);
		t.employee(5415, 'M', true);
			
	}
	
}
