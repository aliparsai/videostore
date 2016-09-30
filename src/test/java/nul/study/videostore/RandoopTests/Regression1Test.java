package nul.study.videostore.RandoopTests;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression1Test {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str7 = rentalStatement1.getName();
    java.lang.String str8 = rentalStatement1.getName();
    java.lang.String str9 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    int i8 = rental5.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental5.getMovie();
    int i10 = rental5.determineFrequentRenterPoints();
    double d11 = rental5.determineAmount();
    double d12 = rental5.determineAmount();
    double d13 = rental5.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\n\thi!\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }


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
    java.lang.String str15 = rentalStatement1.makeRentalStatement();
    double d16 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement18 = new nul.study.videostore.RentalStatement("");
    int i19 = rentalStatement18.getFrequentRenterPoints();
    nul.study.videostore.Customer customer21 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie23 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie23, 0);
    int i26 = rental25.determineFrequentRenterPoints();
    customer21.addRental(rental25);
    int i28 = rental25.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie29 = rental25.getMovie();
    rentalStatement18.addRental(rental25);
    rentalStatement1.addRental(rental25);
    double d32 = rentalStatement1.getAmountOwed();
    java.lang.String str33 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement35 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer37 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str38 = customer37.getName();
    java.lang.String str39 = customer37.statement();
    nul.study.videostore.RegularMovie regularMovie41 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str42 = regularMovie41.getTitle();
    int i44 = regularMovie41.determineFrequentRenterPoints((int)(short)100);
    int i46 = regularMovie41.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental48 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie41, (int)(byte)0);
    customer37.addRental(rental48);
    int i50 = rental48.getDaysRented();
    nul.study.videostore.Movie movie51 = rental48.getMovie();
    rentalStatement35.addRental(rental48);
    rentalStatement1.addRental(rental48);
    nul.study.videostore.RentalStatement rentalStatement55 = new nul.study.videostore.RentalStatement("");
    int i56 = rentalStatement55.getFrequentRenterPoints();
    java.lang.String str57 = rentalStatement55.getName();
    int i58 = rentalStatement55.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie60 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental62 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie60, 0);
    int i63 = rental62.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie64 = rental62.getMovie();
    nul.study.videostore.Movie movie65 = rental62.getMovie();
    rentalStatement55.addRental(rental62);
    java.lang.String str67 = rentalStatement55.makeRentalStatement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie69 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental71 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie69, 0);
    rentalStatement55.addRental(rental71);
    int i73 = rental71.determineFrequentRenterPoints();
    double d74 = rental71.determineAmount();
    rentalStatement1.addRental(rental71);
    double d76 = rentalStatement1.getAmountOwed();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str33.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str38.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str39.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str42.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + ""+ "'", str57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str67.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d74 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d76 == 0.0d);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount((int)(byte)0);
    java.lang.String str6 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental7.getMovie();
    customer1.addRental(rental7);
    java.lang.String str11 = customer1.statement();
    java.lang.String str12 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement14 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d15 = rentalStatement14.getAmountOwed();
    int i16 = rentalStatement14.getFrequentRenterPoints();
    int i17 = rentalStatement14.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("");
    int i20 = newReleaseMovie19.getPriceCode();
    double d22 = newReleaseMovie19.determineAmount((int)'a');
    int i24 = newReleaseMovie19.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, (int)(byte)0);
    rentalStatement14.addRental(rental26);
    customer1.addRental(rental26);
    java.lang.String str29 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str29.equals("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount((int)(byte)0);
    regularMovie1.setPriceCode((int)' ');
    double d9 = regularMovie1.determineAmount((int)(byte)0);
    double d11 = regularMovie1.determineAmount((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 149.0d);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    int i7 = childrensMovie1.determineFrequentRenterPoints((int)(short)0);
    double d9 = childrensMovie1.determineAmount((int)'#');
    int i10 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 49.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.getName();
    nul.study.videostore.Rental rental9 = null;
    customer1.addRental(rental9);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    int i13 = newReleaseMovie12.getPriceCode();
    int i15 = newReleaseMovie12.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, (-1));
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, (int)(short)0);
    customer1.addRental(rental19);
    double d21 = rental19.determineAmount();
    int i22 = rental19.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie21 = rental19.getMovie();
    nul.study.videostore.Movie movie22 = rental19.getMovie();
    double d23 = rental19.determineAmount();
    nul.study.videostore.Movie movie24 = rental19.getMovie();
    int i25 = rental19.getDaysRented();
    double d26 = rental19.determineAmount();
    rentalStatement1.addRental(rental19);
    nul.study.videostore.Customer customer29 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie31 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i32 = newReleaseMovie31.getPriceCode();
    nul.study.videostore.Rental rental34 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie31, 0);
    customer29.addRental(rental34);
    java.lang.String str36 = customer29.statement();
    nul.study.videostore.RentalStatement rentalStatement38 = new nul.study.videostore.RentalStatement("");
    int i39 = rentalStatement38.getFrequentRenterPoints();
    java.lang.String str40 = rentalStatement38.getName();
    int i41 = rentalStatement38.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement43 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie45 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental47 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie45, 0);
    int i48 = rental47.determineFrequentRenterPoints();
    rentalStatement43.addRental(rental47);
    double d50 = rental47.determineAmount();
    rentalStatement38.addRental(rental47);
    int i52 = rental47.getDaysRented();
    customer29.addRental(rental47);
    rentalStatement1.addRental(rental47);
    java.lang.String str55 = rentalStatement1.getName();
    double d56 = rentalStatement1.getAmountOwed();
    
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
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str36.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + ""+ "'", str55.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d56 == 0.0d);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    childrensMovie1.setPriceCode(52);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i9 = regularMovie1.determineFrequentRenterPoints(10);
    int i11 = regularMovie1.determineFrequentRenterPoints(0);
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)1);
    int i15 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = newReleaseMovie1.getTitle();
    int i3 = newReleaseMovie1.getPriceCode();
    double d5 = newReleaseMovie1.determineAmount(52);
    double d7 = newReleaseMovie1.determineAmount(0);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 156.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    childrensMovie1.setPriceCode(0);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.Customer customer3 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    customer3.addRental(rental7);
    int i10 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie11 = rental7.getMovie();
    int i12 = rental7.getDaysRented();
    int i13 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie14 = rental7.getMovie();
    rentalStatement1.addRental(rental7);
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie21 = rental19.getMovie();
    nul.study.videostore.Movie movie22 = rental19.getMovie();
    double d23 = rental19.determineAmount();
    nul.study.videostore.Movie movie24 = rental19.getMovie();
    int i25 = rental19.getDaysRented();
    double d26 = rental19.determineAmount();
    rentalStatement1.addRental(rental19);
    java.lang.String str28 = rentalStatement1.makeRentalStatement();
    java.lang.String str29 = rentalStatement1.getName();
    int i30 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str28.equals("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str29.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 2);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'a');
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 1);
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)-1);
    double d11 = rental10.determineAmount();
    int i12 = rental10.determineFrequentRenterPoints();
    double d13 = rental10.determineAmount();
    int i14 = rental10.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == (-1));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
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
    int i18 = rental12.getDaysRented();
    customer1.addRental(rental12);
    java.lang.String str20 = customer1.statement();
    
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
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str20.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.getName();
    java.lang.String str5 = rentalStatement1.getName();
    nul.study.videostore.Customer customer7 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement9 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    rentalStatement9.addRental(rental13);
    int i16 = rental13.determineFrequentRenterPoints();
    int i17 = rental13.determineFrequentRenterPoints();
    customer7.addRental(rental13);
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i21 = newReleaseMovie20.getPriceCode();
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, 0);
    int i24 = newReleaseMovie20.getPriceCode();
    int i26 = newReleaseMovie20.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental28 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, (int)(short)10);
    customer7.addRental(rental28);
    java.lang.String str30 = customer7.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie32 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i33 = newReleaseMovie32.getPriceCode();
    nul.study.videostore.Rental rental35 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie32, 0);
    int i37 = newReleaseMovie32.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie32, (int)(byte)-1);
    int i40 = rental39.getDaysRented();
    int i41 = rental39.determineFrequentRenterPoints();
    customer7.addRental(rental39);
    rentalStatement1.addRental(rental39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str5.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    double d11 = rentalStatement1.getAmountOwed();
    java.lang.String str12 = rentalStatement1.getName();
    java.lang.String str13 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    java.lang.String str5 = rentalStatement1.getName();
    nul.study.videostore.RegularMovie regularMovie7 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str8 = regularMovie7.getTitle();
    int i10 = regularMovie7.determineFrequentRenterPoints((int)(short)100);
    int i12 = regularMovie7.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie7, (int)(byte)0);
    rentalStatement1.addRental(rental14);
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
    java.lang.String str31 = rentalStatement1.getName();
    nul.study.videostore.Customer customer33 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement35 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie37 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie37, 0);
    int i40 = rental39.determineFrequentRenterPoints();
    rentalStatement35.addRental(rental39);
    int i42 = rental39.determineFrequentRenterPoints();
    int i43 = rental39.determineFrequentRenterPoints();
    customer33.addRental(rental39);
    rentalStatement1.addRental(rental39);
    double d46 = rental39.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == 0.0d);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i7 = newReleaseMovie6.getPriceCode();
    double d9 = newReleaseMovie6.determineAmount(100);
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, (int)(byte)10);
    int i12 = rental11.getDaysRented();
    double d13 = rental11.determineAmount();
    customer1.addRental(rental11);
    java.lang.String str15 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str15.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n"+ "'", str2.equals("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str7 = rentalStatement1.getName();
    double d8 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement10 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d11 = rentalStatement10.getAmountOwed();
    int i12 = rentalStatement10.getFrequentRenterPoints();
    int i13 = rentalStatement10.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie15 = new nul.study.videostore.NewReleaseMovie("");
    int i16 = newReleaseMovie15.getPriceCode();
    double d18 = newReleaseMovie15.determineAmount((int)'a');
    int i20 = newReleaseMovie15.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie15, (int)(byte)0);
    rentalStatement10.addRental(rental22);
    rentalStatement1.addRental(rental22);
    java.lang.String str25 = rentalStatement1.makeRentalStatement();
    
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str25.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    nul.study.videostore.Movie movie6 = rental3.getMovie();
    double d7 = rental3.determineAmount();
    nul.study.videostore.Movie movie8 = rental3.getMovie();
    int i9 = rental3.getDaysRented();
    int i10 = rental3.determineFrequentRenterPoints();
    int i11 = rental3.getDaysRented();
    int i12 = rental3.determineFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str4 = rentalStatement1.makeRentalStatement();
    double d5 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    double d7 = regularMovie1.determineAmount((int)'4');
    java.lang.String str8 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount((int)(short)1);
    double d5 = childrensMovie1.determineAmount((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 147.0d);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    nul.study.videostore.RegularMovie regularMovie6 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str7 = regularMovie6.getTitle();
    double d9 = regularMovie6.determineAmount(10);
    int i11 = regularMovie6.determineFrequentRenterPoints((int)'a');
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie6, 1);
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie6, (int)(byte)-1);
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie6, (int)(short)100);
    customer1.addRental(rental17);
    int i19 = rental17.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    java.lang.String str4 = childrensMovie1.getTitle();
    double d6 = childrensMovie1.determineAmount((int)(byte)1);
    double d8 = childrensMovie1.determineAmount((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.5d);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    int i7 = newReleaseMovie6.getPriceCode();
    double d9 = newReleaseMovie6.determineAmount((int)'a');
    int i11 = newReleaseMovie6.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, (int)(byte)0);
    rentalStatement1.addRental(rental13);
    double d15 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    int i8 = newReleaseMovie7.getPriceCode();
    int i10 = newReleaseMovie7.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, (-1));
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, (int)(short)0);
    nul.study.videostore.Movie movie15 = rental14.getMovie();
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental(movie15, (int)(short)0);
    rentalStatement1.addRental(rental17);
    double d19 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie21 = rental19.getMovie();
    nul.study.videostore.Movie movie22 = rental19.getMovie();
    double d23 = rental19.determineAmount();
    nul.study.videostore.Movie movie24 = rental19.getMovie();
    int i25 = rental19.getDaysRented();
    double d26 = rental19.determineAmount();
    rentalStatement1.addRental(rental19);
    nul.study.videostore.Customer customer29 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie31 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i32 = newReleaseMovie31.getPriceCode();
    nul.study.videostore.Rental rental34 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie31, 0);
    customer29.addRental(rental34);
    java.lang.String str36 = customer29.statement();
    nul.study.videostore.RentalStatement rentalStatement38 = new nul.study.videostore.RentalStatement("");
    int i39 = rentalStatement38.getFrequentRenterPoints();
    java.lang.String str40 = rentalStatement38.getName();
    int i41 = rentalStatement38.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement43 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie45 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental47 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie45, 0);
    int i48 = rental47.determineFrequentRenterPoints();
    rentalStatement43.addRental(rental47);
    double d50 = rental47.determineAmount();
    rentalStatement38.addRental(rental47);
    int i52 = rental47.getDaysRented();
    customer29.addRental(rental47);
    rentalStatement1.addRental(rental47);
    int i55 = rental47.determineFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str36.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d50 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    double d7 = regularMovie1.determineAmount((int)(short)100);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (-1));
    int i10 = rental9.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    double d3 = regularMovie1.determineAmount((int)(byte)0);
    double d5 = regularMovie1.determineAmount((-1));
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 2);
    int i9 = regularMovie1.determineFrequentRenterPoints(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    double d7 = childrensMovie1.determineAmount((int)(short)1);
    double d9 = childrensMovie1.determineAmount(0);
    int i10 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }


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
    int i24 = rentalStatement1.getFrequentRenterPoints();
    int i25 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    int i4 = childrensMovie1.determineFrequentRenterPoints(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    childrensMovie1.setPriceCode((-1));
    int i9 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    double d13 = childrensMovie1.determineAmount(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 49.5d);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }


    nul.study.videostore.Movie movie0 = null;
    nul.study.videostore.Rental rental2 = new nul.study.videostore.Rental(movie0, 2);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    newReleaseMovie1.setPriceCode((int)(byte)100);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints(0);
    int i10 = newReleaseMovie1.determineFrequentRenterPoints(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    newReleaseMovie1.setPriceCode((int)'#');
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    java.lang.String str5 = regularMovie1.getTitle();
    int i6 = regularMovie1.getPriceCode();
    int i8 = regularMovie1.determineFrequentRenterPoints((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental2 = null;
    rentalStatement1.addRental(rental2);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    double d3 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }


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
    int i14 = rental8.determineFrequentRenterPoints();
    double d15 = rental8.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    int i7 = regularMovie1.determineFrequentRenterPoints(0);
    double d9 = regularMovie1.determineAmount((int)(short)100);
    double d11 = regularMovie1.determineAmount((-1));
    int i13 = regularMovie1.determineFrequentRenterPoints(1);
    double d15 = regularMovie1.determineAmount((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 149.0d);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }


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
    nul.study.videostore.Movie movie17 = rental8.getMovie();
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
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    childrensMovie1.setPriceCode((int)(byte)100);
    int i6 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    double d6 = regularMovie1.determineAmount(0);
    int i8 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    java.lang.String str5 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)1);
    int i9 = regularMovie1.determineFrequentRenterPoints(0);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(short)0);
    int i13 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    double d15 = regularMovie1.determineAmount((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 149.0d);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\t\t0.0\n\t\t156.0\nYou owed 156.0\nYou earned 4 frequent renter points\n");

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str6 = rentalStatement1.makeRentalStatement();
    double d7 = rentalStatement1.getAmountOwed();
    java.lang.String str8 = rentalStatement1.getName();
    java.lang.String str9 = rentalStatement1.getName();
    java.lang.String str10 = rentalStatement1.makeRentalStatement();
    double d11 = rentalStatement1.getAmountOwed();
    
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
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str10.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    nul.study.videostore.Movie movie9 = rental8.getMovie();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental(movie9, (int)(short)0);
    double d12 = rental11.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
    java.lang.String str3 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("hi!");
    double d3 = childrensMovie1.determineAmount((int)(byte)10);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    int i6 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    int i10 = rental8.getDaysRented();
    double d11 = rental8.determineAmount();
    int i12 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("");
    int i16 = rentalStatement15.getFrequentRenterPoints();
    nul.study.videostore.Customer customer18 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, 0);
    int i23 = rental22.determineFrequentRenterPoints();
    customer18.addRental(rental22);
    int i25 = rental22.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie26 = rental22.getMovie();
    rentalStatement15.addRental(rental22);
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, 0);
    int i32 = rental31.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie33 = rental31.getMovie();
    rentalStatement15.addRental(rental31);
    customer1.addRental(rental31);
    java.lang.String str36 = customer1.getName();
    nul.study.videostore.Customer customer38 = new nul.study.videostore.Customer("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement40 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie42 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental44 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie42, 0);
    int i45 = rental44.determineFrequentRenterPoints();
    rentalStatement40.addRental(rental44);
    java.lang.String str47 = rentalStatement40.makeRentalStatement();
    java.lang.String str48 = rentalStatement40.makeRentalStatement();
    double d49 = rentalStatement40.getAmountOwed();
    nul.study.videostore.Customer customer51 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie53 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental55 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie53, 0);
    int i56 = rental55.determineFrequentRenterPoints();
    customer51.addRental(rental55);
    int i58 = rental55.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie59 = rental55.getMovie();
    int i60 = rental55.determineFrequentRenterPoints();
    rentalStatement40.addRental(rental55);
    customer38.addRental(rental55);
    double d63 = rental55.determineAmount();
    customer1.addRental(rental55);
    int i65 = rental55.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str36.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str47.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str48.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }


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
    java.lang.String str15 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer17 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 0);
    int i22 = rental21.determineFrequentRenterPoints();
    customer17.addRental(rental21);
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i26 = newReleaseMovie25.getPriceCode();
    nul.study.videostore.Rental rental28 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, 1);
    int i29 = rental28.getDaysRented();
    customer17.addRental(rental28);
    nul.study.videostore.Rental rental31 = null;
    customer17.addRental(rental31);
    nul.study.videostore.Customer customer34 = new nul.study.videostore.Customer("hi!");
    java.lang.String str35 = customer34.getName();
    java.lang.String str36 = customer34.getName();
    nul.study.videostore.RentalStatement rentalStatement38 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie40 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental42 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie40, 0);
    int i43 = rental42.determineFrequentRenterPoints();
    rentalStatement38.addRental(rental42);
    customer34.addRental(rental42);
    java.lang.String str46 = customer34.statement();
    java.lang.String str47 = customer34.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie49 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental51 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie49, 0);
    int i52 = rental51.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie53 = rental51.getMovie();
    nul.study.videostore.Movie movie54 = rental51.getMovie();
    double d55 = rental51.determineAmount();
    customer34.addRental(rental51);
    double d57 = rental51.determineAmount();
    int i58 = rental51.getDaysRented();
    customer17.addRental(rental51);
    rentalStatement1.addRental(rental51);
    nul.study.videostore.NewReleaseMovie newReleaseMovie62 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental64 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie62, 0);
    int i65 = rental64.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie66 = rental64.getMovie();
    nul.study.videostore.Movie movie67 = rental64.getMovie();
    double d68 = rental64.determineAmount();
    nul.study.videostore.Movie movie69 = rental64.getMovie();
    int i70 = rental64.getDaysRented();
    rentalStatement1.addRental(rental64);
    java.lang.String str72 = rentalStatement1.makeRentalStatement();
    java.lang.String str73 = rentalStatement1.getName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str46.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str47.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d55 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d57 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str72 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"+ "'", str72.equals("Rental Record for \n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str73 + "' != '" + ""+ "'", str73.equals(""));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }


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
    double d16 = rental8.determineAmount();
    int i17 = rental8.getDaysRented();
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
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental7.getMovie();
    customer1.addRental(rental7);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i13 = newReleaseMovie12.getPriceCode();
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i17 = newReleaseMovie12.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, (int)(byte)-1);
    int i20 = rental19.determineFrequentRenterPoints();
    int i21 = rental19.determineFrequentRenterPoints();
    customer1.addRental(rental19);
    java.lang.String str23 = customer1.getName();
    java.lang.String str24 = customer1.getName();
    java.lang.String str25 = customer1.statement();
    java.lang.String str26 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n"+ "'", str25.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    int i12 = newReleaseMovie11.getPriceCode();
    int i14 = newReleaseMovie11.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, (-1));
    rentalStatement1.addRental(rental16);
    nul.study.videostore.Movie movie18 = rental16.getMovie();
    int i19 = rental16.getDaysRented();
    nul.study.videostore.Movie movie20 = rental16.getMovie();
    int i21 = rental16.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == (-1));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount((int)(byte)100);
    double d5 = childrensMovie1.determineAmount(0);
    int i7 = childrensMovie1.determineFrequentRenterPoints(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    double d8 = regularMovie1.determineAmount((int)(short)100);
    int i10 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    int i11 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    nul.study.videostore.Movie movie9 = rental8.getMovie();
    int i10 = movie9.getPriceCode();
    java.lang.String str11 = movie9.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 105.0d);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i10 = newReleaseMovie9.getPriceCode();
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 1);
    int i13 = rental12.getDaysRented();
    customer1.addRental(rental12);
    nul.study.videostore.Rental rental15 = null;
    customer1.addRental(rental15);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str17 = customer1.statement();
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
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    double d3 = regularMovie1.determineAmount((int)(byte)0);
    double d5 = regularMovie1.determineAmount((-1));
    java.lang.String str6 = regularMovie1.getTitle();
    regularMovie1.setPriceCode((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }


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
    customer1.addRental(rental17);
    java.lang.String str20 = customer1.getName();
    java.lang.String str21 = customer1.statement();
    nul.study.videostore.Customer customer23 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, 0);
    int i28 = rental27.determineFrequentRenterPoints();
    customer23.addRental(rental27);
    int i30 = rental27.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie31 = rental27.getMovie();
    customer1.addRental(rental27);
    java.lang.String str33 = customer1.statement();
    nul.study.videostore.Customer customer35 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str36 = customer35.statement();
    java.lang.String str37 = customer35.statement();
    nul.study.videostore.Customer customer39 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie41 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental43 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie41, 0);
    int i44 = rental43.determineFrequentRenterPoints();
    customer39.addRental(rental43);
    nul.study.videostore.NewReleaseMovie newReleaseMovie47 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i48 = newReleaseMovie47.getPriceCode();
    nul.study.videostore.Rental rental50 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie47, 1);
    int i51 = rental50.getDaysRented();
    customer39.addRental(rental50);
    nul.study.videostore.Customer customer54 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie56 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental58 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie56, 0);
    int i59 = rental58.determineFrequentRenterPoints();
    customer54.addRental(rental58);
    int i61 = rental58.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie62 = rental58.getMovie();
    int i63 = rental58.getDaysRented();
    int i64 = rental58.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie65 = rental58.getMovie();
    customer39.addRental(rental58);
    customer35.addRental(rental58);
    double d68 = rental58.determineAmount();
    customer1.addRental(rental58);
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str21.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str33.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str36.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str37.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d68 == 0.0d);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    java.lang.String str10 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie1.determineFrequentRenterPoints(100);
    int i8 = childrensMovie1.getPriceCode();
    java.lang.String str9 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }


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
    java.lang.String str15 = rentalStatement1.makeRentalStatement();
    java.lang.String str16 = rentalStatement1.getName();
    int i17 = rentalStatement1.getFrequentRenterPoints();
    double d18 = rentalStatement1.getAmountOwed();
    java.lang.String str19 = rentalStatement1.makeRentalStatement();
    java.lang.String str20 = rentalStatement1.makeRentalStatement();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str19.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str20.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }


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
    java.lang.String str24 = rentalStatement1.makeRentalStatement();
    int i25 = rentalStatement1.getFrequentRenterPoints();
    int i26 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str24.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 2);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie1.determineFrequentRenterPoints(0);
    int i9 = childrensMovie1.determineFrequentRenterPoints(0);
    
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
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d4 = rentalStatement3.getAmountOwed();
    java.lang.String str5 = rentalStatement3.getName();
    java.lang.String str6 = rentalStatement3.getName();
    double d7 = rentalStatement3.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement9 = new nul.study.videostore.RentalStatement("");
    int i10 = rentalStatement9.getFrequentRenterPoints();
    java.lang.String str11 = rentalStatement9.getName();
    int i12 = rentalStatement9.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie18 = rental16.getMovie();
    nul.study.videostore.Movie movie19 = rental16.getMovie();
    rentalStatement9.addRental(rental16);
    rentalStatement3.addRental(rental16);
    java.lang.String str22 = rentalStatement3.makeRentalStatement();
    java.lang.String str23 = rentalStatement3.makeRentalStatement();
    nul.study.videostore.Customer customer25 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 0);
    int i30 = rental29.determineFrequentRenterPoints();
    customer25.addRental(rental29);
    java.lang.String str32 = customer25.statement();
    nul.study.videostore.RegularMovie regularMovie34 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str35 = regularMovie34.getTitle();
    double d37 = regularMovie34.determineAmount((int)(byte)-1);
    java.lang.String str38 = regularMovie34.getTitle();
    nul.study.videostore.Rental rental40 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie34, (int)(byte)1);
    customer25.addRental(rental40);
    double d42 = rental40.determineAmount();
    double d43 = rental40.determineAmount();
    rentalStatement3.addRental(rental40);
    int i45 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.RegularMovie regularMovie47 = new nul.study.videostore.RegularMovie("");
    int i49 = regularMovie47.determineFrequentRenterPoints(0);
    double d51 = regularMovie47.determineAmount(100);
    int i53 = regularMovie47.determineFrequentRenterPoints((int)'#');
    double d55 = regularMovie47.determineAmount(10);
    int i56 = regularMovie47.getPriceCode();
    double d58 = regularMovie47.determineAmount((int)(byte)10);
    double d60 = regularMovie47.determineAmount((int)(short)10);
    int i62 = regularMovie47.determineFrequentRenterPoints((int)(short)-1);
    java.lang.String str63 = regularMovie47.getTitle();
    double d65 = regularMovie47.determineAmount((int)(short)0);
    nul.study.videostore.Rental rental67 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie47, (int)'#');
    rentalStatement3.addRental(rental67);
    customer1.addRental(rental67);
    java.lang.String str70 = customer1.getName();
    nul.study.videostore.Customer customer72 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement74 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie76 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental78 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie76, 0);
    int i79 = rental78.determineFrequentRenterPoints();
    rentalStatement74.addRental(rental78);
    int i81 = rental78.determineFrequentRenterPoints();
    int i82 = rental78.determineFrequentRenterPoints();
    customer72.addRental(rental78);
    nul.study.videostore.NewReleaseMovie newReleaseMovie85 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i86 = newReleaseMovie85.getPriceCode();
    nul.study.videostore.Rental rental88 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie85, 0);
    int i89 = newReleaseMovie85.getPriceCode();
    int i91 = newReleaseMovie85.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental93 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie85, (int)(short)10);
    customer72.addRental(rental93);
    customer1.addRental(rental93);
    double d96 = rental93.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str5.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str6.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str22.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str23.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str32.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str35.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d37 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str38.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d42 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d43 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d51 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d55 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d58 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d60 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + ""+ "'", str63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d65 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str70.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i91 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d96 == 30.0d);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental7.getMovie();
    customer1.addRental(rental7);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i13 = newReleaseMovie12.getPriceCode();
    double d15 = newReleaseMovie12.determineAmount(100);
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, (int)(byte)10);
    int i19 = newReleaseMovie12.determineFrequentRenterPoints(0);
    int i20 = newReleaseMovie12.getPriceCode();
    double d22 = newReleaseMovie12.determineAmount((int)'#');
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, (int)'4');
    customer1.addRental(rental24);
    nul.study.videostore.RentalStatement rentalStatement27 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d28 = rentalStatement27.getAmountOwed();
    java.lang.String str29 = rentalStatement27.getName();
    java.lang.String str30 = rentalStatement27.getName();
    double d31 = rentalStatement27.getAmountOwed();
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
    rentalStatement27.addRental(rental40);
    customer1.addRental(rental40);
    java.lang.String str47 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 105.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str29.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str30.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 0.0d);
    
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
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\thi!\t156.0\n\t\t0.0\nYou owed 156.0\nYou earned 4 frequent renter points\n"+ "'", str47.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\thi!\t156.0\n\t\t0.0\nYou owed 156.0\nYou earned 4 frequent renter points\n"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    double d3 = rentalStatement1.getAmountOwed();
    java.lang.String str4 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    int i7 = regularMovie1.determineFrequentRenterPoints(0);
    double d9 = regularMovie1.determineAmount((int)(short)100);
    double d11 = regularMovie1.determineAmount(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 14.0d);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie4 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i5 = newReleaseMovie4.getPriceCode();
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie4, 0);
    int i9 = newReleaseMovie4.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie4, (int)(byte)-1);
    rentalStatement1.addRental(rental11);
    double d13 = rental11.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == (-3.0d));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }


    nul.study.videostore.Movie movie0 = null;
    nul.study.videostore.Rental rental2 = new nul.study.videostore.Rental(movie0, (int)'4');
    // The following exception was thrown during execution in test generation
    try {
    double d3 = rental2.determineAmount();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str7 = rentalStatement1.makeRentalStatement();
    
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

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    java.lang.String str10 = rentalStatement1.getName();
    java.lang.String str11 = rentalStatement1.getName();
    java.lang.String str12 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    nul.study.videostore.Movie movie6 = rental3.getMovie();
    double d7 = rental3.determineAmount();
    nul.study.videostore.Movie movie8 = rental3.getMovie();
    int i9 = rental3.getDaysRented();
    nul.study.videostore.Movie movie10 = rental3.getMovie();
    
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
    org.junit.Assert.assertNotNull(movie10);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    regularMovie1.setPriceCode((int)(byte)10);
    java.lang.String str9 = regularMovie1.getTitle();
    java.lang.String str10 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 1);
    double d14 = regularMovie1.determineAmount((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str10.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 51.5d);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    int i4 = childrensMovie1.determineFrequentRenterPoints(10);
    double d6 = childrensMovie1.determineAmount((int)'4');
    int i8 = childrensMovie1.determineFrequentRenterPoints((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(1);
    newReleaseMovie1.setPriceCode(2);
    java.lang.String str6 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str6.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = regularMovie1.determineAmount(100);
    double d5 = regularMovie1.determineAmount((int)'4');
    double d7 = regularMovie1.determineAmount((-1));
    int i9 = regularMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    nul.study.videostore.Rental rental5 = null;
    customer1.addRental(rental5);
    java.lang.String str7 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    double d11 = rentalStatement1.getAmountOwed();
    int i12 = rentalStatement1.getFrequentRenterPoints();
    int i13 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = childrensMovie1.getTitle();
    int i4 = childrensMovie1.determineFrequentRenterPoints((int)(short)0);
    double d6 = childrensMovie1.determineAmount(2);
    int i8 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    java.lang.String str7 = customer6.getName();
    java.lang.String str8 = customer6.getName();
    nul.study.videostore.RentalStatement rentalStatement10 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    rentalStatement10.addRental(rental14);
    customer6.addRental(rental14);
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i20 = newReleaseMovie19.getPriceCode();
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 1);
    int i23 = rental22.getDaysRented();
    customer6.addRental(rental22);
    java.lang.String str25 = customer6.getName();
    java.lang.String str26 = customer6.statement();
    nul.study.videostore.Customer customer28 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie30 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie30, 0);
    int i33 = rental32.determineFrequentRenterPoints();
    customer28.addRental(rental32);
    int i35 = rental32.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie36 = rental32.getMovie();
    customer6.addRental(rental32);
    customer1.addRental(rental32);
    java.lang.String str39 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "hi!"+ "'", str25.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str26.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str39.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    regularMovie1.setPriceCode((int)(byte)10);
    java.lang.String str9 = regularMovie1.getTitle();
    java.lang.String str10 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)'4');
    int i13 = rental12.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str10.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 52);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    int i11 = rental10.determineFrequentRenterPoints();
    rentalStatement6.addRental(rental10);
    java.lang.String str13 = rentalStatement6.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    rentalStatement15.addRental(rental19);
    double d22 = rental19.determineAmount();
    double d23 = rental19.determineAmount();
    rentalStatement6.addRental(rental19);
    double d25 = rental19.determineAmount();
    int i26 = rental19.getDaysRented();
    customer1.addRental(rental19);
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i30 = newReleaseMovie29.getPriceCode();
    double d32 = newReleaseMovie29.determineAmount(100);
    nul.study.videostore.Rental rental34 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, (int)(byte)10);
    int i35 = rental34.getDaysRented();
    double d36 = rental34.determineAmount();
    int i37 = rental34.getDaysRented();
    int i38 = rental34.determineFrequentRenterPoints();
    customer1.addRental(rental34);
    java.lang.String str40 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d36 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\thi!\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n"+ "'", str40.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\thi!\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    int i9 = rentalStatement1.getFrequentRenterPoints();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str11 = rentalStatement1.getName();
    java.lang.String str12 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }


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
    java.lang.String str21 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints(100);
    int i5 = regularMovie1.determineFrequentRenterPoints((int)'4');
    regularMovie1.setPriceCode((int)(byte)10);
    double d9 = regularMovie1.determineAmount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 77.0d);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    double d5 = newReleaseMovie1.determineAmount((int)' ');
    double d7 = newReleaseMovie1.determineAmount((int)' ');
    newReleaseMovie1.setPriceCode((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 96.0d);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    double d3 = regularMovie1.determineAmount((int)(byte)0);
    double d5 = regularMovie1.determineAmount((int)(byte)1);
    double d7 = regularMovie1.determineAmount((int)(byte)1);
    java.lang.String str8 = regularMovie1.getTitle();
    regularMovie1.setPriceCode(52);
    int i12 = regularMovie1.determineFrequentRenterPoints((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    double d3 = regularMovie1.determineAmount((int)(byte)0);
    double d5 = regularMovie1.determineAmount((-1));
    java.lang.String str6 = regularMovie1.getTitle();
    regularMovie1.setPriceCode((int)'#');
    int i9 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 35);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount(3);
    java.lang.String str8 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 9.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental7.getMovie();
    customer1.addRental(rental7);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i13 = newReleaseMovie12.getPriceCode();
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 1);
    int i16 = newReleaseMovie12.getPriceCode();
    newReleaseMovie12.setPriceCode((int)(short)100);
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, (int)(short)0);
    double d21 = rental20.determineAmount();
    customer1.addRental(rental20);
    int i23 = rental20.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i8 = regularMovie1.determineFrequentRenterPoints(0);
    double d10 = regularMovie1.determineAmount((int)'4');
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 77.0d);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    int i10 = regularMovie1.getPriceCode();
    double d12 = regularMovie1.determineAmount((int)(byte)10);
    int i14 = regularMovie1.determineFrequentRenterPoints((int)(byte)0);
    java.lang.String str15 = regularMovie1.getTitle();
    int i17 = regularMovie1.determineFrequentRenterPoints(3);
    
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
    org.junit.Assert.assertTrue(d12 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(short)1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    double d7 = childrensMovie1.determineAmount(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 49.5d);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)10);
    double d8 = newReleaseMovie1.determineAmount((int)'a');
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)' ');
    double d12 = newReleaseMovie1.determineAmount((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-3.0d));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.getName();
    double d5 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement7 = new nul.study.videostore.RentalStatement("");
    int i8 = rentalStatement7.getFrequentRenterPoints();
    java.lang.String str9 = rentalStatement7.getName();
    int i10 = rentalStatement7.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    rentalStatement7.addRental(rental14);
    rentalStatement1.addRental(rental14);
    nul.study.videostore.RentalStatement rentalStatement21 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str22 = rentalStatement21.makeRentalStatement();
    int i23 = rentalStatement21.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement25 = new nul.study.videostore.RentalStatement("");
    int i26 = rentalStatement25.getFrequentRenterPoints();
    nul.study.videostore.Customer customer28 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie30 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie30, 0);
    int i33 = rental32.determineFrequentRenterPoints();
    customer28.addRental(rental32);
    int i35 = rental32.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie36 = rental32.getMovie();
    rentalStatement25.addRental(rental32);
    nul.study.videostore.NewReleaseMovie newReleaseMovie39 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental41 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie39, 0);
    int i42 = rental41.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie43 = rental41.getMovie();
    rentalStatement25.addRental(rental41);
    int i45 = rental41.determineFrequentRenterPoints();
    rentalStatement21.addRental(rental41);
    rentalStatement1.addRental(rental41);
    double d48 = rental41.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str22.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d48 == 0.0d);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    java.lang.String str6 = childrensMovie1.getTitle();
    double d8 = childrensMovie1.determineAmount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.5d);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints(0);
    double d5 = childrensMovie1.determineAmount((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.5d);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }


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
    java.lang.String str15 = rentalStatement1.makeRentalStatement();
    java.lang.String str16 = rentalStatement1.getName();
    int i17 = rentalStatement1.getFrequentRenterPoints();
    double d18 = rentalStatement1.getAmountOwed();
    java.lang.String str19 = rentalStatement1.getName();
    java.lang.String str20 = rentalStatement1.getName();
    java.lang.String str21 = rentalStatement1.getName();
    java.lang.String str22 = rentalStatement1.getName();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    java.lang.String str5 = newReleaseMovie1.getTitle();
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)100);
    newReleaseMovie1.setPriceCode((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\thi!\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }


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
    nul.study.videostore.Customer customer34 = new nul.study.videostore.Customer("hi!");
    java.lang.String str35 = customer34.getName();
    java.lang.String str36 = customer34.getName();
    nul.study.videostore.RentalStatement rentalStatement38 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie40 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental42 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie40, 0);
    int i43 = rental42.determineFrequentRenterPoints();
    rentalStatement38.addRental(rental42);
    customer34.addRental(rental42);
    nul.study.videostore.NewReleaseMovie newReleaseMovie47 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i48 = newReleaseMovie47.getPriceCode();
    nul.study.videostore.Rental rental50 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie47, 1);
    int i51 = rental50.getDaysRented();
    customer34.addRental(rental50);
    java.lang.String str53 = customer34.getName();
    java.lang.String str54 = customer34.statement();
    nul.study.videostore.Customer customer56 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie58 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental60 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie58, 0);
    int i61 = rental60.determineFrequentRenterPoints();
    customer56.addRental(rental60);
    int i63 = rental60.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie64 = rental60.getMovie();
    customer34.addRental(rental60);
    int i66 = rental60.getDaysRented();
    int i67 = rental60.getDaysRented();
    rentalStatement1.addRental(rental60);
    java.lang.String str69 = rentalStatement1.getName();
    int i70 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str54.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str69 + "' != '" + ""+ "'", str69.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(short)1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(35);
    double d7 = childrensMovie1.determineAmount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 75.0d);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount((int)(byte)100);
    int i4 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    double d6 = regularMovie1.determineAmount(0);
    double d8 = regularMovie1.determineAmount((int)(short)-1);
    double d10 = regularMovie1.determineAmount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 2.0d);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(100);
    java.lang.String str4 = newReleaseMovie1.getTitle();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    childrensMovie1.setPriceCode((-1));
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)0);
    int i11 = childrensMovie1.determineFrequentRenterPoints(52);
    int i13 = childrensMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    int i7 = regularMovie1.determineFrequentRenterPoints(0);
    double d9 = regularMovie1.determineAmount((int)(short)0);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i13 = regularMovie1.determineFrequentRenterPoints((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    int i10 = rental8.getDaysRented();
    double d11 = rental8.determineAmount();
    int i12 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.NewReleaseMovie newReleaseMovie15 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie15, 0);
    int i18 = rental17.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie19 = rental17.getMovie();
    nul.study.videostore.Movie movie20 = rental17.getMovie();
    double d21 = rental17.determineAmount();
    nul.study.videostore.Movie movie22 = rental17.getMovie();
    int i23 = rental17.getDaysRented();
    int i24 = rental17.determineFrequentRenterPoints();
    customer1.addRental(rental17);
    double d26 = rental17.determineAmount();
    int i27 = rental17.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 3.0d);
    
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
    org.junit.Assert.assertNotNull(movie22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }


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
    nul.study.videostore.Movie movie24 = rental20.getMovie();
    int i25 = rental20.determineFrequentRenterPoints();
    int i26 = rental20.getDaysRented();
    
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
    org.junit.Assert.assertNotNull(movie24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    nul.study.videostore.Movie movie6 = rental3.getMovie();
    double d7 = rental3.determineAmount();
    nul.study.videostore.Movie movie8 = rental3.getMovie();
    int i9 = rental3.determineFrequentRenterPoints();
    
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

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(short)1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(35);
    java.lang.String str6 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\thi!\t156.0\n\t\t0.0\nYou owed 156.0\nYou earned 4 frequent renter points\n");

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(10);
    java.lang.String str4 = childrensMovie1.getTitle();
    double d6 = childrensMovie1.determineAmount((int)'4');
    double d8 = childrensMovie1.determineAmount(1);
    double d10 = childrensMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 1.5d);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'a');
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 1);
    int i9 = regularMovie1.getPriceCode();
    regularMovie1.setPriceCode((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    int i11 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str12 = rentalStatement1.getName();
    nul.study.videostore.RentalStatement rentalStatement14 = new nul.study.videostore.RentalStatement("");
    int i15 = rentalStatement14.getFrequentRenterPoints();
    nul.study.videostore.Customer customer17 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 0);
    int i22 = rental21.determineFrequentRenterPoints();
    customer17.addRental(rental21);
    int i24 = rental21.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie25 = rental21.getMovie();
    rentalStatement14.addRental(rental21);
    double d27 = rental21.determineAmount();
    double d28 = rental21.determineAmount();
    int i29 = rental21.getDaysRented();
    int i30 = rental21.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)' ');
    double d9 = regularMovie1.determineAmount(0);
    double d11 = regularMovie1.determineAmount((int)(byte)1);
    int i12 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount(0);
    double d9 = newReleaseMovie1.determineAmount((int)(byte)100);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    nul.study.videostore.Movie movie8 = rental5.getMovie();
    movie8.setPriceCode((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie8);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    java.lang.String str5 = newReleaseMovie1.getTitle();
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)100);
    nul.study.videostore.Movie movie8 = rental7.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie8);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    childrensMovie1.setPriceCode((-1));
    double d9 = childrensMovie1.determineAmount(0);
    double d11 = childrensMovie1.determineAmount((int)(short)10);
    double d13 = childrensMovie1.determineAmount(1);
    java.lang.String str14 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str14.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    int i10 = rental8.getDaysRented();
    double d11 = rental8.determineAmount();
    int i12 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("");
    int i16 = rentalStatement15.getFrequentRenterPoints();
    nul.study.videostore.Customer customer18 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, 0);
    int i23 = rental22.determineFrequentRenterPoints();
    customer18.addRental(rental22);
    int i25 = rental22.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie26 = rental22.getMovie();
    rentalStatement15.addRental(rental22);
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, 0);
    int i32 = rental31.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie33 = rental31.getMovie();
    rentalStatement15.addRental(rental31);
    customer1.addRental(rental31);
    nul.study.videostore.Customer customer37 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str38 = customer37.statement();
    java.lang.String str39 = customer37.getName();
    java.lang.String str40 = customer37.getName();
    nul.study.videostore.Customer customer42 = new nul.study.videostore.Customer("hi!");
    java.lang.String str43 = customer42.getName();
    java.lang.String str44 = customer42.getName();
    nul.study.videostore.RentalStatement rentalStatement46 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie48 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental50 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie48, 0);
    int i51 = rental50.determineFrequentRenterPoints();
    rentalStatement46.addRental(rental50);
    customer42.addRental(rental50);
    nul.study.videostore.NewReleaseMovie newReleaseMovie55 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i56 = newReleaseMovie55.getPriceCode();
    nul.study.videostore.Rental rental58 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie55, 1);
    int i59 = rental58.getDaysRented();
    customer42.addRental(rental58);
    java.lang.String str61 = customer42.getName();
    java.lang.String str62 = customer42.statement();
    nul.study.videostore.Customer customer64 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie66 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental68 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie66, 0);
    int i69 = rental68.determineFrequentRenterPoints();
    customer64.addRental(rental68);
    int i71 = rental68.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie72 = rental68.getMovie();
    customer42.addRental(rental68);
    customer37.addRental(rental68);
    nul.study.videostore.Movie movie75 = rental68.getMovie();
    customer1.addRental(rental68);
    int i77 = rental68.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str38.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str39.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str40.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!"+ "'", str43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "hi!"+ "'", str44.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "hi!"+ "'", str61.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str62.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    java.lang.String str5 = rentalStatement1.getName();
    nul.study.videostore.RegularMovie regularMovie7 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str8 = regularMovie7.getTitle();
    int i10 = regularMovie7.determineFrequentRenterPoints((int)(short)100);
    int i12 = regularMovie7.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie7, (int)(byte)0);
    rentalStatement1.addRental(rental14);
    double d16 = rentalStatement1.getAmountOwed();
    double d17 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)' ');
    int i8 = rental7.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    double d10 = newReleaseMovie1.determineAmount((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 300.0d);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    double d11 = regularMovie1.determineAmount((int)(byte)1);
    int i12 = regularMovie1.getPriceCode();
    int i14 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i16 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    int i18 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    double d20 = regularMovie1.determineAmount((int)(short)10);
    regularMovie1.setPriceCode(52);
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 14.0d);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    java.lang.String str11 = rentalStatement1.makeRentalStatement();
    double d12 = rentalStatement1.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 10);
    rentalStatement1.addRental(rental18);
    double d20 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }


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
    java.lang.String str13 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie15 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie15, 0);
    rentalStatement1.addRental(rental17);
    nul.study.videostore.Movie movie19 = rental17.getMovie();
    java.lang.String str20 = movie19.getTitle();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i5 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    double d7 = regularMovie1.determineAmount(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 77.0d);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental7.getMovie();
    customer1.addRental(rental7);
    java.lang.String str11 = customer1.statement();
    nul.study.videostore.Customer customer13 = new nul.study.videostore.Customer("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str14 = customer13.getName();
    nul.study.videostore.Customer customer16 = new nul.study.videostore.Customer("hi!");
    java.lang.String str17 = customer16.getName();
    java.lang.String str18 = customer16.getName();
    nul.study.videostore.RentalStatement rentalStatement20 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie22 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, 0);
    int i25 = rental24.determineFrequentRenterPoints();
    rentalStatement20.addRental(rental24);
    customer16.addRental(rental24);
    java.lang.String str28 = customer16.statement();
    java.lang.String str29 = customer16.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie31 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental33 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie31, 0);
    int i34 = rental33.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie35 = rental33.getMovie();
    nul.study.videostore.Movie movie36 = rental33.getMovie();
    double d37 = rental33.determineAmount();
    customer16.addRental(rental33);
    int i39 = rental33.determineFrequentRenterPoints();
    customer13.addRental(rental33);
    customer1.addRental(rental33);
    int i42 = rental33.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str14.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!"+ "'", str17.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str28.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str29.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d37 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)1);
    double d10 = newReleaseMovie1.determineAmount(1);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)'a');
    double d14 = newReleaseMovie1.determineAmount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 300.0d);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.statement();
    java.lang.String str6 = customer1.statement();
    java.lang.String str7 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    double d3 = rentalStatement1.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    int i10 = rental8.getDaysRented();
    rentalStatement1.addRental(rental8);
    int i12 = rental8.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    double d7 = childrensMovie1.determineAmount((int)(short)10);
    double d9 = childrensMovie1.determineAmount((int)(short)1);
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i12 = childrensMovie1.getPriceCode();
    int i14 = childrensMovie1.determineFrequentRenterPoints(100);
    int i16 = childrensMovie1.determineFrequentRenterPoints(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 0);
    int i19 = rental18.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie20 = rental18.getMovie();
    nul.study.videostore.Movie movie21 = rental18.getMovie();
    double d22 = rental18.determineAmount();
    customer1.addRental(rental18);
    nul.study.videostore.Movie movie24 = rental18.getMovie();
    double d25 = rental18.determineAmount();
    nul.study.videostore.Movie movie26 = rental18.getMovie();
    nul.study.videostore.Rental rental28 = new nul.study.videostore.Rental(movie26, (int)'4');
    int i29 = rental28.getDaysRented();
    int i30 = rental28.getDaysRented();
    nul.study.videostore.Movie movie31 = rental28.getMovie();
    
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
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie31);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    java.lang.String str5 = rentalStatement1.getName();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    double d7 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    int i2 = regularMovie1.getPriceCode();
    int i4 = regularMovie1.determineFrequentRenterPoints(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str5 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Rental rental5 = null;
    rentalStatement1.addRental(rental5);
    java.lang.String str7 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str7.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    int i8 = newReleaseMovie7.getPriceCode();
    int i10 = newReleaseMovie7.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, (-1));
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, (int)(short)0);
    nul.study.videostore.Movie movie15 = rental14.getMovie();
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental(movie15, (int)(short)0);
    rentalStatement1.addRental(rental17);
    nul.study.videostore.Customer customer20 = new nul.study.videostore.Customer("hi!");
    java.lang.String str21 = customer20.getName();
    java.lang.String str22 = customer20.getName();
    nul.study.videostore.RentalStatement rentalStatement24 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie26 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental28 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, 0);
    int i29 = rental28.determineFrequentRenterPoints();
    rentalStatement24.addRental(rental28);
    customer20.addRental(rental28);
    java.lang.String str32 = customer20.statement();
    java.lang.String str33 = customer20.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie35 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental37 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie35, 0);
    int i38 = rental37.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie39 = rental37.getMovie();
    nul.study.videostore.Movie movie40 = rental37.getMovie();
    double d41 = rental37.determineAmount();
    customer20.addRental(rental37);
    double d43 = rental37.determineAmount();
    int i44 = rental37.determineFrequentRenterPoints();
    int i45 = rental37.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental37);
    nul.study.videostore.Movie movie47 = rental37.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str32.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str33.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie47);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.getName();
    double d5 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement7 = new nul.study.videostore.RentalStatement("");
    int i8 = rentalStatement7.getFrequentRenterPoints();
    java.lang.String str9 = rentalStatement7.getName();
    int i10 = rentalStatement7.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    rentalStatement7.addRental(rental14);
    rentalStatement1.addRental(rental14);
    nul.study.videostore.RentalStatement rentalStatement21 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str22 = rentalStatement21.makeRentalStatement();
    int i23 = rentalStatement21.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement25 = new nul.study.videostore.RentalStatement("");
    int i26 = rentalStatement25.getFrequentRenterPoints();
    nul.study.videostore.Customer customer28 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie30 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie30, 0);
    int i33 = rental32.determineFrequentRenterPoints();
    customer28.addRental(rental32);
    int i35 = rental32.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie36 = rental32.getMovie();
    rentalStatement25.addRental(rental32);
    nul.study.videostore.NewReleaseMovie newReleaseMovie39 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental41 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie39, 0);
    int i42 = rental41.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie43 = rental41.getMovie();
    rentalStatement25.addRental(rental41);
    int i45 = rental41.determineFrequentRenterPoints();
    rentalStatement21.addRental(rental41);
    rentalStatement1.addRental(rental41);
    int i48 = rental41.determineFrequentRenterPoints();
    double d49 = rental41.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str22.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d49 == 0.0d);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    java.lang.String str3 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    double d7 = childrensMovie1.determineAmount((int)(short)1);
    java.lang.String str8 = childrensMovie1.getTitle();
    double d10 = childrensMovie1.determineAmount(52);
    int i12 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, 1);
    double d16 = childrensMovie1.determineAmount(1);
    int i18 = childrensMovie1.determineFrequentRenterPoints((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.RegularMovie regularMovie5 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str6 = regularMovie5.getTitle();
    int i8 = regularMovie5.determineFrequentRenterPoints((int)(short)100);
    int i10 = regularMovie5.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie5, (int)(byte)0);
    customer1.addRental(rental12);
    int i14 = rental12.getDaysRented();
    int i15 = rental12.determineFrequentRenterPoints();
    int i16 = rental12.determineFrequentRenterPoints();
    int i17 = rental12.getDaysRented();
    nul.study.videostore.Movie movie18 = rental12.getMovie();
    int i19 = rental12.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    double d6 = regularMovie1.determineAmount(0);
    double d8 = regularMovie1.determineAmount((int)(short)-1);
    int i10 = regularMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }


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
    double d17 = rentalStatement1.getAmountOwed();
    java.lang.String str18 = rentalStatement1.makeRentalStatement();
    int i19 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str18.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)10);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints(0);
    java.lang.String str9 = newReleaseMovie1.getTitle();
    newReleaseMovie1.setPriceCode((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(byte)10);
    childrensMovie1.setPriceCode(0);
    int i8 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    java.lang.String str4 = childrensMovie1.getTitle();
    java.lang.String str5 = childrensMovie1.getTitle();
    int i7 = childrensMovie1.determineFrequentRenterPoints((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    childrensMovie1.setPriceCode((int)'4');
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(byte)10);
    childrensMovie1.setPriceCode((int)(byte)100);
    double d11 = childrensMovie1.determineAmount(1);
    childrensMovie1.setPriceCode(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.5d);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)10);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    double d8 = regularMovie1.determineAmount((int)'a');
    int i10 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    regularMovie1.setPriceCode((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 144.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }


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
    nul.study.videostore.Movie movie15 = rental10.getMovie();
    movie15.setPriceCode((int)(byte)1);
    
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
    org.junit.Assert.assertNotNull(movie15);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'a');
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 1);
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)-1);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(short)100);
    double d13 = rental12.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 149.0d);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }


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
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental(movie21, (-1));
    int i24 = rental23.getDaysRented();
    nul.study.videostore.Movie movie25 = rental23.getMovie();
    int i26 = rental23.getDaysRented();
    
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
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == (-1));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str6 = rentalStatement1.getName();
    java.lang.String str7 = rentalStatement1.makeRentalStatement();
    java.lang.String str8 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    int i4 = childrensMovie1.determineFrequentRenterPoints(1);
    double d6 = childrensMovie1.determineAmount((int)(short)1);
    int i8 = childrensMovie1.determineFrequentRenterPoints((int)'#');
    double d10 = childrensMovie1.determineAmount((int)(short)10);
    double d12 = childrensMovie1.determineAmount(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 75.0d);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    int i4 = childrensMovie1.determineFrequentRenterPoints((int)'a');
    double d6 = childrensMovie1.determineAmount((int)(byte)-1);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)'a');
    int i9 = rental8.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 97);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    double d7 = regularMovie1.determineAmount(10);
    double d9 = regularMovie1.determineAmount(0);
    regularMovie1.setPriceCode((int)(short)-1);
    java.lang.String str12 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie1.determineFrequentRenterPoints(100);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i11 = childrensMovie1.determineFrequentRenterPoints(0);
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, 10);
    childrensMovie1.setPriceCode(100);
    double d17 = childrensMovie1.determineAmount(0);
    
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
    org.junit.Assert.assertTrue(d17 == 1.5d);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
    double d3 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    int i6 = rentalStatement5.getFrequentRenterPoints();
    nul.study.videostore.Customer customer8 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 0);
    int i13 = rental12.determineFrequentRenterPoints();
    customer8.addRental(rental12);
    int i15 = rental12.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental12.getMovie();
    rentalStatement5.addRental(rental12);
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 0);
    int i22 = rental21.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie23 = rental21.getMovie();
    rentalStatement5.addRental(rental21);
    int i25 = rental21.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie26 = rental21.getMovie();
    rentalStatement1.addRental(rental21);
    java.lang.String str28 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Rental Record for Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str28.equals("Rental Record for Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(short)0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    customer1.addRental(rental6);
    java.lang.String str8 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement10 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    rentalStatement10.addRental(rental14);
    java.lang.String str17 = rentalStatement10.makeRentalStatement();
    java.lang.String str18 = rentalStatement10.makeRentalStatement();
    double d19 = rentalStatement10.getAmountOwed();
    java.lang.String str20 = rentalStatement10.getName();
    nul.study.videostore.Customer customer22 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 0);
    int i27 = rental26.determineFrequentRenterPoints();
    customer22.addRental(rental26);
    rentalStatement10.addRental(rental26);
    java.lang.String str30 = rentalStatement10.getName();
    nul.study.videostore.RentalStatement rentalStatement32 = new nul.study.videostore.RentalStatement("");
    int i33 = rentalStatement32.getFrequentRenterPoints();
    java.lang.String str34 = rentalStatement32.getName();
    int i35 = rentalStatement32.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie37 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie37, 0);
    int i40 = rental39.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie41 = rental39.getMovie();
    nul.study.videostore.Movie movie42 = rental39.getMovie();
    rentalStatement32.addRental(rental39);
    int i44 = rentalStatement32.getFrequentRenterPoints();
    int i45 = rentalStatement32.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement47 = new nul.study.videostore.RentalStatement("");
    int i48 = rentalStatement47.getFrequentRenterPoints();
    nul.study.videostore.Customer customer50 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie52 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental54 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie52, 0);
    int i55 = rental54.determineFrequentRenterPoints();
    customer50.addRental(rental54);
    int i57 = rental54.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie58 = rental54.getMovie();
    rentalStatement47.addRental(rental54);
    nul.study.videostore.NewReleaseMovie newReleaseMovie61 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental63 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie61, 0);
    int i64 = rental63.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie65 = rental63.getMovie();
    rentalStatement47.addRental(rental63);
    rentalStatement32.addRental(rental63);
    nul.study.videostore.RentalStatement rentalStatement69 = new nul.study.videostore.RentalStatement("");
    java.lang.String str70 = rentalStatement69.makeRentalStatement();
    double d71 = rentalStatement69.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie73 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i74 = newReleaseMovie73.getPriceCode();
    nul.study.videostore.Rental rental76 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie73, 1);
    int i77 = rental76.getDaysRented();
    int i78 = rental76.getDaysRented();
    rentalStatement69.addRental(rental76);
    rentalStatement32.addRental(rental76);
    nul.study.videostore.NewReleaseMovie newReleaseMovie82 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i83 = newReleaseMovie82.getPriceCode();
    nul.study.videostore.Rental rental85 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie82, 0);
    rentalStatement32.addRental(rental85);
    rentalStatement10.addRental(rental85);
    customer1.addRental(rental85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str18.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + ""+ "'", str30.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str70.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d71 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 1);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie1.determineFrequentRenterPoints((int)'4');
    double d9 = childrensMovie1.determineAmount(100);
    double d11 = childrensMovie1.determineAmount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 142.5d);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie1.determineFrequentRenterPoints(100);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i11 = childrensMovie1.determineFrequentRenterPoints(0);
    double d13 = childrensMovie1.determineAmount((int)(byte)1);
    
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
    org.junit.Assert.assertTrue(d13 == 1.5d);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i5 = newReleaseMovie1.getPriceCode();
    newReleaseMovie1.setPriceCode((int)(short)100);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)1);
    double d13 = newReleaseMovie1.determineAmount(1);
    double d15 = newReleaseMovie1.determineAmount((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 30.0d);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints(2);
    java.lang.String str4 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    double d3 = regularMovie1.determineAmount((int)(byte)0);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 52);
    int i6 = rental5.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)'#');
    double d9 = childrensMovie1.determineAmount((int)(short)10);
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(short)100);
    java.lang.String str12 = childrensMovie1.getTitle();
    int i14 = childrensMovie1.determineFrequentRenterPoints((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount((int)(short)-1);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)'4');
    java.lang.String str10 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i10 = newReleaseMovie1.determineFrequentRenterPoints(0);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    double d9 = newReleaseMovie1.determineAmount((int)'#');
    double d11 = newReleaseMovie1.determineAmount((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 105.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 105.0d);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental7.getMovie();
    customer1.addRental(rental7);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i13 = newReleaseMovie12.getPriceCode();
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i17 = newReleaseMovie12.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, (int)(byte)-1);
    int i20 = rental19.determineFrequentRenterPoints();
    int i21 = rental19.determineFrequentRenterPoints();
    customer1.addRental(rental19);
    nul.study.videostore.RentalStatement rentalStatement24 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d25 = rentalStatement24.getAmountOwed();
    java.lang.String str26 = rentalStatement24.getName();
    java.lang.String str27 = rentalStatement24.getName();
    double d28 = rentalStatement24.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement30 = new nul.study.videostore.RentalStatement("");
    int i31 = rentalStatement30.getFrequentRenterPoints();
    java.lang.String str32 = rentalStatement30.getName();
    int i33 = rentalStatement30.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie35 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental37 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie35, 0);
    int i38 = rental37.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie39 = rental37.getMovie();
    nul.study.videostore.Movie movie40 = rental37.getMovie();
    rentalStatement30.addRental(rental37);
    rentalStatement24.addRental(rental37);
    customer1.addRental(rental37);
    java.lang.String str44 = customer1.statement();
    java.lang.String str45 = customer1.getName();
    java.lang.String str46 = customer1.statement();
    java.lang.String str47 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str26.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str27.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n"+ "'", str44.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "hi!"+ "'", str45.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n"+ "'", str46.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "hi!"+ "'", str47.equals("hi!"));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)10);
    int i7 = rental6.getDaysRented();
    double d8 = rental6.determineAmount();
    nul.study.videostore.Movie movie9 = rental6.getMovie();
    nul.study.videostore.Movie movie10 = rental6.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(10);
    int i6 = regularMovie1.getPriceCode();
    regularMovie1.setPriceCode((int)(short)0);
    int i10 = regularMovie1.determineFrequentRenterPoints((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    regularMovie1.setPriceCode(0);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 0);
    int i22 = rental21.determineFrequentRenterPoints();
    rentalStatement17.addRental(rental21);
    java.lang.String str24 = rentalStatement17.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement26 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie28 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental30 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie28, 0);
    int i31 = rental30.determineFrequentRenterPoints();
    rentalStatement26.addRental(rental30);
    double d33 = rental30.determineAmount();
    double d34 = rental30.determineAmount();
    rentalStatement17.addRental(rental30);
    int i36 = rental30.getDaysRented();
    rentalStatement1.addRental(rental30);
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
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str24.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d34 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    int i7 = childrensMovie1.determineFrequentRenterPoints(0);
    double d9 = childrensMovie1.determineAmount((int)(short)100);
    double d11 = childrensMovie1.determineAmount(1);
    double d13 = childrensMovie1.determineAmount(52);
    int i14 = childrensMovie1.getPriceCode();
    java.lang.String str15 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str15.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str6 = rentalStatement1.makeRentalStatement();
    int i7 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str8 = rentalStatement1.getName();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str9.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    double d7 = childrensMovie1.determineAmount((int)(short)1);
    java.lang.String str8 = childrensMovie1.getTitle();
    double d10 = childrensMovie1.determineAmount(52);
    int i12 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    double d14 = childrensMovie1.determineAmount((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 12.0d);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints(1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 0);
    int i8 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    int i10 = regularMovie1.determineFrequentRenterPoints((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    double d5 = newReleaseMovie1.determineAmount((int)(short)-1);
    newReleaseMovie1.setPriceCode((int)(short)100);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)100);
    java.lang.String str10 = newReleaseMovie1.getTitle();
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount((int)'a');
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)0);
    int i10 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    java.lang.String str11 = newReleaseMovie1.getTitle();
    double d13 = newReleaseMovie1.determineAmount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 3.0d);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount(0);
    int i8 = newReleaseMovie1.getPriceCode();
    int i10 = newReleaseMovie1.determineFrequentRenterPoints(52);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    double d3 = newReleaseMovie1.determineAmount(100);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i6 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)-1);
    int i10 = newReleaseMovie1.determineFrequentRenterPoints(1);
    newReleaseMovie1.setPriceCode((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    nul.study.videostore.Customer customer9 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    customer9.addRental(rental13);
    int i16 = rental13.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie17 = rental13.getMovie();
    int i18 = rental13.determineFrequentRenterPoints();
    customer1.addRental(rental13);
    nul.study.videostore.Customer customer21 = new nul.study.videostore.Customer("hi!");
    java.lang.String str22 = customer21.getName();
    java.lang.String str23 = customer21.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, 0);
    int i28 = rental27.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie29 = rental27.getMovie();
    customer21.addRental(rental27);
    java.lang.String str31 = customer21.statement();
    java.lang.String str32 = customer21.getName();
    nul.study.videostore.Customer customer34 = new nul.study.videostore.Customer("hi!");
    java.lang.String str35 = customer34.getName();
    java.lang.String str36 = customer34.getName();
    nul.study.videostore.RentalStatement rentalStatement38 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie40 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental42 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie40, 0);
    int i43 = rental42.determineFrequentRenterPoints();
    rentalStatement38.addRental(rental42);
    customer34.addRental(rental42);
    nul.study.videostore.NewReleaseMovie newReleaseMovie47 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i48 = newReleaseMovie47.getPriceCode();
    nul.study.videostore.Rental rental50 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie47, 1);
    int i51 = rental50.getDaysRented();
    customer34.addRental(rental50);
    java.lang.String str53 = customer34.getName();
    java.lang.String str54 = customer34.statement();
    nul.study.videostore.Customer customer56 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie58 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental60 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie58, 0);
    int i61 = rental60.determineFrequentRenterPoints();
    customer56.addRental(rental60);
    int i63 = rental60.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie64 = rental60.getMovie();
    customer34.addRental(rental60);
    int i66 = rental60.getDaysRented();
    int i67 = rental60.getDaysRented();
    double d68 = rental60.determineAmount();
    customer21.addRental(rental60);
    customer1.addRental(rental60);
    java.lang.String str71 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!"+ "'", str23.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str31.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!"+ "'", str53.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str54.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"+ "'", str71.equals("Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)10);
    int i7 = rental6.getDaysRented();
    double d8 = rental6.determineAmount();
    nul.study.videostore.Movie movie9 = rental6.getMovie();
    double d10 = rental6.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 30.0d);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    double d7 = regularMovie1.determineAmount(10);
    double d9 = regularMovie1.determineAmount(0);
    double d11 = regularMovie1.determineAmount(100);
    int i13 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)'4');
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 100);
    int i18 = rental17.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental7.getMovie();
    customer1.addRental(rental7);
    java.lang.String str11 = customer1.statement();
    java.lang.String str12 = customer1.getName();
    nul.study.videostore.Customer customer14 = new nul.study.videostore.Customer("hi!");
    java.lang.String str15 = customer14.getName();
    java.lang.String str16 = customer14.getName();
    nul.study.videostore.RentalStatement rentalStatement18 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, 0);
    int i23 = rental22.determineFrequentRenterPoints();
    rentalStatement18.addRental(rental22);
    customer14.addRental(rental22);
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i28 = newReleaseMovie27.getPriceCode();
    nul.study.videostore.Rental rental30 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 1);
    int i31 = rental30.getDaysRented();
    customer14.addRental(rental30);
    java.lang.String str33 = customer14.getName();
    java.lang.String str34 = customer14.statement();
    nul.study.videostore.Customer customer36 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie38 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental40 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie38, 0);
    int i41 = rental40.determineFrequentRenterPoints();
    customer36.addRental(rental40);
    int i43 = rental40.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie44 = rental40.getMovie();
    customer14.addRental(rental40);
    int i46 = rental40.getDaysRented();
    int i47 = rental40.getDaysRented();
    double d48 = rental40.determineAmount();
    customer1.addRental(rental40);
    nul.study.videostore.RentalStatement rentalStatement51 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d52 = rentalStatement51.getAmountOwed();
    java.lang.String str53 = rentalStatement51.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie55 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental57 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie55, 0);
    int i58 = rental57.determineFrequentRenterPoints();
    rentalStatement51.addRental(rental57);
    nul.study.videostore.Movie movie60 = rental57.getMovie();
    customer1.addRental(rental57);
    java.lang.String str62 = customer1.getName();
    java.lang.String str63 = customer1.statement();
    java.lang.String str64 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!"+ "'", str15.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!"+ "'", str16.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str34.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str53.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "hi!"+ "'", str62.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"+ "'", str63.equals("Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }


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
    customer1.addRental(rental17);
    java.lang.String str20 = customer1.getName();
    java.lang.String str21 = customer1.statement();
    java.lang.String str22 = customer1.statement();
    nul.study.videostore.Rental rental23 = null;
    customer1.addRental(rental23);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str25 = customer1.statement();
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
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str21.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str22.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }


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
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    double d5 = rentalStatement1.getAmountOwed();
    java.lang.String str6 = rentalStatement1.makeRentalStatement();
    int i7 = rentalStatement1.getFrequentRenterPoints();
    double d8 = rentalStatement1.getAmountOwed();
    int i9 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)10);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)100);
    newReleaseMovie1.setPriceCode((int)'4');
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)1);
    double d14 = newReleaseMovie1.determineAmount((int)(short)0);
    int i16 = newReleaseMovie1.determineFrequentRenterPoints((int)'#');
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    double d7 = childrensMovie1.determineAmount((int)(short)10);
    double d9 = childrensMovie1.determineAmount((int)(short)1);
    int i10 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount((int)'a');
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)0);
    java.lang.String str9 = newReleaseMovie1.getTitle();
    newReleaseMovie1.setPriceCode((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    int i4 = childrensMovie1.determineFrequentRenterPoints((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(short)1);
    double d5 = childrensMovie1.determineAmount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 75.0d);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    double d8 = regularMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 2.0d);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d4 = rentalStatement3.getAmountOwed();
    java.lang.String str5 = rentalStatement3.getName();
    java.lang.String str6 = rentalStatement3.getName();
    double d7 = rentalStatement3.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement9 = new nul.study.videostore.RentalStatement("");
    int i10 = rentalStatement9.getFrequentRenterPoints();
    java.lang.String str11 = rentalStatement9.getName();
    int i12 = rentalStatement9.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie18 = rental16.getMovie();
    nul.study.videostore.Movie movie19 = rental16.getMovie();
    rentalStatement9.addRental(rental16);
    rentalStatement3.addRental(rental16);
    java.lang.String str22 = rentalStatement3.makeRentalStatement();
    java.lang.String str23 = rentalStatement3.makeRentalStatement();
    nul.study.videostore.Customer customer25 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 0);
    int i30 = rental29.determineFrequentRenterPoints();
    customer25.addRental(rental29);
    java.lang.String str32 = customer25.statement();
    nul.study.videostore.RegularMovie regularMovie34 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str35 = regularMovie34.getTitle();
    double d37 = regularMovie34.determineAmount((int)(byte)-1);
    java.lang.String str38 = regularMovie34.getTitle();
    nul.study.videostore.Rental rental40 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie34, (int)(byte)1);
    customer25.addRental(rental40);
    double d42 = rental40.determineAmount();
    double d43 = rental40.determineAmount();
    rentalStatement3.addRental(rental40);
    int i45 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.RegularMovie regularMovie47 = new nul.study.videostore.RegularMovie("");
    int i49 = regularMovie47.determineFrequentRenterPoints(0);
    double d51 = regularMovie47.determineAmount(100);
    int i53 = regularMovie47.determineFrequentRenterPoints((int)'#');
    double d55 = regularMovie47.determineAmount(10);
    int i56 = regularMovie47.getPriceCode();
    double d58 = regularMovie47.determineAmount((int)(byte)10);
    double d60 = regularMovie47.determineAmount((int)(short)10);
    int i62 = regularMovie47.determineFrequentRenterPoints((int)(short)-1);
    java.lang.String str63 = regularMovie47.getTitle();
    double d65 = regularMovie47.determineAmount((int)(short)0);
    nul.study.videostore.Rental rental67 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie47, (int)'#');
    rentalStatement3.addRental(rental67);
    customer1.addRental(rental67);
    java.lang.String str70 = customer1.statement();
    java.lang.String str71 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str5.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str6.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str22.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str23.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str32.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str35.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d37 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str38.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d42 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d43 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d51 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d55 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d58 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d60 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + ""+ "'", str63.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d65 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str70 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t51.5\nYou owed 51.5\nYou earned 1 frequent renter points\n"+ "'", str70.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t51.5\nYou owed 51.5\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t51.5\nYou owed 51.5\nYou earned 1 frequent renter points\n"+ "'", str71.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t51.5\nYou owed 51.5\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    newReleaseMovie1.setPriceCode((int)(byte)1);
    double d12 = newReleaseMovie1.determineAmount((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == (-3.0d));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d4 = rentalStatement3.getAmountOwed();
    java.lang.String str5 = rentalStatement3.getName();
    nul.study.videostore.Customer customer7 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    customer7.addRental(rental11);
    int i14 = rental11.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie15 = rental11.getMovie();
    int i16 = rental11.getDaysRented();
    rentalStatement3.addRental(rental11);
    customer1.addRental(rental11);
    nul.study.videostore.ChildrensMovie childrensMovie20 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d22 = childrensMovie20.determineAmount(10);
    java.lang.String str23 = childrensMovie20.getTitle();
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie20, (int)(short)0);
    customer1.addRental(rental25);
    nul.study.videostore.Movie movie27 = rental25.getMovie();
    int i28 = movie27.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str5.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str23.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 2);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }


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
    double d20 = rental14.determineAmount();
    int i21 = rental14.getDaysRented();
    int i22 = rental14.determineFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue(d20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\nYou owed 27.0\nYou earned 4 frequent renter points\n");

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 291.0d);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 30.0d);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }


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
    java.lang.String str15 = rentalStatement1.makeRentalStatement();
    double d16 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement18 = new nul.study.videostore.RentalStatement("");
    int i19 = rentalStatement18.getFrequentRenterPoints();
    nul.study.videostore.Customer customer21 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie23 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie23, 0);
    int i26 = rental25.determineFrequentRenterPoints();
    customer21.addRental(rental25);
    int i28 = rental25.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie29 = rental25.getMovie();
    rentalStatement18.addRental(rental25);
    rentalStatement1.addRental(rental25);
    double d32 = rentalStatement1.getAmountOwed();
    java.lang.String str33 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement35 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer37 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str38 = customer37.getName();
    java.lang.String str39 = customer37.statement();
    nul.study.videostore.RegularMovie regularMovie41 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str42 = regularMovie41.getTitle();
    int i44 = regularMovie41.determineFrequentRenterPoints((int)(short)100);
    int i46 = regularMovie41.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental48 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie41, (int)(byte)0);
    customer37.addRental(rental48);
    int i50 = rental48.getDaysRented();
    nul.study.videostore.Movie movie51 = rental48.getMovie();
    rentalStatement35.addRental(rental48);
    rentalStatement1.addRental(rental48);
    double d54 = rental48.determineAmount();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str33.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str38.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str39.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str42.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 2.0d);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(1);
    double d5 = regularMovie1.determineAmount((int)(byte)100);
    double d7 = regularMovie1.determineAmount((-1));
    regularMovie1.setPriceCode((int)(byte)-1);
    regularMovie1.setPriceCode((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    int i5 = regularMovie1.determineFrequentRenterPoints(35);
    int i6 = regularMovie1.getPriceCode();
    java.lang.String str7 = regularMovie1.getTitle();
    int i9 = regularMovie1.determineFrequentRenterPoints((int)(byte)1);
    double d11 = regularMovie1.determineAmount(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 14.0d);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 4 frequent renter points\n");

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str7 = rentalStatement1.getName();
    nul.study.videostore.RentalStatement rentalStatement9 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    rentalStatement9.addRental(rental13);
    int i16 = rental13.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental13);
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i20 = newReleaseMovie19.getPriceCode();
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 0);
    rentalStatement1.addRental(rental22);
    java.lang.String str24 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }


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
    customer1.addRental(rental17);
    java.lang.String str20 = customer1.getName();
    java.lang.String str21 = customer1.statement();
    java.lang.String str22 = customer1.statement();
    nul.study.videostore.Rental rental23 = null;
    customer1.addRental(rental23);
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
    nul.study.videostore.NewReleaseMovie newReleaseMovie40 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental42 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie40, 0);
    int i43 = rental42.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie44 = rental42.getMovie();
    rentalStatement26.addRental(rental42);
    customer1.addRental(rental42);
    int i47 = rental42.determineFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str21.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str22.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.statement();
    java.lang.String str5 = customer1.statement();
    nul.study.videostore.Customer customer7 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str8 = customer7.getName();
    java.lang.String str9 = customer7.statement();
    nul.study.videostore.RegularMovie regularMovie11 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str12 = regularMovie11.getTitle();
    int i14 = regularMovie11.determineFrequentRenterPoints((int)(short)100);
    int i16 = regularMovie11.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie11, (int)(byte)0);
    customer7.addRental(rental18);
    int i20 = rental18.getDaysRented();
    int i21 = rental18.determineFrequentRenterPoints();
    int i22 = rental18.getDaysRented();
    customer1.addRental(rental18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str9.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str12.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    double d3 = newReleaseMovie1.determineAmount(100);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i6 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)-1);
    int i10 = newReleaseMovie1.determineFrequentRenterPoints(10);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }


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
    customer1.addRental(rental17);
    java.lang.String str20 = customer1.getName();
    java.lang.String str21 = customer1.statement();
    java.lang.String str22 = customer1.statement();
    java.lang.String str23 = customer1.statement();
    java.lang.String str24 = customer1.getName();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str21.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str22.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str23.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    double d3 = rentalStatement1.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    int i10 = rental8.getDaysRented();
    rentalStatement1.addRental(rental8);
    int i12 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str13 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.ChildrensMovie childrensMovie15 = new nul.study.videostore.ChildrensMovie("");
    int i17 = childrensMovie15.determineFrequentRenterPoints(1);
    childrensMovie15.setPriceCode((int)'4');
    double d21 = childrensMovie15.determineAmount(2);
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie15, (int)'#');
    rentalStatement1.addRental(rental23);
    double d25 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 3.0d);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(100);
    double d5 = newReleaseMovie1.determineAmount((int)(short)-1);
    double d7 = newReleaseMovie1.determineAmount(1);
    java.lang.String str8 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    java.lang.String str2 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    double d9 = regularMovie1.determineAmount((int)(byte)1);
    double d11 = regularMovie1.determineAmount(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    double d7 = childrensMovie1.determineAmount((int)(short)1);
    double d9 = childrensMovie1.determineAmount((int)(byte)1);
    int i10 = childrensMovie1.getPriceCode();
    double d12 = childrensMovie1.determineAmount((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 147.0d);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)10);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints(0);
    double d10 = newReleaseMovie1.determineAmount((int)(byte)10);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    double d14 = newReleaseMovie1.determineAmount(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 30.0d);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.getName();
    java.lang.String str9 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i12 = newReleaseMovie11.getPriceCode();
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 1);
    int i15 = rental14.getDaysRented();
    int i16 = rental14.getDaysRented();
    double d17 = rental14.determineAmount();
    customer1.addRental(rental14);
    int i19 = rental14.determineFrequentRenterPoints();
    int i20 = rental14.getDaysRented();
    nul.study.videostore.Movie movie21 = rental14.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)10);
    int i7 = rental6.getDaysRented();
    double d8 = rental6.determineAmount();
    nul.study.videostore.Movie movie9 = rental6.getMovie();
    java.lang.String str10 = movie9.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!"+ "'", str10.equals("hi!"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.getName();
    double d5 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RegularMovie regularMovie7 = new nul.study.videostore.RegularMovie("");
    int i9 = regularMovie7.determineFrequentRenterPoints(0);
    double d11 = regularMovie7.determineAmount((int)(byte)0);
    int i13 = regularMovie7.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie7, (int)(byte)-1);
    int i16 = rental15.getDaysRented();
    rentalStatement1.addRental(rental15);
    int i18 = rental15.determineFrequentRenterPoints();
    int i19 = rental15.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    java.lang.String str5 = rentalStatement1.getName();
    nul.study.videostore.RegularMovie regularMovie7 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str8 = regularMovie7.getTitle();
    int i10 = regularMovie7.determineFrequentRenterPoints((int)(short)100);
    int i12 = regularMovie7.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie7, (int)(byte)0);
    rentalStatement1.addRental(rental14);
    double d16 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement18 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d19 = rentalStatement18.getAmountOwed();
    java.lang.String str20 = rentalStatement18.getName();
    java.lang.String str21 = rentalStatement18.getName();
    double d22 = rentalStatement18.getAmountOwed();
    nul.study.videostore.RegularMovie regularMovie24 = new nul.study.videostore.RegularMovie("");
    int i26 = regularMovie24.determineFrequentRenterPoints(0);
    double d28 = regularMovie24.determineAmount((int)(byte)0);
    int i30 = regularMovie24.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie24, (int)(byte)-1);
    int i33 = rental32.getDaysRented();
    rentalStatement18.addRental(rental32);
    nul.study.videostore.Movie movie35 = rental32.getMovie();
    rentalStatement1.addRental(rental32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str20.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str21.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie35);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount(1);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i10 = newReleaseMovie1.getPriceCode();
    double d12 = newReleaseMovie1.determineAmount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 3.0d);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.getName();
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str7 = rentalStatement6.getName();
    nul.study.videostore.RentalStatement rentalStatement9 = new nul.study.videostore.RentalStatement("");
    java.lang.String str10 = rentalStatement9.makeRentalStatement();
    double d11 = rentalStatement9.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie13 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i14 = newReleaseMovie13.getPriceCode();
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie13, 1);
    int i17 = rental16.getDaysRented();
    int i18 = rental16.getDaysRented();
    rentalStatement9.addRental(rental16);
    rentalStatement6.addRental(rental16);
    rentalStatement1.addRental(rental16);
    int i22 = rental16.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str7.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str10.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = childrensMovie1.getTitle();
    int i4 = childrensMovie1.determineFrequentRenterPoints((int)(short)0);
    int i6 = childrensMovie1.determineFrequentRenterPoints((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    customer1.addRental(rental6);
    java.lang.String str8 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement10 = new nul.study.videostore.RentalStatement("");
    int i11 = rentalStatement10.getFrequentRenterPoints();
    java.lang.String str12 = rentalStatement10.getName();
    int i13 = rentalStatement10.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    rentalStatement15.addRental(rental19);
    double d22 = rental19.determineAmount();
    rentalStatement10.addRental(rental19);
    int i24 = rental19.getDaysRented();
    customer1.addRental(rental19);
    int i26 = rental19.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.statement();
    java.lang.String str6 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)10);
    double d6 = regularMovie1.determineAmount((int)(short)1);
    int i8 = regularMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    double d7 = childrensMovie1.determineAmount((int)(short)1);
    java.lang.String str8 = childrensMovie1.getTitle();
    double d10 = childrensMovie1.determineAmount(52);
    int i12 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i13 = childrensMovie1.getPriceCode();
    double d15 = childrensMovie1.determineAmount((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 147.0d);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\n\t\t0.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    double d7 = regularMovie1.determineAmount((int)(short)100);
    double d9 = regularMovie1.determineAmount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.Rental rental2 = null;
    rentalStatement1.addRental(rental2);
    double d4 = rentalStatement1.getAmountOwed();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str5 = rentalStatement1.makeRentalStatement();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    double d11 = rentalStatement1.getAmountOwed();
    int i12 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str13 = rentalStatement1.makeRentalStatement();
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    double d15 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    newReleaseMovie1.setPriceCode((int)'#');
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t1.5\nYou owed 1.5\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 300.0d);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }


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
    int i16 = rental9.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie17 = rental9.getMovie();
    
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
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.statement();
    nul.study.videostore.RegularMovie regularMovie10 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str11 = regularMovie10.getTitle();
    double d13 = regularMovie10.determineAmount((int)(byte)-1);
    java.lang.String str14 = regularMovie10.getTitle();
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie10, (int)(byte)1);
    customer1.addRental(rental16);
    double d18 = rental16.determineAmount();
    nul.study.videostore.Movie movie19 = rental16.getMovie();
    int i20 = rental16.getDaysRented();
    int i21 = rental16.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str14.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i13 = newReleaseMovie12.getPriceCode();
    double d15 = newReleaseMovie12.determineAmount(100);
    double d17 = newReleaseMovie12.determineAmount((int)(byte)-1);
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, (int)(byte)100);
    double d20 = rental19.determineAmount();
    rentalStatement1.addRental(rental19);
    nul.study.videostore.RentalStatement rentalStatement23 = new nul.study.videostore.RentalStatement("");
    int i24 = rentalStatement23.getFrequentRenterPoints();
    java.lang.String str25 = rentalStatement23.getName();
    int i26 = rentalStatement23.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement28 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie30 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie30, 0);
    int i33 = rental32.determineFrequentRenterPoints();
    rentalStatement28.addRental(rental32);
    double d35 = rental32.determineAmount();
    rentalStatement23.addRental(rental32);
    int i37 = rental32.getDaysRented();
    int i38 = rental32.getDaysRented();
    rentalStatement1.addRental(rental32);
    nul.study.videostore.Movie movie40 = rental32.getMovie();
    int i41 = rental32.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie42 = rental32.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie42);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    double d5 = rentalStatement1.getAmountOwed();
    java.lang.String str6 = rentalStatement1.getName();
    double d7 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement9 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    rentalStatement9.addRental(rental13);
    java.lang.String str16 = rentalStatement9.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement18 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, 0);
    int i23 = rental22.determineFrequentRenterPoints();
    rentalStatement18.addRental(rental22);
    double d25 = rental22.determineAmount();
    double d26 = rental22.determineAmount();
    rentalStatement9.addRental(rental22);
    double d28 = rental22.determineAmount();
    int i29 = rental22.getDaysRented();
    rentalStatement1.addRental(rental22);
    nul.study.videostore.RentalStatement rentalStatement32 = new nul.study.videostore.RentalStatement("");
    int i33 = rentalStatement32.getFrequentRenterPoints();
    java.lang.String str34 = rentalStatement32.getName();
    double d35 = rentalStatement32.getAmountOwed();
    double d36 = rentalStatement32.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement38 = new nul.study.videostore.RentalStatement("");
    int i39 = rentalStatement38.getFrequentRenterPoints();
    java.lang.String str40 = rentalStatement38.getName();
    int i41 = rentalStatement38.getFrequentRenterPoints();
    int i42 = rentalStatement38.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement44 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i45 = rentalStatement44.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie47 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i48 = newReleaseMovie47.getPriceCode();
    nul.study.videostore.Rental rental50 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie47, 1);
    int i51 = rental50.getDaysRented();
    int i52 = rental50.getDaysRented();
    double d53 = rental50.determineAmount();
    int i54 = rental50.getDaysRented();
    rentalStatement44.addRental(rental50);
    nul.study.videostore.NewReleaseMovie newReleaseMovie57 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental59 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie57, 0);
    int i60 = rental59.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie61 = rental59.getMovie();
    rentalStatement44.addRental(rental59);
    double d63 = rental59.determineAmount();
    rentalStatement38.addRental(rental59);
    rentalStatement32.addRental(rental59);
    int i66 = rental59.getDaysRented();
    rentalStatement1.addRental(rental59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + ""+ "'", str40.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d53 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount((int)(short)1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)(short)100);
    double d7 = childrensMovie1.determineAmount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 142.5d);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    int i10 = regularMovie1.getPriceCode();
    double d12 = regularMovie1.determineAmount((int)(byte)10);
    double d14 = regularMovie1.determineAmount((int)(short)10);
    int i16 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    java.lang.String str17 = regularMovie1.getTitle();
    double d19 = regularMovie1.determineAmount((int)(short)0);
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)'#');
    int i22 = regularMovie1.getPriceCode();
    double d24 = regularMovie1.determineAmount((int)(short)100);
    
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
    org.junit.Assert.assertTrue(d12 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 149.0d);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    double d3 = newReleaseMovie1.determineAmount(100);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    newReleaseMovie1.setPriceCode(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }


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
    movie21.setPriceCode(52);
    
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
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    java.lang.String str5 = newReleaseMovie1.getTitle();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    java.lang.String str5 = regularMovie1.getTitle();
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i9 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    int i12 = newReleaseMovie11.getPriceCode();
    int i14 = newReleaseMovie11.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, (-1));
    rentalStatement1.addRental(rental16);
    java.lang.String str18 = rentalStatement1.getName();
    double d19 = rentalStatement1.getAmountOwed();
    double d20 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i10 = newReleaseMovie9.getPriceCode();
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 1);
    int i13 = rental12.getDaysRented();
    customer1.addRental(rental12);
    nul.study.videostore.Customer customer16 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie18 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie18, 0);
    int i21 = rental20.determineFrequentRenterPoints();
    customer16.addRental(rental20);
    int i23 = rental20.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie24 = rental20.getMovie();
    int i25 = rental20.getDaysRented();
    int i26 = rental20.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie27 = rental20.getMovie();
    customer1.addRental(rental20);
    java.lang.String str29 = customer1.getName();
    java.lang.String str30 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement32 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.NewReleaseMovie newReleaseMovie34 = new nul.study.videostore.NewReleaseMovie("");
    int i35 = newReleaseMovie34.getPriceCode();
    int i37 = newReleaseMovie34.determineFrequentRenterPoints((int)(short)-1);
    int i39 = newReleaseMovie34.determineFrequentRenterPoints((int)(short)10);
    nul.study.videostore.Rental rental41 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie34, (int)(short)100);
    int i42 = rental41.determineFrequentRenterPoints();
    rentalStatement32.addRental(rental41);
    customer1.addRental(rental41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str30.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer3 = new nul.study.videostore.Customer("hi!");
    java.lang.String str4 = customer3.getName();
    java.lang.String str5 = customer3.getName();
    nul.study.videostore.RentalStatement rentalStatement7 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    rentalStatement7.addRental(rental11);
    customer3.addRental(rental11);
    java.lang.String str15 = customer3.statement();
    java.lang.String str16 = customer3.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie18 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie18, 0);
    int i21 = rental20.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie22 = rental20.getMovie();
    nul.study.videostore.Movie movie23 = rental20.getMovie();
    double d24 = rental20.determineAmount();
    customer3.addRental(rental20);
    double d26 = rental20.determineAmount();
    nul.study.videostore.Movie movie27 = rental20.getMovie();
    customer1.addRental(rental20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie27);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    int i11 = rental10.determineFrequentRenterPoints();
    rentalStatement6.addRental(rental10);
    java.lang.String str13 = rentalStatement6.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    rentalStatement15.addRental(rental19);
    double d22 = rental19.determineAmount();
    double d23 = rental19.determineAmount();
    rentalStatement6.addRental(rental19);
    double d25 = rental19.determineAmount();
    int i26 = rental19.getDaysRented();
    customer1.addRental(rental19);
    nul.study.videostore.Movie movie28 = rental19.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie28);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i8 = regularMovie1.getPriceCode();
    int i9 = regularMovie1.getPriceCode();
    int i10 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.getName();
    double d5 = rentalStatement1.getAmountOwed();
    double d6 = rentalStatement1.getAmountOwed();
    int i7 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }


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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    java.lang.String str10 = rentalStatement1.getName();
    java.lang.String str11 = rentalStatement1.getName();
    java.lang.String str12 = rentalStatement1.makeRentalStatement();
    double d13 = rentalStatement1.getAmountOwed();
    double d14 = rentalStatement1.getAmountOwed();
    nul.study.videostore.Customer customer16 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie18 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie18, 0);
    int i21 = rental20.determineFrequentRenterPoints();
    customer16.addRental(rental20);
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i25 = newReleaseMovie24.getPriceCode();
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 1);
    int i28 = rental27.getDaysRented();
    customer16.addRental(rental27);
    nul.study.videostore.Customer customer31 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie33 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental35 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie33, 0);
    int i36 = rental35.determineFrequentRenterPoints();
    customer31.addRental(rental35);
    int i38 = rental35.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie39 = rental35.getMovie();
    int i40 = rental35.getDaysRented();
    int i41 = rental35.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie42 = rental35.getMovie();
    customer16.addRental(rental35);
    rentalStatement1.addRental(rental35);
    double d45 = rentalStatement1.getAmountOwed();
    double d46 = rentalStatement1.getAmountOwed();
    java.lang.String str47 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str12.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d45 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + ""+ "'", str47.equals(""));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.statement();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement8 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 0);
    int i13 = rental12.determineFrequentRenterPoints();
    rentalStatement8.addRental(rental12);
    int i15 = rental12.determineFrequentRenterPoints();
    int i16 = rental12.determineFrequentRenterPoints();
    customer6.addRental(rental12);
    customer1.addRental(rental12);
    int i19 = rental12.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 149.0d);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    double d5 = rentalStatement1.getAmountOwed();
    java.lang.String str6 = rentalStatement1.getName();
    int i7 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str8 = rentalStatement1.getName();
    java.lang.String str9 = rentalStatement1.getName();
    double d10 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    java.lang.String str11 = rentalStatement1.makeRentalStatement();
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
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }


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
    java.lang.String str15 = rentalStatement1.makeRentalStatement();
    java.lang.String str16 = rentalStatement1.getName();
    int i17 = rentalStatement1.getFrequentRenterPoints();
    double d18 = rentalStatement1.getAmountOwed();
    int i19 = rentalStatement1.getFrequentRenterPoints();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    double d5 = newReleaseMovie1.determineAmount((int)' ');
    double d7 = newReleaseMovie1.determineAmount((int)' ');
    double d9 = newReleaseMovie1.determineAmount(2);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    double d13 = newReleaseMovie1.determineAmount(2);
    int i15 = newReleaseMovie1.determineFrequentRenterPoints(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 6.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 6.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    newReleaseMovie1.setPriceCode((int)'#');
    int i7 = newReleaseMovie1.getPriceCode();
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    double d5 = newReleaseMovie1.determineAmount((int)(short)-1);
    newReleaseMovie1.setPriceCode((int)(short)100);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)100);
    java.lang.String str10 = newReleaseMovie1.getTitle();
    java.lang.String str11 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i9 = regularMovie1.determineFrequentRenterPoints(10);
    regularMovie1.setPriceCode(0);
    double d13 = regularMovie1.determineAmount(52);
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(short)100);
    int i17 = regularMovie1.determineFrequentRenterPoints((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    double d5 = rentalStatement1.getAmountOwed();
    java.lang.String str6 = rentalStatement1.makeRentalStatement();
    int i7 = rentalStatement1.getFrequentRenterPoints();
    double d8 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)(short)1);
    double d5 = regularMovie1.determineAmount(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 77.0d);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
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
    int i18 = rental13.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental13);
    nul.study.videostore.Customer customer21 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie23 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie23, 0);
    int i26 = rental25.determineFrequentRenterPoints();
    customer21.addRental(rental25);
    int i28 = rental25.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie29 = rental25.getMovie();
    int i30 = rental25.getDaysRented();
    rentalStatement1.addRental(rental25);
    double d32 = rentalStatement1.getAmountOwed();
    int i33 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount((int)(short)10);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)1);
    int i6 = rental5.determineFrequentRenterPoints();
    double d7 = rental5.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    java.lang.String str5 = newReleaseMovie1.getTitle();
    double d7 = newReleaseMovie1.determineAmount((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 3.0d);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount((int)(short)-1);
    int i8 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    java.lang.String str3 = regularMovie1.getTitle();
    double d5 = regularMovie1.determineAmount(2);
    regularMovie1.setPriceCode((int)' ');
    java.lang.String str8 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    double d8 = regularMovie1.determineAmount((int)' ');
    java.lang.String str9 = regularMovie1.getTitle();
    double d11 = regularMovie1.determineAmount(100);
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 0);
    int i14 = rental13.getDaysRented();
    double d15 = rental13.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 47.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 2.0d);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    java.lang.String str4 = childrensMovie1.getTitle();
    double d6 = childrensMovie1.determineAmount((int)(byte)1);
    int i8 = childrensMovie1.determineFrequentRenterPoints((int)(short)10);
    java.lang.String str9 = childrensMovie1.getTitle();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = newReleaseMovie1.getTitle();
    int i3 = newReleaseMovie1.getPriceCode();
    double d5 = newReleaseMovie1.determineAmount((int)(short)1);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    double d9 = newReleaseMovie1.determineAmount((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 300.0d);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    double d3 = newReleaseMovie1.determineAmount(2);
    double d5 = newReleaseMovie1.determineAmount((int)' ');
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    double d9 = newReleaseMovie1.determineAmount(100);
    double d11 = newReleaseMovie1.determineAmount(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 6.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 105.0d);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str4 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }


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
    java.lang.String str13 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie15 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie15, 0);
    rentalStatement1.addRental(rental17);
    double d19 = rentalStatement1.getAmountOwed();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 0.0d);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount((int)'#');
    java.lang.String str8 = newReleaseMovie1.getTitle();
    int i10 = newReleaseMovie1.determineFrequentRenterPoints(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 105.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    double d3 = rentalStatement1.getAmountOwed();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\nYou owed 27.0\nYou earned 4 frequent renter points\n");

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \n\t\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \n\t\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n"+ "'", str2.equals("Rental Record for \n\t\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)10);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints(0);
    int i9 = newReleaseMovie1.getPriceCode();
    double d11 = newReleaseMovie1.determineAmount((int)'#');
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)'4');
    int i14 = rental13.determineFrequentRenterPoints();
    double d15 = rental13.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 105.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 156.0d);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 291.0d);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)10);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    double d8 = regularMovie1.determineAmount((int)'a');
    int i10 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    double d12 = regularMovie1.determineAmount(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 144.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 2.0d);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\n\thi!\t30.0\n\t\t0.0\nYou owed 30.0\nYou earned 4 frequent renter points\n");

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }


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
    double d28 = rentalStatement1.getAmountOwed();
    java.lang.String str29 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer31 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str32 = customer31.getName();
    java.lang.String str33 = customer31.statement();
    nul.study.videostore.RegularMovie regularMovie35 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str36 = regularMovie35.getTitle();
    int i38 = regularMovie35.determineFrequentRenterPoints((int)(short)100);
    int i40 = regularMovie35.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental42 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie35, (int)(byte)0);
    customer31.addRental(rental42);
    nul.study.videostore.Movie movie44 = rental42.getMovie();
    rentalStatement1.addRental(rental42);
    
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
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str29.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str32.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str33.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str36.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie44);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    int i4 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.Customer customer5 = new nul.study.videostore.Customer("hi!");
    java.lang.String str6 = customer5.getName();
    java.lang.String str7 = customer5.getName();
    java.lang.String str8 = customer5.getName();
    java.lang.String str9 = customer5.getName();
    java.lang.String str10 = customer5.statement();
    nul.study.videostore.Customer customer12 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i17 = rental16.determineFrequentRenterPoints();
    customer12.addRental(rental16);
    int i19 = rental16.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie20 = rental16.getMovie();
    int i21 = rental16.getDaysRented();
    int i22 = rental16.determineFrequentRenterPoints();
    int i23 = rental16.getDaysRented();
    customer5.addRental(rental16);
    customer1.addRental(rental16);
    java.lang.String str26 = customer1.getName();
    java.lang.String str27 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str10.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str26.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str27.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    int i12 = newReleaseMovie11.getPriceCode();
    int i14 = newReleaseMovie11.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, (-1));
    rentalStatement1.addRental(rental16);
    nul.study.videostore.Movie movie18 = rental16.getMovie();
    int i19 = rental16.getDaysRented();
    nul.study.videostore.Movie movie20 = rental16.getMovie();
    nul.study.videostore.Movie movie21 = rental16.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }


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
    customer1.addRental(rental17);
    java.lang.String str20 = customer1.getName();
    java.lang.String str21 = customer1.statement();
    java.lang.String str22 = customer1.statement();
    nul.study.videostore.Rental rental23 = null;
    customer1.addRental(rental23);
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
    nul.study.videostore.NewReleaseMovie newReleaseMovie40 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental42 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie40, 0);
    int i43 = rental42.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie44 = rental42.getMovie();
    rentalStatement26.addRental(rental42);
    customer1.addRental(rental42);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str47 = customer1.statement();
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
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!"+ "'", str20.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str21.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str22.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie44);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    java.lang.String str5 = regularMovie1.getTitle();
    double d7 = regularMovie1.determineAmount(10);
    regularMovie1.setPriceCode(2);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    regularMovie1.setPriceCode((int)(byte)1);
    java.lang.String str14 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 0);
    int i18 = regularMovie1.determineFrequentRenterPoints(0);
    int i19 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str14.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    double d3 = newReleaseMovie1.determineAmount(100);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    double d7 = newReleaseMovie1.determineAmount(0);
    double d9 = newReleaseMovie1.determineAmount((int)(short)1);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints(35);
    int i13 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    nul.study.videostore.Customer customer3 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str4 = customer3.getName();
    java.lang.String str5 = customer3.getName();
    nul.study.videostore.RentalStatement rentalStatement7 = new nul.study.videostore.RentalStatement("");
    int i8 = rentalStatement7.getFrequentRenterPoints();
    java.lang.String str9 = rentalStatement7.getName();
    int i10 = rentalStatement7.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental14.getMovie();
    nul.study.videostore.Movie movie17 = rental14.getMovie();
    rentalStatement7.addRental(rental14);
    int i19 = rentalStatement7.getFrequentRenterPoints();
    nul.study.videostore.Customer customer21 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str22 = customer21.statement();
    java.lang.String str23 = customer21.getName();
    java.lang.String str24 = customer21.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie26 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i27 = newReleaseMovie26.getPriceCode();
    double d29 = newReleaseMovie26.determineAmount(100);
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, (int)(byte)10);
    int i32 = rental31.getDaysRented();
    double d33 = rental31.determineAmount();
    customer21.addRental(rental31);
    double d35 = rental31.determineAmount();
    rentalStatement7.addRental(rental31);
    customer3.addRental(rental31);
    rentalStatement1.addRental(rental31);
    double d39 = rental31.determineAmount();
    double d40 = rental31.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str22.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str23.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str24.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d39 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d40 == 30.0d);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i18 = newReleaseMovie17.getPriceCode();
    double d20 = newReleaseMovie17.determineAmount(100);
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, (int)(byte)10);
    int i23 = rental22.getDaysRented();
    double d24 = rental22.determineAmount();
    int i25 = rental22.getDaysRented();
    customer1.addRental(rental22);
    int i27 = rental22.getDaysRented();
    int i28 = rental22.determineFrequentRenterPoints();
    int i29 = rental22.determineFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 2);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.RegularMovie regularMovie5 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str6 = regularMovie5.getTitle();
    int i8 = regularMovie5.determineFrequentRenterPoints((int)(short)100);
    int i10 = regularMovie5.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie5, (int)(byte)0);
    customer1.addRental(rental12);
    int i14 = rental12.getDaysRented();
    int i15 = rental12.determineFrequentRenterPoints();
    int i16 = rental12.getDaysRented();
    double d17 = rental12.determineAmount();
    nul.study.videostore.Movie movie18 = rental12.getMovie();
    int i19 = rental12.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie21 = rental19.getMovie();
    rentalStatement3.addRental(rental19);
    customer1.addRental(rental19);
    java.lang.String str24 = customer1.getName();
    java.lang.String str25 = customer1.getName();
    nul.study.videostore.Customer customer27 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement29 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d30 = rentalStatement29.getAmountOwed();
    java.lang.String str31 = rentalStatement29.getName();
    nul.study.videostore.Customer customer33 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie35 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental37 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie35, 0);
    int i38 = rental37.determineFrequentRenterPoints();
    customer33.addRental(rental37);
    int i40 = rental37.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie41 = rental37.getMovie();
    int i42 = rental37.getDaysRented();
    rentalStatement29.addRental(rental37);
    customer27.addRental(rental37);
    customer1.addRental(rental37);
    java.lang.String str46 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + ""+ "'", str24.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + ""+ "'", str25.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str31.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + ""+ "'", str46.equals(""));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)10);
    double d7 = rental6.determineAmount();
    nul.study.videostore.Movie movie8 = rental6.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie8);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    newReleaseMovie1.setPriceCode((int)'#');
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)'#');
    double d10 = newReleaseMovie1.determineAmount(35);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    int i14 = newReleaseMovie1.determineFrequentRenterPoints(0);
    double d16 = newReleaseMovie1.determineAmount(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 105.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 291.0d);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str4 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    double d11 = regularMovie1.determineAmount((int)(byte)1);
    int i12 = regularMovie1.getPriceCode();
    int i14 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i16 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    int i17 = regularMovie1.getPriceCode();
    int i18 = regularMovie1.getPriceCode();
    java.lang.String str19 = regularMovie1.getTitle();
    int i21 = regularMovie1.determineFrequentRenterPoints((int)(short)0);
    java.lang.String str22 = regularMovie1.getTitle();
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i8 = regularMovie1.getPriceCode();
    double d10 = regularMovie1.determineAmount(3);
    int i12 = regularMovie1.determineFrequentRenterPoints(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 3.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(short)1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    double d7 = childrensMovie1.determineAmount((int)(byte)-1);
    double d9 = childrensMovie1.determineAmount(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 75.0d);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)10);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    double d10 = newReleaseMovie1.determineAmount((int)(short)1);
    double d12 = newReleaseMovie1.determineAmount((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 3.0d);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    java.lang.String str4 = childrensMovie1.getTitle();
    java.lang.String str5 = childrensMovie1.getTitle();
    int i7 = childrensMovie1.determineFrequentRenterPoints(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    int i7 = regularMovie1.determineFrequentRenterPoints(2);
    int i9 = regularMovie1.determineFrequentRenterPoints(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    double d6 = newReleaseMovie3.determineAmount(100);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, (int)(byte)10);
    int i9 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    int i12 = movie11.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    double d3 = newReleaseMovie1.determineAmount(100);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i6 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)-1);
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 52);
    double d11 = rental10.determineAmount();
    int i12 = rental10.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 156.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 52);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(short)10);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    int i10 = rental8.getDaysRented();
    double d11 = rental8.determineAmount();
    int i12 = rental8.getDaysRented();
    customer1.addRental(rental8);
    java.lang.String str14 = customer1.statement();
    java.lang.String str15 = customer1.getName();
    java.lang.String str16 = customer1.statement();
    java.lang.String str17 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str15.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str17.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str6 = rentalStatement1.makeRentalStatement();
    int i7 = rentalStatement1.getFrequentRenterPoints();
    double d8 = rentalStatement1.getAmountOwed();
    
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
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    int i10 = rental8.getDaysRented();
    double d11 = rental8.determineAmount();
    int i12 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("");
    int i16 = rentalStatement15.getFrequentRenterPoints();
    nul.study.videostore.Customer customer18 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, 0);
    int i23 = rental22.determineFrequentRenterPoints();
    customer18.addRental(rental22);
    int i25 = rental22.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie26 = rental22.getMovie();
    rentalStatement15.addRental(rental22);
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, 0);
    int i32 = rental31.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie33 = rental31.getMovie();
    rentalStatement15.addRental(rental31);
    customer1.addRental(rental31);
    java.lang.String str36 = customer1.getName();
    nul.study.videostore.Customer customer38 = new nul.study.videostore.Customer("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement40 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie42 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental44 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie42, 0);
    int i45 = rental44.determineFrequentRenterPoints();
    rentalStatement40.addRental(rental44);
    java.lang.String str47 = rentalStatement40.makeRentalStatement();
    java.lang.String str48 = rentalStatement40.makeRentalStatement();
    double d49 = rentalStatement40.getAmountOwed();
    nul.study.videostore.Customer customer51 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie53 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental55 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie53, 0);
    int i56 = rental55.determineFrequentRenterPoints();
    customer51.addRental(rental55);
    int i58 = rental55.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie59 = rental55.getMovie();
    int i60 = rental55.determineFrequentRenterPoints();
    rentalStatement40.addRental(rental55);
    customer38.addRental(rental55);
    double d63 = rental55.determineAmount();
    customer1.addRental(rental55);
    nul.study.videostore.Movie movie65 = rental55.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str36.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str47.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str48.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d49 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie65);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(10);
    double d5 = childrensMovie1.determineAmount((int)(short)1);
    childrensMovie1.setPriceCode(0);
    childrensMovie1.setPriceCode(1);
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i13 = childrensMovie1.determineFrequentRenterPoints(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = newReleaseMovie1.getTitle();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    double d8 = newReleaseMovie1.determineAmount((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 105.0d);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    int i8 = newReleaseMovie7.getPriceCode();
    int i10 = newReleaseMovie7.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, (-1));
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, (int)(short)0);
    nul.study.videostore.Movie movie15 = rental14.getMovie();
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental(movie15, (int)(short)0);
    rentalStatement1.addRental(rental17);
    nul.study.videostore.Customer customer20 = new nul.study.videostore.Customer("hi!");
    java.lang.String str21 = customer20.getName();
    java.lang.String str22 = customer20.getName();
    nul.study.videostore.RentalStatement rentalStatement24 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie26 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental28 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, 0);
    int i29 = rental28.determineFrequentRenterPoints();
    rentalStatement24.addRental(rental28);
    customer20.addRental(rental28);
    java.lang.String str32 = customer20.statement();
    java.lang.String str33 = customer20.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie35 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental37 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie35, 0);
    int i38 = rental37.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie39 = rental37.getMovie();
    nul.study.videostore.Movie movie40 = rental37.getMovie();
    double d41 = rental37.determineAmount();
    customer20.addRental(rental37);
    double d43 = rental37.determineAmount();
    int i44 = rental37.determineFrequentRenterPoints();
    int i45 = rental37.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental37);
    java.lang.String str47 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str32.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str33.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d41 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d43 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str47.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    int i9 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(short)10);
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(1);
    double d5 = regularMovie1.determineAmount((int)(byte)100);
    int i7 = regularMovie1.determineFrequentRenterPoints(0);
    int i9 = regularMovie1.determineFrequentRenterPoints(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    int i4 = newReleaseMovie3.getPriceCode();
    int i6 = newReleaseMovie3.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, (-1));
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, (int)(short)0);
    customer1.addRental(rental10);
    java.lang.String str12 = customer1.statement();
    java.lang.String str13 = customer1.getName();
    nul.study.videostore.Customer customer15 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str16 = customer15.statement();
    java.lang.String str17 = customer15.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 0);
    int i22 = rental21.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie23 = rental21.getMovie();
    customer15.addRental(rental21);
    nul.study.videostore.NewReleaseMovie newReleaseMovie26 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i27 = newReleaseMovie26.getPriceCode();
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, 1);
    int i30 = newReleaseMovie26.getPriceCode();
    newReleaseMovie26.setPriceCode((int)(short)100);
    nul.study.videostore.Rental rental34 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, (int)(short)0);
    double d35 = rental34.determineAmount();
    customer15.addRental(rental34);
    nul.study.videostore.Customer customer38 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str39 = customer38.getName();
    java.lang.String str40 = customer38.statement();
    nul.study.videostore.RegularMovie regularMovie42 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str43 = regularMovie42.getTitle();
    int i45 = regularMovie42.determineFrequentRenterPoints((int)(short)100);
    int i47 = regularMovie42.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental49 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie42, (int)(byte)0);
    customer38.addRental(rental49);
    int i51 = rental49.getDaysRented();
    int i52 = rental49.determineFrequentRenterPoints();
    customer15.addRental(rental49);
    customer1.addRental(rental49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str12.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str16.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str17.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str39.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str40.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str43.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie4 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i5 = newReleaseMovie4.getPriceCode();
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie4, 1);
    int i8 = rental7.getDaysRented();
    int i9 = rental7.getDaysRented();
    double d10 = rental7.determineAmount();
    int i11 = rental7.getDaysRented();
    rentalStatement1.addRental(rental7);
    nul.study.videostore.Customer customer14 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 0);
    int i19 = rental18.determineFrequentRenterPoints();
    customer14.addRental(rental18);
    nul.study.videostore.NewReleaseMovie newReleaseMovie22 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i23 = newReleaseMovie22.getPriceCode();
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, 1);
    int i26 = rental25.getDaysRented();
    customer14.addRental(rental25);
    nul.study.videostore.Customer customer29 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie31 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental33 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie31, 0);
    int i34 = rental33.determineFrequentRenterPoints();
    customer29.addRental(rental33);
    int i36 = rental33.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie37 = rental33.getMovie();
    int i38 = rental33.getDaysRented();
    int i39 = rental33.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie40 = rental33.getMovie();
    customer14.addRental(rental33);
    rentalStatement1.addRental(rental33);
    int i43 = rental33.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    java.lang.String str10 = rentalStatement1.getName();
    java.lang.String str11 = rentalStatement1.getName();
    double d12 = rentalStatement1.getAmountOwed();
    double d13 = rentalStatement1.getAmountOwed();
    java.lang.String str14 = rentalStatement1.makeRentalStatement();
    int i15 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie4 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i5 = newReleaseMovie4.getPriceCode();
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie4, 1);
    int i8 = rental7.getDaysRented();
    int i9 = rental7.getDaysRented();
    double d10 = rental7.determineAmount();
    int i11 = rental7.getDaysRented();
    rentalStatement1.addRental(rental7);
    int i13 = rental7.getDaysRented();
    nul.study.videostore.Movie movie14 = rental7.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i7 = newReleaseMovie6.getPriceCode();
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    customer4.addRental(rental9);
    double d11 = rental9.determineAmount();
    customer1.addRental(rental9);
    double d13 = rental9.determineAmount();
    double d14 = rental9.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    double d5 = rentalStatement1.getAmountOwed();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }


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
    nul.study.videostore.Movie movie15 = rental10.getMovie();
    int i16 = movie15.getPriceCode();
    
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
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    double d3 = newReleaseMovie1.determineAmount(100);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints(52);
    newReleaseMovie1.setPriceCode((int)'4');
    java.lang.String str8 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }


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
    nul.study.videostore.Customer customer22 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement24 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie26 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental28 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, 0);
    int i29 = rental28.determineFrequentRenterPoints();
    rentalStatement24.addRental(rental28);
    int i31 = rental28.determineFrequentRenterPoints();
    int i32 = rental28.determineFrequentRenterPoints();
    customer22.addRental(rental28);
    int i34 = rental28.getDaysRented();
    rentalStatement1.addRental(rental28);
    
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
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    double d3 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.RegularMovie regularMovie5 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str6 = regularMovie5.getTitle();
    int i8 = regularMovie5.determineFrequentRenterPoints((int)(short)100);
    int i10 = regularMovie5.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie5, (int)(byte)0);
    customer1.addRental(rental12);
    int i14 = rental12.getDaysRented();
    int i15 = rental12.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount((int)(byte)0);
    int i7 = regularMovie1.determineFrequentRenterPoints((-1));
    double d9 = regularMovie1.determineAmount((int)'4');
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 77.0d);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }


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
    double d24 = rental20.determineAmount();
    int i25 = rental20.getDaysRented();
    customer1.addRental(rental20);
    int i27 = rental20.determineFrequentRenterPoints();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    int i7 = childrensMovie1.determineFrequentRenterPoints((int)(short)0);
    double d9 = childrensMovie1.determineAmount((int)'#');
    double d11 = childrensMovie1.determineAmount((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 49.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.5d);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    int i9 = rental8.determineFrequentRenterPoints();
    customer4.addRental(rental8);
    java.lang.String str11 = customer4.statement();
    nul.study.videostore.RegularMovie regularMovie13 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str14 = regularMovie13.getTitle();
    double d16 = regularMovie13.determineAmount((int)(byte)-1);
    java.lang.String str17 = regularMovie13.getTitle();
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie13, (int)(byte)1);
    customer4.addRental(rental19);
    double d21 = rental19.determineAmount();
    double d22 = rental19.determineAmount();
    rentalStatement1.addRental(rental19);
    java.lang.String str24 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie26 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i27 = newReleaseMovie26.getPriceCode();
    double d29 = newReleaseMovie26.determineAmount(100);
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, (int)(byte)10);
    int i32 = rental31.getDaysRented();
    double d33 = rental31.determineAmount();
    int i34 = rental31.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str14.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str17.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str24.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 2);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i18 = newReleaseMovie17.getPriceCode();
    double d20 = newReleaseMovie17.determineAmount(100);
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, (int)(byte)10);
    int i23 = rental22.getDaysRented();
    double d24 = rental22.determineAmount();
    int i25 = rental22.getDaysRented();
    customer1.addRental(rental22);
    java.lang.String str27 = customer1.getName();
    
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
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount(0);
    int i8 = newReleaseMovie1.getPriceCode();
    int i9 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\n\t\t0.0\nYou owed 2.0\nYou earned 2 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\thi!\t-3.0\nYou owed -3.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = regularMovie1.determineAmount(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 3.5d);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }


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
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    double d3 = rentalStatement1.getAmountOwed();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str5 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str5.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    int i7 = regularMovie1.determineFrequentRenterPoints(0);
    double d9 = regularMovie1.determineAmount((int)(short)0);
    double d11 = regularMovie1.determineAmount((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\thi!\t-3.0\nYou owed -3.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    double d7 = childrensMovie1.determineAmount((int)(short)10);
    double d9 = childrensMovie1.determineAmount((int)(short)1);
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i12 = childrensMovie1.getPriceCode();
    childrensMovie1.setPriceCode((int)'#');
    int i16 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)'a');
    childrensMovie1.setPriceCode((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d4 = rentalStatement3.getAmountOwed();
    java.lang.String str5 = rentalStatement3.getName();
    java.lang.String str6 = rentalStatement3.getName();
    double d7 = rentalStatement3.getAmountOwed();
    nul.study.videostore.RegularMovie regularMovie9 = new nul.study.videostore.RegularMovie("");
    int i11 = regularMovie9.determineFrequentRenterPoints(0);
    double d13 = regularMovie9.determineAmount((int)(byte)0);
    int i15 = regularMovie9.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie9, (int)(byte)-1);
    int i18 = rental17.getDaysRented();
    rentalStatement3.addRental(rental17);
    int i20 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.Customer customer22 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 0);
    int i27 = rental26.determineFrequentRenterPoints();
    customer22.addRental(rental26);
    nul.study.videostore.NewReleaseMovie newReleaseMovie30 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i31 = newReleaseMovie30.getPriceCode();
    nul.study.videostore.Rental rental33 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie30, 1);
    int i34 = rental33.getDaysRented();
    customer22.addRental(rental33);
    nul.study.videostore.Customer customer37 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie39 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental41 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie39, 0);
    int i42 = rental41.determineFrequentRenterPoints();
    customer37.addRental(rental41);
    int i44 = rental41.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie45 = rental41.getMovie();
    int i46 = rental41.getDaysRented();
    int i47 = rental41.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie48 = rental41.getMovie();
    customer22.addRental(rental41);
    nul.study.videostore.ChildrensMovie childrensMovie51 = new nul.study.videostore.ChildrensMovie("");
    int i53 = childrensMovie51.determineFrequentRenterPoints(1);
    int i55 = childrensMovie51.determineFrequentRenterPoints(2);
    childrensMovie51.setPriceCode((-1));
    nul.study.videostore.Rental rental59 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie51, (int)(short)0);
    customer22.addRental(rental59);
    rentalStatement3.addRental(rental59);
    rentalStatement1.addRental(rental59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str5.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str6.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    double d5 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement7 = new nul.study.videostore.RentalStatement("");
    int i8 = rentalStatement7.getFrequentRenterPoints();
    java.lang.String str9 = rentalStatement7.getName();
    int i10 = rentalStatement7.getFrequentRenterPoints();
    int i11 = rentalStatement7.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement13 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i14 = rentalStatement13.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i17 = newReleaseMovie16.getPriceCode();
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 1);
    int i20 = rental19.getDaysRented();
    int i21 = rental19.getDaysRented();
    double d22 = rental19.determineAmount();
    int i23 = rental19.getDaysRented();
    rentalStatement13.addRental(rental19);
    nul.study.videostore.NewReleaseMovie newReleaseMovie26 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental28 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, 0);
    int i29 = rental28.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie30 = rental28.getMovie();
    rentalStatement13.addRental(rental28);
    double d32 = rental28.determineAmount();
    rentalStatement7.addRental(rental28);
    rentalStatement1.addRental(rental28);
    int i35 = rental28.getDaysRented();
    nul.study.videostore.Movie movie36 = rental28.getMovie();
    movie36.setPriceCode((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie36);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie1.determineFrequentRenterPoints(100);
    double d9 = childrensMovie1.determineAmount(3);
    
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
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount((int)'#');
    int i8 = newReleaseMovie1.getPriceCode();
    double d10 = newReleaseMovie1.determineAmount(100);
    double d12 = newReleaseMovie1.determineAmount((int)'#');
    double d14 = newReleaseMovie1.determineAmount((int)(short)10);
    double d16 = newReleaseMovie1.determineAmount(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 105.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 105.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 105.0d);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 4 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(2);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount((int)'a');
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)0);
    int i10 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    java.lang.String str13 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    double d8 = newReleaseMovie1.determineAmount(100);
    newReleaseMovie1.setPriceCode((int)(short)10);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints(0);
    double d14 = newReleaseMovie1.determineAmount(0);
    double d16 = newReleaseMovie1.determineAmount(0);
    java.lang.String str17 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)10);
    double d6 = regularMovie1.determineAmount((int)(short)1);
    int i8 = regularMovie1.determineFrequentRenterPoints((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    double d3 = regularMovie1.determineAmount((int)(byte)0);
    double d5 = regularMovie1.determineAmount((int)(byte)1);
    double d7 = regularMovie1.determineAmount((int)(byte)1);
    double d9 = regularMovie1.determineAmount((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 149.0d);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
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
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
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
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }


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
    nul.study.videostore.Movie movie15 = rental8.getMovie();
    
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
    org.junit.Assert.assertNotNull(movie15);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    double d5 = childrensMovie1.determineAmount((int)'4');
    double d7 = childrensMovie1.determineAmount(100);
    double d9 = childrensMovie1.determineAmount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 75.0d);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    newReleaseMovie1.setPriceCode((int)'#');
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)'#');
    int i10 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount((int)(byte)0);
    regularMovie1.setPriceCode((int)' ');
    double d9 = regularMovie1.determineAmount((int)(byte)0);
    int i11 = regularMovie1.determineFrequentRenterPoints(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    java.lang.String str3 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    int i10 = rental8.getDaysRented();
    double d11 = rental8.determineAmount();
    int i12 = rental8.getDaysRented();
    customer1.addRental(rental8);
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d16 = rentalStatement15.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie18 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i19 = newReleaseMovie18.getPriceCode();
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie18, 0);
    int i23 = newReleaseMovie18.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie18, (int)(byte)-1);
    nul.study.videostore.Movie movie26 = rental25.getMovie();
    rentalStatement15.addRental(rental25);
    customer1.addRental(rental25);
    java.lang.String str29 = customer1.getName();
    java.lang.String str30 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str29.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\thi!\t-3.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str30.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\thi!\t-3.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    int i10 = regularMovie1.getPriceCode();
    double d12 = regularMovie1.determineAmount((int)(byte)10);
    double d14 = regularMovie1.determineAmount((int)(short)10);
    int i16 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    java.lang.String str17 = regularMovie1.getTitle();
    double d19 = regularMovie1.determineAmount((int)(short)0);
    java.lang.String str20 = regularMovie1.getTitle();
    regularMovie1.setPriceCode(0);
    
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
    org.junit.Assert.assertTrue(d12 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = rental4.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie6 = rental4.getMovie();
    double d7 = rental4.determineAmount();
    nul.study.videostore.Movie movie8 = rental4.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie8);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    double d3 = regularMovie1.determineAmount((int)(byte)0);
    double d5 = regularMovie1.determineAmount((-1));
    java.lang.String str6 = regularMovie1.getTitle();
    double d8 = regularMovie1.determineAmount((-1));
    double d10 = regularMovie1.determineAmount(35);
    double d12 = regularMovie1.determineAmount((int)' ');
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 52);
    int i15 = regularMovie1.getPriceCode();
    int i17 = regularMovie1.determineFrequentRenterPoints((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 51.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 47.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    int i12 = newReleaseMovie11.getPriceCode();
    int i14 = newReleaseMovie11.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, (-1));
    rentalStatement1.addRental(rental16);
    java.lang.String str18 = rentalStatement1.getName();
    java.lang.String str19 = rentalStatement1.getName();
    double d20 = rentalStatement1.getAmountOwed();
    java.lang.String str21 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n"+ "'", str2.equals("Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    double d5 = childrensMovie1.determineAmount((int)'4');
    int i7 = childrensMovie1.determineFrequentRenterPoints((int)(byte)1);
    int i9 = childrensMovie1.determineFrequentRenterPoints(100);
    double d11 = childrensMovie1.determineAmount(100);
    int i13 = childrensMovie1.determineFrequentRenterPoints(0);
    int i14 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    rentalStatement3.addRental(rental7);
    int i10 = rental7.determineFrequentRenterPoints();
    int i11 = rental7.determineFrequentRenterPoints();
    customer1.addRental(rental7);
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i15 = newReleaseMovie14.getPriceCode();
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i18 = newReleaseMovie14.getPriceCode();
    int i20 = newReleaseMovie14.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, (int)(short)10);
    customer1.addRental(rental22);
    java.lang.String str24 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie26 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i27 = newReleaseMovie26.getPriceCode();
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, 0);
    int i31 = newReleaseMovie26.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental33 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, (int)(byte)-1);
    int i34 = rental33.getDaysRented();
    int i35 = rental33.determineFrequentRenterPoints();
    customer1.addRental(rental33);
    java.lang.String str37 = customer1.statement();
    nul.study.videostore.ChildrensMovie childrensMovie39 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i41 = childrensMovie39.determineFrequentRenterPoints((-1));
    int i43 = childrensMovie39.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental45 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie39, 0);
    customer1.addRental(rental45);
    nul.study.videostore.RentalStatement rentalStatement48 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i49 = rentalStatement48.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement51 = new nul.study.videostore.RentalStatement("");
    int i52 = rentalStatement51.getFrequentRenterPoints();
    java.lang.String str53 = rentalStatement51.getName();
    int i54 = rentalStatement51.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement56 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie58 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental60 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie58, 0);
    int i61 = rental60.determineFrequentRenterPoints();
    rentalStatement56.addRental(rental60);
    double d63 = rental60.determineAmount();
    rentalStatement51.addRental(rental60);
    int i65 = rental60.determineFrequentRenterPoints();
    rentalStatement48.addRental(rental60);
    customer1.addRental(rental60);
    java.lang.String str68 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!"+ "'", str24.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\nYou owed 27.0\nYou earned 4 frequent renter points\n"+ "'", str37.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\nYou owed 27.0\nYou earned 4 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + ""+ "'", str53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d63 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t1.5\n\t\t0.0\nYou owed 28.5\nYou earned 6 frequent renter points\n"+ "'", str68.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t1.5\n\t\t0.0\nYou owed 28.5\nYou earned 6 frequent renter points\n"));

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)10);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    double d8 = regularMovie1.determineAmount((int)'a');
    int i9 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 144.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints(1);
    double d8 = newReleaseMovie1.determineAmount((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == (-3.0d));

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }


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
    java.lang.String str15 = rentalStatement1.makeRentalStatement();
    java.lang.String str16 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie18 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie18, 0);
    rentalStatement1.addRental(rental20);
    double d22 = rentalStatement1.getAmountOwed();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    double d11 = regularMovie1.determineAmount((int)(byte)1);
    int i12 = regularMovie1.getPriceCode();
    int i14 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i16 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    int i17 = regularMovie1.getPriceCode();
    int i18 = regularMovie1.getPriceCode();
    java.lang.String str19 = regularMovie1.getTitle();
    int i21 = regularMovie1.determineFrequentRenterPoints((int)(short)0);
    int i22 = regularMovie1.getPriceCode();
    double d24 = regularMovie1.determineAmount((int)(byte)1);
    
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
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 2.0d);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount((int)(byte)0);
    int i7 = regularMovie1.determineFrequentRenterPoints((-1));
    int i8 = regularMovie1.getPriceCode();
    double d10 = regularMovie1.determineAmount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 149.0d);

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    double d3 = regularMovie1.determineAmount((int)(byte)0);
    double d5 = regularMovie1.determineAmount((-1));
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 2);
    java.lang.String str8 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    int i6 = regularMovie1.determineFrequentRenterPoints(0);
    double d8 = regularMovie1.determineAmount((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 14.0d);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i5 = newReleaseMovie1.getPriceCode();
    newReleaseMovie1.setPriceCode((int)(short)100);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    double d11 = newReleaseMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    rentalStatement3.addRental(rental7);
    int i10 = rental7.determineFrequentRenterPoints();
    int i11 = rental7.determineFrequentRenterPoints();
    customer1.addRental(rental7);
    nul.study.videostore.NewReleaseMovie newReleaseMovie14 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i15 = newReleaseMovie14.getPriceCode();
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, 0);
    int i18 = newReleaseMovie14.getPriceCode();
    int i20 = newReleaseMovie14.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie14, (int)(short)10);
    customer1.addRental(rental22);
    java.lang.String str24 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n"+ "'", str24.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }


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
    nul.study.videostore.Movie movie22 = rental17.getMovie();
    
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
    org.junit.Assert.assertNotNull(movie22);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    int i4 = newReleaseMovie3.getPriceCode();
    int i6 = newReleaseMovie3.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, (-1));
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, (int)(short)0);
    customer1.addRental(rental10);
    java.lang.String str12 = customer1.statement();
    java.lang.String str13 = customer1.statement();
    java.lang.String str14 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str12.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    int i8 = rental5.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental5.getMovie();
    int i10 = movie9.getPriceCode();
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental(movie9, (int)(byte)1);
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental(movie9, (int)(byte)1);
    int i15 = rental14.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t51.5\nYou owed 51.5\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t51.5\nYou owed 51.5\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t51.5\nYou owed 51.5\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 0);
    int i19 = rental18.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie20 = rental18.getMovie();
    nul.study.videostore.Movie movie21 = rental18.getMovie();
    double d22 = rental18.determineAmount();
    customer1.addRental(rental18);
    double d24 = rental18.determineAmount();
    nul.study.videostore.Movie movie25 = rental18.getMovie();
    int i26 = rental18.getDaysRented();
    
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
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount((int)' ');
    double d5 = childrensMovie1.determineAmount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 45.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.5d);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    double d9 = regularMovie1.determineAmount((int)(byte)1);
    java.lang.String str10 = regularMovie1.getTitle();
    java.lang.String str11 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental7.getMovie();
    customer1.addRental(rental7);
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i13 = newReleaseMovie12.getPriceCode();
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 1);
    int i16 = newReleaseMovie12.getPriceCode();
    newReleaseMovie12.setPriceCode((int)(short)100);
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, (int)(short)0);
    double d21 = rental20.determineAmount();
    customer1.addRental(rental20);
    java.lang.String str23 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str23.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'a');
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 1);
    double d10 = regularMovie1.determineAmount(1);
    int i12 = regularMovie1.determineFrequentRenterPoints((int)' ');
    int i13 = regularMovie1.getPriceCode();
    int i15 = regularMovie1.determineFrequentRenterPoints(35);
    double d17 = regularMovie1.determineAmount(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 3.5d);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }


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
    nul.study.videostore.RentalStatement rentalStatement38 = new nul.study.videostore.RentalStatement("");
    java.lang.String str39 = rentalStatement38.makeRentalStatement();
    double d40 = rentalStatement38.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie42 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i43 = newReleaseMovie42.getPriceCode();
    nul.study.videostore.Rental rental45 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie42, 1);
    int i46 = rental45.getDaysRented();
    int i47 = rental45.getDaysRented();
    rentalStatement38.addRental(rental45);
    rentalStatement1.addRental(rental45);
    int i50 = rentalStatement1.getFrequentRenterPoints();
    int i51 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str39.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.statement();
    java.lang.String str5 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i18 = newReleaseMovie17.getPriceCode();
    double d20 = newReleaseMovie17.determineAmount(100);
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, (int)(byte)10);
    int i23 = rental22.getDaysRented();
    double d24 = rental22.determineAmount();
    int i25 = rental22.getDaysRented();
    customer1.addRental(rental22);
    nul.study.videostore.Movie movie27 = rental22.getMovie();
    
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
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie27);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    double d6 = newReleaseMovie1.determineAmount(1);
    double d8 = newReleaseMovie1.determineAmount(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 30.0d);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i9 = regularMovie1.determineFrequentRenterPoints(10);
    regularMovie1.setPriceCode(0);
    double d13 = regularMovie1.determineAmount(52);
    int i14 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }


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
    java.lang.String str15 = rentalStatement1.makeRentalStatement();
    double d16 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement18 = new nul.study.videostore.RentalStatement("");
    int i19 = rentalStatement18.getFrequentRenterPoints();
    nul.study.videostore.Customer customer21 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie23 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie23, 0);
    int i26 = rental25.determineFrequentRenterPoints();
    customer21.addRental(rental25);
    int i28 = rental25.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie29 = rental25.getMovie();
    rentalStatement18.addRental(rental25);
    rentalStatement1.addRental(rental25);
    double d32 = rentalStatement1.getAmountOwed();
    java.lang.String str33 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer35 = new nul.study.videostore.Customer("hi!");
    java.lang.String str36 = customer35.getName();
    java.lang.String str37 = customer35.getName();
    nul.study.videostore.RentalStatement rentalStatement39 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie41 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental43 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie41, 0);
    int i44 = rental43.determineFrequentRenterPoints();
    rentalStatement39.addRental(rental43);
    customer35.addRental(rental43);
    java.lang.String str47 = customer35.statement();
    java.lang.String str48 = customer35.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie50 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental52 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie50, 0);
    int i53 = rental52.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie54 = rental52.getMovie();
    nul.study.videostore.Movie movie55 = rental52.getMovie();
    double d56 = rental52.determineAmount();
    customer35.addRental(rental52);
    nul.study.videostore.Movie movie58 = rental52.getMovie();
    double d59 = rental52.determineAmount();
    nul.study.videostore.Movie movie60 = rental52.getMovie();
    nul.study.videostore.Rental rental62 = new nul.study.videostore.Rental(movie60, (int)'4');
    rentalStatement1.addRental(rental62);
    nul.study.videostore.RentalStatement rentalStatement65 = new nul.study.videostore.RentalStatement("");
    int i66 = rentalStatement65.getFrequentRenterPoints();
    nul.study.videostore.Customer customer68 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie70 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental72 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie70, 0);
    int i73 = rental72.determineFrequentRenterPoints();
    customer68.addRental(rental72);
    int i75 = rental72.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie76 = rental72.getMovie();
    rentalStatement65.addRental(rental72);
    nul.study.videostore.NewReleaseMovie newReleaseMovie79 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental81 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie79, 0);
    int i82 = rental81.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie83 = rental81.getMovie();
    rentalStatement65.addRental(rental81);
    int i85 = rental81.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie86 = rental81.getMovie();
    int i87 = rental81.getDaysRented();
    double d88 = rental81.determineAmount();
    rentalStatement1.addRental(rental81);
    int i90 = rental81.determineFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str33.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str47.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str48.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d56 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d59 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie83);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i85 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d88 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints(10);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 100);
    double d10 = newReleaseMovie1.determineAmount((int)'#');
    java.lang.String str11 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 105.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    double d5 = rentalStatement1.getAmountOwed();
    java.lang.String str6 = rentalStatement1.makeRentalStatement();
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
    int i20 = rentalStatement8.getFrequentRenterPoints();
    double d21 = rentalStatement8.getAmountOwed();
    java.lang.String str22 = rentalStatement8.makeRentalStatement();
    double d23 = rentalStatement8.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement25 = new nul.study.videostore.RentalStatement("");
    int i26 = rentalStatement25.getFrequentRenterPoints();
    nul.study.videostore.Customer customer28 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie30 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie30, 0);
    int i33 = rental32.determineFrequentRenterPoints();
    customer28.addRental(rental32);
    int i35 = rental32.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie36 = rental32.getMovie();
    rentalStatement25.addRental(rental32);
    rentalStatement8.addRental(rental32);
    double d39 = rentalStatement8.getAmountOwed();
    java.lang.String str40 = rentalStatement8.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement42 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer44 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str45 = customer44.getName();
    java.lang.String str46 = customer44.statement();
    nul.study.videostore.RegularMovie regularMovie48 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str49 = regularMovie48.getTitle();
    int i51 = regularMovie48.determineFrequentRenterPoints((int)(short)100);
    int i53 = regularMovie48.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental55 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie48, (int)(byte)0);
    customer44.addRental(rental55);
    int i57 = rental55.getDaysRented();
    nul.study.videostore.Movie movie58 = rental55.getMovie();
    rentalStatement42.addRental(rental55);
    rentalStatement8.addRental(rental55);
    rentalStatement1.addRental(rental55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
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
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str22.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str40.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str45.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str46.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str49.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie58);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    java.lang.String str5 = regularMovie1.getTitle();
    double d7 = regularMovie1.determineAmount(10);
    regularMovie1.setPriceCode(2);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    regularMovie1.setPriceCode((int)(byte)1);
    java.lang.String str14 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 0);
    int i18 = regularMovie1.determineFrequentRenterPoints(0);
    double d20 = regularMovie1.determineAmount(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str14.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 2.0d);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.statement();
    nul.study.videostore.RegularMovie regularMovie10 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str11 = regularMovie10.getTitle();
    double d13 = regularMovie10.determineAmount((int)(byte)-1);
    java.lang.String str14 = regularMovie10.getTitle();
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie10, (int)(byte)1);
    customer1.addRental(rental16);
    java.lang.String str18 = customer1.getName();
    java.lang.String str19 = customer1.getName();
    nul.study.videostore.RegularMovie regularMovie21 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str22 = regularMovie21.getTitle();
    double d24 = regularMovie21.determineAmount(10);
    int i26 = regularMovie21.determineFrequentRenterPoints((int)'a');
    nul.study.videostore.Rental rental28 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie21, 1);
    customer1.addRental(rental28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str14.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!"+ "'", str18.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!"+ "'", str19.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str22.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }


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
    java.lang.String str15 = rentalStatement1.getName();
    int i16 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\thi!\t-3.0\nYou owed -3.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    int i12 = newReleaseMovie11.getPriceCode();
    int i14 = newReleaseMovie11.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, (-1));
    rentalStatement1.addRental(rental16);
    java.lang.String str18 = rentalStatement1.getName();
    java.lang.String str19 = rentalStatement1.getName();
    java.lang.String str20 = rentalStatement1.makeRentalStatement();
    double d21 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n"+ "'", str20.equals("Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == (-3.0d));

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints(1);
    double d8 = newReleaseMovie1.determineAmount((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 30.0d);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    double d5 = newReleaseMovie1.determineAmount((int)' ');
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)1);
    java.lang.String str10 = newReleaseMovie1.getTitle();
    int i12 = newReleaseMovie1.determineFrequentRenterPoints(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    childrensMovie1.setPriceCode((int)'4');
    childrensMovie1.setPriceCode((int)'4');
    java.lang.String str8 = childrensMovie1.getTitle();
    int i10 = childrensMovie1.determineFrequentRenterPoints((int)(short)100);
    double d12 = childrensMovie1.determineAmount((int)(short)0);
    int i14 = childrensMovie1.determineFrequentRenterPoints((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    childrensMovie1.setPriceCode((int)'4');
    childrensMovie1.setPriceCode((int)'4');
    double d9 = childrensMovie1.determineAmount((int)(byte)-1);
    double d11 = childrensMovie1.determineAmount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 75.0d);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str7 = rentalStatement1.getName();
    double d8 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement10 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d11 = rentalStatement10.getAmountOwed();
    int i12 = rentalStatement10.getFrequentRenterPoints();
    int i13 = rentalStatement10.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie15 = new nul.study.videostore.NewReleaseMovie("");
    int i16 = newReleaseMovie15.getPriceCode();
    double d18 = newReleaseMovie15.determineAmount((int)'a');
    int i20 = newReleaseMovie15.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie15, (int)(byte)0);
    rentalStatement10.addRental(rental22);
    rentalStatement1.addRental(rental22);
    int i25 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)10);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)100);
    newReleaseMovie1.setPriceCode((int)'4');
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)1);
    double d14 = newReleaseMovie1.determineAmount((int)(short)0);
    int i16 = newReleaseMovie1.determineFrequentRenterPoints((int)'#');
    double d18 = newReleaseMovie1.determineAmount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 156.0d);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount((int)'4');
    int i5 = newReleaseMovie1.determineFrequentRenterPoints(1);
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    double d9 = newReleaseMovie1.determineAmount((int)(byte)0);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 156.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie21 = rental19.getMovie();
    rentalStatement3.addRental(rental19);
    customer1.addRental(rental19);
    java.lang.String str24 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement26 = new nul.study.videostore.RentalStatement("");
    int i27 = rentalStatement26.getFrequentRenterPoints();
    java.lang.String str28 = rentalStatement26.getName();
    int i29 = rentalStatement26.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie31 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental33 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie31, 0);
    int i34 = rental33.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie35 = rental33.getMovie();
    nul.study.videostore.Movie movie36 = rental33.getMovie();
    rentalStatement26.addRental(rental33);
    int i38 = rentalStatement26.getFrequentRenterPoints();
    int i39 = rentalStatement26.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement41 = new nul.study.videostore.RentalStatement("");
    int i42 = rentalStatement41.getFrequentRenterPoints();
    nul.study.videostore.Customer customer44 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie46 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental48 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie46, 0);
    int i49 = rental48.determineFrequentRenterPoints();
    customer44.addRental(rental48);
    int i51 = rental48.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie52 = rental48.getMovie();
    rentalStatement41.addRental(rental48);
    nul.study.videostore.NewReleaseMovie newReleaseMovie55 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental57 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie55, 0);
    int i58 = rental57.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie59 = rental57.getMovie();
    rentalStatement41.addRental(rental57);
    rentalStatement26.addRental(rental57);
    nul.study.videostore.RentalStatement rentalStatement63 = new nul.study.videostore.RentalStatement("");
    java.lang.String str64 = rentalStatement63.makeRentalStatement();
    double d65 = rentalStatement63.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie67 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i68 = newReleaseMovie67.getPriceCode();
    nul.study.videostore.Rental rental70 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie67, 1);
    int i71 = rental70.getDaysRented();
    int i72 = rental70.getDaysRented();
    rentalStatement63.addRental(rental70);
    rentalStatement26.addRental(rental70);
    nul.study.videostore.NewReleaseMovie newReleaseMovie76 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i77 = newReleaseMovie76.getPriceCode();
    nul.study.videostore.Rental rental79 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie76, 0);
    rentalStatement26.addRental(rental79);
    customer1.addRental(rental79);
    java.lang.String str82 = customer1.getName();
    java.lang.String str83 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str24.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + ""+ "'", str28.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str64.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str82 + "' != '" + ""+ "'", str82.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str83 + "' != '" + "Rental Record for \n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str83.equals("Rental Record for \n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    double d6 = newReleaseMovie1.determineAmount((int)(byte)-1);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)100);
    int i9 = newReleaseMovie1.getPriceCode();
    int i11 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }


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
    double d16 = rentalStatement1.getAmountOwed();
    java.lang.String str17 = rentalStatement1.makeRentalStatement();
    int i18 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i21 = newReleaseMovie20.getPriceCode();
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, 0);
    int i25 = newReleaseMovie20.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, (int)(byte)-1);
    int i28 = rental27.getDaysRented();
    double d29 = rental27.determineAmount();
    int i30 = rental27.determineFrequentRenterPoints();
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(0);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    double d7 = childrensMovie1.determineAmount((int)(byte)100);
    double d9 = childrensMovie1.determineAmount((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.5d);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    double d8 = regularMovie1.determineAmount((int)(short)0);
    java.lang.String str9 = regularMovie1.getTitle();
    int i10 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.makeRentalStatement();
    double d5 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 10);
    nul.study.videostore.Movie movie5 = rental4.getMovie();
    int i6 = movie5.getPriceCode();
    movie5.setPriceCode((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i4 = newReleaseMovie3.getPriceCode();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    customer1.addRental(rental6);
    java.lang.String str8 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement10 = new nul.study.videostore.RentalStatement("");
    int i11 = rentalStatement10.getFrequentRenterPoints();
    java.lang.String str12 = rentalStatement10.getName();
    int i13 = rentalStatement10.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    rentalStatement15.addRental(rental19);
    double d22 = rental19.determineAmount();
    rentalStatement10.addRental(rental19);
    int i24 = rental19.getDaysRented();
    customer1.addRental(rental19);
    java.lang.String str26 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    nul.study.videostore.Movie movie6 = rental3.getMovie();
    double d7 = rental3.determineAmount();
    int i8 = rental3.getDaysRented();
    nul.study.videostore.Movie movie9 = rental3.getMovie();
    double d10 = rental3.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\thi!\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount((int)'a');
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    newReleaseMovie1.setPriceCode(3);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(100);
    double d5 = newReleaseMovie1.determineAmount((int)(short)-1);
    double d7 = newReleaseMovie1.determineAmount(1);
    double d9 = newReleaseMovie1.determineAmount((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-3.0d));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }


    nul.study.videostore.Movie movie0 = null;
    nul.study.videostore.Rental rental2 = new nul.study.videostore.Rental(movie0, (int)'4');
    // The following exception was thrown during execution in test generation
    try {
    int i3 = rental2.determineFrequentRenterPoints();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
      if (! e.getClass().getCanonicalName().equals("java.lang.NullPointerException")) {
        org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException, got " + e.getClass().getCanonicalName());
      }
    }

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i2 = regularMovie1.getPriceCode();
    int i3 = regularMovie1.getPriceCode();
    double d5 = regularMovie1.determineAmount((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    double d11 = rentalStatement1.getAmountOwed();
    double d12 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    int i5 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    int i8 = newReleaseMovie7.getPriceCode();
    int i10 = newReleaseMovie7.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, (-1));
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, (int)(short)0);
    nul.study.videostore.Movie movie15 = rental14.getMovie();
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental(movie15, (int)(short)0);
    rentalStatement1.addRental(rental17);
    int i19 = rentalStatement1.getFrequentRenterPoints();
    int i20 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)0);
    int i10 = regularMovie1.determineFrequentRenterPoints(100);
    int i11 = regularMovie1.getPriceCode();
    regularMovie1.setPriceCode((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i8 = regularMovie1.determineFrequentRenterPoints(0);
    regularMovie1.setPriceCode((int)(byte)1);
    int i12 = regularMovie1.determineFrequentRenterPoints(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    double d8 = newReleaseMovie1.determineAmount((int)(short)1);
    double d10 = newReleaseMovie1.determineAmount((-1));
    int i12 = newReleaseMovie1.determineFrequentRenterPoints(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental7.getMovie();
    customer1.addRental(rental7);
    java.lang.String str11 = customer1.statement();
    java.lang.String str12 = customer1.getName();
    java.lang.String str13 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!"+ "'", str12.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    int i7 = childrensMovie1.determineFrequentRenterPoints(2);
    double d9 = childrensMovie1.determineAmount(0);
    double d11 = childrensMovie1.determineAmount(10);
    int i13 = childrensMovie1.determineFrequentRenterPoints(1);
    int i15 = childrensMovie1.determineFrequentRenterPoints((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    childrensMovie1.setPriceCode(0);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

}
