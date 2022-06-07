package org.encaps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Q4 {
	
	public static void main(String[] args) {
	
		System.out.println("Array List to find the length");
		System.out.println("-----------------------------");
		List<Integer> ln2 = new ArrayList<Integer>();
		ln2.add(10);
		ln2.add(20);
		ln2.add(30);
		ln2.add(90);
		ln2.add(10);
		ln2.add(10);
		ln2.add(40);
		ln2.add(50);
		System.out.println(ln2);
		
		System.out.println("");
		System.out.println("Linked List to find the length");
		System.out.println("-----------------------------");
		List<Integer> ln = new LinkedList<Integer>();
		ln.add(100);
		ln.add(200);
		ln.add(300);
		ln.add(400);
		ln.add(500);
		ln.add(600);
		ln.add(700);
		System.out.println(ln);
		
		System.out.println("");
		System.out.println("The size of the linked list is :" +ln.size());
		System.out.println(" ");
		System.out.println("Vector List to find the length");
		System.out.println("-----------------------------");
		List<Integer> ln3 = new Vector<>();
		ln3.add(105);
		ln3.add(205);
		ln3.add(305);
		ln3.add(405);
		ln3.add(505);
		ln3.add(605);
		ln3.add(805);
		ln3.add(805);
		System.out.println(ln3);

	}

}


