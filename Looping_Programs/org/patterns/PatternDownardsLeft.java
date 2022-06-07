package org.patterns;

public class PatternDownardsLeft {
	
	public static void main(String[] args) {
		int l = 10;
	for (int i = 10; i > 1; i--) { 
	for (int j = 2 * (l - i); j >= 0; j--) {				
		System.out.print(" "); 
	}			
	for (int j = 1; j < i; j++) {				
		System.out.print( "*" +" " );
	}		
	System.out.println(); 
}
	
	}
}