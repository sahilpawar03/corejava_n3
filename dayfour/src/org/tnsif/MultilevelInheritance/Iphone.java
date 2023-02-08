package org.tnsif.MultilevelInheritance;

public class Iphone extends Android {
		
	private String slottype;
	private void slot() 
	{
		System.out.println("Slot type is "+ slottype);
	}
	public String getSlottype() {
		return slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	
	
	//parameterized constructor
	public IPhone(int modelno,String slottype, String version) {
		super(modelno, version);
		this.slottype = slottype;
	}
	//default constructor
	public IPhone() {
		super();
		
	}
	@Override
	public String toString() {
		return "IPhone [slottype=" + slottype + ", getVersion()=" + getVersion() + ", getModelno()=" + getModelno()
				+ "]";
	}
	
	
	
	
	}
	

