package org.string;

import java.util.Scanner;

public class Q75 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the address....");
		String addres = sc.nextLine();
		
		if(addres.contains("pincode")) {
			
			System.out.println("pincode is Present");
		}
		else {
			
			System.out.println("Enter the valid address");
		}
		
		String replace1 = addres.replaceAll("pincode", " ");
		System.out.println(replace1);	
		
	}
	
}
