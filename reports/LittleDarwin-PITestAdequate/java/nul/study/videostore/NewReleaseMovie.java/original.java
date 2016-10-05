package nul.study.videostore;

public class NewReleaseMovie extends Movie {
	public NewReleaseMovie(String title) {
		super(title, NEW_RELEASE);
	}

	@Override
	public double determineAmount(int daysRented) throws Exception {
		double thisAmount = super.determineAmount(daysRented);
		return thisAmount + (daysRented * 3.0);
	}

	@Override
	public int determineFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}
}