package org.list;

import java.util.ArrayList;
import java.util.List;

public class Collectionlist {

	public static void main(String[] args) {
		
		System.out.println(" Collection Storing Multiple Values of disimilartype");
		System.out.println("in a single reference, Memory Wastage is low");
		System.out.println("why because Memory is allocated @ Runtime");
		System.out.println();				
		System.out.println("***List based on Index***");
		System.out.println("***It's allows duplicate***");
		System.out.println("***Printing based on insetion order***");
		System.out.println();		
		System.out.println("***Array List ***");
		System.out.println("***Linked List***");
		System.out.println("***Vector ***");
		
		
		System.out.println();

		List<Integer> li = new ArrayList<Integer>();

		li.add(10);
		li.add(20);
		li.add(60);
		li.add(80);
		li.add(90);
		li.add(40);
		li.add(10);
		System.out.println("Program Outputs :");
		System.out.println(li);
		li.add(60);
		System.out.println(li);

		// size
		int size = li.size();
		System.out.println(size);

		// get a particular Value

		Integer it = li.get(2);
		System.out.println(it);

		// get a index

		int indexOf = li.indexOf(10);
		System.out.println(indexOf);

		// get a last index

		int ti = li.lastIndexOf(10);
		System.out.println(ti);

		// check the value present or not

		boolean contains = li.contains(10);
		System.out.println(contains);

		// add the value

		li.add(70);
		System.out.println(li);

		// add the value b/w the list

		li.add(2, 200);
		System.out.println(li);

		// replace the value

		li.set(5, 500);
		System.out.println(li);

		// remove the value

		li.remove(2);
		System.out.println(li);

		// create another list

		List<Integer> l2 = new ArrayList<>();
		boolean empty = l2.isEmpty();
		System.out.println(empty);

		System.out.println(l2);

		// to add all list another list

		l2.addAll(li);
		System.out.println(l2);

		// compare two list

		boolean equals1 = l2.equals(li);
		System.out.println(equals1);

		// add some another value in second list

		l2.add(120);
		l2.add(150);
		l2.add(170);
		l2.add(180);

		System.out.println(l2);

		// get common values

		l2.retainAll(li);
		System.out.println(l2);

		// remove common values

		l2.removeAll(li);
		System.out.println(l2);

		// add all values
		l2.addAll(li);
		System.out.println(l2);

		// get all the valus using normal loop

		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}

		// get all the valus using enhanced loop

		for (Integer a : l2) {
			System.out.println(a);
		}
	}
}
