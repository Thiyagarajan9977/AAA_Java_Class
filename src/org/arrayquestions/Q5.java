package org.arrayquestions;

import java.util.ArrayList;
import java.util.List;

public class Q5 {
	
	public static void main(String[] args) {

		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		System.out.println("Input values - " +li);
		System.out.println("first index value of 10 :" +li.indexOf(10) +" "+"Position");
		
		
		List<Integer> li2 = new ArrayList<Integer>();
		li2.add(10);
		li2.add(20);
		li2.add(30);
		li2.add(90);
		li2.add(10);
		li2.add(10);
		li2.add(40);
		li2.add(50);
		System.out.println("");
		System.out.println("Input values - " +li2);
		System.out.println("Last index value of 10 :" +li2.lastIndexOf(10) +" "+"Position");	
		
		List<Integer> li3 = new ArrayList<Integer>();
		li3.add(10);
		li3.add(20);
		li3.add(30);
		li3.add(90);
		li3.add(10);
		li3.add(10);
		li3.add(40);
		li3.add(50);
		System.out.println("");
		System.out.println("Input values - " +li3);
		System.out.println("index value of 50 :" +li3.indexOf(50) +" "+"Position");
				
		
		List<Integer> li4 = new ArrayList<Integer>();
		li4.add(10);
		li4.add(20);
		li4.add(30);
		li4.add(90);
		li4.add(10);
		li4.add(10);
		li4.add(40);
		li4.add(50);
		System.out.println("");
		System.out.println("Input values - " +li4);
		System.out.println("index value of 90 :" +li4.indexOf(90) +" "+"Position");
			
	}
}
