package org.patterns;

public class PatternPyramidUpwards {

	public static void main(String[] args) {
		int m = 10;
		for (int i = 0; i < m; i++) {
			for (int j = (m - i); j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
