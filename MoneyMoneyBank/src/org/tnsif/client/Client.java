package org.tnsif.client;

import org.tnsif.application.MMBankFactory;
import org.tnsif.application.MMCurrentAcc;
import org.tnsif.application.MMSavingAcc;
import org.tnsif.framework.BankFactory;
import org.tnsif.framework.CurrentAcc;
import org.tnsif.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory f = new MMBankFactory();
		MMSavingAcc s = new MMSavingAcc(123, "sam", 20000.0f, true);
		MMCurrentAcc c = new MMCurrentAcc(234, "sam", 20000.0f, 40000.0f);
		
		System.out.println("Savings Account:");
		System.out.println(s);
		s.withdraw(4500); 		//withdraws 4500 from accBalance
		
		System.out.println();
		
		System.out.println("Current Account:");
		System.out.println(c);
		s.withdraw(5000);		//withdraws 5000 from accBalance
		
		
		
		 
		f.getNewSavingAcc(456, "sam", 45000.0f, true);
		f.getNewCurrentAcc(552, "sam", 50000.0f, 80000.0f);
		
		
		
		 
		
		
	}

}
