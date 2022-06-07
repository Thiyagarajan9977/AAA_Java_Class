package org.string;

import java.util.Scanner;

public class Q74 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email....");
		String email = sc.nextLine();
		
		if(email.contains("gmail")) {
			
			System.out.println("Gmail is Present");
		}
		else {
			
			System.out.println("Enter the valid gmail");
		}
		
		String replac = email.replace("gmail", "yahoo");
		System.out.println(replac);
	}

}
