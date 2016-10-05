package nul.study.videostore.PITestAdequate;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ChildrensMovieTest.class, CustomerTest.class, NewReleaseMovieTest.class, RegularMovieTest.class,
		RentalStatementTest.class, RentalTest.class })
public class AllTests {

}
