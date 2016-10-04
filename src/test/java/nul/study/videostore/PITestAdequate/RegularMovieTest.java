package nul.study.videostore.PITestAdequate;

import org.junit.Before;
import org.junit.Test;

import nul.study.videostore.RegularMovie;
import nul.study.videostore.Movie;

import static org.junit.Assert.assertEquals;

public class RegularMovieTest {

	private Movie regularMovie;

	@Before
	public void setUp() {
		regularMovie = new RegularMovie("Scarface");
	}

	@Test
	public void testDetermineAmount() {
		int i;
		for (i = 1; i <= 2; i++)
			assertEquals(regularMovie.determineAmount(i), 2, 0.01);

		for (i = 3; i <= 8; i++)
			assertEquals(regularMovie.determineAmount(i), (i * 1.5) - 1.0, 0.01);
	}

	@Test
	public void testDetermineFrequentRenterPoints() {
		int i;
		for (i = -20; i <= 20; i++)
			assertEquals(regularMovie.determineFrequentRenterPoints(i), 1);
	}
}
