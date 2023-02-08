package org.tnsif.MultilevelInheritance;

public class Iphone extends Android {
	private String slottype;
	public void slot()
	{
		System.out.println("Slot type is : "+slottype);
	}
	public Iphone() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*public Iphone(String slottype) {
		super();
		this.slottype = slottype;
	}*/
	
	public String getSlottype() {
		return slottype;
	}
	public Iphone(String version, String slottype) {
		super(version);
		this.slottype = slottype;
	}
	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	@Override
	public String toString() {
		return "Iphone [slottype=" + slottype + ", getSlottype()=" + getSlottype() + ", getVersion()=" + getVersion()
				+ ", getModelno()=" + getModelno() + "]";
	}
	
	
	
}
	

