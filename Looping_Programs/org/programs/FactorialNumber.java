package org.programs;

import java.util.Scanner;

public class FactorialNumber {
	
	public static void main(String[] args) {
		int j=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int Num = s.nextInt();

		for (int i = 1; i <= Num; i++) {
			j=j*i;			
		}
		
		System.out.println(j);	
	}
}
