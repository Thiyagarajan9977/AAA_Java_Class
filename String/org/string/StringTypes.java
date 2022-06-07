package org.string;

public class StringTypes {
	
	public static void main(String[] args) {
		
		System.out.println("*****   Literal String ******");
		System.out.println("------------------------------");
		
		String s1 = "Welcome";	// O/P - if the value is same allocate same memory else diff memory
		String s2 = "Welcome";
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		
		System.out.println();
		
		System.out.println("*****   Non - Literal String ******");
		System.out.println("-----------------------------------");
		
		String s4 = new String("Welcome"); // O/P - Always allocate new memory bcoz of new keyword
		String s5 = new String("Welcome");
		System.out.println(s4);  
		System.out.println(s5);
		
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
	}
}
