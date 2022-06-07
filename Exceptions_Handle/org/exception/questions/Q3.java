package org.exception.questions;

public class Q3 {
	
	 public static void main(String[] args)
     {
       try
     {
      System.out.printf("1");
       int data = 5 / 0;
     }
    catch(ArithmeticException e)
     {
    	
    System.out.printf("2");
    e.printStackTrace();
    
    System.exit(0);
      }
    finally
       {
     System.out.printf("3");
       }
    System.out.printf("4");
      }

}
