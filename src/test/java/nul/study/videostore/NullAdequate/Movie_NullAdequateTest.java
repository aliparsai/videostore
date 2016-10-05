package nul.study.videostore.NullAdequate;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import nul.study.videostore.ChildrensMovie;
import nul.study.videostore.Movie;
import nul.study.videostore.NewReleaseMovie;
import nul.study.videostore.RegularMovie;

public class Movie_NullAdequateTest {

	private Movie movieInstance1;
	private Movie movieInstance2;
	private Movie movieInstance3;

	@Test
	public void testMutant2() {
		movieInstance1 = new ChildrensMovie("null");
		movieInstance2 = new RegularMovie("null");
		movieInstance3 = new NewReleaseMovie("null");

		try {
			movieInstance1.determineAmount(-8);
		} catch (Exception e) {
			assertTrue(e.getMessage().equals("Invalid value for daysRented."));
		}
		try {
			movieInstance2.determineAmount(-48);
		} catch (Exception e) {
			assertTrue(e.getMessage().equals("Invalid value for daysRented."));
		}
		try {
			movieInstance3.determineAmount(-248);
		} catch (Exception e) {
			assertTrue(e.getMessage().equals("Invalid value for daysRented."));
		}

	}

}
