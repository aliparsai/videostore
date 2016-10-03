package nul.study.videostore;

public class Rental {

	public Rental(Movie movie, int daysRented) {
		if (movie == null)
			throw new NullPointerException("movie is Null");

		this.movie = movie;
		this.daysRented = daysRented;
	}

	public int getDaysRented() {
		return daysRented;
	}

	public Movie getMovie() {
		return movie;
	}

	private Movie movie;
	private int daysRented;

	public double determineAmount() {
		return movie.determineAmount(daysRented);
	}

	public int determineFrequentRenterPoints() {
		return movie.determineFrequentRenterPoints(daysRented);
	}
}
