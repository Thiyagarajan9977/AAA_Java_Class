package org.programs;

public class SumOdd {

	public static void main(String[] args) {

		int j = 0;

		for (int i = 0; i <= 10; i++) {

			if (i % 2 != 0) {

				j = j + i;
				
				}		
		}

		System.out.println(j);
	}
}
