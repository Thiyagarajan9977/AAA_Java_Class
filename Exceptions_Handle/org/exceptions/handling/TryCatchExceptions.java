package org.exceptions.handling;

public class TryCatchExceptions {

	public static void main(String[] args) {

		System.out.println("TryCatch Exceptions");
		System.out.println("----------------------");

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);

		try {
			System.out.println(4 / 0);

		} catch (ArithmeticException e) {
			System.out.println("Don't / 0");
		}

		System.out.println(5);

	}

}
