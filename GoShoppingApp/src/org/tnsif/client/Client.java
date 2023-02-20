package org.tnsif.client;

import org.tnsif.application.GSNormalAcc;
import org.tnsif.application.GSPrimeAcc;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.ShopFactory;

public class Client {
					
	public static void main(String[] args) {
		ShopFactory f=new GSShopFactory();
		GSPrimeAcc p=new GSPrimeAcc(1234,"Sahil pawar",1050f,true);
		GSNormalAcc n=new GSNormalAcc(1234,"Sahil Pawar",1050f,60);
		System.out.println("Prime account: ");
		System.out.println(p);
	

		System.out.println("\nNon Prime account: ");
		System.out.println(n);
		n.bookProduct(n.getCharges());

	}
}
