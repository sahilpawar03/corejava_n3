package org.tnsif.staticdemo;

public class StaticVariableExecutor {

	public static void main(String[] args) {
				
		StaticVariable s=new StaticVariable("Sahil Pawar");
		System.out.println(s);
		
		
		//use classname.variable to call static variable
		System.out.println(StaticVariable.companyName);
		}

	}


