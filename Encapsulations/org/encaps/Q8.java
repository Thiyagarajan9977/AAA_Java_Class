package org.encaps;

import java.util.ArrayList;
import java.util.List;

public class Q8 {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
		li.add(2,50);		
		System.out.println("Q.8.1 - Add a value 50, in the 2nd index of list");
		System.out.println("Array list : [10, 20, 30, 90, 10, 10, 40, 50]");
		System.out.println("After Adding :" +li);
		System.out.println(" ");
		
		li.add(9, 70);
		System.out.println("Q.8.2 - Add a value 70 end of list");
		System.out.println("Array list : [10, 20, 50, 30, 90, 10, 10, 40, 50]");
		System.out.println("After Adding :" +li);
		System.out.println("");
		
		li.add(8, 80);
		System.out.println("Q.8.3 - Add a value 80, 8th index of list");
		System.out.println("Array list : [10, 20, 50, 30, 90, 10, 10, 40, 50, 70]");
		System.out.println("After Adding :" +li);
		
		
	
		
		
		
		
		
	}
	
}
