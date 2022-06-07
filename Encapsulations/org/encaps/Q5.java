package org.encaps;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
	
	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		
		int a1 = a.indexOf(10);
		System.out.println("Q.5.1");
		System.out.println("Array Elements are :" +a);
		System.out.println("First Index value 10 : " +a1);
		
		int a2 = a.lastIndexOf(10);
		System.out.println("Q.5.2");
		System.out.println("Array Elements are :" +a);
		System.out.println("Last Index value 10 : " +a2);
		
		int a3 = a.indexOf(50);
		System.out.println("Q.5.2");
		System.out.println("Array Elements are :" +a);
		System.out.println("Index value 50 : " +a3);
		
		int a4 = a.indexOf(90);
		System.out.println("Q.5.3");
		System.out.println("Array Elements are :" +a);
		System.out.println("Index value 90 : " +a4);
		
		int a5 = a.indexOf(70);
		System.out.println("Q.5.4");
		System.out.println("Array Elements are :" +a);
		System.out.println("Index value 70 : " +a5);
		
		
		
		
		
	}
}
