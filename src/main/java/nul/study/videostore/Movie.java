package nul.study.videostore;

public abstract class Movie {

	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;
	public static final int CHILDRENS = 2;

	private String title;
	private int priceCode;

	public Movie(String title, int priceCode) throws NullPointerException {
		this.title = title;
		if (title == null)
			throw new NullPointerException("title is Null");

		this.priceCode = priceCode;
	}

	public int getPriceCode() {
		return priceCode;
	}

	public void setPriceCode(int code) {
		priceCode = code;
	}

	public String getTitle() throws NullPointerException {
		if (title == null)
			throw new NullPointerException("title is Null");

		return title;
	}

	public abstract double determineAmount(int daysRented);

	public abstract int determineFrequentRenterPoints(int daysRented);
}
