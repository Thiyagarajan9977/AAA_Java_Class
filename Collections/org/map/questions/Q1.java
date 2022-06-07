package org.map.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q1 {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<Integer, String>();
		m1.put(10, "java");
		m1.put(20, "sql");
		m1.put(30, "oops");
		m1.put(40, "Sql");
		m1.put(50, "oracle");
		m1.put(60, "DB");
		m1.put(10, "selenium");
		m1.put(50, "psql");
		m1.put(40, "Hadoop");
		
		int size = m1.size();
		System.out.println(size);
		System.out.println("");
		
		// use entry keyword for (for loop purpose) 
		Set<Entry<Integer,String>> et = m1.entrySet();
		
		for (Entry<Integer, String> a: et) {
			
			System.out.println(a);
			System.out.println(a.getKey());
			System.out.println(a.getValue());
			
		}
		
	}

}

