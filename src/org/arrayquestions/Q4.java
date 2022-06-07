
package org.arrayquestions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Q4 {

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
		System.out.println("ArrayList :");
		System.out.println("Input values - " +li);
		System.out.println("The length of arraylist values : " +li.size());
		
		List<Integer> li2 = new LinkedList<Integer>();
		li2.add(100);
		li2.add(200);
		li2.add(300);
		li2.add(400);
		li2.add(500);
		li2.add(600);
		li2.add(700);
		System.out.println(" ");
		System.out.println("LinkedList :");
		System.out.println("Input values - " +li2);
		System.out.println("The length of arraylist values : " +li2.size());
		
		List<Integer> li3 = new Vector<Integer>();li2.add(100);
		li3.add(105);
		li3.add(205);
		li3.add(305);
		li3.add(405);
		li3.add(505);
		li3.add(605);
		li3.add(705);
		li3.add(805);
		System.out.println(" ");
		System.out.println("VectorList :");
		System.out.println("Input values - " +li3);
		System.out.println("The length of arraylist values : " +li3.size());
	}
}
