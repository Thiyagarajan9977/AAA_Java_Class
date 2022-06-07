package org.exceptions.handling;

public class TryCatchFinallyExceptions {

	public static void main(String[] args) {

		System.out.println("Try Catch Finally Exceptions");
		System.out.println("-----------------------------");

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);

		try {
			System.out.println(4 / 0);

		}

		catch (ArithmeticException e) {
			System.out.println("Don't / 0");
		}

		catch (NullPointerException f) {
			System.out.println("Null");

		}

		catch (Exception e) {

			System.out.println("All Handled");

		}

		System.out.println(5);

	}

}
