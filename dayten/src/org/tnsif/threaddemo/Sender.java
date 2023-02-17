package org.tnsif.threaddemo;
//Program to demonstrate on Sunchronization
 class Sender {
	 	
	 public void sendMessage(String message)
	  { 
	    System.out.println("\nSending "  + message);
	    try
	    { 
	      Thread.sleep(1000); 
	    } 
	    catch (Exception e) 
	    { 
	      System.out.println("Thread interrupted."); 
	    } 
	    System.out.println("\n" +message+ "Sent");
	  }
	
}
