package org.cons;

public class Q5 extends Q4 {
	public Q5() {
		this(9);
		System.out.println("5th Default Constructor");
	}

	public Q5(int b) {
		System.out.println("5th Para Constructor");
	}

	public static void main(String[] args) {
		Q5 t = new Q5();
	}
}
