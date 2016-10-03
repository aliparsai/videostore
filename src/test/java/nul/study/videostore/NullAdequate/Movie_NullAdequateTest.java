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
	public void testMutant7() {
		movieInstance1 = new ChildrensMovie("null");
		movieInstance2 = new RegularMovie("null");
		movieInstance3 = new NewReleaseMovie("null");

		try {
			Field field1 = ChildrensMovie.class.getDeclaredField("title");
			Field field2 = RegularMovie.class.getDeclaredField("title");
			Field field3 = NewReleaseMovie.class.getDeclaredField("title");
			field1.setAccessible(true);
			field2.setAccessible(true);
			field3.setAccessible(true);
			try {
				field1.set(movieInstance1, null);
				field2.set(movieInstance2, null);
				field3.set(movieInstance3, null);

			} catch (IllegalArgumentException | IllegalAccessException e) {
				assert false;
			}

		} catch (NoSuchFieldException | SecurityException e1) {
			assert false;
		}

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
