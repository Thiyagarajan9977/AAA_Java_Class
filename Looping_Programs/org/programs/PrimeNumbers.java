package org.programs;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Input : ");
		int j = s.nextInt();
		
		boolean isPrime = true;
		for (int i = 2; i < j; i++) {
			
			// condition for non-prime number
			
			if (j % i == 0) {
				isPrime = false;				
				break;
			}
		}
		if (isPrime==true)
			
			System.out.println("It's a prime number");
		else
			System.out.println("It's not a prime number");
	}
}