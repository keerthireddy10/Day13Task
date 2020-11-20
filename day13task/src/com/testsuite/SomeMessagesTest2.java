package com.testsuite;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SomeMessagesTest2 {


		String message="keerthi";
		SomeMessages sm=new SomeMessages(message);
		@Test
		public void testAppendMessage()
		{
			message="new"+message;
			assertEquals(message,sm.appendMessage());
		}
	}


