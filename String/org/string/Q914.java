package org.string;

public class Q914 {

	public static void main(String[] args) {

		int vcount = 0, ccount = 0;

		String st = "Welcome";

		st = st.toLowerCase();

		for (int i = 0; i < st.length(); i++) {

			if (st.charAt(i) == 'a' || st.charAt(i) == 'e' || st.charAt(i) == 'i' || st.charAt(i) == 'o'
					|| st.charAt(i) == 'u') {
				vcount++;
			} else if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
				ccount++;
			}
		}
		System.out.println("Vowels = " + vcount);
		System.out.println("Consonants = " + ccount);
	}
}
