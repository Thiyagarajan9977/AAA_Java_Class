package org.abstraction;

public abstract class RBIbank {

	public abstract void savings();
	
	public abstract void current();
	
	private void fixed() {
		
		System.out.println("Fixed 6%");	
	}
}
