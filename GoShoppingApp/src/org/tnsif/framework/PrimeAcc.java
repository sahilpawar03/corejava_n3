package org.tnsif.framework;

public class PrimeAcc  extends ShopAcc{
				
	private boolean isPrime;
	private static final float deliveryCharges=0.0f;
	
	public PrimeAcc(int accno, String accnm, float charges, boolean isPrime) {
		super(accno, accnm, charges);
		this.isPrime=isPrime;
		
	}

	@Override
	public void bookProduct(float charges) {
		System.out.println("Account no: "+this.getAccno()+" "
	+"Account name: "+this.getAccnm()+" "
				+"Delivery Charges: "+this.getCharges()+this.deliveryCharges);
		
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
}
