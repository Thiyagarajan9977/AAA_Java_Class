package org.exceptions.handling;

public class TryFinally {

	public static void main(String[] args) {

		System.out.println("Try Finally Exceptions");
		System.out.println("-----------------------------");

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);

		try {
			System.out.println(4 / 0);
		}

		finally {

			System.out.println("I am finally");
		}

		System.out.println(5);

	}

}
