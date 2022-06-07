package org.exceptions.handling;

// Here creating a new UsrDefException class 
// It's extends from exception parent class 
// because of writing own exception

public class UsrDefException extends Exception {

	@Override
	public String getMessage() {

		String msg = "Employee not available in unit ";

		return msg;
	}
}
