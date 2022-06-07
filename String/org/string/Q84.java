package org.string;

public class Q84 {
	
	public static void main(String[] args) {
		
		String st = "WelComeToJava";
		
		int upper = 0, lower =0;
		
		for (int i = 0; i < st.length(); i++) {

			if (st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {

				upper++;
			} else if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
				lower++;
			}
		}
		
		System.out.println("upper =" +upper);
		System.out.println("lower =" +lower);
	}

}
