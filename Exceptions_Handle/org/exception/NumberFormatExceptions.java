package org.exception;

import java.util.Scanner;

public class NumberFormatExceptions {
	
	public static void main(String[] args) {
		
		//Number format exceptions
		
		System.out.println("Number format exceptions");
		System.out.println("-------------------------");
		
		String n = "1000Rupees";
		System.out.println(n+1000);
		int pt = Integer.parseInt(n);
		System.out.println(pt+1000);
		
	}
}
