package org.string;

public class Q910 {
	
	public static void main(String[] args) {		
		//Compare Method		
		System.out.println("Comparing Two inputs st and st1");		
		String st = "Nisha";
		String st1 = "nisha";
		boolean equals = st.equals(st1);
		System.out.println(equals);			
		System.out.println("Comparing Two inputs st2 and st3");		
		String st2 = "Nia";
		String st3 = "nisha";
		boolean equals1 = st2.equals(st3);
		System.out.println(equals1);
		
		System.out.println();
		
		System.out.println("Two literal string");		
		String s1 = ("Nisha");
		System.out.println(System.identityHashCode(s1));
		String s2 = ("Nisha");
		System.out.println(System.identityHashCode(s2));
		
		System.out.println();		
		System.out.println("Two non- literal string");
		String s3 = new String("Nisha");
		String s4 = new String("Nisha");
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));		
	}
}
