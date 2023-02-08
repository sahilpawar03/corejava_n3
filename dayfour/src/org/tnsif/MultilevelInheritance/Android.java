package org.tnsif.MultilevelInheritance;

public class Android extends Nokia{
	private String version;
	public void accept()
	{
		System.out.println("The android version name is : "+version);
		
	}
	
	//constructor
	public Android() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Android(String version) {
		super();
		this.version = version;
	}
	
	//getter setter
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
