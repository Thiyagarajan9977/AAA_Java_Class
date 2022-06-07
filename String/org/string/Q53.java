package org.string;

import java.util.Scanner;

public class Q53 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the phonenumber ....");
		String phone = sc.nextLine();
		
		boolean check = phone.contains("@");
		System.out.println(check);
	}
}
