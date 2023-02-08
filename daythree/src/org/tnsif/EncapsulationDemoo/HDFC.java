package org.tnsif.EncapsulationDemoo;

public class HDFC {

private int pin;
	
	void accept() {
		System.out.println("ATM pin is : " + pin);
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
}
