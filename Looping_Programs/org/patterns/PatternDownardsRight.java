package org.patterns;

public class PatternDownardsRight {
	
	public static void main(String[] args) {

		// Printing Star from downwards
		System.out.println("Printing Star Pattern downwards:");
		System.out.println("----------------------------------: ");

		for (int i = 10; i > 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
