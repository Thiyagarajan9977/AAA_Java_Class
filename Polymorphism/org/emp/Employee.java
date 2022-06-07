package org.emp;

public class Employee {

	private void empID(int id) {
		System.out.println("Enter the EMP ID : ");
		System.out.println("Employee ID is " + id);
	}

	private void empID(String name) {
		System.out.println("Enter the EMP name : ");
		System.out.println("Employee name is :" + name);

	}

	private void empID(long empphone) {
		System.out.println("Enter the EMP Phone: ");
		System.out.println("Employee name is :" + empphone);

	}

	private void empID(double salary) {
		System.out.println("Enter the salary");
		System.out.println("Employee Salary is : " + salary);
	}

	private void empID(String city, long pincode, int roll) {
		System.out.println("Enter the city and pincode and roll");
		System.out.println("City - pincode - roll is : " + city + pincode + roll);

	}

	public static void main(String[] args) {
		Employee em = new Employee();
		em.empID(123456789);
		em.empID(" Thiyagarajan");
		em.empID(745872.32);
		em.empID("Cuddalore", 607002, 987654);
		em.empID(987654321);

	}

}
