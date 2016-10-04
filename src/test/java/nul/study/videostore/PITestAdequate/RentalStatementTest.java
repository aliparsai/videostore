package nul.study.videostore.PITestAdequate;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

import nul.study.videostore.ChildrensMovie;
import nul.study.videostore.RegularMovie;
import nul.study.videostore.Rental;
import nul.study.videostore.RentalStatement;

public class RentalStatementTest {

	private RentalStatement rentalStatement;

	@Before
	public void setUp() throws Exception {
		rentalStatement = new RentalStatement("Johnny");

	}

	@Test
	public void testRentalStatement() {

		assertEquals(rentalStatement.getName(), "Johnny");

		Rental rental1 = new Rental(new ChildrensMovie("Jungle Book"), 3);
		Rental rental2 = new Rental(new RegularMovie("Scarface"), 2);

		rentalStatement.addRental(rental1);
		rentalStatement.addRental(rental2);

		String statement = rentalStatement.makeRentalStatement();
		String actualStatement1;
		String actualStatement2;
		actualStatement1 = "Rental Record for Johnny\n";
		actualStatement1 += "\t" + rental1.getMovie().getTitle() + "\t" + rental1.determineAmount() + "\n";
		actualStatement1 += "\t" + rental2.getMovie().getTitle() + "\t" + rental2.determineAmount() + "\n";
		actualStatement1 += "You owed " + (rental1.determineAmount() + rental2.determineAmount()) + "\n" + "You earned "
				+ (rental1.determineFrequentRenterPoints() + rental2.determineFrequentRenterPoints())
				+ " frequent renter points\n";
		actualStatement2 = "Rental Record for Johnny\n";
		actualStatement2 += "\t" + rental2.getMovie().getTitle() + "\t" + rental2.determineAmount() + "\n";
		actualStatement2 += "\t" + rental1.getMovie().getTitle() + "\t" + rental1.determineAmount() + "\n";
		actualStatement2 += "You owed " + (rental1.determineAmount() + rental2.determineAmount()) + "\n" + "You earned "
				+ (rental1.determineFrequentRenterPoints() + rental2.determineFrequentRenterPoints())
				+ " frequent renter points\n";

		assertEquals(rentalStatement.getAmountOwed(), rental1.determineAmount() + rental2.determineAmount(), 0.001);
		assertEquals(rentalStatement.getFrequentRenterPoints(),
				rental1.determineFrequentRenterPoints() + rental2.determineFrequentRenterPoints());
		assertTrue(statement.equals(actualStatement1) || statement.equals(actualStatement2));
		
		statement = rentalStatement.makeRentalStatement();
		
		assertEquals(rentalStatement.getAmountOwed(), rental1.determineAmount() + rental2.determineAmount(), 0.001);
		assertEquals(rentalStatement.getFrequentRenterPoints(),
				rental1.determineFrequentRenterPoints() + rental2.determineFrequentRenterPoints());
		assertTrue(statement.equals(actualStatement1) || statement.equals(actualStatement2));
		

	}

}
