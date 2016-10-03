package nul.study.videostore.NullAdequate;

import static org.junit.Assert.assertTrue;
import java.lang.reflect.Field;
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
	public void testMutant7()
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		movieInstance1 = new ChildrensMovie("null");
		movieInstance2 = new RegularMovie("null");
		movieInstance3 = new NewReleaseMovie("null");

		Field field = Movie.class.getDeclaredField("title");
		field.setAccessible(true);
		field.set(movieInstance1, null);
		field.set(movieInstance2, null);
		field.set(movieInstance3, null);

		try {
			movieInstance1.getTitle();
		} catch (NullPointerException e) {
			assertTrue(e.getMessage().equals("title is Null"));
		}
		try {
			movieInstance2.getTitle();
		} catch (NullPointerException e) {
			assertTrue(e.getMessage().equals("title is Null"));
		}
		try {
			movieInstance3.getTitle();
		} catch (NullPointerException e) {
			assertTrue(e.getMessage().equals("title is Null"));
		}

	}

	@Test
	public void testMutant8() {

		try {
			new ChildrensMovie(null);
		} catch (NullPointerException e) {
			assertTrue(e.getMessage().equals("title is Null"));
		}
		try {
			new NewReleaseMovie(null);
		} catch (NullPointerException e) {
			assertTrue(e.getMessage().equals("title is Null"));
		}
		try {
			new RegularMovie(null);
		} catch (NullPointerException e) {
			assertTrue(e.getMessage().equals("title is Null"));
		}

	}

}
