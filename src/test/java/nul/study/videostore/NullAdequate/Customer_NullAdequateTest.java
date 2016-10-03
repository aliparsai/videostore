package nul.study.videostore.NullAdequate;

import org.junit.Before;
import org.junit.Test;

import nul.study.videostore.Customer;


public class Customer_NullAdequateTest {

	private Customer customerInstance;

	@Before 
	public void setUp() {
		customerInstance = new Customer("Ali");
	}
	
	@Test(expected=NullPointerException.class)
	public void testMutant13()
	{
		customerInstance.addRental(null);
	}
	
	@Test(expected=NullPointerException.class)
	public void testMutant14()
	{
		new Customer(null);
	}
	
}
