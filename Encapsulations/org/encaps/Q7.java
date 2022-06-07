package org.encaps;

import java.util.ArrayList;
import java.util.List;

public class Q7 {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(10);
		li.add(10);
		li.add(40);
		
		Integer a = li.remove(2);
		
		System.out.println("Q.7.1 - Removing 2nd index ");
		System.out.println("Before Removing : 10, 20, 30, 40, 50, 60, 10, 10, 40");		
		System.out.println("Removing 2nd index" +" - "+a);
		System.out.println("After removing list: " +li);
		System.out.println("");
		
		
		System.out.println("Q.7.2 - Removing 10th index");
		System.out.println("Before Removing : 10, 20, 30, 40, 50, 60, 10, 10, 40");
		System.out.println("Total value of index : " +li.size());
		System.out.println("Total no of index is "+li.size() +" " +"Hence unable to remove 10th index");
		System.out.println("");
		
		Integer b = li.remove(5);
		
		System.out.println("Q.7.3 - Removing last value of 10 in list");
		System.out.println("Before Removing : 10, 20, 30, 90, 10, 10, 40");
		System.out.println("Removing last value of 10 " +" - "+b);
		System.out.println("After removing list: " +li);
		
	}

}
