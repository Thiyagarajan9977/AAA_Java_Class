package org.exception;

import java.util.Scanner;

public class InputMismatchExceptions {
	
	public static void main(String[] args) {
		
		//Input Mismatch Exceptions
		
		
		System.out.println("Input Mismatch Exceptions");
		System.out.println("-----------------------------");
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the text : ");
		int nextInt = s1.nextInt();
		System.out.println(nextInt);
		
	}
}
