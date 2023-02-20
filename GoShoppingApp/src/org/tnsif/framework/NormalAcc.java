package org.tnsif.framework;

public abstract class NormalAcc extends ShopAcc{
					
	final private float deliveryCharges;
	public NormalAcc(int accno, String accnm, float charges,float deliveryCharges) {
		super(accno, accnm, charges);
		this.deliveryCharges=deliveryCharges;//class variable and constructor variable both same
	}
	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	@Override
	public void bookProduct(float charges) {
		System.out.println("Account no: "+this.getAccno()+" "
	+"Account name: "+this.getAccnm()+" "
				+"Delivery Charges: "+(charges+deliveryCharges));
		
	}
}
