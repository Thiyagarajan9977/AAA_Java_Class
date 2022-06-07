package org.programs;

import java.util.Scanner;

public class ArmstrongNumbers {
	
	 public static void main(String[] args)  {  
		    
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the value :");
		 int n = sc.nextInt();		 
		 
		 int c=0, a,temp;  
		 	//It is the number to check armstrong
		    
		    temp=n;  
		   
		    while(n>0)  
		    {  
		    
		    	a=n%10;  
		    			n=n/10;  
		    					c=c+(a*a*a);  
		    } 
		    
		    if(temp==c)  
		    System.out.println("is a armstrong number");   
		    else  
		        System.out.println("is not a armstrong number");   
		   } 

}
