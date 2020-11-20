package com.testsuite;

public class SomeMessages {
private String message;
    public SomeMessages(String message)
   {
	   this.message=message;
	
   }
    public String appendMessage()
    {
	    message="new"+message;
	    System.out.println(message);
	    return message;
    }
    public String printMessage()
    {
	   
	    System.out.println(message);
	    return message;
    }
	
}
