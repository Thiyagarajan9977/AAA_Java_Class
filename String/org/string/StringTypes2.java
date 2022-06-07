package org.string;

public class StringTypes2 {
	
	public static void main(String[] args) {
		
		System.out.println("Immutuable String");
		System.out.println("-----------------");
		
		String s1 = "welcome";
		String s2 = "welcome";
		System.out.println("Before***********" +s1);
		String s3 = s1.concat(s2);
		System.out.println("After*************" +s1);
		System.out.println(s3);
		System.out.println(s2);
		
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		
		
		
		System.out.println("mutuable String");
		System.out.println("-----------------");
		
		StringBuffer s4 = new StringBuffer("welcome");
		StringBuffer s5 = new StringBuffer("welcome");
		
		System.out.println("Before*****" +s4);
		StringBuffer s6 = s4.append(s5);
		System.out.println("After*****" +s4);
		
		System.out.println(s5);
		System.out.println(s6);
		
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(s5));
		System.out.println(System.identityHashCode(s6));
		
	}

	
	
}
