package org.patterns;

public class PatternTriangleLeft {

	public static void main(String[] args) {

		System.out.println("Printing Stars from LeftTriangle:");
		System.out.println("----------------------------------: ");
	
			for (int i = 0; i < 10; i++) { 
			for (int j = 2*(10 - i); j >= 0; j--) {				
				System.out.print(" "); 
			}			
			for (int j = 0; j <= i; j++) {				
				System.out.print("* ");
			}		
			System.out.println(); 
		}
		System.out.println();

	}
}