package org.sington;

//SingleTone is one of design pattern in java
//one class having one object
//Whenever we need result as variable, 
//Need to set variable as returnType
//Whenever we need result as object, 
//Need to set class Name as returnType

//SingleTone Rule :

// 1. Need to declare the private constructor - Bcoz
// other class not suppose to create new object
// 2. declare the object as static

public class Employee { // Class Name

	static Employee e;

	private Employee() { // Constructor Creation

	}

	public static Employee getinstance() {
			
			if(e==null) {
			
			e = new Employee();
			System.out.println(System.identityHashCode(e));
			}
		return e;
	}

	public void empid() {
		System.out.println("Hai");
	}

	public static void main(String[] args) {
		
		Employee e1 = getinstance();
		e1.empid();
		Employee e2 = getinstance();
		System.out.println(System.identityHashCode(e1));
		System.out.println(System.identityHashCode(e2));
 }
}
