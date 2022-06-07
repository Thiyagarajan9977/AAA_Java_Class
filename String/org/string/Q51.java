package org.string;

import java.util.Scanner;

public class Q51 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the address....");
		String pincode = sc.nextLine();
		
		boolean check = pincode.contains("pincode");
		
		if (check == true) {
			System.out.println("Valid Address");
		} else {
			System.out.println("Invalid Address");
		}
				
		
		
		
		
	}

}
