package org.array;

public class ArrayMultiDimensional {

	public static void main(String[] args) {

		System.out.println("Array MultiDimensional Syntax : ");
		System.out.println("---------------------------------");
		System.out.println("DataType variable[][] = new DataType[row][column]");

		int a[][] = new int[2][3];

		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;

		a[1][0] = 40;
		a[1][1] = 50;
		a[1][2] = 60;

		// to get a value

		System.out.println(a[0][1]);

		// normal for loop

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + " ");
			}

			System.out.println();

		}

		// Enhanced for loop

		for (int[] x : a) {
			for (int y : x) {

				System.out.print(y + " ");

			}

			System.out.println();

		}

	}

}
