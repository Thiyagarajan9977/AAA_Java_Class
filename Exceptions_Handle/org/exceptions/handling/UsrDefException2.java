package org.exceptions.handling;

import java.util.Scanner;

public class UsrDefException2 extends UsrDefException {

	private static void empid() throws UsrDefException {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		String id = s.next();
		
		if (id.startsWith("13")) {
			System.out.println("valid ID");
		} else {
			System.out.println("Invalid ID");
			
			try {
				
				throw new UsrDefException();
				
			} catch (Exception e) {
				System.out.println("Handled");
				e.printStackTrace();
				
				String ss = e.getMessage();
				System.out.println(ss);
			}
			
			finally {
				System.out.println("I am in finally");
			}
			
			System.out.println("End");
		}
	}

	public static void main(String[] args) throws UsrDefException {
		empid();
	}
}
