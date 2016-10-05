package nul.study.videostore.NullAdequate;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import nul.study.videostore.Customer;


public class Customer_NullAdequateTest {

		
	@Test
	public void testMutant7()
	{
		try {
			new Customer(null);
		} catch (NullPointerException e) {
			assertTrue(e.getMessage().equals("name is Null"));
		}
	}
	
}
