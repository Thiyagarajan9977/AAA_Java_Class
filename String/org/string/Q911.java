package org.string;

public class Q911 {
	
	public static void main(String[] args) {
		
		System.out.println("Three literal string");		
		String s1 = new String ("Nisha");
		String s2 = new String("Rengan");
		String s3 = new String("NishaRengan");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		
		System.out.println("Three literal string");		
		String s4 =  ("Nisha");
		String s5 = ("Rengan");
		String s6 = ("NishaRengan");
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
	}
}
