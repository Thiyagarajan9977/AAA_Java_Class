package org.string;

import java.util.Arrays;
import java.util.List;

public class Q916 {

	static String remVowel(String str) {

		Character Vowels[] = { 'a', 'e', 'i', 'o', 'u' };

		List<Character> al = Arrays.asList(Vowels);

		StringBuffer sb = new StringBuffer(str);

		for (int i = 0; i < sb.length(); i++) {

			if (al.contains(sb.charAt(i))) {

				sb.replace(i, i + 1, "@");
				i--;
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String str = "Welcome";
		System.out.println(remVowel(str));
	}

}
