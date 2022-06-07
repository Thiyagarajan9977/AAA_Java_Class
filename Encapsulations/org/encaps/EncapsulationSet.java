package org.encaps;

import java.util.LinkedHashSet;
import java.util.Set;

public class EncapsulationSet {
	
	public static void main(String[] args) {
		
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

		System.out.println("Using Set");
		System.out.println("-----------");
		
		
		Set<Employee> li= new LinkedHashSet<>();
		li.add(e1);
		li.add(e2);
		li.add(e3);
		
//		Enhaced for loop
		
		System.out.println("Get all the details using Enhanced for loop:");
		System.out.println("-----------------------------------------");
		
		for (Employee x : li) {
			
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getPhno());
		}		
	}
	
	

}
