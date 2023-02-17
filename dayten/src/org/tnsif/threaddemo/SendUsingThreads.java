package org.tnsif.threaddemo;
//Class for sending a message using Threads 
public class SendUsingThreads extends Thread  {

	 private String message; 
	  Sender sender; 

	  // Receives a message object and a string message to be sent 
	  SendUsingThreads(String msg, Sender object)
	  { 
	    message = msg;
	    sender = object; 
	  } 

	  public void run() 
	  { 
	    // This will ensure that only one thread sends a message at a time. 
		  synchronized(sender) 
		    { 
		      // synchronizing the send object 
		      sender.sendMessage(message);
		    } 
	  } 
}
