package org.programs;

import java.util.Scanner;

public class CountOfNumber {

	public static void main(String[] args) {
		
		int i=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int add = sc.nextInt();
		int count=0;
		while(add>0) {
			
			add/=10;
			
			count++;
		}
		
		System.out.println("The total count is : " +count );
		}
	
}
