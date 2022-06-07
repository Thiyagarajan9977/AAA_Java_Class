package org.programs;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int a=0, b=1;
		
		System.out.print( +a +" " +b +" ");
		
		for (int i = 0; i <= 10; i++) {
						
			int j = a+b;  //Last Value + Resultant Value
			a=b;	//Last Value	
			b=j;	// Result Value
			
			System.out.print(b +" ");			
		}
	}

}
