package org.arrayquestions;

import java.util.*;

public class Q51 {

	private void emp() {

		List<Integer> li5 = new LinkedList<Integer>();
		 
		li5.add(10);
		li5.add(20);
		li5.add(30);
		li5.add(90);
		li5.add(10);
		li5.add(10);
		li5.add(40);
		li5.add(50);
		
		System.out.println("Normal For loop");
			for (int i = 0; i < li5.size(); i++) {				
					System.out.println(li5.get(i));
			}			
	}

	public static void main(String[] args) {

		Q51 e = new Q51();
		e.emp();
	}
}
