package nul.study.videostore.RandoopTests;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression0Test {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }


    int i0 = nul.study.videostore.NewReleaseMovie.REGULAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }


    int i0 = nul.study.videostore.NewReleaseMovie.CHILDRENS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }


    int i0 = nul.study.videostore.ChildrensMovie.CHILDRENS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }


    int i0 = nul.study.videostore.RegularMovie.CHILDRENS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }


    int i0 = nul.study.videostore.RegularMovie.NEW_RELEASE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }


    int i0 = nul.study.videostore.ChildrensMovie.NEW_RELEASE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }


    int i0 = nul.study.videostore.ChildrensMovie.REGULAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }


    int i0 = nul.study.videostore.NewReleaseMovie.NEW_RELEASE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }


    int i0 = nul.study.videostore.RegularMovie.REGULAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.getName();
    nul.study.videostore.Rental rental9 = null;
    // The following exception was thrown during execution in test generation
    try {
    customer1.addRental(rental9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 1);
    int i7 = rental6.getDaysRented();
    customer1.addRental(rental6);
    nul.study.videostore.Rental rental9 = null;
    // The following exception was thrown during execution in test generation
    try {
    customer1.addRental(rental9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    regularMovie1.setPriceCode((int)(short)1);
    int i5 = regularMovie1.determineFrequentRenterPoints(1);
    double d7 = regularMovie1.determineAmount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(short)0);
    double d9 = regularMovie1.determineAmount((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 149.0d);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    regularMovie1.setPriceCode((int)(short)1);
    int i5 = regularMovie1.determineFrequentRenterPoints(1);
    java.lang.String str6 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints(1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    int i10 = newReleaseMovie1.getPriceCode();
    double d12 = newReleaseMovie1.determineAmount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 156.0d);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement4 = new nul.study.videostore.RentalStatement("");
    int i5 = rentalStatement4.getFrequentRenterPoints();
    nul.study.videostore.Customer customer7 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    customer7.addRental(rental11);
    int i14 = rental11.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie15 = rental11.getMovie();
    rentalStatement4.addRental(rental11);
    nul.study.videostore.NewReleaseMovie newReleaseMovie18 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie18, 0);
    int i21 = rental20.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie22 = rental20.getMovie();
    rentalStatement4.addRental(rental20);
    customer1.addRental(rental20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie15 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie15, 0);
    int i18 = rental17.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie19 = rental17.getMovie();
    rentalStatement1.addRental(rental17);
    nul.study.videostore.Movie movie21 = rental17.getMovie();
    int i22 = movie21.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    double d18 = rental14.determineAmount();
    customer1.addRental(rental14);
    java.lang.String str20 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie22 = new nul.study.videostore.NewReleaseMovie("");
    int i23 = newReleaseMovie22.getPriceCode();
    int i25 = newReleaseMovie22.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, (-1));
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, (int)(byte)10);
    int i30 = rental29.getDaysRented();
    double d31 = rental29.determineAmount();
    customer1.addRental(rental29);
    nul.study.videostore.Rental rental33 = null;
    // The following exception was thrown during execution in test generation
    try {
    customer1.addRental(rental33);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 30.0d);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("");
    int i7 = rentalStatement6.getFrequentRenterPoints();
    nul.study.videostore.Customer customer9 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    customer9.addRental(rental13);
    int i16 = rental13.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie17 = rental13.getMovie();
    rentalStatement6.addRental(rental13);
    rentalStatement1.addRental(rental13);
    double d20 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    java.lang.String str4 = newReleaseMovie1.getTitle();
    int i5 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    int i13 = rental8.getDaysRented();
    int i14 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie15 = rental8.getMovie();
    customer1.addRental(rental8);
    java.lang.String str17 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str17.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    childrensMovie1.setPriceCode((int)(byte)100);
    int i5 = childrensMovie1.determineFrequentRenterPoints(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str6 = rentalStatement1.makeRentalStatement();
    double d7 = rentalStatement1.getAmountOwed();
    int i8 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)10);
    double d9 = rental8.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 30.0d);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    double d5 = rentalStatement1.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie11 = rental9.getMovie();
    nul.study.videostore.Movie movie12 = rental9.getMovie();
    double d13 = rental9.determineAmount();
    nul.study.videostore.Movie movie14 = rental9.getMovie();
    int i15 = rental9.getDaysRented();
    double d16 = rental9.determineAmount();
    rentalStatement1.addRental(rental9);
    double d18 = rental9.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer3 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    customer3.addRental(rental8);
    customer1.addRental(rental8);
    java.lang.String str12 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str12.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount((int)(byte)0);
    regularMovie1.setPriceCode((int)' ');
    double d9 = regularMovie1.determineAmount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 149.0d);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    double d7 = childrensMovie1.determineAmount(0);
    double d9 = childrensMovie1.determineAmount((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 12.0d);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount((int)'a');
    newReleaseMovie1.setPriceCode((int)'4');
    double d8 = newReleaseMovie1.determineAmount((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-3.0d));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.statement();
    java.lang.String str9 = customer1.statement();
    java.lang.String str10 = customer1.getName();
    java.lang.String str11 = customer1.statement();
    java.lang.String str12 = customer1.getName();
    java.lang.String str13 = customer1.getName();
    java.lang.String str14 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.statement();
    java.lang.String str9 = customer1.getName();
    java.lang.String str10 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement4 = new nul.study.videostore.RentalStatement("");
    int i5 = rentalStatement4.getFrequentRenterPoints();
    nul.study.videostore.Customer customer7 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    customer7.addRental(rental11);
    int i14 = rental11.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie15 = rental11.getMovie();
    rentalStatement4.addRental(rental11);
    rentalStatement1.addRental(rental11);
    nul.study.videostore.Movie movie18 = rental11.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)' ');
    int i5 = regularMovie1.determineFrequentRenterPoints(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 47.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    double d10 = newReleaseMovie1.determineAmount(100);
    newReleaseMovie1.setPriceCode((int)' ');
    int i14 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    newReleaseMovie1.setPriceCode((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 10);
    double d4 = rental3.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 30.0d);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }


    nul.study.videostore.Movie movie0 = null;
    // The following exception was thrown during execution in test generation
    try {
    nul.study.videostore.Rental rental2 = new nul.study.videostore.Rental(movie0, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.Customer customer5 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    customer5.addRental(rental9);
    int i12 = rental9.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie13 = rental9.getMovie();
    int i14 = rental9.getDaysRented();
    int i15 = rental9.determineFrequentRenterPoints();
    int i16 = rental9.getDaysRented();
    customer1.addRental(rental9);
    double d18 = rental9.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(0);
    java.lang.String str4 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement10 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    rentalStatement10.addRental(rental14);
    double d17 = rental14.determineAmount();
    double d18 = rental14.determineAmount();
    rentalStatement1.addRental(rental14);
    int i20 = rental14.getDaysRented();
    double d21 = rental14.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)(byte)100);
    java.lang.String str4 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    int i8 = rental5.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental5.getMovie();
    java.lang.String str10 = movie9.getTitle();
    movie9.setPriceCode((int)(byte)100);
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental(movie9, (int)'4');
    java.lang.String str15 = movie9.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.Customer customer5 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    customer5.addRental(rental9);
    int i12 = rental9.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie13 = rental9.getMovie();
    int i14 = rental9.getDaysRented();
    int i15 = rental9.determineFrequentRenterPoints();
    int i16 = rental9.getDaysRented();
    customer1.addRental(rental9);
    int i18 = rental9.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(100);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)-1);
    int i6 = rental5.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == (-1));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    nul.study.videostore.Customer customer5 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    customer5.addRental(rental9);
    int i12 = rental9.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie13 = rental9.getMovie();
    int i14 = rental9.getDaysRented();
    rentalStatement1.addRental(rental9);
    double d16 = rentalStatement1.getAmountOwed();
    java.lang.String str17 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)' ');
    int i5 = regularMovie1.determineFrequentRenterPoints((int)(byte)0);
    double d7 = regularMovie1.determineAmount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 47.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    double d18 = rental14.determineAmount();
    customer1.addRental(rental14);
    java.lang.String str20 = customer1.statement();
    java.lang.String str21 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str21.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    int i10 = newReleaseMovie1.getPriceCode();
    double d12 = newReleaseMovie1.determineAmount((int)(short)0);
    java.lang.String str13 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    int i7 = childrensMovie1.determineFrequentRenterPoints(100);
    java.lang.String str8 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    childrensMovie1.setPriceCode((int)(byte)10);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    int i8 = rental5.determineFrequentRenterPoints();
    double d9 = rental5.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)(short)100);
    double d7 = childrensMovie1.determineAmount((int)(byte)1);
    int i9 = childrensMovie1.determineFrequentRenterPoints(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    java.lang.String str7 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    childrensMovie1.setPriceCode((int)(byte)100);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\t\t30.0\n\t\t0.0\nYou owed 30.0\nYou earned 4 frequent renter points\n");

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(short)1);
    int i5 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    double d14 = rental8.determineAmount();
    double d15 = rental8.determineAmount();
    int i16 = rental8.getDaysRented();
    int i17 = rental8.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    java.lang.String str15 = rentalStatement1.getName();
    int i16 = rentalStatement1.getFrequentRenterPoints();
    int i17 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i20 = newReleaseMovie19.getPriceCode();
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 1);
    int i23 = rental22.getDaysRented();
    int i24 = rental22.getDaysRented();
    double d25 = rental22.determineAmount();
    int i26 = rental22.getDaysRented();
    rentalStatement1.addRental(rental22);
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, 0);
    int i32 = rental31.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie33 = rental31.getMovie();
    rentalStatement1.addRental(rental31);
    java.lang.String str35 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Rental Record for \n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str35.equals("Rental Record for \n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("");
    int i4 = rentalStatement3.getFrequentRenterPoints();
    java.lang.String str5 = rentalStatement3.getName();
    int i6 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement8 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 0);
    int i13 = rental12.determineFrequentRenterPoints();
    rentalStatement8.addRental(rental12);
    double d15 = rental12.determineAmount();
    rentalStatement3.addRental(rental12);
    int i17 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement19 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i20 = rentalStatement19.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement22 = new nul.study.videostore.RentalStatement("");
    int i23 = rentalStatement22.getFrequentRenterPoints();
    nul.study.videostore.Customer customer25 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 0);
    int i30 = rental29.determineFrequentRenterPoints();
    customer25.addRental(rental29);
    int i32 = rental29.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie33 = rental29.getMovie();
    rentalStatement22.addRental(rental29);
    java.lang.String str35 = rentalStatement22.makeRentalStatement();
    nul.study.videostore.Customer customer37 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie39 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental41 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie39, 0);
    int i42 = rental41.determineFrequentRenterPoints();
    customer37.addRental(rental41);
    rentalStatement22.addRental(rental41);
    rentalStatement19.addRental(rental41);
    rentalStatement3.addRental(rental41);
    rentalStatement1.addRental(rental41);
    nul.study.videostore.Movie movie48 = rental41.getMovie();
    int i49 = rental41.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str35.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str7 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer9 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    customer9.addRental(rental13);
    java.lang.String str16 = customer9.statement();
    nul.study.videostore.Customer customer18 = new nul.study.videostore.Customer("hi!");
    java.lang.String str19 = customer18.statement();
    nul.study.videostore.RentalStatement rentalStatement21 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie23 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie23, 0);
    int i26 = rental25.determineFrequentRenterPoints();
    rentalStatement21.addRental(rental25);
    int i28 = rental25.determineFrequentRenterPoints();
    int i29 = rental25.determineFrequentRenterPoints();
    customer18.addRental(rental25);
    customer9.addRental(rental25);
    rentalStatement1.addRental(rental25);
    nul.study.videostore.RegularMovie regularMovie34 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental36 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie34, (int)(byte)-1);
    int i37 = rental36.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental36);
    double d39 = rental36.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str19.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d39 == 2.0d);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    java.lang.String str5 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie11 = rental9.getMovie();
    nul.study.videostore.Movie movie12 = rental9.getMovie();
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental(movie12, (int)(byte)0);
    rentalStatement1.addRental(rental14);
    double d16 = rentalStatement1.getAmountOwed();
    java.lang.String str17 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    nul.study.videostore.Customer customer12 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    customer12.addRental(rental16);
    int i19 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie20 = rental16.getMovie();
    int i21 = rental16.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental16);
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("");
    int i25 = newReleaseMovie24.getPriceCode();
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 10);
    rentalStatement1.addRental(rental27);
    nul.study.videostore.Movie movie29 = rental27.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str5 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    double d11 = regularMovie1.determineAmount((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    int i11 = rental10.determineFrequentRenterPoints();
    rentalStatement6.addRental(rental10);
    rentalStatement1.addRental(rental10);
    int i14 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i2 = regularMovie1.getPriceCode();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = childrensMovie1.getTitle();
    childrensMovie1.setPriceCode((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("hi!");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement4 = new nul.study.videostore.RentalStatement("");
    java.lang.String str5 = rentalStatement4.makeRentalStatement();
    double d6 = rentalStatement4.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 1);
    int i12 = rental11.getDaysRented();
    int i13 = rental11.getDaysRented();
    rentalStatement4.addRental(rental11);
    rentalStatement1.addRental(rental11);
    int i16 = rental11.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(10);
    double d5 = newReleaseMovie1.determineAmount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("hi!");
    childrensMovie1.setPriceCode((int)'4');
    int i4 = childrensMovie1.getPriceCode();
    double d6 = childrensMovie1.determineAmount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.5d);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    double d9 = newReleaseMovie1.determineAmount((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 300.0d);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    java.lang.String str2 = newReleaseMovie1.getTitle();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    int i5 = regularMovie1.determineFrequentRenterPoints((-1));
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)0);
    java.lang.String str8 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    customer1.addRental(rental6);
    double d8 = rental6.determineAmount();
    nul.study.videostore.Movie movie9 = rental6.getMovie();
    int i10 = rental6.getDaysRented();
    double d11 = rental6.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    double d13 = newReleaseMovie1.determineAmount((int)' ');
    java.lang.String str14 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    int i5 = rental3.determineFrequentRenterPoints();
    double d6 = rental3.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)' ');
    regularMovie1.setPriceCode((int)(byte)0);
    java.lang.String str6 = regularMovie1.getTitle();
    regularMovie1.setPriceCode((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 47.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    java.lang.String str5 = regularMovie1.getTitle();
    double d7 = regularMovie1.determineAmount((int)'4');
    double d9 = regularMovie1.determineAmount((int)(byte)-1);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = newReleaseMovie1.getPriceCode();
    double d6 = newReleaseMovie1.determineAmount((int)(short)0);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)'#');
    double d9 = rental8.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 105.0d);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    int i13 = rentalStatement1.getFrequentRenterPoints();
    int i14 = rentalStatement1.getFrequentRenterPoints();
    int i15 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement17 = new nul.study.videostore.RentalStatement("");
    int i18 = rentalStatement17.getFrequentRenterPoints();
    java.lang.String str19 = rentalStatement17.getName();
    int i20 = rentalStatement17.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement22 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 0);
    int i27 = rental26.determineFrequentRenterPoints();
    rentalStatement22.addRental(rental26);
    double d29 = rental26.determineAmount();
    rentalStatement17.addRental(rental26);
    int i31 = rental26.getDaysRented();
    rentalStatement1.addRental(rental26);
    java.lang.String str33 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)'#');
    int i8 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\t\t30.0\n\t\t0.0\nYou owed 30.0\nYou earned 4 frequent renter points\n");

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    int i13 = rentalStatement1.getFrequentRenterPoints();
    int i14 = rentalStatement1.getFrequentRenterPoints();
    int i15 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement17 = new nul.study.videostore.RentalStatement("");
    int i18 = rentalStatement17.getFrequentRenterPoints();
    java.lang.String str19 = rentalStatement17.getName();
    int i20 = rentalStatement17.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement22 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 0);
    int i27 = rental26.determineFrequentRenterPoints();
    rentalStatement22.addRental(rental26);
    double d29 = rental26.determineAmount();
    rentalStatement17.addRental(rental26);
    int i31 = rental26.getDaysRented();
    rentalStatement1.addRental(rental26);
    int i33 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str34 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str34.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    int i10 = regularMovie1.getPriceCode();
    regularMovie1.setPriceCode((int)(byte)100);
    int i14 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i15 = regularMovie1.getPriceCode();
    regularMovie1.setPriceCode((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    int i5 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    nul.study.videostore.Customer customer12 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    customer12.addRental(rental16);
    int i19 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie20 = rental16.getMovie();
    int i21 = rental16.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental16);
    double d23 = rentalStatement1.getAmountOwed();
    java.lang.String str24 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = regularMovie1.determineAmount(100);
    int i5 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    double d4 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount((int)'a');
    double d5 = childrensMovie1.determineAmount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 142.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.5d);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    int i6 = rentalStatement5.getFrequentRenterPoints();
    java.lang.String str7 = rentalStatement5.getName();
    int i8 = rentalStatement5.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 0);
    int i13 = rental12.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie14 = rental12.getMovie();
    nul.study.videostore.Movie movie15 = rental12.getMovie();
    rentalStatement5.addRental(rental12);
    int i17 = rentalStatement5.getFrequentRenterPoints();
    double d18 = rentalStatement5.getAmountOwed();
    int i19 = rentalStatement5.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 0);
    rentalStatement5.addRental(rental23);
    customer1.addRental(rental23);
    nul.study.videostore.RentalStatement rentalStatement27 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, 0);
    int i32 = rental31.determineFrequentRenterPoints();
    rentalStatement27.addRental(rental31);
    java.lang.String str34 = rentalStatement27.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement36 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie38 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental40 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie38, 0);
    int i41 = rental40.determineFrequentRenterPoints();
    rentalStatement36.addRental(rental40);
    double d43 = rental40.determineAmount();
    double d44 = rental40.determineAmount();
    rentalStatement27.addRental(rental40);
    double d46 = rental40.determineAmount();
    int i47 = rental40.getDaysRented();
    customer1.addRental(rental40);
    java.lang.String str49 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str34.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("");
    int i7 = rentalStatement6.getFrequentRenterPoints();
    nul.study.videostore.Customer customer9 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    customer9.addRental(rental13);
    int i16 = rental13.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie17 = rental13.getMovie();
    rentalStatement6.addRental(rental13);
    rentalStatement1.addRental(rental13);
    java.lang.String str20 = rentalStatement1.getName();
    double d21 = rentalStatement1.getAmountOwed();
    int i22 = rentalStatement1.getFrequentRenterPoints();
    double d23 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Rental rental11 = null;
    rentalStatement1.addRental(rental11);
    double d13 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    int i8 = rental5.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental5.getMovie();
    int i10 = movie9.getPriceCode();
    movie9.setPriceCode((int)(byte)100);
    java.lang.String str13 = movie9.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = childrensMovie1.getTitle();
    int i4 = childrensMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i6 = childrensMovie1.determineFrequentRenterPoints((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    java.lang.String str2 = newReleaseMovie1.getTitle();
    double d4 = newReleaseMovie1.determineAmount(0);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str11 = rentalStatement1.getName();
    int i12 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str13 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    nul.study.videostore.Movie movie6 = rental3.getMovie();
    double d7 = rental3.determineAmount();
    nul.study.videostore.Movie movie8 = rental3.getMovie();
    int i9 = rental3.getDaysRented();
    double d10 = rental3.determineAmount();
    int i11 = rental3.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(short)1);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    int i7 = regularMovie1.getPriceCode();
    int i8 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    double d3 = rentalStatement1.getAmountOwed();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str6 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    java.lang.String str7 = customer6.getName();
    java.lang.String str8 = customer6.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i11 = newReleaseMovie10.getPriceCode();
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 1);
    int i14 = rental13.getDaysRented();
    customer6.addRental(rental13);
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie21 = rental19.getMovie();
    nul.study.videostore.Movie movie22 = rental19.getMovie();
    double d23 = rental19.determineAmount();
    customer6.addRental(rental19);
    java.lang.String str25 = customer6.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    int i28 = newReleaseMovie27.getPriceCode();
    int i30 = newReleaseMovie27.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, (-1));
    nul.study.videostore.Rental rental34 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, (int)(byte)10);
    int i35 = rental34.getDaysRented();
    double d36 = rental34.determineAmount();
    customer6.addRental(rental34);
    nul.study.videostore.RentalStatement rentalStatement39 = new nul.study.videostore.RentalStatement("");
    int i40 = rentalStatement39.getFrequentRenterPoints();
    java.lang.String str41 = rentalStatement39.getName();
    int i42 = rentalStatement39.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement44 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie46 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental48 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie46, 0);
    int i49 = rental48.determineFrequentRenterPoints();
    rentalStatement44.addRental(rental48);
    double d51 = rental48.determineAmount();
    rentalStatement39.addRental(rental48);
    int i53 = rental48.getDaysRented();
    customer6.addRental(rental48);
    rentalStatement1.addRental(rental48);
    int i56 = rental48.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str25.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d36 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    regularMovie1.setPriceCode((int)(short)1);
    int i5 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    int i7 = regularMovie1.determineFrequentRenterPoints(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(0);
    int i4 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    int i13 = rentalStatement1.getFrequentRenterPoints();
    double d14 = rentalStatement1.getAmountOwed();
    int i15 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str16 = rentalStatement1.getName();
    java.lang.String str17 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    nul.study.videostore.Movie movie6 = rental3.getMovie();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental(movie6, 0);
    movie6.setPriceCode((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie6);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    double d5 = regularMovie1.determineAmount((int)'#');
    int i6 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 51.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.statement();
    java.lang.String str9 = customer1.statement();
    java.lang.String str10 = customer1.getName();
    java.lang.String str11 = customer1.statement();
    java.lang.String str12 = customer1.statement();
    java.lang.String str13 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str12.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    java.lang.String str4 = rentalStatement1.makeRentalStatement();
    java.lang.String str5 = rentalStatement1.makeRentalStatement();
    java.lang.String str6 = rentalStatement1.makeRentalStatement();
    java.lang.String str7 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie1.determineFrequentRenterPoints(2);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)'a');
    int i11 = childrensMovie1.determineFrequentRenterPoints(0);
    java.lang.String str12 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    java.lang.String str4 = rentalStatement1.makeRentalStatement();
    java.lang.String str5 = rentalStatement1.makeRentalStatement();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.statement();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    customer6.addRental(rental11);
    customer1.addRental(rental11);
    nul.study.videostore.Movie movie14 = rental11.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    double d11 = rentalStatement1.getAmountOwed();
    int i12 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str13 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("hi!");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    int i13 = rental8.determineFrequentRenterPoints();
    double d14 = rental8.determineAmount();
    rentalStatement1.addRental(rental8);
    double d16 = rental8.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    java.lang.String str12 = newReleaseMovie1.getTitle();
    int i14 = newReleaseMovie1.determineFrequentRenterPoints((int)'#');
    double d16 = newReleaseMovie1.determineAmount((int)' ');
    int i18 = newReleaseMovie1.determineFrequentRenterPoints((int)'a');
    int i20 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i3 = regularMovie1.getPriceCode();
    java.lang.String str4 = regularMovie1.getTitle();
    double d6 = regularMovie1.determineAmount((int)(byte)100);
    double d8 = regularMovie1.determineAmount((int)(short)1);
    int i10 = regularMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    java.lang.String str5 = regularMovie1.getTitle();
    double d7 = regularMovie1.determineAmount((int)'4');
    double d9 = regularMovie1.determineAmount(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str7 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer9 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    customer9.addRental(rental13);
    java.lang.String str16 = customer9.statement();
    nul.study.videostore.Customer customer18 = new nul.study.videostore.Customer("hi!");
    java.lang.String str19 = customer18.statement();
    nul.study.videostore.RentalStatement rentalStatement21 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie23 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie23, 0);
    int i26 = rental25.determineFrequentRenterPoints();
    rentalStatement21.addRental(rental25);
    int i28 = rental25.determineFrequentRenterPoints();
    int i29 = rental25.determineFrequentRenterPoints();
    customer18.addRental(rental25);
    customer9.addRental(rental25);
    rentalStatement1.addRental(rental25);
    nul.study.videostore.RegularMovie regularMovie34 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental36 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie34, (int)(byte)-1);
    int i37 = rental36.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental36);
    nul.study.videostore.RentalStatement rentalStatement40 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d41 = rentalStatement40.getAmountOwed();
    nul.study.videostore.Customer customer43 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer45 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie47 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i48 = newReleaseMovie47.getPriceCode();
    nul.study.videostore.Rental rental50 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie47, 1);
    int i51 = rental50.getDaysRented();
    customer45.addRental(rental50);
    customer43.addRental(rental50);
    nul.study.videostore.Customer customer55 = new nul.study.videostore.Customer("hi!");
    java.lang.String str56 = customer55.getName();
    java.lang.String str57 = customer55.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie59 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i60 = newReleaseMovie59.getPriceCode();
    nul.study.videostore.Rental rental62 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie59, 1);
    int i63 = rental62.getDaysRented();
    customer55.addRental(rental62);
    nul.study.videostore.NewReleaseMovie newReleaseMovie66 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental68 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie66, 0);
    int i69 = rental68.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie70 = rental68.getMovie();
    nul.study.videostore.Movie movie71 = rental68.getMovie();
    double d72 = rental68.determineAmount();
    customer55.addRental(rental68);
    double d74 = rental68.determineAmount();
    int i75 = rental68.getDaysRented();
    customer43.addRental(rental68);
    rentalStatement40.addRental(rental68);
    rentalStatement1.addRental(rental68);
    int i79 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str19.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!"+ "'", str56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!"+ "'", str57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)0);
    int i4 = rental3.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i10 = newReleaseMovie1.determineFrequentRenterPoints(100);
    java.lang.String str11 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!"+ "'", str11.equals("hi!"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }


    nul.study.videostore.Movie movie0 = null;
    // The following exception was thrown during execution in test generation
    try {
    nul.study.videostore.Rental rental2 = new nul.study.videostore.Rental(movie0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    nul.study.videostore.Customer customer12 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    customer12.addRental(rental16);
    int i19 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie20 = rental16.getMovie();
    int i21 = rental16.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental16);
    nul.study.videostore.Movie movie23 = rental16.getMovie();
    java.lang.String str24 = movie23.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    double d4 = rentalStatement1.getAmountOwed();
    java.lang.String str5 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer16 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie18 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie18, 0);
    int i21 = rental20.determineFrequentRenterPoints();
    customer16.addRental(rental20);
    rentalStatement1.addRental(rental20);
    java.lang.String str24 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    double d7 = regularMovie1.determineAmount((int)(short)-1);
    int i8 = regularMovie1.getPriceCode();
    int i9 = regularMovie1.getPriceCode();
    double d11 = regularMovie1.determineAmount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 144.5d);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("");
    int i7 = rentalStatement6.getFrequentRenterPoints();
    nul.study.videostore.Customer customer9 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    customer9.addRental(rental13);
    int i16 = rental13.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie17 = rental13.getMovie();
    rentalStatement6.addRental(rental13);
    rentalStatement1.addRental(rental13);
    int i20 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str21 = rentalStatement1.makeRentalStatement();
    java.lang.String str22 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str21.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str22.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement4 = new nul.study.videostore.RentalStatement("");
    int i5 = rentalStatement4.getFrequentRenterPoints();
    nul.study.videostore.Customer customer7 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    customer7.addRental(rental11);
    int i14 = rental11.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie15 = rental11.getMovie();
    rentalStatement4.addRental(rental11);
    java.lang.String str17 = rentalStatement4.makeRentalStatement();
    nul.study.videostore.Customer customer19 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 0);
    int i24 = rental23.determineFrequentRenterPoints();
    customer19.addRental(rental23);
    rentalStatement4.addRental(rental23);
    rentalStatement1.addRental(rental23);
    java.lang.String str28 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str28.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)'4');
    int i5 = regularMovie1.determineFrequentRenterPoints(4);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    int i7 = childrensMovie1.determineFrequentRenterPoints(100);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)(short)0);
    childrensMovie1.setPriceCode((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    nul.study.videostore.Movie movie6 = rental3.getMovie();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental(movie6, (int)(byte)0);
    java.lang.String str9 = movie6.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    double d18 = rental14.determineAmount();
    customer1.addRental(rental14);
    nul.study.videostore.Movie movie20 = rental14.getMovie();
    double d21 = rental14.determineAmount();
    nul.study.videostore.Movie movie22 = rental14.getMovie();
    movie22.setPriceCode((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    double d7 = regularMovie1.determineAmount((int)(byte)10);
    int i9 = regularMovie1.determineFrequentRenterPoints(1);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    java.lang.String str12 = newReleaseMovie1.getTitle();
    double d14 = newReleaseMovie1.determineAmount(2);
    newReleaseMovie1.setPriceCode((-1));
    java.lang.String str17 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 6.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement4 = new nul.study.videostore.RentalStatement("");
    int i5 = rentalStatement4.getFrequentRenterPoints();
    nul.study.videostore.Customer customer7 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    customer7.addRental(rental11);
    int i14 = rental11.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie15 = rental11.getMovie();
    rentalStatement4.addRental(rental11);
    rentalStatement1.addRental(rental11);
    java.lang.String str18 = rentalStatement1.getName();
    java.lang.String str19 = rentalStatement1.getName();
    java.lang.String str20 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str18.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str19.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.statement();
    java.lang.String str5 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    double d7 = childrensMovie1.determineAmount(2);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    customer6.addRental(rental11);
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie18 = rental16.getMovie();
    nul.study.videostore.Movie movie19 = rental16.getMovie();
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental(movie19, (int)(byte)0);
    customer6.addRental(rental21);
    int i23 = rental21.getDaysRented();
    int i24 = rental21.determineFrequentRenterPoints();
    int i25 = rental21.getDaysRented();
    rentalStatement1.addRental(rental21);
    int i27 = rental21.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str7 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer9 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    customer9.addRental(rental13);
    int i16 = rental13.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie17 = rental13.getMovie();
    int i18 = movie17.getPriceCode();
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental(movie17, (int)(short)1);
    rentalStatement1.addRental(rental20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)'a');
    int i4 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    double d10 = newReleaseMovie1.determineAmount(100);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    java.lang.String str15 = rentalStatement1.getName();
    int i16 = rentalStatement1.getFrequentRenterPoints();
    int i17 = rentalStatement1.getFrequentRenterPoints();
    double d18 = rentalStatement1.getAmountOwed();
    java.lang.String str19 = rentalStatement1.getName();
    java.lang.String str20 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str20.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)-1);
    int i4 = rental3.determineFrequentRenterPoints();
    int i5 = rental3.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)'a');
    double d5 = regularMovie1.determineAmount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 144.5d);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.statement();
    java.lang.String str6 = customer1.statement();
    nul.study.videostore.Customer customer8 = new nul.study.videostore.Customer("hi!");
    java.lang.String str9 = customer8.getName();
    java.lang.String str10 = customer8.getName();
    nul.study.videostore.RentalStatement rentalStatement12 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    rentalStatement12.addRental(rental16);
    customer8.addRental(rental16);
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i22 = newReleaseMovie21.getPriceCode();
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 1);
    int i25 = rental24.getDaysRented();
    int i26 = rental24.getDaysRented();
    double d27 = rental24.determineAmount();
    int i28 = rental24.getDaysRented();
    customer8.addRental(rental24);
    java.lang.String str30 = customer8.statement();
    nul.study.videostore.Customer customer32 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie34 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental36 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie34, 0);
    int i37 = rental36.determineFrequentRenterPoints();
    customer32.addRental(rental36);
    int i39 = rental36.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie40 = rental36.getMovie();
    customer8.addRental(rental36);
    customer1.addRental(rental36);
    java.lang.String str43 = customer1.getName();
    java.lang.String str44 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str30.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!"+ "'", str43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    double d10 = newReleaseMovie1.determineAmount(2);
    int i11 = newReleaseMovie1.getPriceCode();
    java.lang.String str12 = newReleaseMovie1.getTitle();
    int i14 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    double d16 = newReleaseMovie1.determineAmount(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 6.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 30.0d);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    int i6 = rentalStatement5.getFrequentRenterPoints();
    java.lang.String str7 = rentalStatement5.getName();
    int i8 = rentalStatement5.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 0);
    int i13 = rental12.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie14 = rental12.getMovie();
    nul.study.videostore.Movie movie15 = rental12.getMovie();
    rentalStatement5.addRental(rental12);
    int i17 = rentalStatement5.getFrequentRenterPoints();
    double d18 = rentalStatement5.getAmountOwed();
    int i19 = rentalStatement5.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 0);
    rentalStatement5.addRental(rental23);
    customer1.addRental(rental23);
    nul.study.videostore.RentalStatement rentalStatement27 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, 0);
    int i32 = rental31.determineFrequentRenterPoints();
    rentalStatement27.addRental(rental31);
    java.lang.String str34 = rentalStatement27.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement36 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie38 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental40 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie38, 0);
    int i41 = rental40.determineFrequentRenterPoints();
    rentalStatement36.addRental(rental40);
    double d43 = rental40.determineAmount();
    double d44 = rental40.determineAmount();
    rentalStatement27.addRental(rental40);
    double d46 = rental40.determineAmount();
    int i47 = rental40.getDaysRented();
    customer1.addRental(rental40);
    int i49 = rental40.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str34.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");
    int i2 = regularMovie1.getPriceCode();
    int i4 = regularMovie1.determineFrequentRenterPoints(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement8 = new nul.study.videostore.RentalStatement("");
    int i9 = rentalStatement8.getFrequentRenterPoints();
    java.lang.String str10 = rentalStatement8.getName();
    int i11 = rentalStatement8.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie13 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie13, 0);
    int i16 = rental15.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie17 = rental15.getMovie();
    nul.study.videostore.Movie movie18 = rental15.getMovie();
    rentalStatement8.addRental(rental15);
    double d20 = rental15.determineAmount();
    rentalStatement1.addRental(rental15);
    int i22 = rental15.getDaysRented();
    double d23 = rental15.determineAmount();
    double d24 = rental15.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 0.0d);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    double d18 = rental14.determineAmount();
    customer1.addRental(rental14);
    java.lang.String str20 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie22 = new nul.study.videostore.NewReleaseMovie("");
    int i23 = newReleaseMovie22.getPriceCode();
    int i25 = newReleaseMovie22.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, (-1));
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, (int)(byte)10);
    int i30 = rental29.getDaysRented();
    double d31 = rental29.determineAmount();
    customer1.addRental(rental29);
    java.lang.String str33 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t30.0\nYou owed 33.0\nYou earned 4 frequent renter points\n"+ "'", str33.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t30.0\nYou owed 33.0\nYou earned 4 frequent renter points\n"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    customer1.addRental(rental9);
    nul.study.videostore.RentalStatement rentalStatement14 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 0);
    int i19 = rental18.determineFrequentRenterPoints();
    rentalStatement14.addRental(rental18);
    java.lang.String str21 = rentalStatement14.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement23 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, 0);
    int i28 = rental27.determineFrequentRenterPoints();
    rentalStatement23.addRental(rental27);
    double d30 = rental27.determineAmount();
    double d31 = rental27.determineAmount();
    rentalStatement14.addRental(rental27);
    double d33 = rental27.determineAmount();
    customer1.addRental(rental27);
    java.lang.String str35 = customer1.getName();
    nul.study.videostore.Rental rental36 = null;
    // The following exception was thrown during execution in test generation
    try {
    customer1.addRental(rental36);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str21.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n");
    int i2 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)-1);
    java.lang.String str4 = regularMovie1.getTitle();
    double d6 = regularMovie1.determineAmount((int)(byte)1);
    double d8 = regularMovie1.determineAmount(100);
    regularMovie1.setPriceCode((int)(short)0);
    int i11 = regularMovie1.getPriceCode();
    regularMovie1.setPriceCode((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    nul.study.videostore.Movie movie6 = rental3.getMovie();
    movie6.setPriceCode((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie6);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 12.0d);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    int i6 = newReleaseMovie1.getPriceCode();
    int i8 = newReleaseMovie1.determineFrequentRenterPoints(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    customer6.addRental(rental11);
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie18 = rental16.getMovie();
    nul.study.videostore.Movie movie19 = rental16.getMovie();
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental(movie19, (int)(byte)0);
    customer6.addRental(rental21);
    int i23 = rental21.getDaysRented();
    int i24 = rental21.determineFrequentRenterPoints();
    int i25 = rental21.getDaysRented();
    rentalStatement1.addRental(rental21);
    java.lang.String str27 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str27.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    double d4 = childrensMovie1.determineAmount(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 12.0d);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("hi!");
    childrensMovie1.setPriceCode((int)'4');
    int i4 = childrensMovie1.getPriceCode();
    double d6 = childrensMovie1.determineAmount((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.5d);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement10 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    rentalStatement10.addRental(rental14);
    double d17 = rental14.determineAmount();
    double d18 = rental14.determineAmount();
    rentalStatement1.addRental(rental14);
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i22 = newReleaseMovie21.getPriceCode();
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 0);
    rentalStatement1.addRental(rental24);
    nul.study.videostore.RentalStatement rentalStatement27 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, 0);
    int i32 = rental31.determineFrequentRenterPoints();
    rentalStatement27.addRental(rental31);
    java.lang.String str34 = rentalStatement27.makeRentalStatement();
    java.lang.String str35 = rentalStatement27.makeRentalStatement();
    double d36 = rentalStatement27.getAmountOwed();
    double d37 = rentalStatement27.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement39 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie41 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental43 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie41, 0);
    int i44 = rental43.determineFrequentRenterPoints();
    rentalStatement39.addRental(rental43);
    int i46 = rental43.determineFrequentRenterPoints();
    int i47 = rental43.determineFrequentRenterPoints();
    rentalStatement27.addRental(rental43);
    rentalStatement1.addRental(rental43);
    double d50 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str34.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str35.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d50 == 0.0d);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    double d18 = rental14.determineAmount();
    customer1.addRental(rental14);
    java.lang.String str20 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie22 = new nul.study.videostore.NewReleaseMovie("");
    int i23 = newReleaseMovie22.getPriceCode();
    int i25 = newReleaseMovie22.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, (-1));
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, (int)(byte)10);
    int i30 = rental29.getDaysRented();
    double d31 = rental29.determineAmount();
    customer1.addRental(rental29);
    nul.study.videostore.RentalStatement rentalStatement34 = new nul.study.videostore.RentalStatement("");
    int i35 = rentalStatement34.getFrequentRenterPoints();
    java.lang.String str36 = rentalStatement34.getName();
    int i37 = rentalStatement34.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement39 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie41 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental43 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie41, 0);
    int i44 = rental43.determineFrequentRenterPoints();
    rentalStatement39.addRental(rental43);
    double d46 = rental43.determineAmount();
    rentalStatement34.addRental(rental43);
    int i48 = rental43.getDaysRented();
    customer1.addRental(rental43);
    nul.study.videostore.Movie movie50 = rental43.getMovie();
    java.lang.String str51 = movie50.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + ""+ "'", str51.equals(""));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    double d4 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("");
    int i7 = rentalStatement6.getFrequentRenterPoints();
    nul.study.videostore.Customer customer9 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    customer9.addRental(rental13);
    int i16 = rental13.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie17 = rental13.getMovie();
    rentalStatement6.addRental(rental13);
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, 0);
    int i23 = rental22.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie24 = rental22.getMovie();
    rentalStatement6.addRental(rental22);
    int i26 = rental22.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental22);
    java.lang.String str28 = rentalStatement1.getName();
    nul.study.videostore.Customer customer30 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie32 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i33 = newReleaseMovie32.getPriceCode();
    nul.study.videostore.Rental rental35 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie32, 1);
    int i36 = rental35.getDaysRented();
    customer30.addRental(rental35);
    rentalStatement1.addRental(rental35);
    double d39 = rental35.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d39 == 3.0d);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    double d14 = rental8.determineAmount();
    double d15 = rental8.determineAmount();
    int i16 = rental8.getDaysRented();
    double d17 = rental8.determineAmount();
    int i18 = rental8.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("");
    int i4 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    int i11 = rental10.determineFrequentRenterPoints();
    customer6.addRental(rental10);
    int i13 = rental10.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie14 = rental10.getMovie();
    rentalStatement3.addRental(rental10);
    java.lang.String str16 = rentalStatement3.makeRentalStatement();
    java.lang.String str17 = rentalStatement3.getName();
    int i18 = rentalStatement3.getFrequentRenterPoints();
    int i19 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i23 = newReleaseMovie21.determineFrequentRenterPoints(100);
    double d25 = newReleaseMovie21.determineAmount((int)' ');
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, (int)(byte)100);
    rentalStatement3.addRental(rental27);
    int i29 = rental27.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    java.lang.String str4 = newReleaseMovie1.getTitle();
    double d6 = newReleaseMovie1.determineAmount((int)'#');
    int i8 = newReleaseMovie1.determineFrequentRenterPoints(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 105.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(0);
    childrensMovie1.setPriceCode((int)'4');
    int i7 = childrensMovie1.determineFrequentRenterPoints(32);
    double d9 = childrensMovie1.determineAmount(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.5d);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.statement();
    java.lang.String str6 = customer1.statement();
    nul.study.videostore.Rental rental7 = null;
    // The following exception was thrown during execution in test generation
    try {
    customer1.addRental(rental7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    double d3 = regularMovie1.determineAmount(32);
    java.lang.String str4 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 47.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    double d9 = newReleaseMovie1.determineAmount((int)'#');
    double d11 = newReleaseMovie1.determineAmount((int)(byte)0);
    java.lang.String str12 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 105.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    int i7 = newReleaseMovie1.getPriceCode();
    int i8 = newReleaseMovie1.getPriceCode();
    int i10 = newReleaseMovie1.determineFrequentRenterPoints(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(100);
    double d5 = newReleaseMovie1.determineAmount((int)' ');
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)100);
    double d9 = newReleaseMovie1.determineAmount((int)(short)1);
    double d11 = newReleaseMovie1.determineAmount((-1));
    int i13 = newReleaseMovie1.determineFrequentRenterPoints(10);
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\n\t\t30.0\n\t\t0.0\nYou owed 30.0\nYou earned 4 frequent renter points\n");

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    double d10 = newReleaseMovie1.determineAmount((int)(byte)100);
    int i11 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)1);
    double d10 = newReleaseMovie1.determineAmount(1);
    double d12 = newReleaseMovie1.determineAmount(10);
    newReleaseMovie1.setPriceCode(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 30.0d);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    double d3 = regularMovie1.determineAmount(52);
    int i5 = regularMovie1.determineFrequentRenterPoints(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    double d18 = rental14.determineAmount();
    customer1.addRental(rental14);
    nul.study.videostore.Movie movie20 = rental14.getMovie();
    double d21 = rental14.determineAmount();
    nul.study.videostore.Movie movie22 = rental14.getMovie();
    movie22.setPriceCode(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    regularMovie1.setPriceCode((int)(byte)1);
    java.lang.String str9 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    int i9 = regularMovie1.determineFrequentRenterPoints((int)(byte)100);
    double d11 = regularMovie1.determineAmount(100);
    double d13 = regularMovie1.determineAmount((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 14.0d);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    double d7 = rental6.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-3.0d));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer3 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    customer3.addRental(rental8);
    customer1.addRental(rental8);
    nul.study.videostore.Customer customer13 = new nul.study.videostore.Customer("hi!");
    java.lang.String str14 = customer13.getName();
    java.lang.String str15 = customer13.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i18 = newReleaseMovie17.getPriceCode();
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 1);
    int i21 = rental20.getDaysRented();
    customer13.addRental(rental20);
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 0);
    int i27 = rental26.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie28 = rental26.getMovie();
    nul.study.videostore.Movie movie29 = rental26.getMovie();
    double d30 = rental26.determineAmount();
    customer13.addRental(rental26);
    double d32 = rental26.determineAmount();
    int i33 = rental26.getDaysRented();
    customer1.addRental(rental26);
    nul.study.videostore.RentalStatement rentalStatement36 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie38 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental40 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie38, 0);
    int i41 = rental40.determineFrequentRenterPoints();
    rentalStatement36.addRental(rental40);
    java.lang.String str43 = rentalStatement36.makeRentalStatement();
    java.lang.String str44 = rentalStatement36.makeRentalStatement();
    double d45 = rentalStatement36.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie47 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i49 = newReleaseMovie47.determineFrequentRenterPoints(100);
    double d51 = newReleaseMovie47.determineAmount((int)' ');
    nul.study.videostore.Rental rental53 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie47, (int)(byte)100);
    double d54 = rental53.determineAmount();
    rentalStatement36.addRental(rental53);
    customer1.addRental(rental53);
    java.lang.String str57 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str43.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str44.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d51 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\n\thi!\t300.0\nYou owed 303.0\nYou earned 4 frequent renter points\n"+ "'", str57.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\n\thi!\t300.0\nYou owed 303.0\nYou earned 4 frequent renter points\n"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    nul.study.videostore.Movie movie9 = rental8.getMovie();
    java.lang.String str10 = movie9.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    int i8 = regularMovie1.getPriceCode();
    java.lang.String str9 = regularMovie1.getTitle();
    double d11 = regularMovie1.determineAmount((int)(byte)0);
    int i13 = regularMovie1.determineFrequentRenterPoints(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    double d10 = rentalStatement1.getAmountOwed();
    double d11 = rentalStatement1.getAmountOwed();
    java.lang.String str12 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    newReleaseMovie1.setPriceCode((int)(byte)10);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str7 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer9 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    customer9.addRental(rental13);
    java.lang.String str16 = customer9.statement();
    nul.study.videostore.Customer customer18 = new nul.study.videostore.Customer("hi!");
    java.lang.String str19 = customer18.statement();
    nul.study.videostore.RentalStatement rentalStatement21 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie23 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie23, 0);
    int i26 = rental25.determineFrequentRenterPoints();
    rentalStatement21.addRental(rental25);
    int i28 = rental25.determineFrequentRenterPoints();
    int i29 = rental25.determineFrequentRenterPoints();
    customer18.addRental(rental25);
    customer9.addRental(rental25);
    rentalStatement1.addRental(rental25);
    nul.study.videostore.NewReleaseMovie newReleaseMovie34 = new nul.study.videostore.NewReleaseMovie("");
    int i35 = newReleaseMovie34.getPriceCode();
    int i37 = newReleaseMovie34.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie34, (-1));
    nul.study.videostore.Rental rental41 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie34, (int)(short)0);
    rentalStatement1.addRental(rental41);
    int i43 = rental41.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str19.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    newReleaseMovie1.setPriceCode((-1));
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.getName();
    double d15 = rentalStatement1.getAmountOwed();
    double d16 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + ""+ "'", str14.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    int i13 = rentalStatement1.getFrequentRenterPoints();
    int i14 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement16 = new nul.study.videostore.RentalStatement("");
    int i17 = rentalStatement16.getFrequentRenterPoints();
    nul.study.videostore.Customer customer19 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 0);
    int i24 = rental23.determineFrequentRenterPoints();
    customer19.addRental(rental23);
    int i26 = rental23.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie27 = rental23.getMovie();
    rentalStatement16.addRental(rental23);
    nul.study.videostore.NewReleaseMovie newReleaseMovie30 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie30, 0);
    int i33 = rental32.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie34 = rental32.getMovie();
    rentalStatement16.addRental(rental32);
    rentalStatement1.addRental(rental32);
    double d37 = rentalStatement1.getAmountOwed();
    int i38 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    int i5 = regularMovie1.determineFrequentRenterPoints((-1));
    double d7 = regularMovie1.determineAmount((-1));
    double d9 = regularMovie1.determineAmount(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 14.0d);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    nul.study.videostore.Customer customer12 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    customer12.addRental(rental16);
    int i19 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie20 = rental16.getMovie();
    int i21 = rental16.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental16);
    double d23 = rentalStatement1.getAmountOwed();
    double d24 = rentalStatement1.getAmountOwed();
    java.lang.String str25 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    int i13 = rentalStatement1.getFrequentRenterPoints();
    int i14 = rentalStatement1.getFrequentRenterPoints();
    int i15 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement17 = new nul.study.videostore.RentalStatement("");
    int i18 = rentalStatement17.getFrequentRenterPoints();
    java.lang.String str19 = rentalStatement17.getName();
    int i20 = rentalStatement17.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement22 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 0);
    int i27 = rental26.determineFrequentRenterPoints();
    rentalStatement22.addRental(rental26);
    double d29 = rental26.determineAmount();
    rentalStatement17.addRental(rental26);
    int i31 = rental26.getDaysRented();
    rentalStatement1.addRental(rental26);
    int i33 = rentalStatement1.getFrequentRenterPoints();
    int i34 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }


    nul.study.videostore.Movie movie0 = null;
    // The following exception was thrown during execution in test generation
    try {
    nul.study.videostore.Rental rental2 = new nul.study.videostore.Rental(movie0, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(0);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    childrensMovie1.setPriceCode((int)(byte)10);
    childrensMovie1.setPriceCode((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    java.lang.String str15 = rentalStatement1.getName();
    double d16 = rentalStatement1.getAmountOwed();
    java.lang.String str17 = rentalStatement1.makeRentalStatement();
    double d18 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.statement();
    java.lang.String str9 = customer1.statement();
    java.lang.String str10 = customer1.getName();
    java.lang.String str11 = customer1.statement();
    java.lang.String str12 = customer1.getName();
    nul.study.videostore.Customer customer14 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 0);
    int i19 = rental18.determineFrequentRenterPoints();
    customer14.addRental(rental18);
    int i21 = rental18.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie22 = rental18.getMovie();
    int i23 = rental18.determineFrequentRenterPoints();
    customer1.addRental(rental18);
    java.lang.String str25 = customer1.statement();
    java.lang.String str26 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str25.equals("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.makeRentalStatement();
    java.lang.String str5 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement4 = new nul.study.videostore.RentalStatement("");
    int i5 = rentalStatement4.getFrequentRenterPoints();
    java.lang.String str6 = rentalStatement4.getName();
    int i7 = rentalStatement4.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement9 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    rentalStatement9.addRental(rental13);
    double d16 = rental13.determineAmount();
    rentalStatement4.addRental(rental13);
    int i18 = rental13.getDaysRented();
    int i19 = rental13.getDaysRented();
    rentalStatement1.addRental(rental13);
    java.lang.String str21 = rentalStatement1.makeRentalStatement();
    int i22 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str21.equals("Rental Record for Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 30.0d);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    java.lang.String str5 = regularMovie1.getTitle();
    int i7 = regularMovie1.determineFrequentRenterPoints(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)' ');
    regularMovie1.setPriceCode((int)(byte)0);
    java.lang.String str6 = regularMovie1.getTitle();
    java.lang.String str7 = regularMovie1.getTitle();
    regularMovie1.setPriceCode(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 47.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    customer1.addRental(rental6);
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie13 = rental11.getMovie();
    nul.study.videostore.Movie movie14 = rental11.getMovie();
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental(movie14, (int)(byte)0);
    customer1.addRental(rental16);
    java.lang.String str18 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str18.equals("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.ChildrensMovie childrensMovie5 = new nul.study.videostore.ChildrensMovie("");
    int i7 = childrensMovie5.determineFrequentRenterPoints(1);
    int i9 = childrensMovie5.determineFrequentRenterPoints(2);
    int i11 = childrensMovie5.determineFrequentRenterPoints(100);
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie5, (int)' ');
    int i14 = rental13.determineFrequentRenterPoints();
    customer1.addRental(rental13);
    int i16 = rental13.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    double d8 = rentalStatement1.getAmountOwed();
    int i9 = rentalStatement1.getFrequentRenterPoints();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str11 = rentalStatement1.makeRentalStatement();
    int i12 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str13 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.statement();
    java.lang.String str9 = customer1.statement();
    java.lang.String str10 = customer1.getName();
    java.lang.String str11 = customer1.statement();
    java.lang.String str12 = customer1.getName();
    nul.study.videostore.Customer customer14 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 0);
    int i19 = rental18.determineFrequentRenterPoints();
    customer14.addRental(rental18);
    int i21 = rental18.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie22 = rental18.getMovie();
    int i23 = rental18.determineFrequentRenterPoints();
    customer1.addRental(rental18);
    double d25 = rental18.determineAmount();
    nul.study.videostore.Movie movie26 = rental18.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie26);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i3 = regularMovie1.getPriceCode();
    int i5 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    int i6 = regularMovie1.getPriceCode();
    int i8 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    childrensMovie1.setPriceCode((int)(byte)-1);
    int i5 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)10);
    double d6 = regularMovie1.determineAmount((int)'4');
    double d8 = regularMovie1.determineAmount(0);
    regularMovie1.setPriceCode((int)' ');
    int i11 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 32);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i5 = childrensMovie1.determineFrequentRenterPoints(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    int i7 = childrensMovie1.determineFrequentRenterPoints(100);
    double d9 = childrensMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.5d);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount((int)'a');
    double d6 = newReleaseMovie1.determineAmount((int)(byte)0);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.statement();
    java.lang.String str6 = customer1.statement();
    nul.study.videostore.Customer customer8 = new nul.study.videostore.Customer("hi!");
    java.lang.String str9 = customer8.getName();
    java.lang.String str10 = customer8.getName();
    nul.study.videostore.RentalStatement rentalStatement12 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    rentalStatement12.addRental(rental16);
    customer8.addRental(rental16);
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i22 = newReleaseMovie21.getPriceCode();
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 1);
    int i25 = rental24.getDaysRented();
    int i26 = rental24.getDaysRented();
    double d27 = rental24.determineAmount();
    int i28 = rental24.getDaysRented();
    customer8.addRental(rental24);
    java.lang.String str30 = customer8.statement();
    nul.study.videostore.Customer customer32 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie34 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental36 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie34, 0);
    int i37 = rental36.determineFrequentRenterPoints();
    customer32.addRental(rental36);
    int i39 = rental36.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie40 = rental36.getMovie();
    customer8.addRental(rental36);
    customer1.addRental(rental36);
    java.lang.String str43 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str30.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str43.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    double d10 = newReleaseMovie1.determineAmount(100);
    newReleaseMovie1.setPriceCode((int)' ');
    int i14 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    double d16 = newReleaseMovie1.determineAmount(1);
    java.lang.String str17 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    nul.study.videostore.Movie movie6 = rental3.getMovie();
    double d7 = rental3.determineAmount();
    nul.study.videostore.Movie movie8 = rental3.getMovie();
    int i9 = movie8.getPriceCode();
    java.lang.String str10 = movie8.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    customer1.addRental(rental9);
    nul.study.videostore.RentalStatement rentalStatement14 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 0);
    int i19 = rental18.determineFrequentRenterPoints();
    rentalStatement14.addRental(rental18);
    java.lang.String str21 = rentalStatement14.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement23 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, 0);
    int i28 = rental27.determineFrequentRenterPoints();
    rentalStatement23.addRental(rental27);
    double d30 = rental27.determineAmount();
    double d31 = rental27.determineAmount();
    rentalStatement14.addRental(rental27);
    double d33 = rental27.determineAmount();
    customer1.addRental(rental27);
    double d35 = rental27.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str21.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 0.0d);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    int i13 = rentalStatement1.getFrequentRenterPoints();
    int i14 = rentalStatement1.getFrequentRenterPoints();
    int i15 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i18 = newReleaseMovie17.getPriceCode();
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i21 = newReleaseMovie17.getPriceCode();
    int i23 = newReleaseMovie17.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, (int)(short)10);
    int i26 = rental25.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental25);
    int i28 = rental25.determineFrequentRenterPoints();
    int i29 = rental25.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 10);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(short)1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 10);
    double d7 = rental6.determineAmount();
    int i8 = rental6.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 10);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    double d18 = rental14.determineAmount();
    customer1.addRental(rental14);
    java.lang.String str20 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie22 = new nul.study.videostore.NewReleaseMovie("");
    int i23 = newReleaseMovie22.getPriceCode();
    int i25 = newReleaseMovie22.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, (-1));
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, (int)(byte)10);
    int i30 = rental29.getDaysRented();
    double d31 = rental29.determineAmount();
    customer1.addRental(rental29);
    nul.study.videostore.RentalStatement rentalStatement34 = new nul.study.videostore.RentalStatement("");
    int i35 = rentalStatement34.getFrequentRenterPoints();
    java.lang.String str36 = rentalStatement34.getName();
    int i37 = rentalStatement34.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement39 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie41 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental43 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie41, 0);
    int i44 = rental43.determineFrequentRenterPoints();
    rentalStatement39.addRental(rental43);
    double d46 = rental43.determineAmount();
    rentalStatement34.addRental(rental43);
    int i48 = rental43.getDaysRented();
    customer1.addRental(rental43);
    java.lang.String str50 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t30.0\n\t\t0.0\nYou owed 33.0\nYou earned 5 frequent renter points\n"+ "'", str50.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t30.0\n\t\t0.0\nYou owed 33.0\nYou earned 5 frequent renter points\n"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \n\t\t0.0\n\t\t30.0\n\t\t0.0\nYou owed 30.0\nYou earned 4 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t30.0\n\t\t0.0\nYou owed 30.0\nYou earned 4 frequent renter points\n"+ "'", str2.equals("Rental Record for \n\t\t0.0\n\t\t30.0\n\t\t0.0\nYou owed 30.0\nYou earned 4 frequent renter points\n"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    double d7 = regularMovie1.determineAmount((int)(byte)10);
    double d9 = regularMovie1.determineAmount((int)(short)10);
    regularMovie1.setPriceCode((int)'4');
    int i13 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i14 = regularMovie1.getPriceCode();
    java.lang.String str15 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(short)-1);
    int i18 = rental17.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str15.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.getName();
    nul.study.videostore.ChildrensMovie childrensMovie10 = new nul.study.videostore.ChildrensMovie("");
    int i12 = childrensMovie10.determineFrequentRenterPoints(1);
    int i14 = childrensMovie10.determineFrequentRenterPoints(2);
    double d16 = childrensMovie10.determineAmount(10);
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie10, (int)(short)0);
    customer1.addRental(rental18);
    nul.study.videostore.Movie movie20 = rental18.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == (-3.0d));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    int i15 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer17 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 0);
    int i22 = rental21.determineFrequentRenterPoints();
    customer17.addRental(rental21);
    int i24 = rental21.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie25 = rental21.getMovie();
    int i26 = rental21.getDaysRented();
    int i27 = rental21.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie28 = rental21.getMovie();
    rentalStatement1.addRental(rental21);
    int i30 = rental21.determineFrequentRenterPoints();
    double d31 = rental21.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 0.0d);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = childrensMovie1.getTitle();
    int i4 = childrensMovie1.determineFrequentRenterPoints((int)(byte)-1);
    double d6 = childrensMovie1.determineAmount(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 45.0d);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie4 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie4, 0);
    int i7 = rental6.determineFrequentRenterPoints();
    int i8 = rental6.determineFrequentRenterPoints();
    int i9 = rental6.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental6);
    nul.study.videostore.Movie movie11 = rental6.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    int i8 = rental5.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental5.getMovie();
    nul.study.videostore.Movie movie10 = rental5.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    int i10 = rental9.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie11 = rental9.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    customer1.addRental(rental9);
    java.lang.String str13 = customer1.statement();
    java.lang.String str14 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("");
    int i17 = newReleaseMovie16.getPriceCode();
    int i19 = newReleaseMovie16.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, (-1));
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, (int)(byte)10);
    int i24 = rental23.getDaysRented();
    double d25 = rental23.determineAmount();
    int i26 = rental23.getDaysRented();
    customer1.addRental(rental23);
    nul.study.videostore.Customer customer29 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer31 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie33 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i34 = newReleaseMovie33.getPriceCode();
    nul.study.videostore.Rental rental36 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie33, 1);
    int i37 = rental36.getDaysRented();
    customer31.addRental(rental36);
    customer29.addRental(rental36);
    nul.study.videostore.RentalStatement rentalStatement41 = new nul.study.videostore.RentalStatement("");
    int i42 = rentalStatement41.getFrequentRenterPoints();
    java.lang.String str43 = rentalStatement41.getName();
    int i44 = rentalStatement41.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement46 = new nul.study.videostore.RentalStatement("");
    int i47 = rentalStatement46.getFrequentRenterPoints();
    nul.study.videostore.Customer customer49 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie51 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental53 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie51, 0);
    int i54 = rental53.determineFrequentRenterPoints();
    customer49.addRental(rental53);
    int i56 = rental53.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie57 = rental53.getMovie();
    rentalStatement46.addRental(rental53);
    rentalStatement41.addRental(rental53);
    nul.study.videostore.Customer customer61 = new nul.study.videostore.Customer("hi!");
    java.lang.String str62 = customer61.getName();
    java.lang.String str63 = customer61.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie65 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i66 = newReleaseMovie65.getPriceCode();
    nul.study.videostore.Rental rental68 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie65, 1);
    int i69 = rental68.getDaysRented();
    customer61.addRental(rental68);
    nul.study.videostore.NewReleaseMovie newReleaseMovie72 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental74 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie72, 0);
    int i75 = rental74.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie76 = rental74.getMovie();
    nul.study.videostore.Movie movie77 = rental74.getMovie();
    double d78 = rental74.determineAmount();
    customer61.addRental(rental74);
    java.lang.String str80 = customer61.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie82 = new nul.study.videostore.NewReleaseMovie("");
    int i83 = newReleaseMovie82.getPriceCode();
    int i85 = newReleaseMovie82.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental87 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie82, (-1));
    nul.study.videostore.Rental rental89 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie82, (int)(byte)10);
    int i90 = rental89.getDaysRented();
    double d91 = rental89.determineAmount();
    customer61.addRental(rental89);
    double d93 = rental89.determineAmount();
    rentalStatement41.addRental(rental89);
    customer29.addRental(rental89);
    customer1.addRental(rental89);
    java.lang.String str97 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!"+ "'", str62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!"+ "'", str63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d78 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str80.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d91 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d93 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str97 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\t\t30.0\n\t\t30.0\nYou owed 60.0\nYou earned 5 frequent renter points\n"+ "'", str97.equals("Rental Record for hi!\n\t\t0.0\n\t\t30.0\n\t\t30.0\nYou owed 60.0\nYou earned 5 frequent renter points\n"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(100);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints(10);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)1);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 10);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\n\thi!\t300.0\nYou owed 303.0\nYou earned 4 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    double d5 = newReleaseMovie1.determineAmount((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 96.0d);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    int i8 = regularMovie1.getPriceCode();
    java.lang.String str9 = regularMovie1.getTitle();
    regularMovie1.setPriceCode((-1));
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 10);
    int i15 = regularMovie1.determineFrequentRenterPoints(0);
    int i16 = regularMovie1.getPriceCode();
    regularMovie1.setPriceCode((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }


    nul.study.videostore.Movie movie0 = null;
    // The following exception was thrown during execution in test generation
    try {
    nul.study.videostore.Rental rental2 = new nul.study.videostore.Rental(movie0, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie1.determineFrequentRenterPoints(2);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)100);
    double d11 = childrensMovie1.determineAmount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 147.0d);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\n\t\t0.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    java.lang.String str15 = rentalStatement1.getName();
    int i16 = rentalStatement1.getFrequentRenterPoints();
    double d17 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RegularMovie regularMovie19 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str20 = regularMovie19.getTitle();
    double d22 = regularMovie19.determineAmount((int)(byte)-1);
    java.lang.String str23 = regularMovie19.getTitle();
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie19, (int)(byte)-1);
    nul.study.videostore.Movie movie26 = rental25.getMovie();
    rentalStatement1.addRental(rental25);
    double d28 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement30 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie32 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental34 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie32, 0);
    int i35 = rental34.determineFrequentRenterPoints();
    rentalStatement30.addRental(rental34);
    int i37 = rental34.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str23.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    double d6 = newReleaseMovie1.determineAmount((int)' ');
    java.lang.String str7 = newReleaseMovie1.getTitle();
    java.lang.String str8 = newReleaseMovie1.getTitle();
    int i9 = newReleaseMovie1.getPriceCode();
    int i11 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(100);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints(10);
    int i6 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    customer6.addRental(rental11);
    double d13 = rental11.determineAmount();
    customer1.addRental(rental11);
    java.lang.String str15 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement17 = new nul.study.videostore.RentalStatement("");
    int i18 = rentalStatement17.getFrequentRenterPoints();
    nul.study.videostore.Customer customer20 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie22 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, 0);
    int i25 = rental24.determineFrequentRenterPoints();
    customer20.addRental(rental24);
    int i27 = rental24.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie28 = rental24.getMovie();
    rentalStatement17.addRental(rental24);
    java.lang.String str30 = rentalStatement17.makeRentalStatement();
    java.lang.String str31 = rentalStatement17.getName();
    double d32 = rentalStatement17.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement34 = new nul.study.videostore.RentalStatement("");
    int i35 = rentalStatement34.getFrequentRenterPoints();
    java.lang.String str36 = rentalStatement34.getName();
    int i37 = rentalStatement34.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie39 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental41 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie39, 0);
    int i42 = rental41.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie43 = rental41.getMovie();
    nul.study.videostore.Movie movie44 = rental41.getMovie();
    rentalStatement34.addRental(rental41);
    rentalStatement17.addRental(rental41);
    customer1.addRental(rental41);
    int i48 = rental41.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str30.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + ""+ "'", str36.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i14 = newReleaseMovie12.determineFrequentRenterPoints(100);
    double d16 = newReleaseMovie12.determineAmount((int)' ');
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, (int)(byte)100);
    double d19 = rental18.determineAmount();
    rentalStatement1.addRental(rental18);
    nul.study.videostore.Movie movie21 = rental18.getMovie();
    int i22 = rental18.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    java.lang.String str4 = regularMovie1.getTitle();
    int i5 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(short)10);
    double d5 = childrensMovie1.determineAmount((int)(short)10);
    double d7 = childrensMovie1.determineAmount(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.getName();
    java.lang.String str9 = customer1.statement();
    java.lang.String str10 = customer1.getName();
    nul.study.videostore.RegularMovie regularMovie12 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str13 = regularMovie12.getTitle();
    double d15 = regularMovie12.determineAmount((int)(byte)-1);
    java.lang.String str16 = regularMovie12.getTitle();
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie12, (int)(byte)-1);
    nul.study.videostore.Movie movie19 = rental18.getMovie();
    int i20 = rental18.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie21 = rental18.getMovie();
    customer1.addRental(rental18);
    int i23 = rental18.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str13.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str16.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == (-1));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(100);
    double d11 = regularMovie1.determineAmount(1);
    int i13 = regularMovie1.determineFrequentRenterPoints((int)'4');
    double d15 = regularMovie1.determineAmount((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 2.0d);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.getName();
    java.lang.String str9 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = newReleaseMovie11.getPriceCode();
    double d16 = newReleaseMovie11.determineAmount((int)(short)0);
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, (int)'#');
    customer1.addRental(rental18);
    double d20 = rental18.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 105.0d);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = regularMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    int i7 = childrensMovie1.determineFrequentRenterPoints(1);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    double d15 = rentalStatement1.getAmountOwed();
    java.lang.String str16 = rentalStatement1.makeRentalStatement();
    java.lang.String str17 = rentalStatement1.getName();
    int i18 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    double d3 = regularMovie1.determineAmount(0);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)'a');
    double d7 = regularMovie1.determineAmount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\thi!\t3.0\nYou owed 6.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    int i7 = childrensMovie1.determineFrequentRenterPoints(100);
    int i9 = childrensMovie1.determineFrequentRenterPoints(0);
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    java.lang.String str12 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    double d3 = rentalStatement1.getAmountOwed();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str5 = rentalStatement1.getName();
    double d6 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str5.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    childrensMovie1.setPriceCode(52);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer3 = new nul.study.videostore.Customer("hi!");
    java.lang.String str4 = customer3.getName();
    java.lang.String str5 = customer3.getName();
    nul.study.videostore.Customer customer7 = new nul.study.videostore.Customer("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    java.lang.String str8 = customer7.getName();
    java.lang.String str9 = customer7.statement();
    java.lang.String str10 = customer7.statement();
    nul.study.videostore.Customer customer12 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    customer12.addRental(rental16);
    java.lang.String str19 = customer12.statement();
    java.lang.String str20 = customer12.statement();
    java.lang.String str21 = customer12.getName();
    java.lang.String str22 = customer12.statement();
    java.lang.String str23 = customer12.getName();
    nul.study.videostore.Customer customer25 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 0);
    int i30 = rental29.determineFrequentRenterPoints();
    customer25.addRental(rental29);
    int i32 = rental29.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie33 = rental29.getMovie();
    int i34 = rental29.determineFrequentRenterPoints();
    customer12.addRental(rental29);
    customer7.addRental(rental29);
    customer3.addRental(rental29);
    rentalStatement1.addRental(rental29);
    int i39 = rental29.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str9.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str10.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str19.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str22.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    regularMovie1.setPriceCode(2);
    java.lang.String str7 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)1);
    java.lang.String str10 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str10.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.statement();
    java.lang.String str5 = customer1.statement();
    java.lang.String str6 = customer1.statement();
    java.lang.String str7 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement4 = new nul.study.videostore.RentalStatement("");
    int i5 = rentalStatement4.getFrequentRenterPoints();
    nul.study.videostore.Customer customer7 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    customer7.addRental(rental11);
    int i14 = rental11.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie15 = rental11.getMovie();
    rentalStatement4.addRental(rental11);
    nul.study.videostore.NewReleaseMovie newReleaseMovie18 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie18, 0);
    int i21 = rental20.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie22 = rental20.getMovie();
    rentalStatement4.addRental(rental20);
    nul.study.videostore.Movie movie24 = rental20.getMovie();
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental(movie24, (int)(short)0);
    double d27 = rental26.determineAmount();
    customer1.addRental(rental26);
    java.lang.String str29 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str29.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.statement();
    java.lang.String str6 = customer1.statement();
    nul.study.videostore.Customer customer8 = new nul.study.videostore.Customer("hi!");
    java.lang.String str9 = customer8.getName();
    java.lang.String str10 = customer8.getName();
    nul.study.videostore.RentalStatement rentalStatement12 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    rentalStatement12.addRental(rental16);
    customer8.addRental(rental16);
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i22 = newReleaseMovie21.getPriceCode();
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 1);
    int i25 = rental24.getDaysRented();
    int i26 = rental24.getDaysRented();
    double d27 = rental24.determineAmount();
    int i28 = rental24.getDaysRented();
    customer8.addRental(rental24);
    java.lang.String str30 = customer8.statement();
    nul.study.videostore.Customer customer32 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie34 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental36 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie34, 0);
    int i37 = rental36.determineFrequentRenterPoints();
    customer32.addRental(rental36);
    int i39 = rental36.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie40 = rental36.getMovie();
    customer8.addRental(rental36);
    customer1.addRental(rental36);
    nul.study.videostore.RentalStatement rentalStatement44 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie46 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental48 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie46, 0);
    int i49 = rental48.determineFrequentRenterPoints();
    rentalStatement44.addRental(rental48);
    int i51 = rental48.determineFrequentRenterPoints();
    int i52 = rental48.determineFrequentRenterPoints();
    customer1.addRental(rental48);
    java.lang.String str54 = customer1.getName();
    java.lang.String str55 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str30.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "hi!"+ "'", str54.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str55.equals("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)'a');
    int i5 = regularMovie1.determineFrequentRenterPoints(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 156.0d);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    nul.study.videostore.ChildrensMovie childrensMovie14 = new nul.study.videostore.ChildrensMovie("");
    int i16 = childrensMovie14.determineFrequentRenterPoints(1);
    int i18 = childrensMovie14.determineFrequentRenterPoints(2);
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie14, (int)(short)1);
    rentalStatement1.addRental(rental20);
    double d22 = rental20.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 1.5d);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.statement();
    nul.study.videostore.RegularMovie regularMovie7 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str8 = regularMovie7.getTitle();
    double d10 = regularMovie7.determineAmount((int)(byte)-1);
    java.lang.String str11 = regularMovie7.getTitle();
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie7, (int)(byte)-1);
    int i14 = rental13.determineFrequentRenterPoints();
    int i15 = rental13.determineFrequentRenterPoints();
    customer1.addRental(rental13);
    nul.study.videostore.Rental rental17 = null;
    // The following exception was thrown during execution in test generation
    try {
    customer1.addRental(rental17);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(100);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)-1);
    nul.study.videostore.Movie movie6 = rental5.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie6);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)(short)100);
    double d7 = childrensMovie1.determineAmount(0);
    int i9 = childrensMovie1.determineFrequentRenterPoints(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    customer1.addRental(rental6);
    java.lang.String str8 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    int i11 = newReleaseMovie10.getPriceCode();
    int i13 = newReleaseMovie10.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, (-1));
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, (int)(short)0);
    customer1.addRental(rental17);
    java.lang.String str19 = customer1.getName();
    nul.study.videostore.Customer customer21 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie23 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie23, 0);
    int i26 = rental25.determineFrequentRenterPoints();
    customer21.addRental(rental25);
    java.lang.String str28 = customer21.statement();
    nul.study.videostore.Customer customer30 = new nul.study.videostore.Customer("hi!");
    java.lang.String str31 = customer30.statement();
    nul.study.videostore.RentalStatement rentalStatement33 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie35 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental37 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie35, 0);
    int i38 = rental37.determineFrequentRenterPoints();
    rentalStatement33.addRental(rental37);
    int i40 = rental37.determineFrequentRenterPoints();
    int i41 = rental37.determineFrequentRenterPoints();
    customer30.addRental(rental37);
    customer21.addRental(rental37);
    customer1.addRental(rental37);
    java.lang.String str45 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str28.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str31.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"+ "'", str45.equals("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = newReleaseMovie1.getPriceCode();
    newReleaseMovie1.setPriceCode(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i5 = newReleaseMovie1.getPriceCode();
    newReleaseMovie1.setPriceCode((int)'#');
    int i9 = newReleaseMovie1.determineFrequentRenterPoints(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    int i8 = regularMovie1.getPriceCode();
    java.lang.String str9 = regularMovie1.getTitle();
    regularMovie1.setPriceCode((-1));
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 10);
    int i14 = rental13.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    java.lang.String str5 = customer4.getName();
    java.lang.String str6 = customer4.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 1);
    int i12 = rental11.getDaysRented();
    customer4.addRental(rental11);
    nul.study.videostore.NewReleaseMovie newReleaseMovie15 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie15, 0);
    int i18 = rental17.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie19 = rental17.getMovie();
    nul.study.videostore.Movie movie20 = rental17.getMovie();
    double d21 = rental17.determineAmount();
    customer4.addRental(rental17);
    int i23 = rental17.determineFrequentRenterPoints();
    customer1.addRental(rental17);
    nul.study.videostore.Customer customer26 = new nul.study.videostore.Customer("hi!");
    java.lang.String str27 = customer26.getName();
    java.lang.String str28 = customer26.getName();
    nul.study.videostore.RentalStatement rentalStatement30 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie32 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental34 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie32, 0);
    int i35 = rental34.determineFrequentRenterPoints();
    rentalStatement30.addRental(rental34);
    customer26.addRental(rental34);
    customer1.addRental(rental34);
    java.lang.String str39 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str39.equals("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\n\t\t0.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    int i7 = childrensMovie1.determineFrequentRenterPoints(100);
    childrensMovie1.setPriceCode((int)(byte)0);
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    double d3 = rentalStatement1.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    rentalStatement1.addRental(rental7);
    int i9 = rental7.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)-1);
    java.lang.String str4 = regularMovie1.getTitle();
    double d6 = regularMovie1.determineAmount((int)(byte)1);
    int i8 = regularMovie1.determineFrequentRenterPoints(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    double d15 = rentalStatement1.getAmountOwed();
    java.lang.String str16 = rentalStatement1.makeRentalStatement();
    java.lang.String str17 = rentalStatement1.getName();
    double d18 = rentalStatement1.getAmountOwed();
    java.lang.String str19 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str19.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    int i11 = rental10.determineFrequentRenterPoints();
    rentalStatement6.addRental(rental10);
    rentalStatement1.addRental(rental10);
    double d14 = rentalStatement1.getAmountOwed();
    java.lang.String str15 = rentalStatement1.makeRentalStatement();
    java.lang.String str16 = rentalStatement1.getName();
    int i17 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str18 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    int i13 = rentalStatement1.getFrequentRenterPoints();
    int i14 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement16 = new nul.study.videostore.RentalStatement("");
    int i17 = rentalStatement16.getFrequentRenterPoints();
    nul.study.videostore.Customer customer19 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 0);
    int i24 = rental23.determineFrequentRenterPoints();
    customer19.addRental(rental23);
    int i26 = rental23.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie27 = rental23.getMovie();
    rentalStatement16.addRental(rental23);
    nul.study.videostore.NewReleaseMovie newReleaseMovie30 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie30, 0);
    int i33 = rental32.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie34 = rental32.getMovie();
    rentalStatement16.addRental(rental32);
    rentalStatement1.addRental(rental32);
    double d37 = rentalStatement1.getAmountOwed();
    java.lang.String str38 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str38.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("hi!");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    customer1.addRental(rental9);
    java.lang.String str13 = customer1.statement();
    java.lang.String str14 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("");
    int i17 = newReleaseMovie16.getPriceCode();
    int i19 = newReleaseMovie16.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, (-1));
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, (int)(byte)10);
    int i24 = rental23.getDaysRented();
    double d25 = rental23.determineAmount();
    int i26 = rental23.getDaysRented();
    customer1.addRental(rental23);
    nul.study.videostore.Customer customer29 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer31 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie33 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i34 = newReleaseMovie33.getPriceCode();
    nul.study.videostore.Rental rental36 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie33, 1);
    int i37 = rental36.getDaysRented();
    customer31.addRental(rental36);
    customer29.addRental(rental36);
    nul.study.videostore.RentalStatement rentalStatement41 = new nul.study.videostore.RentalStatement("");
    int i42 = rentalStatement41.getFrequentRenterPoints();
    java.lang.String str43 = rentalStatement41.getName();
    int i44 = rentalStatement41.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement46 = new nul.study.videostore.RentalStatement("");
    int i47 = rentalStatement46.getFrequentRenterPoints();
    nul.study.videostore.Customer customer49 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie51 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental53 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie51, 0);
    int i54 = rental53.determineFrequentRenterPoints();
    customer49.addRental(rental53);
    int i56 = rental53.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie57 = rental53.getMovie();
    rentalStatement46.addRental(rental53);
    rentalStatement41.addRental(rental53);
    nul.study.videostore.Customer customer61 = new nul.study.videostore.Customer("hi!");
    java.lang.String str62 = customer61.getName();
    java.lang.String str63 = customer61.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie65 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i66 = newReleaseMovie65.getPriceCode();
    nul.study.videostore.Rental rental68 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie65, 1);
    int i69 = rental68.getDaysRented();
    customer61.addRental(rental68);
    nul.study.videostore.NewReleaseMovie newReleaseMovie72 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental74 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie72, 0);
    int i75 = rental74.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie76 = rental74.getMovie();
    nul.study.videostore.Movie movie77 = rental74.getMovie();
    double d78 = rental74.determineAmount();
    customer61.addRental(rental74);
    java.lang.String str80 = customer61.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie82 = new nul.study.videostore.NewReleaseMovie("");
    int i83 = newReleaseMovie82.getPriceCode();
    int i85 = newReleaseMovie82.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental87 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie82, (-1));
    nul.study.videostore.Rental rental89 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie82, (int)(byte)10);
    int i90 = rental89.getDaysRented();
    double d91 = rental89.determineAmount();
    customer61.addRental(rental89);
    double d93 = rental89.determineAmount();
    rentalStatement41.addRental(rental89);
    customer29.addRental(rental89);
    customer1.addRental(rental89);
    int i97 = rental89.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie98 = rental89.getMovie();
    nul.study.videostore.Movie movie99 = rental89.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + ""+ "'", str43.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!"+ "'", str62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "hi!"+ "'", str63.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie77);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d78 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str80.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d91 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d93 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i97 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie98);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie99);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(short)1);
    int i5 = regularMovie1.determineFrequentRenterPoints((int)(byte)100);
    int i6 = regularMovie1.getPriceCode();
    double d8 = regularMovie1.determineAmount((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 149.0d);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    double d6 = newReleaseMovie1.determineAmount((int)' ');
    java.lang.String str7 = newReleaseMovie1.getTitle();
    newReleaseMovie1.setPriceCode((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount((int)(byte)10);
    int i4 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)'4');
    int i5 = regularMovie1.determineFrequentRenterPoints(4);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    childrensMovie1.setPriceCode((int)(byte)10);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    double d13 = newReleaseMovie1.determineAmount(0);
    int i15 = newReleaseMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    int i9 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    java.lang.String str10 = regularMovie1.getTitle();
    regularMovie1.setPriceCode(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)(short)1);
    int i7 = childrensMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)(byte)100);
    double d11 = childrensMovie1.determineAmount((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 12.0d);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)1);
    java.lang.String str8 = childrensMovie1.getTitle();
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(byte)100);
    int i12 = childrensMovie1.determineFrequentRenterPoints((int)(short)10);
    int i14 = childrensMovie1.determineFrequentRenterPoints(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    nul.study.videostore.Movie movie9 = rental8.getMovie();
    movie9.setPriceCode((int)(byte)10);
    movie9.setPriceCode((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    double d5 = childrensMovie1.determineAmount((int)'4');
    double d7 = childrensMovie1.determineAmount((int)(short)10);
    int i9 = childrensMovie1.determineFrequentRenterPoints(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)1);
    double d9 = childrensMovie1.determineAmount(4);
    double d11 = childrensMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.5d);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints(0);
    newReleaseMovie1.setPriceCode((int)(short)0);
    newReleaseMovie1.setPriceCode(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints(10);
    double d6 = newReleaseMovie1.determineAmount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 3.0d);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement4 = new nul.study.videostore.RentalStatement("");
    int i5 = rentalStatement4.getFrequentRenterPoints();
    nul.study.videostore.Customer customer7 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    customer7.addRental(rental11);
    int i14 = rental11.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie15 = rental11.getMovie();
    rentalStatement4.addRental(rental11);
    java.lang.String str17 = rentalStatement4.makeRentalStatement();
    nul.study.videostore.Customer customer19 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 0);
    int i24 = rental23.determineFrequentRenterPoints();
    customer19.addRental(rental23);
    rentalStatement4.addRental(rental23);
    rentalStatement1.addRental(rental23);
    int i28 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str29 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str29.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = newReleaseMovie1.getTitle();
    newReleaseMovie1.setPriceCode((-1));
    double d6 = newReleaseMovie1.determineAmount((int)(short)1);
    java.lang.String str7 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str7.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    java.lang.String str15 = rentalStatement1.makeRentalStatement();
    java.lang.String str16 = rentalStatement1.makeRentalStatement();
    java.lang.String str17 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    customer1.addRental(rental9);
    java.lang.String str13 = customer1.statement();
    java.lang.String str14 = customer1.statement();
    java.lang.String str15 = customer1.getName();
    java.lang.String str16 = customer1.getName();
    java.lang.String str17 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    double d7 = childrensMovie1.determineAmount(0);
    childrensMovie1.setPriceCode((int)(short)10);
    double d11 = childrensMovie1.determineAmount((int)(short)1);
    int i13 = childrensMovie1.determineFrequentRenterPoints(32);
    int i15 = childrensMovie1.determineFrequentRenterPoints(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)0);
    int i4 = rental3.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    newReleaseMovie1.setPriceCode((int)(byte)100);
    int i14 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 100);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    double d3 = regularMovie1.determineAmount(52);
    double d5 = regularMovie1.determineAmount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 77.0d);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.statement();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    customer6.addRental(rental11);
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie18 = rental16.getMovie();
    nul.study.videostore.Movie movie19 = rental16.getMovie();
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental(movie19, (int)(byte)0);
    customer6.addRental(rental21);
    int i23 = rental21.getDaysRented();
    int i24 = rental21.determineFrequentRenterPoints();
    customer1.addRental(rental21);
    java.lang.String str26 = customer1.statement();
    java.lang.String str27 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str26.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    double d4 = childrensMovie1.determineAmount(10);
    childrensMovie1.setPriceCode((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 12.0d);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    double d10 = newReleaseMovie1.determineAmount(100);
    newReleaseMovie1.setPriceCode((int)' ');
    int i14 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    double d16 = newReleaseMovie1.determineAmount(1);
    int i17 = newReleaseMovie1.getPriceCode();
    int i19 = newReleaseMovie1.determineFrequentRenterPoints(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 2);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    int i6 = regularMovie1.determineFrequentRenterPoints(0);
    int i7 = regularMovie1.getPriceCode();
    double d9 = regularMovie1.determineAmount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i3 = regularMovie1.getPriceCode();
    int i5 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    int i6 = regularMovie1.getPriceCode();
    java.lang.String str7 = regularMovie1.getTitle();
    int i8 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)'4');
    double d5 = newReleaseMovie1.determineAmount((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-3.0d));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    nul.study.videostore.Movie movie6 = rental3.getMovie();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental(movie6, 0);
    int i9 = movie6.getPriceCode();
    java.lang.String str10 = movie6.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    java.lang.String str5 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie11 = rental9.getMovie();
    nul.study.videostore.Movie movie12 = rental9.getMovie();
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental(movie12, (int)(byte)0);
    rentalStatement1.addRental(rental14);
    double d16 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RegularMovie regularMovie18 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str19 = regularMovie18.getTitle();
    double d21 = regularMovie18.determineAmount((int)(short)1);
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie18, 10);
    rentalStatement1.addRental(rental23);
    nul.study.videostore.RentalStatement rentalStatement26 = new nul.study.videostore.RentalStatement("");
    int i27 = rentalStatement26.getFrequentRenterPoints();
    nul.study.videostore.Customer customer29 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie31 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental33 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie31, 0);
    int i34 = rental33.determineFrequentRenterPoints();
    customer29.addRental(rental33);
    int i36 = rental33.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie37 = rental33.getMovie();
    rentalStatement26.addRental(rental33);
    java.lang.String str39 = rentalStatement26.makeRentalStatement();
    java.lang.String str40 = rentalStatement26.getName();
    int i41 = rentalStatement26.getFrequentRenterPoints();
    int i42 = rentalStatement26.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie44 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i45 = newReleaseMovie44.getPriceCode();
    nul.study.videostore.Rental rental47 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie44, 1);
    int i48 = rental47.getDaysRented();
    int i49 = rental47.getDaysRented();
    double d50 = rental47.determineAmount();
    int i51 = rental47.getDaysRented();
    rentalStatement26.addRental(rental47);
    int i53 = rental47.getDaysRented();
    rentalStatement1.addRental(rental47);
    double d55 = rental47.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str19.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str39.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d50 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d55 == 3.0d);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    int i9 = regularMovie1.determineFrequentRenterPoints((int)'a');
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 100);
    int i12 = rental11.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.getName();
    java.lang.String str6 = customer1.getName();
    nul.study.videostore.Customer customer8 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer10 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i13 = newReleaseMovie12.getPriceCode();
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 1);
    int i16 = rental15.getDaysRented();
    customer10.addRental(rental15);
    customer8.addRental(rental15);
    nul.study.videostore.RentalStatement rentalStatement20 = new nul.study.videostore.RentalStatement("");
    int i21 = rentalStatement20.getFrequentRenterPoints();
    java.lang.String str22 = rentalStatement20.getName();
    int i23 = rentalStatement20.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, 0);
    int i28 = rental27.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie29 = rental27.getMovie();
    nul.study.videostore.Movie movie30 = rental27.getMovie();
    rentalStatement20.addRental(rental27);
    double d32 = rental27.determineAmount();
    int i33 = rental27.getDaysRented();
    double d34 = rental27.determineAmount();
    customer8.addRental(rental27);
    customer1.addRental(rental27);
    java.lang.String str37 = customer1.getName();
    java.lang.String str38 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str38.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie1.determineFrequentRenterPoints(2);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)100);
    nul.study.videostore.Movie movie10 = rental9.getMovie();
    movie10.setPriceCode((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.ChildrensMovie childrensMovie5 = new nul.study.videostore.ChildrensMovie("");
    int i7 = childrensMovie5.determineFrequentRenterPoints(1);
    int i9 = childrensMovie5.determineFrequentRenterPoints(2);
    int i11 = childrensMovie5.determineFrequentRenterPoints(100);
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie5, (int)' ');
    int i14 = rental13.determineFrequentRenterPoints();
    customer1.addRental(rental13);
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 10);
    customer1.addRental(rental19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    java.lang.String str12 = newReleaseMovie1.getTitle();
    int i14 = newReleaseMovie1.determineFrequentRenterPoints((int)'#');
    int i15 = newReleaseMovie1.getPriceCode();
    int i17 = newReleaseMovie1.determineFrequentRenterPoints((int)' ');
    double d19 = newReleaseMovie1.determineAmount(100);
    int i21 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(100);
    double d11 = regularMovie1.determineAmount(1);
    int i13 = regularMovie1.determineFrequentRenterPoints((int)'4');
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(100);
    java.lang.String str10 = regularMovie1.getTitle();
    int i11 = regularMovie1.getPriceCode();
    int i13 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)'4');
    int i5 = regularMovie1.determineFrequentRenterPoints(4);
    int i7 = regularMovie1.determineFrequentRenterPoints((-1));
    double d9 = regularMovie1.determineAmount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 77.0d);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    int i4 = newReleaseMovie3.getPriceCode();
    int i6 = newReleaseMovie3.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, (-1));
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, (int)(short)0);
    customer1.addRental(rental10);
    nul.study.videostore.RentalStatement rentalStatement13 = new nul.study.videostore.RentalStatement("");
    int i14 = rentalStatement13.getFrequentRenterPoints();
    java.lang.String str15 = rentalStatement13.getName();
    int i16 = rentalStatement13.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie18 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie18, 0);
    int i21 = rental20.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie22 = rental20.getMovie();
    nul.study.videostore.Movie movie23 = rental20.getMovie();
    rentalStatement13.addRental(rental20);
    int i25 = rentalStatement13.getFrequentRenterPoints();
    int i26 = rentalStatement13.getFrequentRenterPoints();
    int i27 = rentalStatement13.getFrequentRenterPoints();
    double d28 = rentalStatement13.getAmountOwed();
    java.lang.String str29 = rentalStatement13.makeRentalStatement();
    nul.study.videostore.Customer customer31 = new nul.study.videostore.Customer("hi!");
    java.lang.String str32 = customer31.getName();
    java.lang.String str33 = customer31.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie35 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i36 = newReleaseMovie35.getPriceCode();
    nul.study.videostore.Rental rental38 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie35, 1);
    int i39 = rental38.getDaysRented();
    customer31.addRental(rental38);
    nul.study.videostore.NewReleaseMovie newReleaseMovie42 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental44 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie42, 0);
    int i45 = rental44.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie46 = rental44.getMovie();
    nul.study.videostore.Movie movie47 = rental44.getMovie();
    double d48 = rental44.determineAmount();
    customer31.addRental(rental44);
    java.lang.String str50 = customer31.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie52 = new nul.study.videostore.NewReleaseMovie("");
    int i53 = newReleaseMovie52.getPriceCode();
    int i55 = newReleaseMovie52.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental57 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie52, (-1));
    nul.study.videostore.Rental rental59 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie52, (int)(byte)10);
    int i60 = rental59.getDaysRented();
    double d61 = rental59.determineAmount();
    customer31.addRental(rental59);
    nul.study.videostore.RentalStatement rentalStatement64 = new nul.study.videostore.RentalStatement("");
    int i65 = rentalStatement64.getFrequentRenterPoints();
    java.lang.String str66 = rentalStatement64.getName();
    int i67 = rentalStatement64.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement69 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie71 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental73 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie71, 0);
    int i74 = rental73.determineFrequentRenterPoints();
    rentalStatement69.addRental(rental73);
    double d76 = rental73.determineAmount();
    rentalStatement64.addRental(rental73);
    int i78 = rental73.getDaysRented();
    customer31.addRental(rental73);
    rentalStatement13.addRental(rental73);
    customer1.addRental(rental73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str29.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str50.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d61 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + ""+ "'", str66.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    int i10 = regularMovie1.getPriceCode();
    regularMovie1.setPriceCode((int)(byte)100);
    int i14 = regularMovie1.determineFrequentRenterPoints((-1));
    int i16 = regularMovie1.determineFrequentRenterPoints(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    java.lang.String str5 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i9 = newReleaseMovie7.determineFrequentRenterPoints((int)(byte)-1);
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, (int)(short)10);
    rentalStatement1.addRental(rental11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    java.lang.String str7 = customer6.getName();
    java.lang.String str8 = customer6.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i11 = newReleaseMovie10.getPriceCode();
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 1);
    int i14 = rental13.getDaysRented();
    customer6.addRental(rental13);
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie21 = rental19.getMovie();
    nul.study.videostore.Movie movie22 = rental19.getMovie();
    double d23 = rental19.determineAmount();
    customer6.addRental(rental19);
    java.lang.String str25 = customer6.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    int i28 = newReleaseMovie27.getPriceCode();
    int i30 = newReleaseMovie27.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, (-1));
    nul.study.videostore.Rental rental34 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, (int)(byte)10);
    int i35 = rental34.getDaysRented();
    double d36 = rental34.determineAmount();
    customer6.addRental(rental34);
    nul.study.videostore.RentalStatement rentalStatement39 = new nul.study.videostore.RentalStatement("");
    int i40 = rentalStatement39.getFrequentRenterPoints();
    java.lang.String str41 = rentalStatement39.getName();
    int i42 = rentalStatement39.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement44 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie46 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental48 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie46, 0);
    int i49 = rental48.determineFrequentRenterPoints();
    rentalStatement44.addRental(rental48);
    double d51 = rental48.determineAmount();
    rentalStatement39.addRental(rental48);
    int i53 = rental48.getDaysRented();
    customer6.addRental(rental48);
    rentalStatement1.addRental(rental48);
    int i56 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str25.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d36 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d51 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)-1);
    java.lang.String str4 = regularMovie1.getTitle();
    double d6 = regularMovie1.determineAmount((int)(byte)1);
    double d8 = regularMovie1.determineAmount(100);
    regularMovie1.setPriceCode((int)(short)0);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 149.0d);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.statement();
    nul.study.videostore.RegularMovie regularMovie7 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str8 = regularMovie7.getTitle();
    double d10 = regularMovie7.determineAmount((int)(byte)-1);
    java.lang.String str11 = regularMovie7.getTitle();
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie7, (int)(byte)-1);
    int i14 = rental13.determineFrequentRenterPoints();
    int i15 = rental13.determineFrequentRenterPoints();
    customer1.addRental(rental13);
    nul.study.videostore.Movie movie17 = rental13.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i3 = regularMovie1.getPriceCode();
    int i5 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    int i6 = regularMovie1.getPriceCode();
    int i8 = regularMovie1.determineFrequentRenterPoints((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    int i15 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer17 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 0);
    int i22 = rental21.determineFrequentRenterPoints();
    customer17.addRental(rental21);
    int i24 = rental21.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie25 = rental21.getMovie();
    int i26 = rental21.getDaysRented();
    int i27 = rental21.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie28 = rental21.getMovie();
    rentalStatement1.addRental(rental21);
    int i30 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str31 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    customer1.addRental(rental6);
    java.lang.String str8 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    int i11 = newReleaseMovie10.getPriceCode();
    int i13 = newReleaseMovie10.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, (-1));
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, (int)(short)0);
    customer1.addRental(rental17);
    java.lang.String str19 = customer1.statement();
    java.lang.String str20 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str19.equals("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("hi!");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    int i13 = rentalStatement1.getFrequentRenterPoints();
    double d14 = rentalStatement1.getAmountOwed();
    int i15 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement17 = new nul.study.videostore.RentalStatement("");
    int i18 = rentalStatement17.getFrequentRenterPoints();
    java.lang.String str19 = rentalStatement17.getName();
    double d20 = rentalStatement17.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement22 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 0);
    int i27 = rental26.determineFrequentRenterPoints();
    rentalStatement22.addRental(rental26);
    rentalStatement17.addRental(rental26);
    rentalStatement1.addRental(rental26);
    nul.study.videostore.RentalStatement rentalStatement32 = new nul.study.videostore.RentalStatement("");
    int i33 = rentalStatement32.getFrequentRenterPoints();
    java.lang.String str34 = rentalStatement32.makeRentalStatement();
    double d35 = rentalStatement32.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement37 = new nul.study.videostore.RentalStatement("");
    int i38 = rentalStatement37.getFrequentRenterPoints();
    nul.study.videostore.Customer customer40 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie42 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental44 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie42, 0);
    int i45 = rental44.determineFrequentRenterPoints();
    customer40.addRental(rental44);
    int i47 = rental44.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie48 = rental44.getMovie();
    rentalStatement37.addRental(rental44);
    nul.study.videostore.NewReleaseMovie newReleaseMovie51 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental53 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie51, 0);
    int i54 = rental53.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie55 = rental53.getMovie();
    rentalStatement37.addRental(rental53);
    int i57 = rental53.determineFrequentRenterPoints();
    rentalStatement32.addRental(rental53);
    java.lang.String str59 = rentalStatement32.getName();
    nul.study.videostore.Customer customer61 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie63 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i64 = newReleaseMovie63.getPriceCode();
    nul.study.videostore.Rental rental66 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie63, 1);
    int i67 = rental66.getDaysRented();
    customer61.addRental(rental66);
    rentalStatement32.addRental(rental66);
    rentalStatement1.addRental(rental66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str34.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    int i7 = childrensMovie1.determineFrequentRenterPoints(100);
    double d9 = childrensMovie1.determineAmount((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 45.0d);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    customer1.addRental(rental9);
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i15 = newReleaseMovie14.getPriceCode();
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 1);
    int i18 = rental17.getDaysRented();
    int i19 = rental17.getDaysRented();
    double d20 = rental17.determineAmount();
    int i21 = rental17.getDaysRented();
    customer1.addRental(rental17);
    java.lang.String str23 = customer1.statement();
    nul.study.videostore.Customer customer25 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 0);
    int i30 = rental29.determineFrequentRenterPoints();
    customer25.addRental(rental29);
    int i32 = rental29.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie33 = rental29.getMovie();
    customer1.addRental(rental29);
    nul.study.videostore.Customer customer36 = new nul.study.videostore.Customer("hi!");
    java.lang.String str37 = customer36.getName();
    java.lang.String str38 = customer36.getName();
    nul.study.videostore.RentalStatement rentalStatement40 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie42 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental44 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie42, 0);
    int i45 = rental44.determineFrequentRenterPoints();
    rentalStatement40.addRental(rental44);
    customer36.addRental(rental44);
    nul.study.videostore.NewReleaseMovie newReleaseMovie49 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i50 = newReleaseMovie49.getPriceCode();
    nul.study.videostore.Rental rental52 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie49, 1);
    int i53 = rental52.getDaysRented();
    int i54 = rental52.getDaysRented();
    double d55 = rental52.determineAmount();
    int i56 = rental52.getDaysRented();
    customer36.addRental(rental52);
    java.lang.String str58 = customer36.statement();
    nul.study.videostore.Customer customer60 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie62 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental64 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie62, 0);
    int i65 = rental64.determineFrequentRenterPoints();
    customer60.addRental(rental64);
    int i67 = rental64.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie68 = rental64.getMovie();
    customer36.addRental(rental64);
    nul.study.videostore.Movie movie70 = rental64.getMovie();
    customer1.addRental(rental64);
    nul.study.videostore.RentalStatement rentalStatement73 = new nul.study.videostore.RentalStatement("");
    int i74 = rentalStatement73.getFrequentRenterPoints();
    java.lang.String str75 = rentalStatement73.getName();
    int i76 = rentalStatement73.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie78 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental80 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie78, 0);
    int i81 = rental80.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie82 = rental80.getMovie();
    nul.study.videostore.Movie movie83 = rental80.getMovie();
    rentalStatement73.addRental(rental80);
    double d85 = rental80.determineAmount();
    nul.study.videostore.Movie movie86 = rental80.getMovie();
    customer1.addRental(rental80);
    java.lang.String str88 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str23.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d55 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str58.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + ""+ "'", str75.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i76 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie82);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d85 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 5 frequent renter points\n"+ "'", str88.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 5 frequent renter points\n"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 144.5d);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.ChildrensMovie childrensMovie3 = new nul.study.videostore.ChildrensMovie("");
    double d5 = childrensMovie3.determineAmount((int)'a');
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie3, (int)'#');
    rentalStatement1.addRental(rental7);
    int i9 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 142.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    java.lang.String str15 = rentalStatement1.getName();
    int i16 = rentalStatement1.getFrequentRenterPoints();
    int i17 = rentalStatement1.getFrequentRenterPoints();
    double d18 = rentalStatement1.getAmountOwed();
    nul.study.videostore.Customer customer20 = new nul.study.videostore.Customer("hi!");
    java.lang.String str21 = customer20.statement();
    nul.study.videostore.RentalStatement rentalStatement23 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, 0);
    int i28 = rental27.determineFrequentRenterPoints();
    rentalStatement23.addRental(rental27);
    int i30 = rental27.determineFrequentRenterPoints();
    int i31 = rental27.determineFrequentRenterPoints();
    customer20.addRental(rental27);
    int i33 = rental27.getDaysRented();
    rentalStatement1.addRental(rental27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str21.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    int i8 = regularMovie1.getPriceCode();
    java.lang.String str9 = regularMovie1.getTitle();
    regularMovie1.setPriceCode((-1));
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 10);
    int i14 = rental13.getDaysRented();
    nul.study.videostore.Movie movie15 = rental13.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 5 frequent renter points\n");

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(short)1);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    int i7 = regularMovie1.getPriceCode();
    int i9 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    java.lang.String str10 = regularMovie1.getTitle();
    double d12 = regularMovie1.determineAmount((int)'4');
    regularMovie1.setPriceCode((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str10.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 77.0d);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }


    nul.study.videostore.Movie movie0 = null;
    // The following exception was thrown during execution in test generation
    try {
    nul.study.videostore.Rental rental2 = new nul.study.videostore.Rental(movie0, 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie1.determineFrequentRenterPoints(2);
    childrensMovie1.setPriceCode((-1));
    double d11 = childrensMovie1.determineAmount((int)(short)-1);
    int i13 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i15 = childrensMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i17 = childrensMovie1.determineFrequentRenterPoints(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    double d11 = regularMovie1.determineAmount((int)(byte)1);
    double d13 = regularMovie1.determineAmount((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 149.0d);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t30.0\n\t\t0.0\nYou owed 33.0\nYou earned 5 frequent renter points\n");

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str2.equals("Rental Record for \n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount((int)(byte)0);
    int i6 = regularMovie1.getPriceCode();
    int i8 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(100);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints(10);
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 10);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints(2);
    int i13 = newReleaseMovie1.determineFrequentRenterPoints(52);
    int i15 = newReleaseMovie1.determineFrequentRenterPoints((int)'a');
    int i17 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(100);
    double d5 = newReleaseMovie1.determineAmount((int)' ');
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)100);
    java.lang.String str8 = newReleaseMovie1.getTitle();
    int i10 = newReleaseMovie1.determineFrequentRenterPoints((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount((int)(short)10);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 1);
    java.lang.String str8 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    double d8 = rentalStatement1.getAmountOwed();
    double d9 = rentalStatement1.getAmountOwed();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    double d11 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    java.lang.String str4 = newReleaseMovie1.getTitle();
    double d6 = newReleaseMovie1.determineAmount((int)'#');
    int i8 = newReleaseMovie1.determineFrequentRenterPoints(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 105.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    double d9 = newReleaseMovie1.determineAmount((int)'4');
    double d11 = newReleaseMovie1.determineAmount((int)'4');
    double d13 = newReleaseMovie1.determineAmount(1);
    double d15 = newReleaseMovie1.determineAmount(0);
    newReleaseMovie1.setPriceCode(0);
    int i18 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 156.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 156.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints(100);
    double d5 = regularMovie1.determineAmount((int)(byte)0);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    double d10 = newReleaseMovie1.determineAmount(100);
    double d12 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)1);
    nul.study.videostore.Movie movie15 = rental14.getMovie();
    movie15.setPriceCode((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    int i5 = regularMovie1.determineFrequentRenterPoints((-1));
    regularMovie1.setPriceCode(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("hi!");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement4 = new nul.study.videostore.RentalStatement("");
    java.lang.String str5 = rentalStatement4.makeRentalStatement();
    double d6 = rentalStatement4.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 1);
    int i12 = rental11.getDaysRented();
    int i13 = rental11.getDaysRented();
    rentalStatement4.addRental(rental11);
    rentalStatement1.addRental(rental11);
    java.lang.String str16 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    double d7 = regularMovie1.determineAmount((int)(short)0);
    double d9 = regularMovie1.determineAmount((int)(byte)1);
    int i11 = regularMovie1.determineFrequentRenterPoints(32);
    int i13 = regularMovie1.determineFrequentRenterPoints((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    int i13 = rentalStatement1.getFrequentRenterPoints();
    int i14 = rentalStatement1.getFrequentRenterPoints();
    int i15 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str16 = rentalStatement1.makeRentalStatement();
    double d17 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.getName();
    java.lang.String str5 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i8 = newReleaseMovie7.getPriceCode();
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 1);
    int i11 = rental10.getDaysRented();
    rentalStatement1.addRental(rental10);
    double d13 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str5.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    int i9 = regularMovie1.determineFrequentRenterPoints((int)(byte)100);
    java.lang.String str10 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement10 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    rentalStatement10.addRental(rental14);
    double d17 = rental14.determineAmount();
    double d18 = rental14.determineAmount();
    rentalStatement1.addRental(rental14);
    nul.study.videostore.RegularMovie regularMovie21 = new nul.study.videostore.RegularMovie("");
    int i23 = regularMovie21.determineFrequentRenterPoints(0);
    double d25 = regularMovie21.determineAmount(100);
    int i27 = regularMovie21.determineFrequentRenterPoints((int)'#');
    double d29 = regularMovie21.determineAmount(100);
    double d31 = regularMovie21.determineAmount(1);
    int i33 = regularMovie21.determineFrequentRenterPoints((int)'4');
    nul.study.videostore.Rental rental35 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie21, (-1));
    nul.study.videostore.Movie movie36 = rental35.getMovie();
    rentalStatement1.addRental(rental35);
    int i38 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    customer1.addRental(rental9);
    nul.study.videostore.Customer customer14 = new nul.study.videostore.Customer("hi!");
    java.lang.String str15 = customer14.getName();
    java.lang.String str16 = customer14.getName();
    java.lang.String str17 = customer14.getName();
    java.lang.String str18 = customer14.getName();
    nul.study.videostore.RentalStatement rentalStatement20 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie22 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, 0);
    int i25 = rental24.determineFrequentRenterPoints();
    rentalStatement20.addRental(rental24);
    java.lang.String str27 = rentalStatement20.makeRentalStatement();
    java.lang.String str28 = rentalStatement20.makeRentalStatement();
    double d29 = rentalStatement20.getAmountOwed();
    nul.study.videostore.Customer customer31 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie33 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental35 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie33, 0);
    int i36 = rental35.determineFrequentRenterPoints();
    customer31.addRental(rental35);
    int i38 = rental35.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie39 = rental35.getMovie();
    int i40 = rental35.determineFrequentRenterPoints();
    rentalStatement20.addRental(rental35);
    customer14.addRental(rental35);
    customer1.addRental(rental35);
    java.lang.String str44 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str27.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str28.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str44.equals("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie1.determineFrequentRenterPoints(2);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)(short)100);
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    int i10 = regularMovie1.getPriceCode();
    regularMovie1.setPriceCode((int)(byte)100);
    int i14 = regularMovie1.determineFrequentRenterPoints((-1));
    double d16 = regularMovie1.determineAmount(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 47.0d);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }


    nul.study.videostore.Movie movie0 = null;
    // The following exception was thrown during execution in test generation
    try {
    nul.study.videostore.Rental rental2 = new nul.study.videostore.Rental(movie0, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    customer1.addRental(rental6);
    java.lang.String str8 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    int i11 = newReleaseMovie10.getPriceCode();
    int i13 = newReleaseMovie10.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, (-1));
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, (int)(short)0);
    customer1.addRental(rental17);
    java.lang.String str19 = customer1.getName();
    java.lang.String str20 = customer1.getName();
    nul.study.videostore.Customer customer22 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 0);
    int i27 = rental26.determineFrequentRenterPoints();
    customer22.addRental(rental26);
    int i29 = rental26.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie30 = rental26.getMovie();
    customer1.addRental(rental26);
    nul.study.videostore.Movie movie32 = rental26.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie32);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    java.lang.String str4 = regularMovie1.getTitle();
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Rental rental15 = null;
    rentalStatement1.addRental(rental15);
    nul.study.videostore.Customer customer18 = new nul.study.videostore.Customer("hi!");
    java.lang.String str19 = customer18.getName();
    java.lang.String str20 = customer18.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie22 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i23 = newReleaseMovie22.getPriceCode();
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, 1);
    int i26 = rental25.getDaysRented();
    customer18.addRental(rental25);
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, 0);
    int i32 = rental31.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie33 = rental31.getMovie();
    nul.study.videostore.Movie movie34 = rental31.getMovie();
    double d35 = rental31.determineAmount();
    customer18.addRental(rental31);
    double d37 = rental31.determineAmount();
    nul.study.videostore.Movie movie38 = rental31.getMovie();
    rentalStatement1.addRental(rental31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie38);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("");
    int i4 = rentalStatement3.getFrequentRenterPoints();
    java.lang.String str5 = rentalStatement3.getName();
    int i6 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement8 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 0);
    int i13 = rental12.determineFrequentRenterPoints();
    rentalStatement8.addRental(rental12);
    double d15 = rental12.determineAmount();
    rentalStatement3.addRental(rental12);
    int i17 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement19 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i20 = rentalStatement19.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement22 = new nul.study.videostore.RentalStatement("");
    int i23 = rentalStatement22.getFrequentRenterPoints();
    nul.study.videostore.Customer customer25 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 0);
    int i30 = rental29.determineFrequentRenterPoints();
    customer25.addRental(rental29);
    int i32 = rental29.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie33 = rental29.getMovie();
    rentalStatement22.addRental(rental29);
    java.lang.String str35 = rentalStatement22.makeRentalStatement();
    nul.study.videostore.Customer customer37 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie39 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental41 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie39, 0);
    int i42 = rental41.determineFrequentRenterPoints();
    customer37.addRental(rental41);
    rentalStatement22.addRental(rental41);
    rentalStatement19.addRental(rental41);
    rentalStatement3.addRental(rental41);
    rentalStatement1.addRental(rental41);
    int i48 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer50 = new nul.study.videostore.Customer("hi!");
    java.lang.String str51 = customer50.getName();
    java.lang.String str52 = customer50.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie54 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i55 = newReleaseMovie54.getPriceCode();
    nul.study.videostore.Rental rental57 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie54, 1);
    int i58 = rental57.getDaysRented();
    customer50.addRental(rental57);
    nul.study.videostore.NewReleaseMovie newReleaseMovie61 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental63 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie61, 0);
    int i64 = rental63.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie65 = rental63.getMovie();
    nul.study.videostore.Movie movie66 = rental63.getMovie();
    double d67 = rental63.determineAmount();
    customer50.addRental(rental63);
    nul.study.videostore.Movie movie69 = rental63.getMovie();
    double d70 = rental63.determineAmount();
    rentalStatement1.addRental(rental63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str35.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "hi!"+ "'", str51.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "hi!"+ "'", str52.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d67 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d70 == 0.0d);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(0);
    childrensMovie1.setPriceCode((int)'4');
    int i7 = childrensMovie1.determineFrequentRenterPoints(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    double d18 = rental14.determineAmount();
    customer1.addRental(rental14);
    java.lang.String str20 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie22 = new nul.study.videostore.NewReleaseMovie("");
    int i23 = newReleaseMovie22.getPriceCode();
    int i25 = newReleaseMovie22.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, (-1));
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, (int)(byte)10);
    int i30 = rental29.getDaysRented();
    double d31 = rental29.determineAmount();
    customer1.addRental(rental29);
    double d33 = rental29.determineAmount();
    nul.study.videostore.Movie movie34 = rental29.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie34);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.Customer customer3 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    customer3.addRental(rental8);
    double d10 = rental8.determineAmount();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    int i12 = rental8.getDaysRented();
    int i13 = rental8.getDaysRented();
    customer1.addRental(rental8);
    double d15 = rental8.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i5 = regularMovie1.getPriceCode();
    double d7 = regularMovie1.determineAmount((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 14.0d);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.getName();
    java.lang.String str9 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = newReleaseMovie11.getPriceCode();
    double d16 = newReleaseMovie11.determineAmount((int)(short)0);
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, (int)'#');
    customer1.addRental(rental18);
    java.lang.String str20 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\t\t105.0\nYou owed 105.0\nYou earned 3 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\n\t\t0.0\n\t\t105.0\nYou owed 105.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    java.lang.String str15 = rentalStatement1.getName();
    int i16 = rentalStatement1.getFrequentRenterPoints();
    int i17 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i21 = newReleaseMovie19.determineFrequentRenterPoints(100);
    double d23 = newReleaseMovie19.determineAmount((int)' ');
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, (int)(byte)100);
    rentalStatement1.addRental(rental25);
    java.lang.String str27 = rentalStatement1.getName();
    double d28 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 0.0d);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("");
    int i4 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    int i11 = rental10.determineFrequentRenterPoints();
    customer6.addRental(rental10);
    int i13 = rental10.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie14 = rental10.getMovie();
    rentalStatement3.addRental(rental10);
    java.lang.String str16 = rentalStatement3.makeRentalStatement();
    java.lang.String str17 = rentalStatement3.getName();
    double d18 = rentalStatement3.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement20 = new nul.study.videostore.RentalStatement("");
    int i21 = rentalStatement20.getFrequentRenterPoints();
    java.lang.String str22 = rentalStatement20.getName();
    int i23 = rentalStatement20.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, 0);
    int i28 = rental27.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie29 = rental27.getMovie();
    nul.study.videostore.Movie movie30 = rental27.getMovie();
    rentalStatement20.addRental(rental27);
    rentalStatement3.addRental(rental27);
    customer1.addRental(rental27);
    nul.study.videostore.Rental rental34 = null;
    // The following exception was thrown during execution in test generation
    try {
    customer1.addRental(rental34);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie30);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str6 = rentalStatement1.makeRentalStatement();
    java.lang.String str7 = rentalStatement1.makeRentalStatement();
    double d8 = rentalStatement1.getAmountOwed();
    nul.study.videostore.Customer customer10 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    customer10.addRental(rental14);
    rentalStatement1.addRental(rental14);
    int i18 = rental14.determineFrequentRenterPoints();
    double d19 = rental14.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    double d9 = newReleaseMovie1.determineAmount((int)'4');
    double d11 = newReleaseMovie1.determineAmount(2);
    int i13 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)10);
    newReleaseMovie1.setPriceCode((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 156.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 6.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\thi!\t3.0\nYou owed 6.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    childrensMovie1.setPriceCode((int)' ');
    java.lang.String str6 = childrensMovie1.getTitle();
    int i8 = childrensMovie1.determineFrequentRenterPoints((int)(byte)-1);
    double d10 = childrensMovie1.determineAmount((int)(byte)0);
    childrensMovie1.setPriceCode(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 1.5d);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    regularMovie1.setPriceCode(2);
    java.lang.String str7 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)1);
    double d11 = regularMovie1.determineAmount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 149.0d);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    customer1.addRental(rental6);
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie13 = rental11.getMovie();
    customer1.addRental(rental11);
    nul.study.videostore.Customer customer16 = new nul.study.videostore.Customer("hi!");
    java.lang.String str17 = customer16.getName();
    java.lang.String str18 = customer16.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i21 = newReleaseMovie20.getPriceCode();
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, 1);
    int i24 = rental23.getDaysRented();
    customer16.addRental(rental23);
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 0);
    int i30 = rental29.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie31 = rental29.getMovie();
    nul.study.videostore.Movie movie32 = rental29.getMovie();
    double d33 = rental29.determineAmount();
    customer16.addRental(rental29);
    double d35 = rental29.determineAmount();
    nul.study.videostore.Movie movie36 = rental29.getMovie();
    customer1.addRental(rental29);
    java.lang.String str38 = customer1.statement();
    java.lang.String str39 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"+ "'", str38.equals("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"+ "'", str39.equals("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = childrensMovie1.getTitle();
    double d4 = childrensMovie1.determineAmount((int)(byte)1);
    int i6 = childrensMovie1.determineFrequentRenterPoints(4);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(byte)10);
    childrensMovie1.setPriceCode((int)(byte)10);
    int i11 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 10);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    double d11 = rentalStatement1.getAmountOwed();
    java.lang.String str12 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.getName();
    java.lang.String str5 = rentalStatement1.makeRentalStatement();
    java.lang.String str6 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    double d18 = rental14.determineAmount();
    customer1.addRental(rental14);
    java.lang.String str20 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    double d3 = rentalStatement1.getAmountOwed();
    java.lang.String str4 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    customer1.addRental(rental9);
    nul.study.videostore.Movie movie13 = rental9.getMovie();
    nul.study.videostore.Movie movie14 = rental9.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\n\t\t0.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\n\t\t0.0\nYou owed 2.0\nYou earned 2 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\n\t\t0.0\nYou owed 2.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie1.determineFrequentRenterPoints(2);
    childrensMovie1.setPriceCode((-1));
    double d11 = childrensMovie1.determineAmount((int)(short)-1);
    int i13 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i15 = childrensMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i16 = childrensMovie1.getPriceCode();
    int i17 = childrensMovie1.getPriceCode();
    double d19 = childrensMovie1.determineAmount((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.5d);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement10 = new nul.study.videostore.RentalStatement("");
    int i11 = rentalStatement10.getFrequentRenterPoints();
    nul.study.videostore.Customer customer13 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie15 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie15, 0);
    int i18 = rental17.determineFrequentRenterPoints();
    customer13.addRental(rental17);
    int i20 = rental17.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie21 = rental17.getMovie();
    rentalStatement10.addRental(rental17);
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 0);
    int i27 = rental26.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie28 = rental26.getMovie();
    rentalStatement10.addRental(rental26);
    customer1.addRental(rental26);
    int i31 = rental26.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    int i11 = rental10.determineFrequentRenterPoints();
    rentalStatement6.addRental(rental10);
    double d13 = rental10.determineAmount();
    rentalStatement1.addRental(rental10);
    int i15 = rentalStatement1.getFrequentRenterPoints();
    double d16 = rentalStatement1.getAmountOwed();
    java.lang.String str17 = rentalStatement1.makeRentalStatement();
    int i18 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str4 = rentalStatement1.getName();
    double d5 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    customer1.addRental(rental9);
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i15 = newReleaseMovie14.getPriceCode();
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 1);
    int i18 = rental17.getDaysRented();
    int i19 = rental17.getDaysRented();
    double d20 = rental17.determineAmount();
    int i21 = rental17.getDaysRented();
    customer1.addRental(rental17);
    java.lang.String str23 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("");
    int i26 = newReleaseMovie25.getPriceCode();
    int i28 = newReleaseMovie25.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental30 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, (-1));
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, (int)(short)0);
    int i33 = rental32.getDaysRented();
    customer1.addRental(rental32);
    double d35 = rental32.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str23.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 0.0d);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(short)1);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i7 = regularMovie1.getPriceCode();
    int i9 = regularMovie1.determineFrequentRenterPoints(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i3 = regularMovie1.getPriceCode();
    java.lang.String str4 = regularMovie1.getTitle();
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)'a');
    int i9 = rental8.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)'4');
    int i5 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t30.0\nYou owed 33.0\nYou earned 4 frequent renter points\n");

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    double d10 = newReleaseMovie1.determineAmount(100);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i14 = newReleaseMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    nul.study.videostore.RegularMovie regularMovie4 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str5 = regularMovie4.getTitle();
    double d7 = regularMovie4.determineAmount((int)(byte)-1);
    java.lang.String str8 = regularMovie4.getTitle();
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie4, (int)(byte)-1);
    int i11 = rental10.getDaysRented();
    int i12 = rental10.determineFrequentRenterPoints();
    customer1.addRental(rental10);
    int i14 = rental10.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 2 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    int i13 = rentalStatement1.getFrequentRenterPoints();
    int i14 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str15 = rentalStatement1.makeRentalStatement();
    int i16 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 10);
    double d5 = newReleaseMovie1.determineAmount((-1));
    int i7 = newReleaseMovie1.determineFrequentRenterPoints(52);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }


    nul.study.videostore.Movie movie0 = null;
    // The following exception was thrown during execution in test generation
    try {
    nul.study.videostore.Rental rental2 = new nul.study.videostore.Rental(movie0, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement4 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    rentalStatement4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    int i12 = rental8.determineFrequentRenterPoints();
    customer1.addRental(rental8);
    java.lang.String str14 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    double d18 = rental14.determineAmount();
    customer1.addRental(rental14);
    double d20 = rental14.determineAmount();
    int i21 = rental14.getDaysRented();
    int i22 = rental14.determineFrequentRenterPoints();
    int i23 = rental14.getDaysRented();
    double d24 = rental14.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 0.0d);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    double d3 = rentalStatement1.getAmountOwed();
    double d4 = rentalStatement1.getAmountOwed();
    java.lang.String str5 = rentalStatement1.makeRentalStatement();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    int i7 = rentalStatement1.getFrequentRenterPoints();
    int i8 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i3 = regularMovie1.getPriceCode();
    java.lang.String str4 = regularMovie1.getTitle();
    double d6 = regularMovie1.determineAmount((int)(byte)100);
    int i8 = regularMovie1.determineFrequentRenterPoints(0);
    int i10 = regularMovie1.determineFrequentRenterPoints((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(10);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)100);
    int i9 = regularMovie1.determineFrequentRenterPoints(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.statement();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    customer6.addRental(rental11);
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie18 = rental16.getMovie();
    nul.study.videostore.Movie movie19 = rental16.getMovie();
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental(movie19, (int)(byte)0);
    customer6.addRental(rental21);
    int i23 = rental21.getDaysRented();
    int i24 = rental21.determineFrequentRenterPoints();
    customer1.addRental(rental21);
    nul.study.videostore.Rental rental26 = null;
    // The following exception was thrown during execution in test generation
    try {
    customer1.addRental(rental26);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 1);
    int i7 = rental6.getDaysRented();
    customer1.addRental(rental6);
    int i9 = rental6.determineFrequentRenterPoints();
    int i10 = rental6.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    childrensMovie1.setPriceCode((int)' ');
    java.lang.String str6 = childrensMovie1.getTitle();
    int i8 = childrensMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i9 = childrensMovie1.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, 52);
    int i12 = rental11.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    java.lang.String str5 = customer4.getName();
    java.lang.String str6 = customer4.getName();
    java.lang.String str7 = customer4.getName();
    java.lang.String str8 = customer4.statement();
    java.lang.String str9 = customer4.statement();
    nul.study.videostore.Customer customer11 = new nul.study.videostore.Customer("hi!");
    java.lang.String str12 = customer11.getName();
    java.lang.String str13 = customer11.getName();
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    rentalStatement15.addRental(rental19);
    customer11.addRental(rental19);
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i25 = newReleaseMovie24.getPriceCode();
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 1);
    int i28 = rental27.getDaysRented();
    int i29 = rental27.getDaysRented();
    double d30 = rental27.determineAmount();
    int i31 = rental27.getDaysRented();
    customer11.addRental(rental27);
    java.lang.String str33 = customer11.statement();
    nul.study.videostore.Customer customer35 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie37 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie37, 0);
    int i40 = rental39.determineFrequentRenterPoints();
    customer35.addRental(rental39);
    int i42 = rental39.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie43 = rental39.getMovie();
    customer11.addRental(rental39);
    customer4.addRental(rental39);
    int i46 = rental39.getDaysRented();
    double d47 = rental39.determineAmount();
    rentalStatement1.addRental(rental39);
    nul.study.videostore.RegularMovie regularMovie50 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str51 = regularMovie50.getTitle();
    double d53 = regularMovie50.determineAmount((int)(byte)-1);
    java.lang.String str54 = regularMovie50.getTitle();
    nul.study.videostore.Rental rental56 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie50, (int)(byte)-1);
    int i57 = rental56.getDaysRented();
    int i58 = rental56.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d30 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str33.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str51.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d53 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str54.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\thi!\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    int i13 = rentalStatement1.getFrequentRenterPoints();
    int i14 = rentalStatement1.getFrequentRenterPoints();
    int i15 = rentalStatement1.getFrequentRenterPoints();
    double d16 = rentalStatement1.getAmountOwed();
    java.lang.String str17 = rentalStatement1.getName();
    nul.study.videostore.Customer customer19 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 0);
    int i24 = rental23.determineFrequentRenterPoints();
    customer19.addRental(rental23);
    java.lang.String str26 = customer19.statement();
    java.lang.String str27 = customer19.statement();
    java.lang.String str28 = customer19.getName();
    java.lang.String str29 = customer19.getName();
    nul.study.videostore.Customer customer31 = new nul.study.videostore.Customer("hi!");
    java.lang.String str32 = customer31.statement();
    java.lang.String str33 = customer31.getName();
    nul.study.videostore.RentalStatement rentalStatement35 = new nul.study.videostore.RentalStatement("");
    int i36 = rentalStatement35.getFrequentRenterPoints();
    java.lang.String str37 = rentalStatement35.getName();
    int i38 = rentalStatement35.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie40 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental42 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie40, 0);
    int i43 = rental42.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie44 = rental42.getMovie();
    nul.study.videostore.Movie movie45 = rental42.getMovie();
    rentalStatement35.addRental(rental42);
    int i47 = rentalStatement35.getFrequentRenterPoints();
    double d48 = rentalStatement35.getAmountOwed();
    int i49 = rentalStatement35.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie51 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental53 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie51, 0);
    rentalStatement35.addRental(rental53);
    customer31.addRental(rental53);
    nul.study.videostore.RentalStatement rentalStatement57 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie59 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental61 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie59, 0);
    int i62 = rental61.determineFrequentRenterPoints();
    rentalStatement57.addRental(rental61);
    java.lang.String str64 = rentalStatement57.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement66 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie68 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental70 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie68, 0);
    int i71 = rental70.determineFrequentRenterPoints();
    rentalStatement66.addRental(rental70);
    double d73 = rental70.determineAmount();
    double d74 = rental70.determineAmount();
    rentalStatement57.addRental(rental70);
    double d76 = rental70.determineAmount();
    int i77 = rental70.getDaysRented();
    customer31.addRental(rental70);
    customer19.addRental(rental70);
    nul.study.videostore.Movie movie80 = rental70.getMovie();
    rentalStatement1.addRental(rental70);
    int i82 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str26.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str27.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!"+ "'", str28.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str32.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + ""+ "'", str37.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str64.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d73 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie80);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 0);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    double d7 = regularMovie1.determineAmount((int)(byte)10);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)-1);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)'4');
    double d13 = regularMovie1.determineAmount((int)(byte)100);
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 149.0d);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 10);
    int i4 = rental3.getDaysRented();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    int i6 = rental3.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    double d7 = regularMovie1.determineAmount((int)(byte)10);
    double d9 = regularMovie1.determineAmount((int)(short)10);
    regularMovie1.setPriceCode((int)'4');
    int i13 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    java.lang.String str14 = regularMovie1.getTitle();
    regularMovie1.setPriceCode(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str14.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 10);
    double d5 = newReleaseMovie1.determineAmount((-1));
    double d7 = newReleaseMovie1.determineAmount(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 12.0d);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    double d14 = rental8.determineAmount();
    int i15 = rental8.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(100);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints(10);
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 10);
    java.lang.String str10 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    customer1.addRental(rental6);
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie13 = rental11.getMovie();
    nul.study.videostore.Movie movie14 = rental11.getMovie();
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental(movie14, (int)(byte)0);
    customer1.addRental(rental16);
    int i18 = rental16.getDaysRented();
    nul.study.videostore.Movie movie19 = rental16.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    int i10 = newReleaseMovie1.getPriceCode();
    double d12 = newReleaseMovie1.determineAmount((int)(short)0);
    double d14 = newReleaseMovie1.determineAmount(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 105.0d);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    int i11 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie15 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie15, 0);
    int i18 = rental17.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie19 = rental17.getMovie();
    rentalStatement1.addRental(rental17);
    nul.study.videostore.Movie movie21 = rental17.getMovie();
    java.lang.String str22 = movie21.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\n\t\t1.5\nYou owed 1.5\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(100);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints(10);
    double d7 = newReleaseMovie1.determineAmount((int)(byte)-1);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)'#');
    nul.study.videostore.Movie movie10 = rental9.getMovie();
    nul.study.videostore.Movie movie11 = rental9.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    nul.study.videostore.Movie movie6 = rental3.getMovie();
    double d7 = rental3.determineAmount();
    nul.study.videostore.Movie movie8 = rental3.getMovie();
    int i9 = rental3.determineFrequentRenterPoints();
    double d10 = rental3.determineAmount();
    double d11 = rental3.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)'4');
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    int i7 = childrensMovie1.determineFrequentRenterPoints((int)(byte)1);
    int i9 = childrensMovie1.determineFrequentRenterPoints((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    rentalStatement1.addRental(rental8);
    double d13 = rental8.determineAmount();
    nul.study.videostore.Movie movie14 = rental8.getMovie();
    int i15 = rental8.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.statement();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    customer6.addRental(rental11);
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie18 = rental16.getMovie();
    nul.study.videostore.Movie movie19 = rental16.getMovie();
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental(movie19, (int)(byte)0);
    customer6.addRental(rental21);
    int i23 = rental21.getDaysRented();
    int i24 = rental21.determineFrequentRenterPoints();
    customer1.addRental(rental21);
    java.lang.String str26 = customer1.statement();
    nul.study.videostore.Customer customer28 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie30 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i31 = newReleaseMovie30.getPriceCode();
    nul.study.videostore.Rental rental33 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie30, 0);
    customer28.addRental(rental33);
    double d35 = rental33.determineAmount();
    int i36 = rental33.determineFrequentRenterPoints();
    double d37 = rental33.determineAmount();
    customer1.addRental(rental33);
    java.lang.String str39 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str26.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str39.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    double d10 = newReleaseMovie1.determineAmount(100);
    double d12 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)1);
    double d16 = newReleaseMovie1.determineAmount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 3.0d);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    java.lang.String str4 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    int i9 = regularMovie1.determineFrequentRenterPoints((int)'a');
    int i10 = regularMovie1.getPriceCode();
    int i11 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("");
    int i4 = rentalStatement3.getFrequentRenterPoints();
    java.lang.String str5 = rentalStatement3.getName();
    int i6 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement8 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 0);
    int i13 = rental12.determineFrequentRenterPoints();
    rentalStatement8.addRental(rental12);
    double d15 = rental12.determineAmount();
    rentalStatement3.addRental(rental12);
    int i17 = rental12.getDaysRented();
    nul.study.videostore.Movie movie18 = rental12.getMovie();
    customer1.addRental(rental12);
    nul.study.videostore.RegularMovie regularMovie21 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie21, (int)(byte)-1);
    int i24 = rental23.determineFrequentRenterPoints();
    int i25 = rental23.getDaysRented();
    int i26 = rental23.getDaysRented();
    customer1.addRental(rental23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("");
    int i4 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    int i11 = rental10.determineFrequentRenterPoints();
    customer6.addRental(rental10);
    int i13 = rental10.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie14 = rental10.getMovie();
    rentalStatement3.addRental(rental10);
    java.lang.String str16 = rentalStatement3.makeRentalStatement();
    java.lang.String str17 = rentalStatement3.getName();
    double d18 = rentalStatement3.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement20 = new nul.study.videostore.RentalStatement("");
    int i21 = rentalStatement20.getFrequentRenterPoints();
    java.lang.String str22 = rentalStatement20.getName();
    int i23 = rentalStatement20.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, 0);
    int i28 = rental27.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie29 = rental27.getMovie();
    nul.study.videostore.Movie movie30 = rental27.getMovie();
    rentalStatement20.addRental(rental27);
    rentalStatement3.addRental(rental27);
    customer1.addRental(rental27);
    java.lang.String str34 = customer1.getName();
    java.lang.String str35 = customer1.getName();
    java.lang.String str36 = customer1.statement();
    nul.study.videostore.RegularMovie regularMovie38 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str39 = regularMovie38.getTitle();
    double d41 = regularMovie38.determineAmount((int)(short)1);
    nul.study.videostore.Rental rental43 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie38, 10);
    customer1.addRental(rental43);
    java.lang.String str45 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str36.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str39.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d41 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Rental Record for \n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t14.0\nYou owed 14.0\nYou earned 2 frequent renter points\n"+ "'", str45.equals("Rental Record for \n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t14.0\nYou owed 14.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("");
    int i4 = rentalStatement3.getFrequentRenterPoints();
    java.lang.String str5 = rentalStatement3.getName();
    int i6 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement8 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 0);
    int i13 = rental12.determineFrequentRenterPoints();
    rentalStatement8.addRental(rental12);
    double d15 = rental12.determineAmount();
    rentalStatement3.addRental(rental12);
    int i17 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement19 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i20 = rentalStatement19.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement22 = new nul.study.videostore.RentalStatement("");
    int i23 = rentalStatement22.getFrequentRenterPoints();
    nul.study.videostore.Customer customer25 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 0);
    int i30 = rental29.determineFrequentRenterPoints();
    customer25.addRental(rental29);
    int i32 = rental29.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie33 = rental29.getMovie();
    rentalStatement22.addRental(rental29);
    java.lang.String str35 = rentalStatement22.makeRentalStatement();
    nul.study.videostore.Customer customer37 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie39 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental41 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie39, 0);
    int i42 = rental41.determineFrequentRenterPoints();
    customer37.addRental(rental41);
    rentalStatement22.addRental(rental41);
    rentalStatement19.addRental(rental41);
    rentalStatement3.addRental(rental41);
    rentalStatement1.addRental(rental41);
    java.lang.String str48 = rentalStatement1.makeRentalStatement();
    int i49 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str50 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str35.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str48.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str50.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    double d11 = rentalStatement1.getAmountOwed();
    int i12 = rentalStatement1.getFrequentRenterPoints();
    double d13 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d16 = rentalStatement15.getAmountOwed();
    java.lang.String str17 = rentalStatement15.getName();
    nul.study.videostore.Customer customer19 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 0);
    int i24 = rental23.determineFrequentRenterPoints();
    customer19.addRental(rental23);
    int i26 = rental23.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie27 = rental23.getMovie();
    int i28 = rental23.getDaysRented();
    rentalStatement15.addRental(rental23);
    java.lang.String str30 = rentalStatement15.getName();
    java.lang.String str31 = rentalStatement15.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement33 = new nul.study.videostore.RentalStatement("");
    int i34 = rentalStatement33.getFrequentRenterPoints();
    java.lang.String str35 = rentalStatement33.getName();
    int i36 = rentalStatement33.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie38 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental40 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie38, 0);
    int i41 = rental40.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie42 = rental40.getMovie();
    nul.study.videostore.Movie movie43 = rental40.getMovie();
    rentalStatement33.addRental(rental40);
    int i45 = rentalStatement33.getFrequentRenterPoints();
    double d46 = rentalStatement33.getAmountOwed();
    int i47 = rentalStatement33.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement49 = new nul.study.videostore.RentalStatement("");
    int i50 = rentalStatement49.getFrequentRenterPoints();
    java.lang.String str51 = rentalStatement49.getName();
    double d52 = rentalStatement49.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement54 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie56 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental58 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie56, 0);
    int i59 = rental58.determineFrequentRenterPoints();
    rentalStatement54.addRental(rental58);
    rentalStatement49.addRental(rental58);
    rentalStatement33.addRental(rental58);
    double d63 = rental58.determineAmount();
    rentalStatement15.addRental(rental58);
    rentalStatement1.addRental(rental58);
    int i66 = rental58.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str30.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str31.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + ""+ "'", str35.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + ""+ "'", str51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str6 = rentalStatement1.makeRentalStatement();
    java.lang.String str7 = rentalStatement1.makeRentalStatement();
    double d8 = rentalStatement1.getAmountOwed();
    nul.study.videostore.Customer customer10 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    customer10.addRental(rental14);
    rentalStatement1.addRental(rental14);
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("");
    int i20 = newReleaseMovie19.getPriceCode();
    int i22 = newReleaseMovie19.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, (-1));
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, (int)(byte)10);
    rentalStatement1.addRental(rental26);
    int i28 = rental26.getDaysRented();
    double d29 = rental26.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 30.0d);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    double d4 = rentalStatement1.getAmountOwed();
    java.lang.String str5 = rentalStatement1.getName();
    java.lang.String str6 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement10 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    rentalStatement10.addRental(rental14);
    double d17 = rental14.determineAmount();
    double d18 = rental14.determineAmount();
    rentalStatement1.addRental(rental14);
    java.lang.String str20 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str20.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str11 = rentalStatement1.getName();
    double d12 = rentalStatement1.getAmountOwed();
    double d13 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");
    int i2 = regularMovie1.getPriceCode();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(byte)100);
    double d6 = regularMovie1.determineAmount(32);
    double d8 = regularMovie1.determineAmount((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 47.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 2.0d);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("hi!");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    double d3 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    int i10 = regularMovie1.getPriceCode();
    regularMovie1.setPriceCode((int)(byte)100);
    int i14 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i15 = regularMovie1.getPriceCode();
    double d17 = regularMovie1.determineAmount((int)(short)10);
    int i19 = regularMovie1.determineFrequentRenterPoints(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.getName();
    java.lang.String str6 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement8 = new nul.study.videostore.RentalStatement("");
    int i9 = rentalStatement8.getFrequentRenterPoints();
    java.lang.String str10 = rentalStatement8.getName();
    int i11 = rentalStatement8.getFrequentRenterPoints();
    double d12 = rentalStatement8.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie18 = rental16.getMovie();
    nul.study.videostore.Movie movie19 = rental16.getMovie();
    double d20 = rental16.determineAmount();
    nul.study.videostore.Movie movie21 = rental16.getMovie();
    int i22 = rental16.getDaysRented();
    double d23 = rental16.determineAmount();
    rentalStatement8.addRental(rental16);
    customer1.addRental(rental16);
    java.lang.String str26 = customer1.getName();
    java.lang.String str27 = customer1.statement();
    nul.study.videostore.Customer customer29 = new nul.study.videostore.Customer("hi!");
    java.lang.String str30 = customer29.getName();
    java.lang.String str31 = customer29.getName();
    java.lang.String str32 = customer29.getName();
    java.lang.String str33 = customer29.statement();
    java.lang.String str34 = customer29.statement();
    nul.study.videostore.Customer customer36 = new nul.study.videostore.Customer("hi!");
    java.lang.String str37 = customer36.getName();
    java.lang.String str38 = customer36.getName();
    nul.study.videostore.RentalStatement rentalStatement40 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie42 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental44 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie42, 0);
    int i45 = rental44.determineFrequentRenterPoints();
    rentalStatement40.addRental(rental44);
    customer36.addRental(rental44);
    nul.study.videostore.NewReleaseMovie newReleaseMovie49 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i50 = newReleaseMovie49.getPriceCode();
    nul.study.videostore.Rental rental52 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie49, 1);
    int i53 = rental52.getDaysRented();
    int i54 = rental52.getDaysRented();
    double d55 = rental52.determineAmount();
    int i56 = rental52.getDaysRented();
    customer36.addRental(rental52);
    java.lang.String str58 = customer36.statement();
    nul.study.videostore.Customer customer60 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie62 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental64 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie62, 0);
    int i65 = rental64.determineFrequentRenterPoints();
    customer60.addRental(rental64);
    int i67 = rental64.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie68 = rental64.getMovie();
    customer36.addRental(rental64);
    customer29.addRental(rental64);
    int i71 = rental64.getDaysRented();
    double d72 = rental64.determineAmount();
    customer1.addRental(rental64);
    java.lang.String str74 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str27.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str33.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str34.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "hi!"+ "'", str38.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d55 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str58.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d72 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "hi!"+ "'", str74.equals("hi!"));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for hi!\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

}
