package org.string;

import java.util.Scanner;

public class Q6 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the phone number ....");
		String phone = sc.nextLine();

		if (phone.matches("[0-9]{10}")) {
			
			System.out.println("Valid Number");
		} 
		
		else {
			System.out.println("Invalid Number");
	}	
}
	}
