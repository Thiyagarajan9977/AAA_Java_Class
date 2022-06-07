package org.string;

public class Q915 {

	public static void main(String[] args) {

		String st = "Welcome To Java class @123";

		int caps = 0, small = 0, number = 0, special = 0;

		for (int i = 0; i < st.length(); i++) {

			if (st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {

				caps++;
			} else if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
				small++;
			}

			else if (st.charAt(i) >= '0' && st.charAt(i) <= '9') {
				number++;
			} else {
				special++;
			}
		}
		System.out.println("caps = " + caps);
		System.out.println("small = " + small);
		System.out.println("number = " + number);
		System.out.println("special = " + special);

	}
}
