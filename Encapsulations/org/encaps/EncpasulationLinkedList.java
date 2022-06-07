package org.encaps;

import java.util.LinkedList;
import java.util.List;

public class EncpasulationLinkedList {

	public static void main(String[] args) {

		// E1 Method
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("Thiyagu");
		e1.setPhno(987654321);

		// E2 Method
		Employee e2 = new Employee();
		e2.setId(200);
		e2.setName("Rajan");
		e2.setPhno(123456789);

		// E3 Method
		Employee e3 = new Employee();
		e3.setId(300);
		e3.setName("Thiyagarajan");
		e3.setPhno(987651234);

		System.out.println("Using List");
		System.out.println("-----------");
		
		List<Employee> li = new LinkedList<>(); // Employee Object reference
		li.add(e1);
		li.add(e2);
		li.add(e3);

		
		// get particuluar employee details
		Employee a = li.get(0);
		System.out.println("Get the particuluar employee details :");
		int a1 = a.getId();
		System.out.println(a1);

		// get all the details

		System.out.println("Get all the details using Normal for loop:");
		System.out.println("-----------------------------------------");
		

		for (int i = 0; i < li.size(); i++) {
			Employee b = li.get(i);
			System.out.println(b.getId());
			System.out.println(b.getName());
			System.out.println(b.getPhno());
		}
			// using Enhanced for loop
			System.out.println("");
			System.out.println("Get all the details using Enhanced for loop:");
			System.out.println("--------------------------------------------");

			for (Employee x : li) {

				System.out.println(x.getId());
				System.out.println(x.getName());
				System.out.println(x.getPhno());
		}
	}
}
