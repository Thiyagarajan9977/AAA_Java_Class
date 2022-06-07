package org.string;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Q5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the emailID....");
		String email = sc.next();
		
		boolean check = email.contains("@");
		System.out.println(check);
		
	}
}
