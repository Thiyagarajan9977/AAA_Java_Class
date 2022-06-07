package org.programs;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {

		Scanner ages = new Scanner(System.in);
		System.out.println("Enter the age : ");
		short age = ages.nextShort();
		if (age >= 18) {
			System.out.println("Eligible to Vote");
		}

		else {
			System.out.println("Not Eligble to vote");
		}
	}
}
