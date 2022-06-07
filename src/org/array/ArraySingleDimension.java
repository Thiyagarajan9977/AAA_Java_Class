package org.array;

public class ArraySingleDimension {

	public static void main(String[] args) {

		System.out.println("Array can store Multiple values in same dataTypes");
		System.out.println("Array working based on index");
		System.out.println(" ");

		System.out.println("Array Syntax : ");
		System.out.println("---------------");
		System.out.println("DataType variable[] = new DataType[size]");

		System.out.println("");
		System.out.println("Array Enhanced for loop/ for each : ");
		System.out.println("------------------------------------");
		System.out.println("(DataType variableName : storedVariable) {");
		System.out.println("}");
		System.out.println("");

		System.out.println("Program Outputs");
		System.out.println("----------------");

		int a[] = new int[5];
		a[0] = 50;
		a[1] = 80;
		a[2] = 90;
		a[3] = 60;
		a[4] = 30;

		int b[] = { 50, 80, 90, 60, 30 };

		// To find the length

		System.out.println("To find the length of array A");
		
		int len = a.length; // one way
		System.out.println(len);
		System.out.println("");
		System.out.println("To find the length of array B");
		System.out.println(b.length); //another way
		
//		To get particular value
		
		System.out.println("To get particular value of array");
		System.out.println(a[4]);
		System.out.println("");
		
//		Normal For loop
		
		System.out.println("Using Normal for loop to get array value");
		System.out.println("---------------------");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			}
		
//		Enhanced For loop
		
		System.out.println();
		System.out.println("Using Enahanced for loop to get array value");
		System.out.println("---------------------");
		for (int i : a) {
			System.out.println(i);
		}
		
		

	}

}
