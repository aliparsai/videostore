package nul.study.videostore.NullAdequate;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import nul.study.videostore.Rental;


public class Rental_NullAdequateTest {


	@Test
	public void testMutant5()
	{
		try {
			new Rental(null, 42);
		} catch (NullPointerException e) {
			assertTrue(e.getMessage().equals("movie is Null"));
		}
	}
	
}
