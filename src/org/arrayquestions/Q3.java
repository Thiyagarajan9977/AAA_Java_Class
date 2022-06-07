package org.arrayquestions;

public class Q3 {

	public static void main(String[] args) {

		int arr[] = {1,1,2,3,2,3};
		int len = arr.length;
		int temp[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
				if (arr[i] != arr[i+1]) {
				temp[j++] = arr[i]; // Iteration check up to <len-1
			}						// so last value didn't taken
		}
		temp[j++] = arr[len - 1]; // To print last iteration use like this
		for (int k = 0; k < j; k++) {
			System.out.println(temp[k]);
		}
	}
}     


