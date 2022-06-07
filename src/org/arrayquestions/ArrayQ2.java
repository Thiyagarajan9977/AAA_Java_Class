package org.arrayquestions;

public class ArrayQ2 {

	public static void main(String[] args) {

		float  a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, sum=0, average= 0;
		
		float total = a.length;

		for (int i = 0; i <= total; i++) {

			sum = sum + i;
		}

		average = sum / total;

		System.out.println(" The avarage value is " +average);

	}

}
