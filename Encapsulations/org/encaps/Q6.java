package org.encaps;

import java.util.ArrayList;
import java.util.List;

public class Q6 {
	
	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		li.add(105);

		Integer a = li.get(2);
		System.out.println("Q.6.1" +"-> " + li);
		System.out.println("2nd Index : " +a);
		System.out.println("");
		
		Integer a1 = li.get(4);
		System.out.println("Q.6.2"+"-> " + li);
		System.out.println("4th Index : " +a1);
		System.out.println("");
		
		Integer a2 = li.get(8);
		System.out.println("Q.6.3"+"-> " + li);
		System.out.println("8th Index : " +a2);
		System.out.println("");
		
		System.out.println("");
		
		System.out.println(" Q.6.4 - Normal for Loop");
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
			}
		System.out.println("");
		System.out.println(" Q.6.5 - Enhanced For Loop");
		for (Integer f : li) {
				System.out.println(f);			
		}		
	}
}
