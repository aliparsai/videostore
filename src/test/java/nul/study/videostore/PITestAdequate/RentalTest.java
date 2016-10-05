package nul.study.videostore.PITestAdequate;

import org.junit.Before;
import org.junit.Test;

import nul.study.videostore.ChildrensMovie;
import nul.study.videostore.Movie;
import nul.study.videostore.NewReleaseMovie;
import nul.study.videostore.RegularMovie;
import nul.study.videostore.Rental;

import static org.junit.Assert.assertEquals;

public class RentalTest {

	private Movie childrensMovie;
	private NewReleaseMovie newReleaseMovie;
	private RegularMovie regularMovie;
	private Rental rentalR1;
	private Rental rentalR2;
	private Rental rentalC1;
	private Rental rentalC2;
	private Rental rentalN1;
	private Rental rentalN2;

	@Before
	public void setUp() {
		childrensMovie = new ChildrensMovie("Jungle Book");
		regularMovie = new RegularMovie("Scarface");
		newReleaseMovie = new NewReleaseMovie("The Magnificient Seven");

		rentalR1 = new Rental(regularMovie, 1);
		rentalR2 = new Rental(regularMovie, 5);
		rentalC1 = new Rental(childrensMovie, 1);
		rentalC2 = new Rental(childrensMovie, 5);
		rentalN1 = new Rental(newReleaseMovie, 1);
		rentalN2 = new Rental(newReleaseMovie, 5);

	}

	@Test
	public void testDetermineAmount() throws Exception {

		assertEquals(rentalR1.determineAmount(), regularMovie.determineAmount(1), 0.001);
		assertEquals(rentalR2.determineAmount(), regularMovie.determineAmount(5), 0.001);
		assertEquals(rentalC1.determineAmount(), childrensMovie.determineAmount(1), 0.001);
		assertEquals(rentalC2.determineAmount(), childrensMovie.determineAmount(5), 0.001);
		assertEquals(rentalN1.determineAmount(), newReleaseMovie.determineAmount(1), 0.001);
		assertEquals(rentalN2.determineAmount(), newReleaseMovie.determineAmount(5), 0.001);

	}

	@Test
	public void testDetermineFrequentRenterPoints() {

		assertEquals(rentalR1.determineFrequentRenterPoints(), regularMovie.determineFrequentRenterPoints(1));
		assertEquals(rentalR2.determineFrequentRenterPoints(), regularMovie.determineFrequentRenterPoints(5));
		assertEquals(rentalC1.determineFrequentRenterPoints(), childrensMovie.determineFrequentRenterPoints(1));
		assertEquals(rentalC2.determineFrequentRenterPoints(), childrensMovie.determineFrequentRenterPoints(5));
		assertEquals(rentalN1.determineFrequentRenterPoints(), newReleaseMovie.determineFrequentRenterPoints(1));
		assertEquals(rentalN2.determineFrequentRenterPoints(), newReleaseMovie.determineFrequentRenterPoints(5));

	}
}
