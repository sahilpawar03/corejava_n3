package org.tnsif.framework;

public abstract class BankAcc {
					
	//private data members
		private int accNo;
		private String accNm;
		private float accBal;
		
		//getter and setter
		public int getAccNo() {
			return accNo;
		}
		public void setAccNo(int accNo) {
			this.accNo = accNo;
		}
		public String getAccNm() {
			return accNm;
		}
		public void setAccNm(String accNm) {
			this.accNm = accNm;
		}
		public float getAccBal() {
			return accBal;
		}
		public void setAccBal(float accBal) {
			this.accBal = accBal;
		}
		
		//parameterize constructor
		public BankAcc(int accNo, String accNm, float accBal) {
			super();
			this.accNo = accNo;
			this.accNm = accNm;
			this.accBal = accBal;
		}
		
		//method
		abstract public void withdraw(float accBal);
		public void deposit(float accBal) {
			System.out.println("Account balance: "+accBal);
		}
		
		//tostring method
		@Override
		public String toString() {
			return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
		}
		
		
}
