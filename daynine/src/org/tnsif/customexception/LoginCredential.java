package org.tnsif.customexception;
//program to demonstrate custom exceptions
//using extends Exception
public class LoginCredential extends Exception {
		
	private String str;

	public LoginCredential(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredential [str=" + str + "]";
	}

}
