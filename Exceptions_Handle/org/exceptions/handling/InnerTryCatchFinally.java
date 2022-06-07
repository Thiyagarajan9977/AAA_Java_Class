package org.exceptions.handling;

public class InnerTryCatchFinally {

	public static void main(String[] args) {

		System.out.println("Inner Try Catch Finally Exceptions");
		System.out.println("-----------------------------");

		System.out.println(1);
		System.out.println(2);
		System.out.println(3);

		try {
			System.out.println(4);

			try { // Inner Try
				String n = null;
				System.out.println(n.length());
			}

			catch (NullPointerException n) { // Inner Catch
				System.out.println("Inner catch block ");
			}

			finally { // Inner Finally
				System.out.println("i am in inner finally");
			}

		}

		catch (Exception e) {

			System.out.println("I am in outer finally");

		}

		finally {
			System.out.println("I am in outer final");
		}

		System.out.println(5);

	}

}
