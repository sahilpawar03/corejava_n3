package org.tnsif.framework;

public abstract class SavingAcc  extends BankAcc {
				
	private boolean isSalaried;
	private static final float minibal=0.0f;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried=isSalaried;
		
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
	
	public void withdraw(float accBal) {
		System.out.println("Account no: "+this.getAccNo()+" "
	+"Account name: "+this.getAccNm()+" "
				+"Account balance: "+this.getAccBal()+this.minibal);
		
	}
}
