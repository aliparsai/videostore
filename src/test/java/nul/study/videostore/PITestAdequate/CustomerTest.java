package nul.study.videostore.PITestAdequate;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import nul.study.videostore.ChildrensMovie;
import nul.study.videostore.Customer;
import nul.study.videostore.NewReleaseMovie;
import nul.study.videostore.Rental;

public class CustomerTest {

	private Customer customer;

	@Before
	public void setUp() {
		customer = new Customer("Fred");
	}

	@Test
	public void testMultipleChildrensStatement() {
		customer.addRental(new Rental(new ChildrensMovie("The Tigger Movie"), 3));
		customer.addRental(new Rental(new ChildrensMovie("Jungle Book"), 5));

		assertEquals(
				"Rental Record for Fred\n\tThe Tigger Movie\t1.5\n\tJungle Book\t4.5\nYou owed 6.0\nYou earned 2 frequent renter points\n",
				customer.statement());
	}

	@Test
	public void testSingleNewReleaseStatement() {
		customer.addRental(new Rental(new NewReleaseMovie("The Cell"), 1));
		assertEquals("Rental Record for Fred\n\tThe Cell\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n",
				customer.statement());
	}

}
