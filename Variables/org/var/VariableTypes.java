package org.var;

public class VariableTypes {
	
	public static int a =10;
	static int b=20;
	
	private void empID() {
		
			
	/*	System.out.println("Post Increment");
		System.out.println(a++);
		System.out.println(a);		
		System.out.println(b++);
		System.out.println(b);
		*/
		System.out.println("Pre Increment");
		//	pre increment
		System.out.println(++a);
		System.out.println(a);		
		System.out.println(++b);
		System.out.println(b);
	}
	public static void main(String[] args) {
		
	VariableTypes e = new VariableTypes();
	e.empID();
	a=11;
	b=20;	
	}
}
