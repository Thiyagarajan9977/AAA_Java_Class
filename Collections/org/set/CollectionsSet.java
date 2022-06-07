package org.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsSet {
	
	public static void main(String[] args) {
		
		System.out.println("***Set Based on Value***");
		System.out.println("***It Won't allows duplicate***");
		System.out.println("***printing order based on class***");
		System.out.println(" ");		
		
		System.out.println("There is no get method concept, because");
		System.out.println("Set is based on value, It won't allow index");
		
		
		System.out.println();		
		System.out.println("***Hashset - Random Order***");
		System.out.println("***LinkedHashset - Insertion Order***");
		System.out.println("***TreeSet - Ascending Order***");
		System.out.println();
		
		Set<Integer> si = new LinkedHashSet<>();
		si.add(10);
		si.add(90);
		si.add(80);
		si.add(30);
		si.add(10);
		si.add(60);
		si.add(50);
		si.add(40);
		System.out.println();
		System.out.println("Program Outputs below : ");
		System.out.println(si);
		
//		check the value present or not using "contains" method 
		
		System.out.println("check the value present or not using contains method");
		boolean con= si.contains(90);
		System.out.println(con);
		
//		remove the value from set using "Remove" method
		
		System.out.println("Remove the value from set using \"Remove\" method");
		si.remove(90);
		System.out.println(si);
		
//		get all values using ***Enhanced loop****
		
		System.out.println();
		System.out.println("***Enhanced loop****");
		
		System.out.println("Since there is no normal for loop concept");
		System.out.println("it's working based on index");
		
		
		List<Integer> li = new ArrayList<Integer>();
		System.out.println();
		System.out.println("List :");
		
//		added all the values from set SI variables
		
		li.add(10);
		li.add(90);
		li.add(80);
		li.add(30);
		li.add(10);
		li.add(60);
		li.add(50);
		li.add(40);
		li.add(40);
			
		System.out.println("Below the value 10 prints two times");
		System.out.println("So ArrayList allow the duplicates");
		System.out.println(li);
		
		Set<Integer> s2 = new LinkedHashSet<>();
		s2.addAll(li);
		System.out.println();
		System.out.println(" li variable values added into s2 variable");
		System.out.println("Below the value 10 prints one time");
		System.out.println("So set won't allow the duplicates");
		
		System.out.println(s2);
		System.out.println();
		
		Set<Character> s3 = new TreeSet<>();
		
		System.out.println("Treeset working based on Ascending order");
		System.out.println("Below the value print based on ASCII format");		
		
		s3.add('a');
		s3.add('5');
		s3.add('%');
		s3.add('A');
		s3.add(' ');
		s3.add('9');
		System.out.println(s3);
		
		
		
		
		
		
		
		
		
		
		
	}

}

