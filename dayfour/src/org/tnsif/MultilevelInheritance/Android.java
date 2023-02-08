package org.tnsif.MultilevelInheritance;

public class Android extends Nokia{
	
	private String version;
	private void accept() {
		System.out.println("The Android version is "+ version);
	}
	
	//geter and setter
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	//default constructor
	public Android() {
		super();
		
	}

	//parameterized constructor
	public Android(int modelno, String version) {
		super(modelno);
		this.version = version;
		
	}
	
}
