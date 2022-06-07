package org.cons;

public class Q2 extends Q1 {
	public Q2() {
		this(7);
		System.out.println("Q2 Default const...");
	}

	public Q2(int a) {
		super();
		System.out.println("Q2 Para const...");
	}

	public static void main(String[] args) {
		Q2 a = new Q2();
	}
}
