package org.scanner;

import java.util.Scanner;

public class Scan {
	
	
	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);

		System.out.println("Enter the age : " );
		byte b = s.nextByte();
		System.out.println("My age is " +b);
		
		System.out.println("Enter the atmPin");
		short atmPin = s.nextShort();
		System.out.println("My atmPin" +"\t" +atmPin);
		
		System.out.println("Enter the pincode");
		int Pincode = s.nextInt();
		System.out.println("My pincode is" +"\t" +Pincode);
		
		System.out.println("Enter the phone no");
		long Phone = s.nextLong();
		System.out.println("My phone no is" +"\t" +Phone);
		
		System.out.println("Enter the salary");
		float salary = s.nextFloat();
		System.out.println("My salary is" +"\t"+salary);
		
		System.out.println("Enter the double value");
		double doub = s.nextDouble();
		System.out.println("Double value is" +"\t"+doub);
		
		System.out.println("Enter the result");
		boolean Result = s.nextBoolean();
		System.out.println("Result is" +"\t"+Result);
		
		System.out.println("Enter the name ");
		String Name = s.next();
		System.out.println("My name is" +"\t"+Name);
		
		System.out.println("Enter the gender");
		char gender = s.next().charAt(0);
		System.out.println("Gender is" +"\t" +gender);
		
	}
	
}
