package org.programs;

public class PrimeNumbers2 {

	public static void main(String[] args) {

		for (int i = 2; i <= 17; i++) {

			for (int j = 2; j <= i; j++) {

				if (j == i)		// when number divisible by same number 

				{

					System.out.println(i); // print the i
				}

				if (i % j == 0) {
					break;
				}

			}
		}
	}
}
