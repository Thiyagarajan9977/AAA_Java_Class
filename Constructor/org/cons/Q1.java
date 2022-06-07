package org.cons;

public class Q1 {

	public Q1() {
		this("Java");
		System.out.println("Q1 Default const...");
	}

	public Q1(int id) {
		this(3456.5678f);
		System.out.println(id);
	}

	public Q1(String name) {
		this(12);
		System.out.println(name);
	}

	public Q1(float sal) {
		System.out.println(sal);
	}

	public static void main(String[] args) {
		Q1 a = new Q1();
	}
}
