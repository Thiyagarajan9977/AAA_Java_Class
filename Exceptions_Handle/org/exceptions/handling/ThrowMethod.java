package org.exceptions.handling;

import java.io.IOException;
import java.util.Scanner;

public class ThrowMethod {
	
	//Throw is keyword, it is used to throw own exceptions
	// It will declare inside the block only

	// Throws is also a keyword same as throw own exception
	// It will declare the method signature level
	
	// My intention is throw the manual exception instead of 
	// invalid output, So  using throw keyword to achieved this   
	// This is compile time exception - [checked exception]
	
	private static void empid() throws IOException {
		
		Scanner s = new Scanner(System.in);
		String id = s.next();
		if(id.startsWith("13")) {
			System.out.println("valid ID");
			}
		else {
			System.out.println("Invalid ID");
			
			throw new IOException();
		}
	}
	
	public static void main(String[] args) throws IOException {
		empid();
	}
}
