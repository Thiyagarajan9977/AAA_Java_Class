package org.patterns;

public class PatternTriangleRight {

	public static void main(String[] args) {
			// printing star Right Triangle pattern

		System.out.println("Printing Star Pattern :");
		System.out.println("-------------------------: ");

		for (int i = 1; i < 12; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("*" +" ");
			}
			System.out.println();
		}
	}
}
