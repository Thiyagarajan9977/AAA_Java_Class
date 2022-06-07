package org.map;

import java.util.*;
import java.util.Map.Entry;

public class CollectionsMap {

	public static void main(String[] args) {
		
		System.out.println("Map :");
		System.out.println("----");
		
		System.out.println("Map - Key & Value pair combination is called Entry");
		System.out.println("Key won't allow duplicate");
		System.out.println("Value allow duplicate");
		
		System.out.println("");
		System.out.println("Types of Map :");
		System.out.println("---------------");
		System.out.println("HashMap - Random Order");
		System.out.println("LinkedHashMap - Insertion Order");
		System.out.println("TreeMap - Ascending Order");
		System.out.println("Hashtable - Random");
		
		
		Map<Integer, String> mp =  new LinkedHashMap<>();
		mp.put(10, "java");
		mp.put(50, "SQL");
		mp.put(30, "Python");
		mp.put(20, "selenium");
		mp.put(40, "C#");
		mp.put(10, "Bigdata");
		mp.put(60, "Bigdata");
		System.out.println(" ");
		System.out.println("***Progam Outputs***");
		System.out.println("--------------------");
		System.out.println(mp);
		
//		size of the map
		
		System.out.println();
		System.out.println("Size of Map");
		System.out.println("-----------");
		int size = mp.size();
		System.out.println(size);
		
//		get particuluar value
		System.out.println("Get a particuluar Value");
		System.out.println("-----------------------");
		String t = mp.get(10);
		System.out.println(t);
	
//		check the value present or not
		System.out.println("Check the value present or not");
		System.out.println("------------------------------");
		
		boolean cv = mp.containsValue("java");
		System.out.println(cv);
		
//		get only the keys
		System.out.println("To get the key ");
		System.out.println("------------------------------");		
		Set<Integer> ks = mp.keySet();
		System.out.println(ks);
		System.out.println();
		
//		get only the values
		
		System.out.println("To get the values");
		System.out.println("-----------------");
		Collection<String> vc = mp.values();
		System.out.println(vc);
		
//		To remove the key
		
		System.out.println("To remove the key ");
		System.out.println("-----------------");
		mp.remove(60);
		System.out.println(mp);
		
//		To check the entry
		
		Set<Entry<Integer, String>> es = mp.entrySet();
		
		
//		To get all the values using Enhanced For loop
		
		for (Entry<Integer, String> et : es) {
			
			System.out.println(et.getKey());
			
			System.out.println(et.getValue());
			
			System.out.println(et);
		}
	}
}
