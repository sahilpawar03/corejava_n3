package org.tnsif.application;

import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class MMBankFactory  extends BankFactory {
					
	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc(accNo, accNm, accBal,isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc  c=new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return c;
	}

}
