package org.arrayquestions;

public class ArrayQ1 {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
		int sum=0;
		
		for (int i = 1; i <= a.length; i++) {
			
			sum=(sum+i);
		}	
		
		System.out.println("The sum of the value is " +sum);
	}
}
