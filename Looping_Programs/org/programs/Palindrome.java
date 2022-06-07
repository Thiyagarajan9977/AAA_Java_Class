package org.programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		int a = 0, sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int input = sc.nextInt();

		int temp = input;

		while (input != 0) {

			a = input % 10;

			sum = sum * 10 + a;

			input /= 10;
		}

		if (sum == temp) {

			System.out.println("Number is Palindrome ");
		}
		else
			System.out.println("Not a palindrome");
	}
}
