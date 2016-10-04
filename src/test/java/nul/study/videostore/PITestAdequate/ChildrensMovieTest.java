package nul.study.videostore.PITestAdequate;

import org.junit.Before;
import org.junit.Test;

import nul.study.videostore.ChildrensMovie;
import nul.study.videostore.Movie;

import static org.junit.Assert.assertEquals;

public class ChildrensMovieTest {

	private Movie childrensMovie;

	@Before
	public void setUp() {
		childrensMovie = new ChildrensMovie("Jungle Book");
	}

	@Test
	public void testDetermineAmount() {
		int i;
		for (i = 1; i <= 3; i++)
			assertEquals(childrensMovie.determineAmount(i), 1.5, 0.01);

		for (i = 4; i <= 8; i++)
			assertEquals(childrensMovie.determineAmount(i), (i * 1.5) - 3.0, 0.01);
	}

	@Test
	public void testDetermineFrequentRenterPoints() {
		int i;
		for (i = -20; i <= 20; i++)
			assertEquals(childrensMovie.determineFrequentRenterPoints(i), 1);
	}
}
