package org.string;

import java.util.Scanner;

public class Q8 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name....");
		String name = sc.nextLine();
		
		System.out.println("Upper to Lower");
		
		String lc = name.toLowerCase();
		System.out.println(lc);
		
		System.out.println();
		
		System.out.println("Lower to Upper");
		
		String lc1 = name.toUpperCase();			
		System.out.println(lc1);
		
	}

}
