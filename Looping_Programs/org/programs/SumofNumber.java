package org.programs;

import java.util.Scanner;

public class SumofNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int add = sc.nextInt();
		
		int n, sum=0;
		
			while(add>0) {
			
			n=add%10;
			
			sum =sum+n;
			
			add = add/10;			
		}
			System.out.println(sum);
		
			
	}
}



