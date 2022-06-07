package org.datatypes;

public class DataType {
	
	//Data Types 
	
	/*		//1Byte = 8Bits
	//byte = -(2^n-) to ((2^n-1)-1)
	//		=128 to 127
	
//DataType DefaultValue			Size		WrapperClass	Digits
	
	//Byte 		0				1Byte		Byte			2				
	//Short		0				2Byte		Short			4
	//Int		0				4Byte		Integer			5-9
	//Long		0				8Byte		Long			10-16
		
	//Float		0.0				4Byte		Float			5-9
	//Double	0.0				8Byte		Double			10-16
	
	//Char		0				-			Character		'A' - Single Quotes with only one letter.
	//String	Null			-			String			"String" - Double Quotes with N no of words
	
	//Boolean	False			-			Boolean			only True/False
	
	//When assign Value for Long at the end should Mention l for value declaration
	
	//Example: long phoneNumber = 987654321l
	
	//When assign the value for Float at the end should mention the f for value declaration
	
	//Example: float salary = 54879.25f
	
	//Syntax:
	
	//DataType VariableName;
*/
	
	public static void main(String[] args) {
		
		byte age = 12;
		System.out.println("age");
		System.out.println("My age is :" +age );
		
		short atmPin = 2145;
		System.out.println(atmPin);
		System.out.println("The atm pin no is : " +atmPin);
		
		int phno = 987654321;
		System.out.println(phno);
		System.out.println(+phno +age +atmPin +"The ph no is:");
		
		long debitCard = 1234567890123l;
		System.out.println(debitCard);
		System.out.println(+debitCard +age +atmPin + "The debit card no:");
		
		float salary = 112456.21f;
		System.out.println(salary);
		System.out.println("The salary range is :" +salary);
		
		double doub = 254125412.2541;
		System.out.println(doub);
		System.out.println("The doule value is : " + doub);
		
		char gender = 'M';
		System.out.println(gender);
		System.out.println("The gender is : " +gender);
		
		String words = "This is my Sweet Home";
		System.out.println(words);
		System.out.println("The string value is :" 	+words + gender + doub + salary + atmPin);
			
		
	}

}
