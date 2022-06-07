package org.string;

import java.util.Scanner;

public class Q52 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email....");
		String at = sc.nextLine();

		boolean check = at.contains("@");
		

		if (check == true) {
			System.out.println("Valid Mail Address");
		} else {
			System.out.println("Invalid Mail Address");
		}
	}
}
