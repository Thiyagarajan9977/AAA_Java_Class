package org.string;

public class Strings {
	
	public static void main(String[] args) {
		
		String s = "welcome";
		
		//check the length of string
		
		int ln = s.length();
		System.out.println(ln);
		
		//check the string is empty of not
		
		boolean em = s.isEmpty();
		System.out.println(em);
		
		//get a particular char
		
		char ch = s.charAt(2); // index start with 0
		System.out.println(ch);
		
		//get a index
		
		int io = s.indexOf('c'); // print the char index value
		System.out.println(io);
		
		//last index
		
		int li = s.lastIndexOf('m');
		System.out.println(li);
		
		//starting with 
		
		System.out.println("Starting with String");
		System.out.println("*******************");
		
		String s2 = "welcome to java";
		boolean sw = s2.startsWith("welcome");
		System.out.println(s2);
		System.out.println(s2.startsWith("w"));
		System.out.println(s2.startsWith("welcome"));
		System.out.println(s2.startsWith("come"));
		
		System.out.println("Ending with String");
		System.out.println("*******************");
		
		boolean ew = s2.endsWith("java");
		System.out.println(s2);
		System.out.println(s2.endsWith("ja"));
		System.out.println(s2.endsWith("va"));
		System.out.println(s2.endsWith("java"));
		
		//contains
		
		System.out.println("String contains");
		System.out.println("*******************");
		
		boolean ct = s2.contains("come");
		System.out.println(s2);
		System.out.println(s2.contains("we"));
		System.out.println(s2.contains("to"));
		System.out.println(s2.contains("java"));

		//Upper and Lower
		
		System.out.println("String Upper to Lower Case");
		System.out.println("**************************");
		
		String s3 = "welcome";
		
		String uc = s3.toUpperCase();
		System.out.println(uc);
		
		String s4 = "WELCOME";
		
		String lc = s4.toLowerCase();
		System.out.println(lc);
		
		//Compare two string
		
		String s5 = "Hello";
		String s6 = "HELLO";
		
		boolean bo = s6.equals(s5);
		System.out.println(bo);
		
		//Without case
		
		//Ignore Case
		
		boolean eqi = s6.equalsIgnoreCase(s5);
		System.out.println(eqi);
		
		//concat
		
		String add = s4.concat(s5);
		System.out.println(add);
		
		// Replace 
		
		String s7= "Hello";
		String rp = s7.replace('e', 'o');
		System.out.println(rp);
		
		// Replace All
		
		String s8 = "Welcome to java";
		String ra = s8.replaceAll("to", "output");
		System.out.println(ra);
		
		// Trim - Remove
		
		String s9 = "             Welcome to Java              ";
		System.out.println(s9);
		String tr = s9.trim();
		System.out.println(tr);
		
		//Substring
		
		System.out.println("***************Substring*************");
		String s10 = "Welcome to Java";
		String sst = s10.substring(5);
		System.out.println(sst);
		
		//Another 
		
		String st = s10.substring(5, 13);
		System.out.println(st);
		
		String s11 = "Welcome to Java";
		String[] sp = s11.split("o");
		for (String x : sp) {
			System.out.println(x);
		}
	}	
}
