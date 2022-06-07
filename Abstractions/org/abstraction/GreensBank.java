package org.abstraction;

public class GreensBank extends RBIbank {

	@Override
	public void savings() {
		System.out.println("Savings % is 5.4");
	}

	@Override
	public void current() {
		System.out.println("Current % is 7.4");
	}
	
	private void deposit() {
		System.out.println("Deposit % is 6");
	}
	
	public static void main(String[] args) {
		GreensBank gr = new GreensBank();
		gr.deposit();
		gr.current();
		gr.savings();
		
	}
}
