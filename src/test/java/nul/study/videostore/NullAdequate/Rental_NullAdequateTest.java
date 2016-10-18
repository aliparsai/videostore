package nul.study.videostore.NullAdequate;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import nul.study.videostore.Rental;
import nul.study.videostore.Movie;
import nul.study.videostore.RegularMovie;



public class Rental_NullAdequateTest {


	@Test
	public void testMutant2()
	{
		Rental rental = new Rental(null, 42);
		Movie movie = rental.getMovie();
		assertTrue(movie instanceof RegularMovie);
		
	}
	
}
