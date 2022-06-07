package org.map.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Q11 {
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();
		m.put(10, 10);
		m.put(20, 20);
		m.put(30, 30);
		m.put(40, 40);
		m.put(50, 50);
		m.put(60, 60);
		m.put(10, 10);
		m.put(50, 50);
		m.put(40, 40);
		
		Set<Entry<Integer, Integer>> es = m.entrySet();
		
		for (Entry<Integer, Integer> a : es) {
					
			System.out.println(a.getKey());
			System.out.println(a.getValue());
			System.out.println(es);	
		}		
	}
}
