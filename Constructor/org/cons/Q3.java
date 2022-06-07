package org.cons;

public class Q3 extends Q2 {

	public Q3() {
		this(13);
		System.out.println("Q3 Default const...");
	}

	public Q3(int a) {
		System.out.println("Q3 Para constructor...");
	}

	public static void main(String[] args) {
		Q3 a = new Q3();
	}
}
