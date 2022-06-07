package org.encaps;

public class Sample {
	
	public static void main(String[] args) {
		
		System.out.println("Encapsulation is used for hiding the data");
		System.out.println("Taking sample class creating e1 object for Employee");
		System.out.println("using e1 variable to calling the employee method");
		System.out.println("Assigning the value using setter");
		System.out.println("& taken the value using getter");
		System.out.println(" " );
		
		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("Thiyagu");
		e1.setPhno(987654321);
		int id = e1.getId();
		String id2 = e1.getName();
		System.out.println("Encapsulation Program Output :");
		System.out.println("------------------------------");
		System.out.println(id);
		System.out.println(id2);
		System.out.println(e1.getPhno());
	}
}
