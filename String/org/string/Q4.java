package org.string;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st name...");
		String input1 = sc.nextLine();
				
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the 2nd name...");
		String input2 = sc.nextLine();
		
		boolean check = input1.equals(input2);
		System.out.println(check);
	}
	
}
