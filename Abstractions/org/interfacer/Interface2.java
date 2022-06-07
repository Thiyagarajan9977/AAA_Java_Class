package org.interfacer;

public class Interface2 implements Interfacef {

	@Override
	public void savings() {
		System.out.println("Savings bank is 6 %");	
	}

	@Override
	public void current() {
		System.out.println("Current Account is 5% ");
		
	}

	@Override
	public void deposit() {
		System.out.println("Deposit account is 12%");
		
	}
	
	public static void main(String[] args) {
		Interface2 in = new Interface2();
		in.savings();
		in.current();
		in.deposit();
	}

}
