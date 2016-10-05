package nul.study.videostore.PITestAdequate;

import org.junit.Before;
import org.junit.Test;

import nul.study.videostore.NewReleaseMovie;
import nul.study.videostore.Movie;

import static org.junit.Assert.assertEquals;

public class NewReleaseMovieTest {

	private Movie newReleaseMovie;

	@Before
	public void setUp() {
		newReleaseMovie = new NewReleaseMovie("The Magnificient Seven");
	}

	@Test
	public void testDetermineAmount() throws Exception {
		int i;
		for (i = 1; i <= 25; i++)
			assertEquals(newReleaseMovie.determineAmount(i), 3.0 * i, 0.01);
	}

	@Test
	public void testDetermineFrequentRenterPoints() {
		int i;
		assertEquals(newReleaseMovie.determineFrequentRenterPoints(1), 1);
		for (i = 2; i <= 20; i++)
			assertEquals(newReleaseMovie.determineFrequentRenterPoints(i), 2);
	}
}
