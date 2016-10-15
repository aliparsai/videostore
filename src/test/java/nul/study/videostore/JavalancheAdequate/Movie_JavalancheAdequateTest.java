package nul.study.videostore.JavalancheAdequate;

import org.junit.Test;

import nul.study.videostore.ChildrensMovie;
import nul.study.videostore.Movie;
import nul.study.videostore.NewReleaseMovie;
import nul.study.videostore.RegularMovie;

public class Movie_JavalancheAdequateTest {

	private Movie movieInstance1;
	private Movie movieInstance2;
	private Movie movieInstance3;

	@Test(expected = Throwable.class)
	public void testChildrensMovie() throws Throwable {
		movieInstance1 = new ChildrensMovie("null");
		double d = movieInstance1.determineAmount(-8);

	}

	@Test(expected = Throwable.class)
	public void testRegularMovie() throws Throwable {

		movieInstance2 = new RegularMovie("null");
		double d = movieInstance2.determineAmount(-48);
	}

	@Test(expected = Throwable.class)
	public void testNewReleaseMovie() throws Throwable {
		movieInstance3 = new NewReleaseMovie("null");
		double d = movieInstance3.determineAmount(-248);

	}

}
