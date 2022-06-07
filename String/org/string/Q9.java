package org.string;

public class Q9 {
	
	public static void main(String[] args) {
		
		String st = "Welcome to class java";		
		boolean startsWith = st.startsWith("Welcome"); //startsWith condition True
		System.out.println(startsWith);
		
		String st1 = "Hai i am nisha";
		boolean startsWith1 = st1.startsWith("Welcome"); //startsWith condition False
		System.out.println(startsWith1);
		
		String st2 = "Welcome to java class";
		boolean startsWith2 = st2.endsWith("class"); //Endswith condition True
		System.out.println(startsWith2);
		
		
		String st3 = "Welcome to java class";
		boolean startsWith3 = st3.endsWith("java"); //Endswith condition False
		System.out.println(startsWith3);
		
		String st4 = "Welcome to java class";
		boolean empty = st4.isEmpty();			//Isempty condition False
		System.out.println(empty);
		
		String st5 = " ";
		boolean empty1 = st5.isEmpty();			//Isempty condition False
		System.out.println(empty1);
		
		
	}

}
