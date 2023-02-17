package org.tnsif.threaddemo;
//Driver class 
public class SenderExecutor {

	public static void main(String[] args) {
		{ 
		    Sender sender = new Sender(); 
		    SendUsingThreads sender1 = new SendUsingThreads( "C2TC" , sender);
		    SendUsingThreads sender2 =  new SendUsingThreads( "Welcome to TNS India", sender);

		    // Start two threads of SendUsingThreads type 
		    sender1.start(); 
		    sender2.start(); 
		    // wait for threads to end 
		    try
		    { 
		      sender1.join(); 
		      sender2.join(); 
		    } 
		    catch(Exception e) 
		    { 
		      System.out.println("Interrupted"); 
		    } 
		  

		  }
		

	}

}
