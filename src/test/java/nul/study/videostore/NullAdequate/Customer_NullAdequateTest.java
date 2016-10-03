package nul.study.videostore.NullAdequate;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import nul.study.videostore.Customer;


public class Customer_NullAdequateTest {

	private Customer customerInstance;

	@Before 
	public void setUp() {
		customerInstance = new Customer("Ali");
	}

	@Test
	public void testMutant13() {
		try {
			customerInstance.addRental(null);
		} catch (NullPointerException e) {
			assertTrue(e.getMessage().equals("rental object is Null"));
		}

	}
	
	@Test
	public void testMutant14()
	{
		try {
			new Customer(null);
		} catch (NullPointerException e) {
			assertTrue(e.getMessage().equals("name is Null"));
		}
	}
	
}
