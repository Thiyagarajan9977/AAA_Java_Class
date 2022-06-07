package org.exception;

import java.util.LinkedList;
import java.util.List;

public class IndexOutofBoundExceptions {
	
	public static void main(String[] args) {
		
		//Index Out of Bound Exceptions
		
		System.out.println("Index Outof Bound Exceptions");
		System.out.println("----------------------------");
				
		List<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(10);
		System.out.println(li.get(2));
		
		
	}
}
