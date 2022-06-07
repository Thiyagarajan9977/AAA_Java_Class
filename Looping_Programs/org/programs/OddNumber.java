package org.programs;

import java.util.Scanner;

public class OddNumber {

	public static void main(String[] args) {

		Scanner odd = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		short a = odd.nextShort();		
		if (a % 2 == 0) {

			System.out.println(" It's an Even Number");
		}

		else {

			System.out.println("It's an odd Number ");
		}
	}
}
