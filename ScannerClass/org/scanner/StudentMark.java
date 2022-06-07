package org.scanner;

import java.util.Scanner;

	public class StudentMark {
		
			
	public static void main(String[] args) {
		
		Scanner stud = new Scanner(System.in);
		
		System.out.println("Enter the student ID : "  ); int StudID = stud.nextInt();
		
		System.out.println("Enter the student ID : "   +StudID);
		
		System.out.println("Enter the student Name : " );
		String StudName = stud.next();
		System.out.println("Enter the student Name  :" +StudName);
		
		System.out.println("Enter the Mark 1 : ");
		short Mark1 = stud.nextShort();
		System.out.println("Enter the Mark 1  :" +Mark1);
		
		System.out.println("Enter the Mark 2 :");
		short Mark2 = stud.nextShort();
		System.out.println("Enter the Mark 2   :" +Mark2);
		
		System.out.println("Enter the Mark 3 : ");
		short Mark3 = stud.nextShort();
		System.out.println("Enter the Mark 3    :" +Mark3);
		
		System.out.println("Enter the Mark 4 : ");
		short Mark4 = stud.nextShort();
		System.out.println("Enter the Mark 4     :" +Mark4);
		
		System.out.println("Enter the Mark 5 : ");
		short Mark5 = stud.nextShort();
		System.out.println("Enter the Mark 5   :" +Mark5);
		
		System.out.println("The total Mark is : " +(Mark1+Mark2+Mark3+Mark4+Mark5));
		
		float a = (Mark1+Mark2+Mark3+Mark4+Mark5) *100/500;
		
		System.out.println("The average is :" +a);
		
	}

}
