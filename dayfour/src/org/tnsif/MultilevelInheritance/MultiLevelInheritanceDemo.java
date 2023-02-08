package org.tnsif.MultilevelInheritance;

import java.util.Scanner;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the modelno, version, slottype");
		int modelno=sc.nextInt();
		sc.nextLine();
		String version=sc.nextLine();
		String slottype=sc.nextLine();
		//Iphone i=new Iphone();
		Iphone i1=new Iphone();
		i1.setModelno(modelno);
		i1.setSlottype(slottype);
		i1.setVersion(version);
		i1.slot();
		i1.accept();
		i1.display();
		System.out.println(i1);
		

	}
	}


