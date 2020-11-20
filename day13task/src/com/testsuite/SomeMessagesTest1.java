package com.testsuite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeMessagesTest1 {

	String message="keerthi";
	SomeMessages sm=new SomeMessages(message);
	@Test
	public void testPrintMessage()
	{
		assertEquals(message,sm.printMessage());
	}
}
