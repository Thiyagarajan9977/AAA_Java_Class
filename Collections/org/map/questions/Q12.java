package org.map.questions;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Q12 {

	public static void main(String[] args) {

		Map<String, Integer> m1 = new TreeMap<>();

		m1.put("!", 10);
		m1.put("@", 20);
		m1.put("$", 30);
		m1.put("%", 40);
		m1.put("^", 50);
		m1.put("&", 60);
		m1.put("*", 50);
		m1.put("(", 40);

		int size = m1.size();

		Set<Entry<String, Integer>> es = m1.entrySet();

		for (Entry<String, Integer> a : es) {

			System.out.println(a.getKey());
			System.out.println(a.getValue());
			System.out.println(es);
		}
	}
}
