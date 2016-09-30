package nul.study.videostore.RandoopTests;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Regression6Test {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test001"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test002"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(2);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test003"); }


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
    double d31 = rentalStatement1.getAmountOwed();
    java.lang.String str32 = rentalStatement1.makeRentalStatement();
    double d33 = rentalStatement1.getAmountOwed();
    
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
    org.junit.Assert.assertTrue(d31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Rental Record for \n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\n\t\t0.0\nYou owed 2.0\nYou earned 2 frequent renter points\n"+ "'", str32.equals("Rental Record for \n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\n\t\t0.0\nYou owed 2.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 2.0d);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test004"); }


    nul.study.videostore.Movie movie0 = null;
    nul.study.videostore.Rental rental2 = new nul.study.videostore.Rental(movie0, (int)(short)100);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test005"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    nul.study.videostore.Movie movie10 = rental9.getMovie();
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental(movie10, (int)(byte)0);
    double d13 = rental12.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test006"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
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
    nul.study.videostore.Customer customer19 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str20 = customer19.statement();
    java.lang.String str21 = customer19.getName();
    java.lang.String str22 = customer19.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i25 = newReleaseMovie24.getPriceCode();
    double d27 = newReleaseMovie24.determineAmount(100);
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, (int)(byte)10);
    int i30 = rental29.getDaysRented();
    double d31 = rental29.determineAmount();
    customer19.addRental(rental29);
    double d33 = rental29.determineAmount();
    rentalStatement5.addRental(rental29);
    customer1.addRental(rental29);
    java.lang.String str36 = customer1.statement();
    java.lang.String str37 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str20.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str21.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str22.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n"+ "'", str36.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n"+ "'", str37.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test007"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((-1));
    java.lang.String str6 = childrensMovie1.getTitle();
    int i7 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test008"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    int i10 = regularMovie1.getPriceCode();
    double d12 = regularMovie1.determineAmount((int)(byte)10);
    double d14 = regularMovie1.determineAmount(0);
    double d16 = regularMovie1.determineAmount((int)(byte)0);
    int i18 = regularMovie1.determineFrequentRenterPoints(97);
    
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
    org.junit.Assert.assertTrue(d14 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test009"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie26 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    int i28 = newReleaseMovie26.determineFrequentRenterPoints(35);
    nul.study.videostore.Rental rental30 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, 0);
    rentalStatement1.addRental(rental30);
    int i32 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer34 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie36 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental38 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie36, 0);
    int i39 = rental38.determineFrequentRenterPoints();
    customer34.addRental(rental38);
    java.lang.String str41 = customer34.getName();
    nul.study.videostore.Rental rental42 = null;
    customer34.addRental(rental42);
    nul.study.videostore.NewReleaseMovie newReleaseMovie45 = new nul.study.videostore.NewReleaseMovie("");
    int i46 = newReleaseMovie45.getPriceCode();
    int i48 = newReleaseMovie45.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental50 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie45, (-1));
    nul.study.videostore.Rental rental52 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie45, (int)(short)0);
    customer34.addRental(rental52);
    double d54 = rental52.determineAmount();
    rentalStatement1.addRental(rental52);
    int i56 = rental52.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie57 = rental52.getMovie();
    
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
    org.junit.Assert.assertTrue(i28 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie57);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test010"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)10);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints(0);
    double d10 = newReleaseMovie1.determineAmount((int)(byte)10);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    java.lang.String str13 = newReleaseMovie1.getTitle();
    int i15 = newReleaseMovie1.determineFrequentRenterPoints(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test011"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    double d5 = childrensMovie1.determineAmount((int)'4');
    double d7 = childrensMovie1.determineAmount(100);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test012"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t2.0\n\t\t1.5\nYou owed 3.5\nYou earned 2 frequent renter points\n");
    nul.study.videostore.Customer customer3 = new nul.study.videostore.Customer("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    java.lang.String str4 = customer3.statement();
    java.lang.String str5 = customer3.getName();
    java.lang.String str6 = customer3.statement();
    nul.study.videostore.Customer customer8 = new nul.study.videostore.Customer("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i11 = newReleaseMovie10.getPriceCode();
    double d13 = newReleaseMovie10.determineAmount(100);
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, (int)(byte)10);
    int i16 = rental15.getDaysRented();
    customer8.addRental(rental15);
    nul.study.videostore.Movie movie18 = rental15.getMovie();
    customer3.addRental(rental15);
    nul.study.videostore.Customer customer21 = new nul.study.videostore.Customer("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.Customer customer23 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, 0);
    int i28 = rental27.determineFrequentRenterPoints();
    customer23.addRental(rental27);
    int i30 = rental27.determineFrequentRenterPoints();
    customer21.addRental(rental27);
    customer3.addRental(rental27);
    customer1.addRental(rental27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str5.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test013"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    regularMovie1.setPriceCode(2);
    double d6 = regularMovie1.determineAmount((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 51.5d);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test014"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount(0);
    double d9 = newReleaseMovie1.determineAmount((int)(byte)100);
    double d11 = newReleaseMovie1.determineAmount((int)' ');
    int i12 = newReleaseMovie1.getPriceCode();
    java.lang.String str13 = newReleaseMovie1.getTitle();
    int i15 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test015"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental7.getMovie();
    customer1.addRental(rental7);
    java.lang.String str11 = customer1.statement();
    nul.study.videostore.Customer customer13 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str14 = customer13.getName();
    java.lang.String str15 = customer13.statement();
    nul.study.videostore.RegularMovie regularMovie17 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str18 = regularMovie17.getTitle();
    int i20 = regularMovie17.determineFrequentRenterPoints((int)(short)100);
    int i22 = regularMovie17.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie17, (int)(byte)0);
    customer13.addRental(rental24);
    int i26 = rental24.getDaysRented();
    int i27 = rental24.determineFrequentRenterPoints();
    customer1.addRental(rental24);
    nul.study.videostore.RentalStatement rentalStatement30 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie32 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental34 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie32, 0);
    int i35 = rental34.determineFrequentRenterPoints();
    rentalStatement30.addRental(rental34);
    java.lang.String str37 = rentalStatement30.makeRentalStatement();
    java.lang.String str38 = rentalStatement30.makeRentalStatement();
    double d39 = rentalStatement30.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie41 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i42 = newReleaseMovie41.getPriceCode();
    double d44 = newReleaseMovie41.determineAmount(100);
    double d46 = newReleaseMovie41.determineAmount((int)(byte)-1);
    nul.study.videostore.Rental rental48 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie41, (int)(byte)100);
    double d49 = rental48.determineAmount();
    rentalStatement30.addRental(rental48);
    nul.study.videostore.RentalStatement rentalStatement52 = new nul.study.videostore.RentalStatement("");
    int i53 = rentalStatement52.getFrequentRenterPoints();
    java.lang.String str54 = rentalStatement52.getName();
    int i55 = rentalStatement52.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement57 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie59 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental61 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie59, 0);
    int i62 = rental61.determineFrequentRenterPoints();
    rentalStatement57.addRental(rental61);
    double d64 = rental61.determineAmount();
    rentalStatement52.addRental(rental61);
    int i66 = rental61.getDaysRented();
    int i67 = rental61.getDaysRented();
    rentalStatement30.addRental(rental61);
    nul.study.videostore.Movie movie69 = rental61.getMovie();
    customer1.addRental(rental61);
    java.lang.String str71 = customer1.statement();
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str14.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str15.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str18.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str37.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str38.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d39 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d44 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d49 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str54 + "' != '" + ""+ "'", str54.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\n\t\t0.0\nYou owed 2.0\nYou earned 3 frequent renter points\n"+ "'", str71.equals("Rental Record for hi!\n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\n\t\t0.0\nYou owed 2.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test016"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.getName();
    java.lang.String str6 = customer1.statement();
    nul.study.videostore.Customer customer8 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 0);
    int i13 = rental12.determineFrequentRenterPoints();
    customer8.addRental(rental12);
    int i15 = rental12.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental12.getMovie();
    int i17 = rental12.getDaysRented();
    int i18 = rental12.determineFrequentRenterPoints();
    int i19 = rental12.getDaysRented();
    customer1.addRental(rental12);
    int i21 = rental12.determineFrequentRenterPoints();
    double d22 = rental12.determineAmount();
    int i23 = rental12.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test017"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test018"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    java.lang.String str4 = regularMovie1.getTitle();
    double d6 = regularMovie1.determineAmount((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 2.0d);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test019"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    double d8 = regularMovie1.determineAmount((int)(short)10);
    int i10 = regularMovie1.determineFrequentRenterPoints((-1));
    java.lang.String str11 = regularMovie1.getTitle();
    regularMovie1.setPriceCode((int)'#');
    double d15 = regularMovie1.determineAmount(100);
    int i17 = regularMovie1.determineFrequentRenterPoints(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test020"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    double d5 = newReleaseMovie1.determineAmount((int)(short)-1);
    java.lang.String str6 = newReleaseMovie1.getTitle();
    double d8 = newReleaseMovie1.determineAmount((int)' ');
    double d10 = newReleaseMovie1.determineAmount((int)(short)-1);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test021"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)0);
    java.lang.String str9 = newReleaseMovie1.getTitle();
    double d11 = newReleaseMovie1.determineAmount((-1));
    double d13 = newReleaseMovie1.determineAmount(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 291.0d);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test022"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement7 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    rentalStatement7.addRental(rental11);
    java.lang.String str14 = rentalStatement7.makeRentalStatement();
    java.lang.String str15 = rentalStatement7.makeRentalStatement();
    double d16 = rentalStatement7.getAmountOwed();
    java.lang.String str17 = rentalStatement7.getName();
    nul.study.videostore.Customer customer19 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 0);
    int i24 = rental23.determineFrequentRenterPoints();
    customer19.addRental(rental23);
    rentalStatement7.addRental(rental23);
    java.lang.String str27 = rentalStatement7.getName();
    nul.study.videostore.RentalStatement rentalStatement29 = new nul.study.videostore.RentalStatement("");
    int i30 = rentalStatement29.getFrequentRenterPoints();
    java.lang.String str31 = rentalStatement29.getName();
    int i32 = rentalStatement29.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie34 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental36 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie34, 0);
    int i37 = rental36.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie38 = rental36.getMovie();
    nul.study.videostore.Movie movie39 = rental36.getMovie();
    rentalStatement29.addRental(rental36);
    int i41 = rentalStatement29.getFrequentRenterPoints();
    int i42 = rentalStatement29.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement44 = new nul.study.videostore.RentalStatement("");
    int i45 = rentalStatement44.getFrequentRenterPoints();
    nul.study.videostore.Customer customer47 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie49 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental51 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie49, 0);
    int i52 = rental51.determineFrequentRenterPoints();
    customer47.addRental(rental51);
    int i54 = rental51.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie55 = rental51.getMovie();
    rentalStatement44.addRental(rental51);
    nul.study.videostore.NewReleaseMovie newReleaseMovie58 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental60 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie58, 0);
    int i61 = rental60.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie62 = rental60.getMovie();
    rentalStatement44.addRental(rental60);
    rentalStatement29.addRental(rental60);
    nul.study.videostore.RentalStatement rentalStatement66 = new nul.study.videostore.RentalStatement("");
    java.lang.String str67 = rentalStatement66.makeRentalStatement();
    double d68 = rentalStatement66.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie70 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i71 = newReleaseMovie70.getPriceCode();
    nul.study.videostore.Rental rental73 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie70, 1);
    int i74 = rental73.getDaysRented();
    int i75 = rental73.getDaysRented();
    rentalStatement66.addRental(rental73);
    rentalStatement29.addRental(rental73);
    nul.study.videostore.NewReleaseMovie newReleaseMovie79 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i80 = newReleaseMovie79.getPriceCode();
    nul.study.videostore.Rental rental82 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie79, 0);
    rentalStatement29.addRental(rental82);
    rentalStatement7.addRental(rental82);
    customer1.addRental(rental82);
    nul.study.videostore.NewReleaseMovie newReleaseMovie87 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental89 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie87, 0);
    int i90 = rental89.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie91 = rental89.getMovie();
    nul.study.videostore.Movie movie92 = rental89.getMovie();
    double d93 = rental89.determineAmount();
    nul.study.videostore.Movie movie94 = rental89.getMovie();
    customer1.addRental(rental89);
    java.lang.String str96 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + ""+ "'", str31.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie62);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str67.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d68 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i90 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie92);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d93 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie94);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str96 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str96.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test023"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)-1);
    int i9 = rental8.getDaysRented();
    int i10 = rental8.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    int i12 = rental8.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test024"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    double d5 = rental4.determineAmount();
    nul.study.videostore.Movie movie6 = rental4.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie6);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test025"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    childrensMovie1.setPriceCode((-1));
    int i9 = childrensMovie1.determineFrequentRenterPoints((-1));
    childrensMovie1.setPriceCode(0);
    double d13 = childrensMovie1.determineAmount((int)(byte)100);
    double d15 = childrensMovie1.determineAmount(0);
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, 2);
    nul.study.videostore.Movie movie18 = rental17.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie18);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test026"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(1);
    int i4 = newReleaseMovie1.getPriceCode();
    double d6 = newReleaseMovie1.determineAmount((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 300.0d);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test027"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 1 frequent renter points\n");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test028"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    int i9 = rentalStatement1.getFrequentRenterPoints();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    double d11 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test029"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    double d5 = childrensMovie1.determineAmount(0);
    int i7 = childrensMovie1.determineFrequentRenterPoints(0);
    double d9 = childrensMovie1.determineAmount((int)(byte)100);
    childrensMovie1.setPriceCode((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 147.0d);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test030"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (-1));
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(short)0);
    int i9 = regularMovie1.determineFrequentRenterPoints((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test031"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test032"); }


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
    java.lang.String str56 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement58 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i59 = rentalStatement58.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie61 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i62 = newReleaseMovie61.getPriceCode();
    nul.study.videostore.Rental rental64 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie61, 1);
    int i65 = rental64.getDaysRented();
    int i66 = rental64.getDaysRented();
    double d67 = rental64.determineAmount();
    int i68 = rental64.getDaysRented();
    rentalStatement58.addRental(rental64);
    nul.study.videostore.NewReleaseMovie newReleaseMovie71 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental73 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie71, 0);
    int i74 = rental73.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie75 = rental73.getMovie();
    rentalStatement58.addRental(rental73);
    nul.study.videostore.RentalStatement rentalStatement78 = new nul.study.videostore.RentalStatement("");
    int i79 = rentalStatement78.getFrequentRenterPoints();
    java.lang.String str80 = rentalStatement78.getName();
    int i81 = rentalStatement78.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement83 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie85 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental87 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie85, 0);
    int i88 = rental87.determineFrequentRenterPoints();
    rentalStatement83.addRental(rental87);
    double d90 = rental87.determineAmount();
    rentalStatement78.addRental(rental87);
    int i92 = rental87.getDaysRented();
    rentalStatement58.addRental(rental87);
    rentalStatement1.addRental(rental87);
    
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
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"+ "'", str56.equals("Rental Record for \n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i62 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d67 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i74 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie75);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + ""+ "'", str80.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d90 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test033"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints(100);
    int i5 = regularMovie1.determineFrequentRenterPoints((int)'4');
    java.lang.String str6 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test034"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    double d5 = newReleaseMovie1.determineAmount((int)' ');
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)1);
    java.lang.String str10 = newReleaseMovie1.getTitle();
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)'a');
    int i14 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i16 = newReleaseMovie1.determineFrequentRenterPoints((int)' ');
    double d18 = newReleaseMovie1.determineAmount((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 300.0d);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test035"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints(2);
    childrensMovie1.setPriceCode((int)(short)10);
    double d7 = childrensMovie1.determineAmount(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 1.5d);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test036"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)0);
    java.lang.String str4 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test037"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (-1));
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(short)0);
    int i8 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test038"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount(0);
    double d9 = newReleaseMovie1.determineAmount((int)(byte)100);
    double d11 = newReleaseMovie1.determineAmount((int)' ');
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    int i14 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test039"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t149.0\n\t\t51.5\nYou owed 200.5\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test040"); }


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
    int i14 = rental8.determineFrequentRenterPoints();
    double d15 = rental8.determineAmount();
    double d16 = rental8.determineAmount();
    nul.study.videostore.Movie movie17 = rental8.getMovie();
    int i18 = rental8.determineFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test041"); }


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
    java.lang.String str42 = customer1.getName();
    nul.study.videostore.Customer customer44 = new nul.study.videostore.Customer("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str45 = customer44.getName();
    java.lang.String str46 = customer44.statement();
    nul.study.videostore.Customer customer48 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie50 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental52 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie50, 0);
    int i53 = rental52.determineFrequentRenterPoints();
    customer48.addRental(rental52);
    nul.study.videostore.NewReleaseMovie newReleaseMovie56 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i57 = newReleaseMovie56.getPriceCode();
    nul.study.videostore.Rental rental59 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie56, 1);
    int i60 = rental59.getDaysRented();
    customer48.addRental(rental59);
    nul.study.videostore.Rental rental62 = null;
    customer48.addRental(rental62);
    java.lang.String str64 = customer48.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie66 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i67 = newReleaseMovie66.getPriceCode();
    nul.study.videostore.Rental rental69 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie66, 1);
    int i70 = rental69.getDaysRented();
    int i71 = rental69.getDaysRented();
    double d72 = rental69.determineAmount();
    customer48.addRental(rental69);
    customer44.addRental(rental69);
    customer1.addRental(rental69);
    java.lang.String str76 = customer1.statement();
    nul.study.videostore.ChildrensMovie childrensMovie78 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i80 = childrensMovie78.determineFrequentRenterPoints((-1));
    int i82 = childrensMovie78.determineFrequentRenterPoints((-1));
    int i84 = childrensMovie78.determineFrequentRenterPoints(100);
    int i86 = childrensMovie78.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental88 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie78, (int)(byte)10);
    int i89 = rental88.determineFrequentRenterPoints();
    customer1.addRental(rental88);
    double d91 = rental88.determineAmount();
    
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
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str42.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str45.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str46.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "hi!"+ "'", str64.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i67 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d72 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str76 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str76.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d91 == 12.0d);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test042"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    childrensMovie1.setPriceCode((int)'4');
    childrensMovie1.setPriceCode((int)'4');
    java.lang.String str8 = childrensMovie1.getTitle();
    int i10 = childrensMovie1.determineFrequentRenterPoints((int)(short)100);
    double d12 = childrensMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.5d);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test043"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.statement();
    java.lang.String str6 = customer1.getName();
    java.lang.String str7 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test044"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.RegularMovie regularMovie3 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str4 = regularMovie3.getTitle();
    double d6 = regularMovie3.determineAmount(10);
    int i7 = regularMovie3.getPriceCode();
    int i9 = regularMovie3.determineFrequentRenterPoints(0);
    double d11 = regularMovie3.determineAmount((int)(short)0);
    int i13 = regularMovie3.determineFrequentRenterPoints((int)(short)100);
    int i15 = regularMovie3.determineFrequentRenterPoints(1);
    double d17 = regularMovie3.determineAmount((int)(byte)1);
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie3, (int)'#');
    int i20 = rental19.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental19);
    java.lang.String str22 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t51.5\nYou owed 51.5\nYou earned 1 frequent renter points\n"+ "'", str22.equals("Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t51.5\nYou owed 51.5\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test045"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    java.lang.String str5 = regularMovie1.getTitle();
    double d7 = regularMovie1.determineAmount((int)'4');
    double d9 = regularMovie1.determineAmount((int)'a');
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(short)100);
    regularMovie1.setPriceCode(100);
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 77.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 144.5d);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test046"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test047"); }


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
    java.lang.String str23 = rentalStatement1.makeRentalStatement();
    java.lang.String str24 = rentalStatement1.makeRentalStatement();
    
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
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str23.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str24.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test048"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)(byte)1);
    int i5 = regularMovie1.determineFrequentRenterPoints(100);
    int i7 = regularMovie1.determineFrequentRenterPoints(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test049"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test050"); }


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
    java.lang.String str90 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue("'" + str90 + "' != '" + ""+ "'", str90.equals(""));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test051"); }


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
    double d25 = rental20.determineAmount();
    int i26 = rental20.determineFrequentRenterPoints();
    double d27 = rental20.determineAmount();
    nul.study.videostore.Movie movie28 = rental20.getMovie();
    nul.study.videostore.Rental rental30 = new nul.study.videostore.Rental(movie28, (int)'a');
    
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
    org.junit.Assert.assertTrue(d25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie28);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test052"); }


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
    java.lang.String str13 = rentalStatement1.makeRentalStatement();
    int i14 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str15 = rentalStatement1.makeRentalStatement();
    int i16 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str17 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test053"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test054"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)-1);
    double d9 = rental8.determineAmount();
    int i10 = rental8.getDaysRented();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test055"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.getName();
    java.lang.String str9 = customer1.getName();
    nul.study.videostore.ChildrensMovie childrensMovie11 = new nul.study.videostore.ChildrensMovie("");
    int i13 = childrensMovie11.determineFrequentRenterPoints(1);
    int i15 = childrensMovie11.determineFrequentRenterPoints(2);
    double d17 = childrensMovie11.determineAmount((int)(short)10);
    double d19 = childrensMovie11.determineAmount((int)(short)1);
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie11, 1);
    customer1.addRental(rental21);
    int i23 = rental21.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!"+ "'", str9.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test056"); }


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
    double d18 = rentalStatement1.getAmountOwed();
    java.lang.String str19 = rentalStatement1.makeRentalStatement();
    
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
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str19.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test057"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test058"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(10);
    java.lang.String str4 = childrensMovie1.getTitle();
    childrensMovie1.setPriceCode((int)(byte)-1);
    double d8 = childrensMovie1.determineAmount((int)' ');
    int i10 = childrensMovie1.determineFrequentRenterPoints((int)(byte)100);
    int i12 = childrensMovie1.determineFrequentRenterPoints((int)'a');
    int i13 = childrensMovie1.getPriceCode();
    double d15 = childrensMovie1.determineAmount(97);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 45.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 142.5d);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test059"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)10);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints(0);
    int i9 = newReleaseMovie1.getPriceCode();
    double d11 = newReleaseMovie1.determineAmount((int)'#');
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)'4');
    java.lang.String str14 = newReleaseMovie1.getTitle();
    int i16 = newReleaseMovie1.determineFrequentRenterPoints(2);
    
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
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 2);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test060"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test061"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount((int)(short)0);
    double d6 = newReleaseMovie1.determineAmount((int)(byte)-1);
    double d8 = newReleaseMovie1.determineAmount((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 30.0d);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test062"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t1.5\nYou owed 1.5\nYou earned 2 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount((int)(byte)0);
    int i4 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test063"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    double d7 = regularMovie1.determineAmount(10);
    double d9 = regularMovie1.determineAmount(0);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test064"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    newReleaseMovie1.setPriceCode((int)(byte)100);
    java.lang.String str7 = newReleaseMovie1.getTitle();
    double d9 = newReleaseMovie1.determineAmount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 291.0d);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test065"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test066"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    int i6 = newReleaseMovie5.getPriceCode();
    int i8 = newReleaseMovie5.determineFrequentRenterPoints((int)(short)-1);
    int i10 = newReleaseMovie5.determineFrequentRenterPoints((int)(short)10);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, (int)(short)100);
    int i13 = rental12.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental12);
    int i15 = rental12.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 100);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test067"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)10);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)100);
    newReleaseMovie1.setPriceCode((int)'4');
    int i11 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 52);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test068"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    double d5 = newReleaseMovie1.determineAmount((int)' ');
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)1);
    java.lang.String str10 = newReleaseMovie1.getTitle();
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)'a');
    java.lang.String str13 = newReleaseMovie1.getTitle();
    int i15 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    double d17 = newReleaseMovie1.determineAmount(100);
    double d19 = newReleaseMovie1.determineAmount((int)(byte)-1);
    int i20 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + ""+ "'", str13.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test069"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    int i7 = childrensMovie1.determineFrequentRenterPoints(2);
    double d9 = childrensMovie1.determineAmount(0);
    double d11 = childrensMovie1.determineAmount(10);
    java.lang.String str12 = childrensMovie1.getTitle();
    int i14 = childrensMovie1.determineFrequentRenterPoints(0);
    double d16 = childrensMovie1.determineAmount((int)(short)10);
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 12.0d);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test070"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental7.getMovie();
    customer1.addRental(rental7);
    java.lang.String str11 = customer1.getName();
    java.lang.String str12 = customer1.getName();
    java.lang.String str13 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str11.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str12.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test071"); }


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
    nul.study.videostore.Customer customer34 = new nul.study.videostore.Customer("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie36 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental38 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie36, 10);
    customer34.addRental(rental38);
    java.lang.String str40 = customer34.statement();
    java.lang.String str41 = customer34.getName();
    nul.study.videostore.RentalStatement rentalStatement43 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d44 = rentalStatement43.getAmountOwed();
    java.lang.String str45 = rentalStatement43.getName();
    java.lang.String str46 = rentalStatement43.getName();
    double d47 = rentalStatement43.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement49 = new nul.study.videostore.RentalStatement("");
    int i50 = rentalStatement49.getFrequentRenterPoints();
    java.lang.String str51 = rentalStatement49.getName();
    int i52 = rentalStatement49.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie54 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental56 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie54, 0);
    int i57 = rental56.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie58 = rental56.getMovie();
    nul.study.videostore.Movie movie59 = rental56.getMovie();
    rentalStatement49.addRental(rental56);
    rentalStatement43.addRental(rental56);
    nul.study.videostore.RentalStatement rentalStatement63 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str64 = rentalStatement63.makeRentalStatement();
    int i65 = rentalStatement63.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement67 = new nul.study.videostore.RentalStatement("");
    int i68 = rentalStatement67.getFrequentRenterPoints();
    nul.study.videostore.Customer customer70 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie72 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental74 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie72, 0);
    int i75 = rental74.determineFrequentRenterPoints();
    customer70.addRental(rental74);
    int i77 = rental74.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie78 = rental74.getMovie();
    rentalStatement67.addRental(rental74);
    nul.study.videostore.NewReleaseMovie newReleaseMovie81 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental83 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie81, 0);
    int i84 = rental83.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie85 = rental83.getMovie();
    rentalStatement67.addRental(rental83);
    int i87 = rental83.determineFrequentRenterPoints();
    rentalStatement63.addRental(rental83);
    rentalStatement43.addRental(rental83);
    customer34.addRental(rental83);
    rentalStatement1.addRental(rental83);
    
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
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Rental Record for \n\t\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n"+ "'", str40.equals("Rental Record for \n\t\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + ""+ "'", str41.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str45.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str46 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str46.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d47 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + ""+ "'", str51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str64 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str64.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test072"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    double d5 = childrensMovie1.determineAmount(0);
    int i7 = childrensMovie1.determineFrequentRenterPoints(0);
    double d9 = childrensMovie1.determineAmount((int)(byte)100);
    double d11 = childrensMovie1.determineAmount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 142.5d);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test073"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount((int)'a');
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)1);
    double d8 = newReleaseMovie1.determineAmount((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 3.0d);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test074"); }


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
    int i20 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str21 = rentalStatement1.makeRentalStatement();
    
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
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n"+ "'", str21.equals("Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test075"); }


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
    int i20 = rentalStatement1.getFrequentRenterPoints();
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
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + ""+ "'", str21.equals(""));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test076"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    int i9 = regularMovie1.determineFrequentRenterPoints((int)(byte)100);
    double d11 = regularMovie1.determineAmount((int)'#');
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)'#');
    int i14 = rental13.determineFrequentRenterPoints();
    int i15 = rental13.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 51.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test077"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    newReleaseMovie1.setPriceCode((int)'#');
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    int i10 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)100);
    double d12 = newReleaseMovie1.determineAmount((int)(byte)1);
    int i14 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test078"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    double d7 = childrensMovie1.determineAmount((int)(byte)100);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)(byte)100);
    childrensMovie1.setPriceCode(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test079"); }


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
    nul.study.videostore.Customer customer26 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str27 = customer26.getName();
    java.lang.String str28 = customer26.getName();
    java.lang.String str29 = customer26.getName();
    nul.study.videostore.RegularMovie regularMovie31 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str32 = regularMovie31.getTitle();
    double d34 = regularMovie31.determineAmount(10);
    int i36 = regularMovie31.determineFrequentRenterPoints((int)'a');
    nul.study.videostore.Rental rental38 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie31, 1);
    nul.study.videostore.Rental rental40 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie31, (int)(byte)-1);
    nul.study.videostore.Rental rental42 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie31, (int)(short)100);
    customer26.addRental(rental42);
    nul.study.videostore.Movie movie44 = null;
    nul.study.videostore.Rental rental46 = new nul.study.videostore.Rental(movie44, (int)(byte)0);
    customer26.addRental(rental46);
    customer1.addRental(rental46);
    java.lang.String str49 = customer1.getName();
    
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
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str27.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str28.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str29.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str32.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d34 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + ""+ "'", str49.equals(""));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test080"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    double d3 = rentalStatement1.getAmountOwed();
    java.lang.String str4 = rentalStatement1.getName();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    java.lang.String str7 = customer6.getName();
    java.lang.String str8 = customer6.getName();
    nul.study.videostore.RentalStatement rentalStatement10 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie12 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie12, 0);
    int i15 = rental14.determineFrequentRenterPoints();
    rentalStatement10.addRental(rental14);
    customer6.addRental(rental14);
    java.lang.String str18 = customer6.statement();
    java.lang.String str19 = customer6.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 0);
    int i24 = rental23.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie25 = rental23.getMovie();
    nul.study.videostore.Movie movie26 = rental23.getMovie();
    double d27 = rental23.determineAmount();
    customer6.addRental(rental23);
    double d29 = rental23.determineAmount();
    nul.study.videostore.Movie movie30 = rental23.getMovie();
    rentalStatement1.addRental(rental23);
    java.lang.String str32 = rentalStatement1.getName();
    java.lang.String str33 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Rental rental34 = null;
    rentalStatement1.addRental(rental34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str18.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str19.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + ""+ "'", str32.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str33.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test081"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t1.5\n\t\t0.0\nYou owed 28.5\nYou earned 6 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t1.5\n\t\t0.0\nYou owed 28.5\nYou earned 6 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t1.5\n\t\t0.0\nYou owed 28.5\nYou earned 6 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t1.5\n\t\t0.0\nYou owed 28.5\nYou earned 6 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t1.5\n\t\t0.0\nYou owed 28.5\nYou earned 6 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test082"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer3 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d6 = rentalStatement5.getAmountOwed();
    java.lang.String str7 = rentalStatement5.getName();
    nul.study.videostore.Customer customer9 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    customer9.addRental(rental13);
    int i16 = rental13.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie17 = rental13.getMovie();
    int i18 = rental13.getDaysRented();
    rentalStatement5.addRental(rental13);
    customer3.addRental(rental13);
    nul.study.videostore.ChildrensMovie childrensMovie22 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d24 = childrensMovie22.determineAmount(10);
    java.lang.String str25 = childrensMovie22.getTitle();
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie22, (int)(short)0);
    customer3.addRental(rental27);
    customer1.addRental(rental27);
    nul.study.videostore.Customer customer31 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie33 = new nul.study.videostore.NewReleaseMovie("");
    int i34 = newReleaseMovie33.getPriceCode();
    int i36 = newReleaseMovie33.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental38 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie33, (-1));
    nul.study.videostore.Rental rental40 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie33, (int)(short)0);
    customer31.addRental(rental40);
    nul.study.videostore.Customer customer43 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie45 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental47 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie45, 0);
    int i48 = rental47.determineFrequentRenterPoints();
    customer43.addRental(rental47);
    java.lang.String str50 = customer43.getName();
    nul.study.videostore.Rental rental51 = null;
    customer43.addRental(rental51);
    nul.study.videostore.NewReleaseMovie newReleaseMovie54 = new nul.study.videostore.NewReleaseMovie("");
    int i55 = newReleaseMovie54.getPriceCode();
    int i57 = newReleaseMovie54.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental59 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie54, (-1));
    nul.study.videostore.Rental rental61 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie54, (int)(short)0);
    customer43.addRental(rental61);
    int i63 = rental61.determineFrequentRenterPoints();
    customer31.addRental(rental61);
    int i65 = rental61.getDaysRented();
    customer1.addRental(rental61);
    double d67 = rental61.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str7.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str25.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i65 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d67 == 0.0d);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test083"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.statement();
    java.lang.String str5 = customer1.getName();
    java.lang.String str6 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test084"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    childrensMovie1.setPriceCode((-1));
    int i9 = childrensMovie1.determineFrequentRenterPoints((-1));
    childrensMovie1.setPriceCode(0);
    double d13 = childrensMovie1.determineAmount((int)(byte)100);
    double d15 = childrensMovie1.determineAmount((int)(byte)1);
    childrensMovie1.setPriceCode((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 1.5d);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test085"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test086"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.getName();
    double d5 = rentalStatement1.getAmountOwed();
    java.lang.String str6 = rentalStatement1.getName();
    java.lang.String str7 = rentalStatement1.makeRentalStatement();
    java.lang.String str8 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str6.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test087"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    double d7 = childrensMovie1.determineAmount((int)(short)10);
    double d9 = childrensMovie1.determineAmount((int)(short)1);
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i12 = childrensMovie1.getPriceCode();
    int i14 = childrensMovie1.determineFrequentRenterPoints(35);
    double d16 = childrensMovie1.determineAmount((int)(byte)10);
    int i18 = childrensMovie1.determineFrequentRenterPoints((int)(short)10);
    
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
    org.junit.Assert.assertTrue(d16 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test088"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount(0);
    double d9 = newReleaseMovie1.determineAmount((int)(byte)100);
    double d11 = newReleaseMovie1.determineAmount((int)' ');
    int i12 = newReleaseMovie1.getPriceCode();
    java.lang.String str13 = newReleaseMovie1.getTitle();
    double d15 = newReleaseMovie1.determineAmount((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 30.0d);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test089"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test090"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints(1);
    regularMovie1.setPriceCode((int)' ');
    regularMovie1.setPriceCode((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test091"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t1.5\n\t\t0.0\nYou owed 28.5\nYou earned 6 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test092"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
    java.lang.String str3 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i10 = newReleaseMovie5.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, (int)(byte)-1);
    int i13 = rental12.getDaysRented();
    rentalStatement1.addRental(rental12);
    int i15 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str16 = rentalStatement1.makeRentalStatement();
    double d17 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\thi!\t-3.0\nYou owed -3.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\thi!\t-3.0\nYou owed -3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == (-3.0d));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test093"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    childrensMovie1.setPriceCode((int)'4');
    childrensMovie1.setPriceCode((int)'4');
    java.lang.String str8 = childrensMovie1.getTitle();
    double d10 = childrensMovie1.determineAmount(52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + ""+ "'", str8.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 75.0d);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test094"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
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
    double d17 = rentalStatement3.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 0);
    int i22 = rental21.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie23 = rental21.getMovie();
    nul.study.videostore.Movie movie24 = rental21.getMovie();
    double d25 = rental21.determineAmount();
    nul.study.videostore.Movie movie26 = rental21.getMovie();
    int i27 = rental21.getDaysRented();
    double d28 = rental21.determineAmount();
    rentalStatement3.addRental(rental21);
    rentalStatement1.addRental(rental21);
    int i31 = rentalStatement1.getFrequentRenterPoints();
    int i32 = rentalStatement1.getFrequentRenterPoints();
    double d33 = rentalStatement1.getAmountOwed();
    int i34 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test095"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    double d7 = childrensMovie1.determineAmount((int)(short)10);
    double d9 = childrensMovie1.determineAmount((int)(short)1);
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i12 = childrensMovie1.getPriceCode();
    int i14 = childrensMovie1.determineFrequentRenterPoints(35);
    double d16 = childrensMovie1.determineAmount((int)(byte)10);
    double d18 = childrensMovie1.determineAmount((int)' ');
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(byte)100);
    double d22 = childrensMovie1.determineAmount(1);
    int i24 = childrensMovie1.determineFrequentRenterPoints(10);
    int i25 = childrensMovie1.getPriceCode();
    
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
    org.junit.Assert.assertTrue(d16 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 45.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 2);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test096"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount((int)'a');
    double d5 = newReleaseMovie1.determineAmount(100);
    double d7 = newReleaseMovie1.determineAmount((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 300.0d);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test097"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 52);
    double d5 = newReleaseMovie1.determineAmount(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 30.0d);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test098"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)1);
    double d10 = newReleaseMovie1.determineAmount(0);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)100);
    int i14 = newReleaseMovie1.determineFrequentRenterPoints(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test099"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    double d7 = childrensMovie1.determineAmount((int)(byte)100);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)(byte)100);
    int i10 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 2);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test100"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i4 = rental3.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie5 = rental3.getMovie();
    nul.study.videostore.Movie movie6 = rental3.getMovie();
    double d7 = rental3.determineAmount();
    int i8 = rental3.getDaysRented();
    nul.study.videostore.Movie movie9 = rental3.getMovie();
    int i10 = rental3.getDaysRented();
    
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
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test101"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)' ');
    int i4 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test102"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    int i9 = rentalStatement1.getFrequentRenterPoints();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement12 = new nul.study.videostore.RentalStatement("");
    java.lang.String str13 = rentalStatement12.makeRentalStatement();
    double d14 = rentalStatement12.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i17 = newReleaseMovie16.getPriceCode();
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 1);
    int i20 = rental19.getDaysRented();
    int i21 = rental19.getDaysRented();
    rentalStatement12.addRental(rental19);
    nul.study.videostore.Movie movie23 = rental19.getMovie();
    nul.study.videostore.Movie movie24 = rental19.getMovie();
    rentalStatement1.addRental(rental19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str13.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test103"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n");
    regularMovie1.setPriceCode(35);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)1);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test104"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test105"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)0);
    int i10 = regularMovie1.determineFrequentRenterPoints(100);
    regularMovie1.setPriceCode((int)(byte)0);
    int i13 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test106"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test107"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i8 = regularMovie1.determineFrequentRenterPoints(0);
    regularMovie1.setPriceCode((int)(byte)1);
    double d12 = regularMovie1.determineAmount((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 14.0d);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test108"); }


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
    int i72 = rental64.getDaysRented();
    int i73 = rental64.getDaysRented();
    
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
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test109"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    double d3 = newReleaseMovie1.determineAmount(2);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    double d7 = newReleaseMovie1.determineAmount(0);
    double d9 = newReleaseMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 6.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 0.0d);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test110"); }


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
    double d16 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement18 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    nul.study.videostore.Customer customer20 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str21 = customer20.getName();
    java.lang.String str22 = customer20.getName();
    nul.study.videostore.RentalStatement rentalStatement24 = new nul.study.videostore.RentalStatement("");
    int i25 = rentalStatement24.getFrequentRenterPoints();
    java.lang.String str26 = rentalStatement24.getName();
    int i27 = rentalStatement24.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, 0);
    int i32 = rental31.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie33 = rental31.getMovie();
    nul.study.videostore.Movie movie34 = rental31.getMovie();
    rentalStatement24.addRental(rental31);
    int i36 = rentalStatement24.getFrequentRenterPoints();
    nul.study.videostore.Customer customer38 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str39 = customer38.statement();
    java.lang.String str40 = customer38.getName();
    java.lang.String str41 = customer38.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie43 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i44 = newReleaseMovie43.getPriceCode();
    double d46 = newReleaseMovie43.determineAmount(100);
    nul.study.videostore.Rental rental48 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie43, (int)(byte)10);
    int i49 = rental48.getDaysRented();
    double d50 = rental48.determineAmount();
    customer38.addRental(rental48);
    double d52 = rental48.determineAmount();
    rentalStatement24.addRental(rental48);
    customer20.addRental(rental48);
    rentalStatement18.addRental(rental48);
    double d56 = rental48.determineAmount();
    rentalStatement1.addRental(rental48);
    double d58 = rentalStatement1.getAmountOwed();
    
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
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str21.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str22.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + ""+ "'", str26.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str39.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str40.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str41.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d50 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d52 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d56 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d58 == 0.0d);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test111"); }


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
    java.lang.String str20 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer22 = new nul.study.videostore.Customer("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str23 = customer22.getName();
    java.lang.String str24 = customer22.statement();
    java.lang.String str25 = customer22.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 0);
    customer22.addRental(rental29);
    rentalStatement1.addRental(rental29);
    java.lang.String str32 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str20.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str23.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str24.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str25.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str32.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test112"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t-3.0\nYou owed -3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    java.lang.String str4 = rentalStatement3.makeRentalStatement();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    customer6.addRental(rental11);
    double d13 = rental11.determineAmount();
    int i14 = rental11.determineFrequentRenterPoints();
    rentalStatement3.addRental(rental11);
    int i16 = rental11.determineFrequentRenterPoints();
    customer1.addRental(rental11);
    java.lang.String str18 = customer1.getName();
    nul.study.videostore.Customer customer20 = new nul.study.videostore.Customer("hi!");
    java.lang.String str21 = customer20.getName();
    java.lang.String str22 = customer20.getName();
    nul.study.videostore.RentalStatement rentalStatement24 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie26 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental28 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, 0);
    int i29 = rental28.determineFrequentRenterPoints();
    rentalStatement24.addRental(rental28);
    customer20.addRental(rental28);
    nul.study.videostore.NewReleaseMovie newReleaseMovie33 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i34 = newReleaseMovie33.getPriceCode();
    nul.study.videostore.Rental rental36 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie33, 1);
    int i37 = rental36.getDaysRented();
    customer20.addRental(rental36);
    java.lang.String str39 = customer20.getName();
    java.lang.String str40 = customer20.statement();
    nul.study.videostore.Customer customer42 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie44 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental46 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie44, 0);
    int i47 = rental46.determineFrequentRenterPoints();
    customer42.addRental(rental46);
    int i49 = rental46.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie50 = rental46.getMovie();
    customer20.addRental(rental46);
    int i52 = rental46.getDaysRented();
    int i53 = rental46.getDaysRented();
    double d54 = rental46.determineAmount();
    double d55 = rental46.determineAmount();
    customer1.addRental(rental46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t-3.0\nYou owed -3.0\nYou earned 1 frequent renter points\n"+ "'", str18.equals("Rental Record for Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t-3.0\nYou owed -3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!"+ "'", str21.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!"+ "'", str22.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!"+ "'", str39.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str40.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d55 == 0.0d);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test113"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(100);
    regularMovie1.setPriceCode((int)'a');
    regularMovie1.setPriceCode(1);
    
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
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test114"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    double d7 = childrensMovie1.determineAmount((int)(short)1);
    java.lang.String str8 = childrensMovie1.getTitle();
    double d10 = childrensMovie1.determineAmount(52);
    int i12 = childrensMovie1.determineFrequentRenterPoints((int)(short)100);
    double d14 = childrensMovie1.determineAmount(3);
    childrensMovie1.setPriceCode(52);
    
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
    org.junit.Assert.assertTrue(d14 == 1.5d);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test115"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    double d3 = rentalStatement1.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 1);
    int i9 = rental8.getDaysRented();
    int i10 = rental8.getDaysRented();
    rentalStatement1.addRental(rental8);
    double d12 = rentalStatement1.getAmountOwed();
    
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
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test116"); }


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
    nul.study.videostore.Movie movie19 = rental17.getMovie();
    movie19.setPriceCode((int)(byte)-1);
    
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
    org.junit.Assert.assertNotNull(movie19);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test117"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.statement();
    nul.study.videostore.Customer customer6 = new nul.study.videostore.Customer("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    double d11 = newReleaseMovie8.determineAmount(100);
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, (int)(byte)10);
    int i14 = rental13.getDaysRented();
    customer6.addRental(rental13);
    nul.study.videostore.Movie movie16 = rental13.getMovie();
    customer1.addRental(rental13);
    java.lang.String str18 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n"+ "'", str18.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test118"); }


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
    nul.study.videostore.ChildrensMovie childrensMovie31 = new nul.study.videostore.ChildrensMovie("");
    int i33 = childrensMovie31.determineFrequentRenterPoints(1);
    int i35 = childrensMovie31.determineFrequentRenterPoints(2);
    childrensMovie31.setPriceCode((-1));
    int i39 = childrensMovie31.determineFrequentRenterPoints((-1));
    childrensMovie31.setPriceCode(0);
    double d43 = childrensMovie31.determineAmount((int)(byte)100);
    double d45 = childrensMovie31.determineAmount(0);
    nul.study.videostore.Rental rental47 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie31, 2);
    customer1.addRental(rental47);
    
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
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d43 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d45 == 1.5d);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test119"); }


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
    int i20 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test120"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t149.0\n\t\t51.5\nYou owed 200.5\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test121"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test122"); }


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
    int i48 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str49 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str49.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test123"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    int i5 = regularMovie1.determineFrequentRenterPoints((int)'4');
    int i7 = regularMovie1.determineFrequentRenterPoints(52);
    double d9 = regularMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test124"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    int i4 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test125"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("hi!");
    double d3 = childrensMovie1.determineAmount(1);
    int i4 = childrensMovie1.getPriceCode();
    double d6 = childrensMovie1.determineAmount((int)(short)100);
    double d8 = childrensMovie1.determineAmount((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 45.0d);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test126"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    childrensMovie1.setPriceCode((int)'4');
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(byte)10);
    childrensMovie1.setPriceCode((int)(byte)100);
    double d11 = childrensMovie1.determineAmount(1);
    int i13 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i15 = childrensMovie1.determineFrequentRenterPoints(35);
    nul.study.videostore.Rental rental17 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)' ');
    int i19 = childrensMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test127"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test128"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    double d3 = rentalStatement1.getAmountOwed();
    nul.study.videostore.Customer customer5 = new nul.study.videostore.Customer("hi!");
    java.lang.String str6 = customer5.getName();
    java.lang.String str7 = customer5.getName();
    nul.study.videostore.RentalStatement rentalStatement9 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    rentalStatement9.addRental(rental13);
    customer5.addRental(rental13);
    java.lang.String str17 = customer5.statement();
    java.lang.String str18 = customer5.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, 0);
    int i23 = rental22.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie24 = rental22.getMovie();
    nul.study.videostore.Movie movie25 = rental22.getMovie();
    double d26 = rental22.determineAmount();
    customer5.addRental(rental22);
    nul.study.videostore.Movie movie28 = rental22.getMovie();
    double d29 = rental22.determineAmount();
    nul.study.videostore.Movie movie30 = rental22.getMovie();
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental(movie30, (int)'4');
    rentalStatement1.addRental(rental32);
    int i34 = rental32.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!"+ "'", str7.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str18.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 2);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test129"); }


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
    nul.study.videostore.RentalStatement rentalStatement21 = new nul.study.videostore.RentalStatement("");
    int i22 = rentalStatement21.getFrequentRenterPoints();
    java.lang.String str23 = rentalStatement21.getName();
    int i24 = rentalStatement21.getFrequentRenterPoints();
    double d25 = rentalStatement21.getAmountOwed();
    java.lang.String str26 = rentalStatement21.makeRentalStatement();
    java.lang.String str27 = rentalStatement21.getName();
    nul.study.videostore.RentalStatement rentalStatement29 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie31 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental33 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie31, 0);
    int i34 = rental33.determineFrequentRenterPoints();
    rentalStatement29.addRental(rental33);
    java.lang.String str36 = rentalStatement29.makeRentalStatement();
    java.lang.String str37 = rentalStatement29.makeRentalStatement();
    double d38 = rentalStatement29.getAmountOwed();
    java.lang.String str39 = rentalStatement29.makeRentalStatement();
    double d40 = rentalStatement29.getAmountOwed();
    java.lang.String str41 = rentalStatement29.makeRentalStatement();
    nul.study.videostore.Customer customer43 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str44 = customer43.getName();
    java.lang.String str45 = customer43.statement();
    nul.study.videostore.RegularMovie regularMovie47 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str48 = regularMovie47.getTitle();
    int i50 = regularMovie47.determineFrequentRenterPoints((int)(short)100);
    int i52 = regularMovie47.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental54 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie47, (int)(byte)0);
    customer43.addRental(rental54);
    int i56 = rental54.getDaysRented();
    rentalStatement29.addRental(rental54);
    nul.study.videostore.Movie movie58 = rental54.getMovie();
    rentalStatement21.addRental(rental54);
    rentalStatement1.addRental(rental54);
    
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
    org.junit.Assert.assertTrue(i22 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + ""+ "'", str23.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str26.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + ""+ "'", str27.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str36.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str37.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str39.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d40 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str41.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str44.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str45.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str48.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie58);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test130"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
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
    java.lang.String str17 = rentalStatement3.getName();
    double d18 = rentalStatement3.getAmountOwed();
    java.lang.String str19 = rentalStatement3.getName();
    nul.study.videostore.Customer customer21 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str22 = customer21.statement();
    java.lang.String str23 = customer21.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, 0);
    int i28 = rental27.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie29 = rental27.getMovie();
    customer21.addRental(rental27);
    rentalStatement3.addRental(rental27);
    rentalStatement1.addRental(rental27);
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str22.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str23.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test131"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\thi!\t300.0\nYou owed 300.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test132"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\nYou owed 27.0\nYou earned 4 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test133"); }


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
    double d14 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement16 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie18 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie18, 0);
    int i21 = rental20.determineFrequentRenterPoints();
    rentalStatement16.addRental(rental20);
    int i23 = rental20.determineFrequentRenterPoints();
    int i24 = rental20.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental20);
    int i26 = rental20.determineFrequentRenterPoints();
    double d27 = rental20.determineAmount();
    
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
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 0.0d);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test134"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\nYou owed 27.0\nYou earned 4 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    regularMovie1.setPriceCode(100);
    double d6 = regularMovie1.determineAmount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\nYou owed 27.0\nYou earned 4 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\n\thi!\t-3.0\nYou owed 27.0\nYou earned 4 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 144.5d);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test135"); }


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
    java.lang.String str25 = rentalStatement1.makeRentalStatement();
    double d26 = rentalStatement1.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie28 = new nul.study.videostore.NewReleaseMovie("");
    int i29 = newReleaseMovie28.getPriceCode();
    int i31 = newReleaseMovie28.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental33 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie28, (-1));
    rentalStatement1.addRental(rental33);
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str25.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test136"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.ChildrensMovie childrensMovie4 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i6 = childrensMovie4.determineFrequentRenterPoints((-1));
    int i8 = childrensMovie4.determineFrequentRenterPoints((-1));
    int i10 = childrensMovie4.determineFrequentRenterPoints(100);
    int i12 = childrensMovie4.determineFrequentRenterPoints((int)(short)-1);
    int i14 = childrensMovie4.determineFrequentRenterPoints(0);
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie4, 10);
    rentalStatement1.addRental(rental16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test137"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)' ');
    int i9 = regularMovie1.determineFrequentRenterPoints((int)(short)0);
    regularMovie1.setPriceCode(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test138"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount((int)'a');
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    double d8 = newReleaseMovie1.determineAmount((int)(short)0);
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test139"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 4 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(2);
    java.lang.String str4 = childrensMovie1.getTitle();
    double d6 = childrensMovie1.determineAmount(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 4 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 4 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 147.0d);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test140"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n");
    nul.study.videostore.Customer customer3 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str4 = customer3.statement();
    java.lang.String str5 = customer3.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie11 = rental9.getMovie();
    customer3.addRental(rental9);
    int i13 = rental9.getDaysRented();
    int i14 = rental9.getDaysRented();
    customer1.addRental(rental9);
    java.lang.String str16 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n"+ "'", str16.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test141"); }


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
    nul.study.videostore.Customer customer23 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie25 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie25, 0);
    int i28 = rental27.determineFrequentRenterPoints();
    customer23.addRental(rental27);
    int i30 = rental27.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie31 = rental27.getMovie();
    int i32 = rental27.determineFrequentRenterPoints();
    double d33 = rental27.determineAmount();
    rentalStatement1.addRental(rental27);
    int i35 = rentalStatement1.getFrequentRenterPoints();
    int i36 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str37 = rentalStatement1.makeRentalStatement();
    
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
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Rental Record for \n\t\t0.0\n\thi!\t300.0\n\t\t0.0\nYou owed 300.0\nYou earned 4 frequent renter points\n"+ "'", str37.equals("Rental Record for \n\t\t0.0\n\thi!\t300.0\n\t\t0.0\nYou owed 300.0\nYou earned 4 frequent renter points\n"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test142"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie26 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    int i28 = newReleaseMovie26.determineFrequentRenterPoints(35);
    nul.study.videostore.Rental rental30 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, 0);
    rentalStatement1.addRental(rental30);
    int i32 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer34 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie36 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental38 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie36, 0);
    int i39 = rental38.determineFrequentRenterPoints();
    customer34.addRental(rental38);
    java.lang.String str41 = customer34.getName();
    nul.study.videostore.Rental rental42 = null;
    customer34.addRental(rental42);
    nul.study.videostore.NewReleaseMovie newReleaseMovie45 = new nul.study.videostore.NewReleaseMovie("");
    int i46 = newReleaseMovie45.getPriceCode();
    int i48 = newReleaseMovie45.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental50 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie45, (-1));
    nul.study.videostore.Rental rental52 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie45, (int)(short)0);
    customer34.addRental(rental52);
    double d54 = rental52.determineAmount();
    rentalStatement1.addRental(rental52);
    java.lang.String str56 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue(i28 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str56.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test143"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n"+ "'", str2.equals("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test144"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    double d6 = regularMovie1.determineAmount(0);
    int i8 = regularMovie1.determineFrequentRenterPoints((int)'#');
    regularMovie1.setPriceCode(100);
    
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
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test145"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)10);
    double d4 = rental3.determineAmount();
    double d5 = rental3.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 14.0d);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test146"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    double d6 = newReleaseMovie1.determineAmount((int)(byte)-1);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)1);
    double d10 = newReleaseMovie1.determineAmount((int)(byte)1);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints(35);
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)1);
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test147"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount((int)(short)100);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test148"); }


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
    java.lang.String str20 = customer1.statement();
    java.lang.String str21 = customer1.statement();
    nul.study.videostore.Customer customer23 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement25 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 0);
    int i30 = rental29.determineFrequentRenterPoints();
    rentalStatement25.addRental(rental29);
    int i32 = rental29.determineFrequentRenterPoints();
    int i33 = rental29.determineFrequentRenterPoints();
    customer23.addRental(rental29);
    nul.study.videostore.NewReleaseMovie newReleaseMovie36 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i37 = newReleaseMovie36.getPriceCode();
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie36, 0);
    int i40 = newReleaseMovie36.getPriceCode();
    int i42 = newReleaseMovie36.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental44 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie36, (int)(short)10);
    customer23.addRental(rental44);
    int i46 = rental44.getDaysRented();
    int i47 = rental44.determineFrequentRenterPoints();
    customer1.addRental(rental44);
    java.lang.String str49 = customer1.getName();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str21.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test149"); }


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
    int i16 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str17 = rentalStatement1.getName();
    java.lang.String str18 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str18.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test150"); }


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
    double d64 = rentalStatement1.getAmountOwed();
    java.lang.String str65 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue(d64 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str65 + "' != '" + ""+ "'", str65.equals(""));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test151"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)10);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    double d8 = regularMovie1.determineAmount((int)'a');
    double d10 = regularMovie1.determineAmount((int)' ');
    int i12 = regularMovie1.determineFrequentRenterPoints((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 144.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 47.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test152"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i21 = newReleaseMovie20.getPriceCode();
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, 0);
    int i24 = rental23.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie25 = rental23.getMovie();
    double d26 = rental23.determineAmount();
    customer1.addRental(rental23);
    java.lang.String str28 = customer1.statement();
    
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
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str28.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test153"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(short)0);
    double d5 = childrensMovie1.determineAmount(35);
    int i6 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 49.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test154"); }


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
    java.lang.String str16 = rentalStatement1.getName();
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
    double d31 = rental25.determineAmount();
    double d32 = rental25.determineAmount();
    nul.study.videostore.Movie movie33 = rental25.getMovie();
    rentalStatement1.addRental(rental25);
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d32 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie33);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test155"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    int i5 = regularMovie1.determineFrequentRenterPoints(35);
    int i6 = regularMovie1.getPriceCode();
    int i8 = regularMovie1.determineFrequentRenterPoints((int)'a');
    double d10 = regularMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 2.0d);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test156"); }


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
    double d22 = rentalStatement1.getAmountOwed();
    nul.study.videostore.Rental rental23 = null;
    rentalStatement1.addRental(rental23);
    int i25 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test157"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    int i10 = regularMovie1.getPriceCode();
    double d12 = regularMovie1.determineAmount((int)(byte)10);
    double d14 = regularMovie1.determineAmount((int)(short)10);
    int i16 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    double d18 = regularMovie1.determineAmount((-1));
    
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
    org.junit.Assert.assertTrue(d18 == 2.0d);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test158"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i5 = regularMovie1.getPriceCode();
    double d7 = regularMovie1.determineAmount((int)(short)100);
    int i9 = regularMovie1.determineFrequentRenterPoints(35);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(byte)100);
    regularMovie1.setPriceCode((int)(byte)-1);
    double d15 = regularMovie1.determineAmount((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 14.0d);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test159"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    int i8 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    regularMovie1.setPriceCode((int)'a');
    java.lang.String str11 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 1);
    int i15 = regularMovie1.determineFrequentRenterPoints((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test160"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str4 = rentalStatement3.getName();
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("");
    java.lang.String str7 = rentalStatement6.makeRentalStatement();
    double d8 = rentalStatement6.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i11 = newReleaseMovie10.getPriceCode();
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 1);
    int i14 = rental13.getDaysRented();
    int i15 = rental13.getDaysRented();
    rentalStatement6.addRental(rental13);
    rentalStatement3.addRental(rental13);
    customer1.addRental(rental13);
    java.lang.String str19 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement21 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d22 = rentalStatement21.getAmountOwed();
    int i23 = rentalStatement21.getFrequentRenterPoints();
    int i24 = rentalStatement21.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie26 = new nul.study.videostore.NewReleaseMovie("");
    int i27 = newReleaseMovie26.getPriceCode();
    double d29 = newReleaseMovie26.determineAmount((int)'a');
    int i31 = newReleaseMovie26.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental33 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie26, (int)(byte)0);
    rentalStatement21.addRental(rental33);
    java.lang.String str35 = rentalStatement21.getName();
    nul.study.videostore.Customer customer37 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie39 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental41 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie39, 0);
    int i42 = rental41.determineFrequentRenterPoints();
    customer37.addRental(rental41);
    nul.study.videostore.NewReleaseMovie newReleaseMovie45 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i46 = newReleaseMovie45.getPriceCode();
    nul.study.videostore.Rental rental48 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie45, 1);
    int i49 = rental48.getDaysRented();
    customer37.addRental(rental48);
    nul.study.videostore.Rental rental51 = null;
    customer37.addRental(rental51);
    nul.study.videostore.Customer customer54 = new nul.study.videostore.Customer("hi!");
    java.lang.String str55 = customer54.getName();
    java.lang.String str56 = customer54.getName();
    nul.study.videostore.RentalStatement rentalStatement58 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie60 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental62 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie60, 0);
    int i63 = rental62.determineFrequentRenterPoints();
    rentalStatement58.addRental(rental62);
    customer54.addRental(rental62);
    java.lang.String str66 = customer54.statement();
    java.lang.String str67 = customer54.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie69 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental71 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie69, 0);
    int i72 = rental71.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie73 = rental71.getMovie();
    nul.study.videostore.Movie movie74 = rental71.getMovie();
    double d75 = rental71.determineAmount();
    customer54.addRental(rental71);
    double d77 = rental71.determineAmount();
    int i78 = rental71.getDaysRented();
    customer37.addRental(rental71);
    rentalStatement21.addRental(rental71);
    customer1.addRental(rental71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str19.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str35.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "hi!"+ "'", str55.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!"+ "'", str56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str66 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str66.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str67.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d75 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d77 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i78 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test161"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test162"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(short)1);
    int i5 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test163"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(10);
    double d5 = childrensMovie1.determineAmount((int)(short)1);
    java.lang.String str6 = childrensMovie1.getTitle();
    java.lang.String str7 = childrensMovie1.getTitle();
    childrensMovie1.setPriceCode((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test164"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    java.lang.String str5 = rentalStatement1.getName();
    double d6 = rentalStatement1.getAmountOwed();
    java.lang.String str7 = rentalStatement1.getName();
    nul.study.videostore.Customer customer9 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie11 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental13 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie11, 0);
    int i14 = rental13.determineFrequentRenterPoints();
    customer9.addRental(rental13);
    nul.study.videostore.Customer customer17 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 0);
    int i22 = rental21.determineFrequentRenterPoints();
    customer17.addRental(rental21);
    int i24 = rental21.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie25 = rental21.getMovie();
    int i26 = rental21.determineFrequentRenterPoints();
    customer9.addRental(rental21);
    nul.study.videostore.Customer customer29 = new nul.study.videostore.Customer("hi!");
    java.lang.String str30 = customer29.getName();
    java.lang.String str31 = customer29.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie33 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental35 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie33, 0);
    int i36 = rental35.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie37 = rental35.getMovie();
    customer29.addRental(rental35);
    java.lang.String str39 = customer29.statement();
    java.lang.String str40 = customer29.getName();
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
    int i74 = rental68.getDaysRented();
    int i75 = rental68.getDaysRented();
    double d76 = rental68.determineAmount();
    customer29.addRental(rental68);
    customer9.addRental(rental68);
    rentalStatement1.addRental(rental68);
    java.lang.String str80 = rentalStatement1.getName();
    int i81 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + ""+ "'", str3.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "hi!"+ "'", str30.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "hi!"+ "'", str31.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str39.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
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
    org.junit.Assert.assertTrue(i74 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i75 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d76 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str80 + "' != '" + ""+ "'", str80.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i81 == 0);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test165"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    double d6 = newReleaseMovie1.determineAmount((int)(byte)-1);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)1);
    double d10 = newReleaseMovie1.determineAmount((int)(byte)1);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test166"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    childrensMovie1.setPriceCode((int)'4');
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(byte)10);
    double d9 = childrensMovie1.determineAmount((int)(short)0);
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test167"); }


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
    nul.study.videostore.Customer customer37 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie39 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i40 = newReleaseMovie39.getPriceCode();
    nul.study.videostore.Rental rental42 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie39, 0);
    customer37.addRental(rental42);
    double d44 = rental42.determineAmount();
    customer1.addRental(rental42);
    nul.study.videostore.RegularMovie regularMovie47 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str48 = regularMovie47.getTitle();
    double d50 = regularMovie47.determineAmount((int)(byte)-1);
    java.lang.String str51 = regularMovie47.getTitle();
    double d53 = regularMovie47.determineAmount(10);
    regularMovie47.setPriceCode(2);
    int i57 = regularMovie47.determineFrequentRenterPoints((int)(byte)-1);
    regularMovie47.setPriceCode((int)(byte)1);
    java.lang.String str60 = regularMovie47.getTitle();
    regularMovie47.setPriceCode((int)(byte)0);
    int i64 = regularMovie47.determineFrequentRenterPoints((int)'4');
    nul.study.videostore.Rental rental66 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie47, (int)(byte)1);
    customer1.addRental(rental66);
    java.lang.String str68 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie70 = new nul.study.videostore.NewReleaseMovie("");
    int i71 = newReleaseMovie70.getPriceCode();
    int i73 = newReleaseMovie70.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental75 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie70, (-1));
    customer1.addRental(rental75);
    java.lang.String str77 = customer1.getName();
    
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
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str48 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str48.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d50 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str51.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d53 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str60.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str68 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str68.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str77 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str77.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test168"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    java.lang.String str5 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)1);
    int i9 = regularMovie1.determineFrequentRenterPoints(0);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(short)0);
    int i13 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    double d15 = regularMovie1.determineAmount(1);
    int i17 = regularMovie1.determineFrequentRenterPoints(4);
    double d19 = regularMovie1.determineAmount((int)(byte)0);
    
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
    org.junit.Assert.assertTrue(d15 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d19 == 2.0d);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test169"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(2);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)(short)0);
    int i6 = childrensMovie1.getPriceCode();
    java.lang.String str7 = childrensMovie1.getTitle();
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str7.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test170"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)(short)1);
    int i5 = regularMovie1.determineFrequentRenterPoints((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test171"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    int i7 = childrensMovie1.determineFrequentRenterPoints(2);
    double d9 = childrensMovie1.determineAmount(0);
    double d11 = childrensMovie1.determineAmount(10);
    int i13 = childrensMovie1.determineFrequentRenterPoints(1);
    double d15 = childrensMovie1.determineAmount(100);
    int i17 = childrensMovie1.determineFrequentRenterPoints(1);
    
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
    org.junit.Assert.assertTrue(d15 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test172"); }


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
    int i13 = rental5.getDaysRented();
    
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
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test173"); }


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
    int i54 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str55 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue(i54 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + ""+ "'", str55.equals(""));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test174"); }


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
    double d24 = rentalStatement1.getAmountOwed();
    
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
    org.junit.Assert.assertTrue(d24 == 0.0d);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test175"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    double d7 = regularMovie1.determineAmount((int)(byte)0);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test176"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    customer1.addRental(rental9);
    int i13 = rental9.getDaysRented();
    int i14 = rental9.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test177"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i9 = regularMovie1.determineFrequentRenterPoints(10);
    regularMovie1.setPriceCode(0);
    double d13 = regularMovie1.determineAmount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 2.0d);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test178"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)10);
    regularMovie1.setPriceCode((int)' ');

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test179"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test180"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test181"); }


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
    double d24 = rentalStatement1.getAmountOwed();
    double d25 = rentalStatement1.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i28 = newReleaseMovie27.getPriceCode();
    double d30 = newReleaseMovie27.determineAmount(100);
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, (int)(byte)10);
    int i33 = rental32.getDaysRented();
    double d34 = rental32.determineAmount();
    int i35 = rental32.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental32);
    
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
    org.junit.Assert.assertTrue(d24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d30 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d34 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 2);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test182"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    double d3 = newReleaseMovie1.determineAmount(100);
    int i5 = newReleaseMovie1.determineFrequentRenterPoints(52);
    newReleaseMovie1.setPriceCode((int)'4');
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test183"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    double d3 = regularMovie1.determineAmount((int)(short)1);
    java.lang.String str4 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test184"); }


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
    java.lang.String str36 = customer1.statement();
    java.lang.String str37 = customer1.getName();
    java.lang.String str38 = customer1.statement();
    
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
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str36.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str37.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str38.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test185"); }


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
    double d14 = rental8.determineAmount();
    int i15 = rental8.getDaysRented();
    
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
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test186"); }


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
    java.lang.String str20 = rentalStatement1.makeRentalStatement();
    int i21 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str20.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test187"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str5 = customer4.statement();
    java.lang.String str6 = customer4.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i9 = newReleaseMovie8.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 1);
    int i12 = rental11.getDaysRented();
    int i13 = rental11.getDaysRented();
    double d14 = rental11.determineAmount();
    int i15 = rental11.getDaysRented();
    customer4.addRental(rental11);
    java.lang.String str17 = customer4.statement();
    java.lang.String str18 = customer4.getName();
    nul.study.videostore.RegularMovie regularMovie20 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str21 = regularMovie20.getTitle();
    double d23 = regularMovie20.determineAmount(10);
    int i25 = regularMovie20.determineFrequentRenterPoints((int)'a');
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie20, 1);
    int i28 = rental27.determineFrequentRenterPoints();
    customer4.addRental(rental27);
    nul.study.videostore.Customer customer31 = new nul.study.videostore.Customer("hi!");
    java.lang.String str32 = customer31.getName();
    java.lang.String str33 = customer31.getName();
    nul.study.videostore.RentalStatement rentalStatement35 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie37 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie37, 0);
    int i40 = rental39.determineFrequentRenterPoints();
    rentalStatement35.addRental(rental39);
    customer31.addRental(rental39);
    nul.study.videostore.NewReleaseMovie newReleaseMovie44 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i45 = newReleaseMovie44.getPriceCode();
    nul.study.videostore.Rental rental47 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie44, 1);
    int i48 = rental47.getDaysRented();
    customer31.addRental(rental47);
    java.lang.String str50 = customer31.getName();
    java.lang.String str51 = customer31.statement();
    nul.study.videostore.Customer customer53 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie55 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental57 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie55, 0);
    int i58 = rental57.determineFrequentRenterPoints();
    customer53.addRental(rental57);
    int i60 = rental57.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie61 = rental57.getMovie();
    customer31.addRental(rental57);
    int i63 = rental57.getDaysRented();
    int i64 = rental57.getDaysRented();
    double d65 = rental57.determineAmount();
    customer4.addRental(rental57);
    nul.study.videostore.Movie movie67 = rental57.getMovie();
    rentalStatement1.addRental(rental57);
    int i69 = rentalStatement1.getFrequentRenterPoints();
    int i70 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str18.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str21.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!"+ "'", str50.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str51.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d65 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test188"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    java.lang.String str4 = rentalStatement1.makeRentalStatement();
    java.lang.String str5 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test189"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints(2);
    childrensMovie1.setPriceCode((int)(short)10);
    int i7 = childrensMovie1.determineFrequentRenterPoints(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test190"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\thi!\t156.0\n\t\t0.0\nYou owed 156.0\nYou earned 4 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test191"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement4 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    int i11 = rental10.determineFrequentRenterPoints();
    rentalStatement6.addRental(rental10);
    java.lang.String str13 = rentalStatement6.makeRentalStatement();
    java.lang.String str14 = rentalStatement6.makeRentalStatement();
    double d15 = rentalStatement6.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i18 = newReleaseMovie17.getPriceCode();
    double d20 = newReleaseMovie17.determineAmount(100);
    double d22 = newReleaseMovie17.determineAmount((int)(byte)-1);
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, (int)(byte)100);
    double d25 = rental24.determineAmount();
    rentalStatement6.addRental(rental24);
    nul.study.videostore.Customer customer28 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie30 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie30, 0);
    int i33 = rental32.determineFrequentRenterPoints();
    customer28.addRental(rental32);
    int i35 = rental32.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie36 = rental32.getMovie();
    int i37 = rental32.determineFrequentRenterPoints();
    double d38 = rental32.determineAmount();
    rentalStatement6.addRental(rental32);
    rentalStatement4.addRental(rental32);
    int i41 = rental32.getDaysRented();
    int i42 = rental32.getDaysRented();
    nul.study.videostore.Movie movie43 = rental32.getMovie();
    customer1.addRental(rental32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d25 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d38 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie43);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test192"); }


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
    java.lang.String str17 = rentalStatement1.makeRentalStatement();
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
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test193"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints(1);
    java.lang.String str7 = newReleaseMovie1.getTitle();
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test194"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    childrensMovie1.setPriceCode((int)(byte)100);
    double d6 = childrensMovie1.determineAmount(100);
    int i8 = childrensMovie1.determineFrequentRenterPoints((int)(byte)1);
    double d10 = childrensMovie1.determineAmount(35);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, 35);
    int i13 = rental12.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 49.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 35);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test195"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    childrensMovie1.setPriceCode((-1));
    int i9 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    double d13 = childrensMovie1.determineAmount((int)(short)10);
    childrensMovie1.setPriceCode((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 12.0d);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test196"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t30.0\n\thi!\t3.0\nYou owed 33.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test197"); }


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
    double d28 = rental19.determineAmount();
    int i29 = rental19.getDaysRented();
    
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
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test198"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n");
    regularMovie1.setPriceCode((int)(byte)10);
    double d5 = regularMovie1.determineAmount(3);
    java.lang.String str6 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 3.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t-3.0\n\t\t0.0\nYou owed -3.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test199"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str4 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test200"); }


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
    int i18 = rentalStatement1.getFrequentRenterPoints();
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
    nul.study.videostore.Movie movie42 = rental35.getMovie();
    int i43 = rental35.getDaysRented();
    rentalStatement1.addRental(rental35);
    
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
    org.junit.Assert.assertTrue(i18 == 0);
    
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
    org.junit.Assert.assertNotNull(movie42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i43 == 0);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test201"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test202"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    double d8 = newReleaseMovie1.determineAmount(100);
    double d10 = newReleaseMovie1.determineAmount(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 9.0d);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test203"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.ChildrensMovie childrensMovie3 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i5 = childrensMovie3.determineFrequentRenterPoints((-1));
    int i7 = childrensMovie3.determineFrequentRenterPoints((-1));
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie3, 0);
    rentalStatement1.addRental(rental9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test204"); }


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
    double d24 = regularMovie1.determineAmount(100);
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(short)100);
    int i27 = regularMovie1.getPriceCode();
    int i29 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    
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
    org.junit.Assert.assertTrue(d24 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test205"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test206"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.getName();
    java.lang.String str6 = customer1.statement();
    nul.study.videostore.Customer customer8 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie10 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie10, 0);
    int i13 = rental12.determineFrequentRenterPoints();
    customer8.addRental(rental12);
    int i15 = rental12.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie16 = rental12.getMovie();
    int i17 = rental12.getDaysRented();
    int i18 = rental12.determineFrequentRenterPoints();
    int i19 = rental12.getDaysRented();
    customer1.addRental(rental12);
    java.lang.String str21 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement23 = new nul.study.videostore.RentalStatement("");
    int i24 = rentalStatement23.getFrequentRenterPoints();
    nul.study.videostore.Customer customer26 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie28 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental30 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie28, 0);
    int i31 = rental30.determineFrequentRenterPoints();
    customer26.addRental(rental30);
    int i33 = rental30.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie34 = rental30.getMovie();
    rentalStatement23.addRental(rental30);
    nul.study.videostore.NewReleaseMovie newReleaseMovie37 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie37, 0);
    int i40 = rental39.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie41 = rental39.getMovie();
    rentalStatement23.addRental(rental39);
    nul.study.videostore.Movie movie43 = rental39.getMovie();
    nul.study.videostore.Rental rental45 = new nul.study.videostore.Rental(movie43, (int)(short)100);
    nul.study.videostore.Rental rental47 = new nul.study.videostore.Rental(movie43, (int)(short)-1);
    customer1.addRental(rental47);
    java.lang.String str49 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!"+ "'", str2.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!"+ "'", str3.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!"+ "'", str4.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str21.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str49 + "' != '" + "hi!"+ "'", str49.equals("hi!"));

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test207"); }


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
    java.lang.String str25 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer27 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i30 = newReleaseMovie29.getPriceCode();
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, 0);
    customer27.addRental(rental32);
    java.lang.String str34 = customer27.statement();
    nul.study.videostore.RentalStatement rentalStatement36 = new nul.study.videostore.RentalStatement("");
    int i37 = rentalStatement36.getFrequentRenterPoints();
    java.lang.String str38 = rentalStatement36.getName();
    int i39 = rentalStatement36.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement41 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie43 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental45 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie43, 0);
    int i46 = rental45.determineFrequentRenterPoints();
    rentalStatement41.addRental(rental45);
    double d48 = rental45.determineAmount();
    rentalStatement36.addRental(rental45);
    int i50 = rental45.getDaysRented();
    customer27.addRental(rental45);
    rentalStatement1.addRental(rental45);
    java.lang.String str53 = rentalStatement1.getName();
    nul.study.videostore.RentalStatement rentalStatement55 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str56 = rentalStatement55.makeRentalStatement();
    int i57 = rentalStatement55.getFrequentRenterPoints();
    int i58 = rentalStatement55.getFrequentRenterPoints();
    int i59 = rentalStatement55.getFrequentRenterPoints();
    java.lang.String str60 = rentalStatement55.makeRentalStatement();
    java.lang.String str61 = rentalStatement55.getName();
    nul.study.videostore.Customer customer63 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement65 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie67 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental69 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie67, 0);
    int i70 = rental69.determineFrequentRenterPoints();
    rentalStatement65.addRental(rental69);
    int i72 = rental69.determineFrequentRenterPoints();
    int i73 = rental69.determineFrequentRenterPoints();
    customer63.addRental(rental69);
    nul.study.videostore.NewReleaseMovie newReleaseMovie76 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i77 = newReleaseMovie76.getPriceCode();
    nul.study.videostore.Rental rental79 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie76, 0);
    int i80 = newReleaseMovie76.getPriceCode();
    int i82 = newReleaseMovie76.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental84 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie76, (int)(short)10);
    customer63.addRental(rental84);
    int i86 = rental84.getDaysRented();
    int i87 = rental84.determineFrequentRenterPoints();
    int i88 = rental84.getDaysRented();
    rentalStatement55.addRental(rental84);
    rentalStatement1.addRental(rental84);
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str25.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str34.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + ""+ "'", str53.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str56.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str60.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str61.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i80 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i88 == 10);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test208"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 2.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test209"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    double d10 = newReleaseMovie1.determineAmount((int)(short)0);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    double d14 = newReleaseMovie1.determineAmount(0);
    int i15 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test210"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test211"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(1);
    newReleaseMovie1.setPriceCode(2);
    double d7 = newReleaseMovie1.determineAmount(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 9.0d);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test212"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.getName();
    double d5 = rentalStatement1.getAmountOwed();
    double d6 = rentalStatement1.getAmountOwed();
    java.lang.String str7 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str7.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test213"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints(10);
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 100);
    int i9 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)10);
    int i13 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test214"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    childrensMovie1.setPriceCode((-1));
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)0);
    int i10 = childrensMovie1.getPriceCode();
    int i12 = childrensMovie1.determineFrequentRenterPoints(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test215"); }


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
    double d20 = regularMovie1.determineAmount((int)(byte)100);
    regularMovie1.setPriceCode((int)'4');
    
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
    org.junit.Assert.assertTrue(d20 == 149.0d);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test216"); }


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
    java.lang.String str17 = rentalStatement1.makeRentalStatement();
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
    rentalStatement1.addRental(rental41);
    java.lang.String str47 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer49 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement51 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie53 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental55 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie53, 0);
    int i56 = rental55.determineFrequentRenterPoints();
    rentalStatement51.addRental(rental55);
    int i58 = rental55.determineFrequentRenterPoints();
    int i59 = rental55.determineFrequentRenterPoints();
    customer49.addRental(rental55);
    nul.study.videostore.NewReleaseMovie newReleaseMovie62 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i63 = newReleaseMovie62.getPriceCode();
    nul.study.videostore.Rental rental65 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie62, 0);
    int i66 = newReleaseMovie62.getPriceCode();
    int i68 = newReleaseMovie62.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental70 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie62, (int)(short)10);
    customer49.addRental(rental70);
    nul.study.videostore.RegularMovie regularMovie73 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str74 = regularMovie73.getTitle();
    double d76 = regularMovie73.determineAmount(10);
    int i77 = regularMovie73.getPriceCode();
    int i79 = regularMovie73.determineFrequentRenterPoints(0);
    double d81 = regularMovie73.determineAmount((int)(short)100);
    double d83 = regularMovie73.determineAmount((-1));
    nul.study.videostore.Rental rental85 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie73, (int)(short)100);
    int i86 = rental85.getDaysRented();
    double d87 = rental85.determineAmount();
    customer49.addRental(rental85);
    rentalStatement1.addRental(rental85);
    
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
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str17.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
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
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str47.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str74.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d76 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d81 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d83 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i86 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d87 == 149.0d);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test217"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\n\thi!\t0.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\n\t\t-3.0\nYou owed 2.0\nYou earned 5 frequent renter points\n");

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test218"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    double d5 = childrensMovie1.determineAmount((int)'4');
    int i7 = childrensMovie1.determineFrequentRenterPoints((int)(byte)1);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test219"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(1);
    double d5 = regularMovie1.determineAmount((int)(byte)100);
    int i6 = regularMovie1.getPriceCode();
    double d8 = regularMovie1.determineAmount((-1));
    int i10 = regularMovie1.determineFrequentRenterPoints(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test220"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\n\thi!\t30.0\nYou owed 30.0\nYou earned 4 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test221"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    double d5 = childrensMovie1.determineAmount((int)'4');
    int i7 = childrensMovie1.determineFrequentRenterPoints((int)(byte)1);
    int i9 = childrensMovie1.determineFrequentRenterPoints(100);
    double d11 = childrensMovie1.determineAmount(100);
    int i13 = childrensMovie1.determineFrequentRenterPoints(0);
    double d15 = childrensMovie1.determineAmount(52);
    double d17 = childrensMovie1.determineAmount((int)'4');
    int i19 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i21 = childrensMovie1.determineFrequentRenterPoints((int)(short)-1);
    
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
    org.junit.Assert.assertTrue(d15 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 75.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test222"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test223"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = regularMovie1.getPriceCode();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test224"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    java.lang.String str9 = newReleaseMovie1.getTitle();
    java.lang.String str10 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + ""+ "'", str10.equals(""));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test225"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t300.0\nYou owed 300.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test226"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    int i9 = rentalStatement1.getFrequentRenterPoints();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str11 = rentalStatement1.getName();
    java.lang.String str12 = rentalStatement1.makeRentalStatement();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str12.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test227"); }


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
    nul.study.videostore.Customer customer15 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str16 = customer15.statement();
    java.lang.String str17 = customer15.getName();
    java.lang.String str18 = customer15.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i21 = newReleaseMovie20.getPriceCode();
    double d23 = newReleaseMovie20.determineAmount(100);
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, (int)(byte)10);
    int i26 = rental25.getDaysRented();
    double d27 = rental25.determineAmount();
    customer15.addRental(rental25);
    double d29 = rental25.determineAmount();
    rentalStatement1.addRental(rental25);
    int i31 = rentalStatement1.getFrequentRenterPoints();
    int i32 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str33 = rentalStatement1.getName();
    java.lang.String str34 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str16.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str17.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str18.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + ""+ "'", str33.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + ""+ "'", str34.equals(""));

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test228"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    double d5 = newReleaseMovie1.determineAmount((int)' ');
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)1);
    int i11 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 96.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test229"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)1);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)'4');
    int i7 = childrensMovie1.determineFrequentRenterPoints(1);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)(short)10);
    java.lang.String str10 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str10.equals("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test230"); }


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
    int i28 = rentalStatement1.getFrequentRenterPoints();
    double d29 = rentalStatement1.getAmountOwed();
    double d30 = rentalStatement1.getAmountOwed();
    
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
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d30 == 0.0d);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test231"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(100);
    double d5 = newReleaseMovie1.determineAmount((int)(short)100);
    double d7 = newReleaseMovie1.determineAmount((int)'a');
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test232"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    java.lang.String str5 = regularMovie1.getTitle();
    double d7 = regularMovie1.determineAmount(10);
    regularMovie1.setPriceCode(2);
    java.lang.String str10 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, (int)(byte)0);
    java.lang.String str13 = regularMovie1.getTitle();
    int i14 = regularMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str10.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str13.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test233"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i7 = childrensMovie1.determineFrequentRenterPoints((int)(short)1);
    childrensMovie1.setPriceCode(52);
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(short)10);
    java.lang.String str12 = childrensMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str12.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test234"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount(1);
    newReleaseMovie1.setPriceCode(2);
    double d7 = newReleaseMovie1.determineAmount((int)(short)100);
    java.lang.String str8 = newReleaseMovie1.getTitle();
    java.lang.String str9 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test235"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    java.lang.String str4 = childrensMovie1.getTitle();
    int i5 = childrensMovie1.getPriceCode();
    double d7 = childrensMovie1.determineAmount((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 49.5d);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test236"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.getName();
    java.lang.String str6 = customer1.getName();
    java.lang.String str7 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str7.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test237"); }


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
    double d28 = rentalStatement1.getAmountOwed();
    java.lang.String str29 = rentalStatement1.getName();
    java.lang.String str30 = rentalStatement1.getName();
    java.lang.String str31 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str29.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str30.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str31.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test238"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    newReleaseMovie1.setPriceCode((int)(byte)10);
    double d5 = newReleaseMovie1.determineAmount((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 291.0d);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test239"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 4 frequent renter points\n");

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test240"); }


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
    nul.study.videostore.Customer customer37 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie39 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i40 = newReleaseMovie39.getPriceCode();
    nul.study.videostore.Rental rental42 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie39, 0);
    customer37.addRental(rental42);
    double d44 = rental42.determineAmount();
    customer1.addRental(rental42);
    nul.study.videostore.Customer customer47 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement49 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str50 = rentalStatement49.getName();
    nul.study.videostore.RentalStatement rentalStatement52 = new nul.study.videostore.RentalStatement("");
    java.lang.String str53 = rentalStatement52.makeRentalStatement();
    double d54 = rentalStatement52.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie56 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i57 = newReleaseMovie56.getPriceCode();
    nul.study.videostore.Rental rental59 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie56, 1);
    int i60 = rental59.getDaysRented();
    int i61 = rental59.getDaysRented();
    rentalStatement52.addRental(rental59);
    rentalStatement49.addRental(rental59);
    customer47.addRental(rental59);
    nul.study.videostore.Movie movie65 = rental59.getMovie();
    customer1.addRental(rental59);
    
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
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str50.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str53.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie65);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test241"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test242"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    regularMovie1.setPriceCode((int)(byte)10);
    java.lang.String str9 = regularMovie1.getTitle();
    java.lang.String str10 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 1);
    nul.study.videostore.Movie movie13 = rental12.getMovie();
    nul.study.videostore.Rental rental15 = new nul.study.videostore.Rental(movie13, 97);
    
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
    org.junit.Assert.assertNotNull(movie13);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test243"); }


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
    nul.study.videostore.Movie movie16 = rental9.getMovie();
    movie16.setPriceCode((int)(byte)-1);
    
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
    org.junit.Assert.assertNotNull(movie16);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test244"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test245"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    double d3 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\n\thi!\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 0.0d);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test246"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie64 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i65 = newReleaseMovie64.getPriceCode();
    double d67 = newReleaseMovie64.determineAmount(100);
    nul.study.videostore.Rental rental69 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie64, (int)(byte)10);
    int i71 = newReleaseMovie64.determineFrequentRenterPoints(0);
    int i72 = newReleaseMovie64.getPriceCode();
    nul.study.videostore.Rental rental74 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie64, 10);
    double d75 = rental74.determineAmount();
    double d76 = rental74.determineAmount();
    customer1.addRental(rental74);
    
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
    org.junit.Assert.assertTrue(i65 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d67 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d75 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d76 == 30.0d);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test247"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for Rental Record for hi!\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)'#');
    double d5 = newReleaseMovie1.determineAmount((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test248"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    java.lang.String str4 = regularMovie1.getTitle();
    regularMovie1.setPriceCode((int)' ');
    int i8 = regularMovie1.determineFrequentRenterPoints(2);
    regularMovie1.setPriceCode((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test249"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test250"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount((int)(byte)100);
    childrensMovie1.setPriceCode((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 147.0d);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test251"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.statement();
    java.lang.String str5 = customer1.getName();
    nul.study.videostore.Customer customer7 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie9 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie9, 0);
    int i12 = rental11.determineFrequentRenterPoints();
    customer7.addRental(rental11);
    nul.study.videostore.Customer customer15 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie17 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie17, 0);
    int i20 = rental19.determineFrequentRenterPoints();
    customer15.addRental(rental19);
    int i22 = rental19.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie23 = rental19.getMovie();
    int i24 = rental19.determineFrequentRenterPoints();
    customer7.addRental(rental19);
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 0);
    int i30 = rental29.determineFrequentRenterPoints();
    double d31 = rental29.determineAmount();
    customer7.addRental(rental29);
    int i33 = rental29.getDaysRented();
    customer1.addRental(rental29);
    double d35 = rental29.determineAmount();
    int i36 = rental29.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!"+ "'", str5.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d31 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == 1);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test252"); }


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
    nul.study.videostore.RegularMovie regularMovie17 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str18 = regularMovie17.getTitle();
    double d20 = regularMovie17.determineAmount(10);
    int i22 = regularMovie17.determineFrequentRenterPoints((int)'a');
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie17, 1);
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie17, (int)(byte)-1);
    double d27 = rental26.determineAmount();
    double d28 = rental26.determineAmount();
    rentalStatement1.addRental(rental26);
    double d30 = rentalStatement1.getAmountOwed();
    int i31 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str18.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d20 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test253"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    newReleaseMovie1.setPriceCode((-1));
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)' ');
    java.lang.String str6 = newReleaseMovie1.getTitle();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test254"); }


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
    nul.study.videostore.Customer customer15 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str16 = customer15.statement();
    java.lang.String str17 = customer15.getName();
    java.lang.String str18 = customer15.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i21 = newReleaseMovie20.getPriceCode();
    double d23 = newReleaseMovie20.determineAmount(100);
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, (int)(byte)10);
    int i26 = rental25.getDaysRented();
    double d27 = rental25.determineAmount();
    customer15.addRental(rental25);
    double d29 = rental25.determineAmount();
    rentalStatement1.addRental(rental25);
    int i31 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer33 = new nul.study.videostore.Customer("hi!");
    java.lang.String str34 = customer33.getName();
    java.lang.String str35 = customer33.getName();
    java.lang.String str36 = customer33.getName();
    java.lang.String str37 = customer33.getName();
    java.lang.String str38 = customer33.statement();
    nul.study.videostore.Customer customer40 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie42 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental44 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie42, 0);
    int i45 = rental44.determineFrequentRenterPoints();
    customer40.addRental(rental44);
    int i47 = rental44.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie48 = rental44.getMovie();
    int i49 = rental44.getDaysRented();
    int i50 = rental44.determineFrequentRenterPoints();
    int i51 = rental44.getDaysRented();
    customer33.addRental(rental44);
    int i53 = rental44.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental44);
    java.lang.String str55 = rentalStatement1.makeRentalStatement();
    java.lang.String str56 = rentalStatement1.makeRentalStatement();
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str16.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str17.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str18.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d23 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d29 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!"+ "'", str34.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "hi!"+ "'", str35.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "hi!"+ "'", str36.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "hi!"+ "'", str37.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str38.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i45 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str55 + "' != '" + "Rental Record for \n\t\t0.0\n\thi!\t30.0\n\t\t0.0\nYou owed 30.0\nYou earned 4 frequent renter points\n"+ "'", str55.equals("Rental Record for \n\t\t0.0\n\thi!\t30.0\n\t\t0.0\nYou owed 30.0\nYou earned 4 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "Rental Record for \n\t\t0.0\n\thi!\t30.0\n\t\t0.0\nYou owed 30.0\nYou earned 4 frequent renter points\n"+ "'", str56.equals("Rental Record for \n\t\t0.0\n\thi!\t30.0\n\t\t0.0\nYou owed 30.0\nYou earned 4 frequent renter points\n"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test255"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.getName();
    int i10 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str11 = rentalStatement1.makeRentalStatement();
    java.lang.String str12 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + ""+ "'", str9.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str11.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test256"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(10);
    java.lang.String str4 = childrensMovie1.getTitle();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)0);
    int i8 = childrensMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i10 = childrensMovie1.determineFrequentRenterPoints(10);
    childrensMovie1.setPriceCode((int)'a');
    int i14 = childrensMovie1.determineFrequentRenterPoints((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test257"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i5 = newReleaseMovie1.getPriceCode();
    newReleaseMovie1.setPriceCode((int)(short)100);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)1);
    int i13 = newReleaseMovie1.determineFrequentRenterPoints(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test258"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    double d7 = childrensMovie1.determineAmount((int)(short)1);
    java.lang.String str8 = childrensMovie1.getTitle();
    double d10 = childrensMovie1.determineAmount(52);
    int i12 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    nul.study.videostore.Rental rental14 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, 1);
    double d16 = childrensMovie1.determineAmount(97);
    double d18 = childrensMovie1.determineAmount((int)'#');
    
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
    org.junit.Assert.assertTrue(d16 == 142.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 49.5d);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test259"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    java.lang.String str6 = childrensMovie1.getTitle();
    int i7 = childrensMovie1.getPriceCode();
    childrensMovie1.setPriceCode(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test260"); }


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
    int i28 = rentalStatement1.getFrequentRenterPoints();
    int i29 = rentalStatement1.getFrequentRenterPoints();
    double d30 = rentalStatement1.getAmountOwed();
    
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
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d30 == 0.0d);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test261"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(2);
    int i5 = childrensMovie1.determineFrequentRenterPoints((int)(short)0);
    int i6 = childrensMovie1.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(byte)0);
    nul.study.videostore.Movie movie9 = rental8.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test262"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    regularMovie1.setPriceCode((int)(byte)10);
    java.lang.String str9 = regularMovie1.getTitle();
    java.lang.String str10 = regularMovie1.getTitle();
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 1);
    int i14 = regularMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i15 = regularMovie1.getPriceCode();
    
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
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 10);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test263"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(10);
    double d5 = childrensMovie1.determineAmount((int)(byte)-1);
    int i7 = childrensMovie1.determineFrequentRenterPoints(35);
    int i9 = childrensMovie1.determineFrequentRenterPoints((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test264"); }


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
    nul.study.videostore.RentalStatement rentalStatement16 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d17 = rentalStatement16.getAmountOwed();
    java.lang.String str18 = rentalStatement16.getName();
    nul.study.videostore.Customer customer20 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie22 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, 0);
    int i25 = rental24.determineFrequentRenterPoints();
    customer20.addRental(rental24);
    int i27 = rental24.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie28 = rental24.getMovie();
    int i29 = rental24.getDaysRented();
    rentalStatement16.addRental(rental24);
    int i31 = rental24.determineFrequentRenterPoints();
    customer1.addRental(rental24);
    
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
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str18.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test265"); }


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
    nul.study.videostore.RentalStatement rentalStatement27 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("");
    int i30 = newReleaseMovie29.getPriceCode();
    int i32 = newReleaseMovie29.determineFrequentRenterPoints((int)(short)-1);
    int i34 = newReleaseMovie29.determineFrequentRenterPoints((int)(short)10);
    nul.study.videostore.Rental rental36 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, (int)(short)100);
    int i37 = rental36.determineFrequentRenterPoints();
    rentalStatement27.addRental(rental36);
    customer1.addRental(rental36);
    nul.study.videostore.RentalStatement rentalStatement41 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\thi!\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement43 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i44 = rentalStatement43.getFrequentRenterPoints();
    nul.study.videostore.Customer customer46 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie48 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental50 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie48, 0);
    int i51 = rental50.determineFrequentRenterPoints();
    customer46.addRental(rental50);
    java.lang.String str53 = customer46.statement();
    nul.study.videostore.RegularMovie regularMovie55 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str56 = regularMovie55.getTitle();
    double d58 = regularMovie55.determineAmount((int)(byte)-1);
    java.lang.String str59 = regularMovie55.getTitle();
    nul.study.videostore.Rental rental61 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie55, (int)(byte)1);
    customer46.addRental(rental61);
    double d63 = rental61.determineAmount();
    double d64 = rental61.determineAmount();
    rentalStatement43.addRental(rental61);
    double d66 = rental61.determineAmount();
    rentalStatement41.addRental(rental61);
    int i68 = rental61.determineFrequentRenterPoints();
    double d69 = rental61.determineAmount();
    customer1.addRental(rental61);
    nul.study.videostore.Movie movie71 = rental61.getMovie();
    
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
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str53.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str56.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d58 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str59.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d63 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d64 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d66 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d69 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie71);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test266"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.getName();
    double d4 = rentalStatement1.getAmountOwed();
    double d5 = rentalStatement1.getAmountOwed();
    int i6 = rentalStatement1.getFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test267"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    int i5 = regularMovie1.determineFrequentRenterPoints((int)(byte)100);
    double d7 = regularMovie1.determineAmount(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 2.0d);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test268"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    double d10 = newReleaseMovie1.determineAmount((int)(short)0);
    double d12 = newReleaseMovie1.determineAmount((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 0.0d);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test269"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(short)0);
    int i9 = rental8.getDaysRented();
    nul.study.videostore.Movie movie10 = rental8.getMovie();
    nul.study.videostore.Movie movie11 = rental8.getMovie();
    nul.study.videostore.Movie movie12 = rental8.getMovie();
    double d13 = rental8.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test270"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    int i8 = rental5.determineFrequentRenterPoints();
    int i9 = rental5.determineFrequentRenterPoints();
    double d10 = rental5.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test271"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    int i4 = childrensMovie1.determineFrequentRenterPoints(10);
    double d6 = childrensMovie1.determineAmount((int)(byte)-1);
    double d8 = childrensMovie1.determineAmount(0);
    int i10 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    java.lang.String str11 = childrensMovie1.getTitle();
    int i13 = childrensMovie1.determineFrequentRenterPoints(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test272"); }


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
    java.lang.String str25 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.Customer customer27 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i30 = newReleaseMovie29.getPriceCode();
    nul.study.videostore.Rental rental32 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, 0);
    customer27.addRental(rental32);
    java.lang.String str34 = customer27.statement();
    nul.study.videostore.RentalStatement rentalStatement36 = new nul.study.videostore.RentalStatement("");
    int i37 = rentalStatement36.getFrequentRenterPoints();
    java.lang.String str38 = rentalStatement36.getName();
    int i39 = rentalStatement36.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement41 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie43 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental45 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie43, 0);
    int i46 = rental45.determineFrequentRenterPoints();
    rentalStatement41.addRental(rental45);
    double d48 = rental45.determineAmount();
    rentalStatement36.addRental(rental45);
    int i50 = rental45.getDaysRented();
    customer27.addRental(rental45);
    rentalStatement1.addRental(rental45);
    double d53 = rentalStatement1.getAmountOwed();
    int i54 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str25.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str34.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + ""+ "'", str38.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d48 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i50 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d53 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 2);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test273"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\t\t0.0\n\t\t0.0\n\t\t0.0\nYou owed 3.0\nYou earned 4 frequent renter points\n");

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test274"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    nul.study.videostore.Customer customer4 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i7 = newReleaseMovie6.getPriceCode();
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 0);
    customer4.addRental(rental9);
    double d11 = rental9.determineAmount();
    customer1.addRental(rental9);
    java.lang.String str13 = customer1.getName();
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("");
    java.lang.String str16 = rentalStatement15.makeRentalStatement();
    double d17 = rentalStatement15.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie19 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i20 = newReleaseMovie19.getPriceCode();
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie19, 1);
    int i23 = rental22.getDaysRented();
    int i24 = rental22.getDaysRented();
    rentalStatement15.addRental(rental22);
    int i26 = rentalStatement15.getFrequentRenterPoints();
    java.lang.String str27 = rentalStatement15.makeRentalStatement();
    nul.study.videostore.ChildrensMovie childrensMovie29 = new nul.study.videostore.ChildrensMovie("");
    int i31 = childrensMovie29.determineFrequentRenterPoints(1);
    childrensMovie29.setPriceCode((int)'4');
    double d35 = childrensMovie29.determineAmount(2);
    nul.study.videostore.Rental rental37 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie29, (int)'#');
    rentalStatement15.addRental(rental37);
    customer1.addRental(rental37);
    java.lang.String str40 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str13.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str16.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str27.equals("Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str40.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test275"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\thi!\t156.0\n\t\t0.0\nYou owed 156.0\nYou earned 4 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 75.0d);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test276"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(10);
    java.lang.String str4 = childrensMovie1.getTitle();
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)0);
    int i8 = childrensMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i10 = childrensMovie1.determineFrequentRenterPoints((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test277"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)100);
    double d8 = newReleaseMovie1.determineAmount(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 9.0d);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test278"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = childrensMovie1.getTitle();
    int i4 = childrensMovie1.determineFrequentRenterPoints((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test279"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    childrensMovie1.setPriceCode((int)'4');
    childrensMovie1.setPriceCode((int)'4');
    java.lang.String str8 = childrensMovie1.getTitle();
    int i10 = childrensMovie1.determineFrequentRenterPoints((int)(short)100);
    double d12 = childrensMovie1.determineAmount((int)(short)0);
    int i14 = childrensMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i15 = childrensMovie1.getPriceCode();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 52);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test280"); }


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
    double d18 = rental12.determineAmount();
    
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
    org.junit.Assert.assertTrue(d18 == 2.0d);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test281"); }


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
    nul.study.videostore.Customer customer27 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie29 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie29, 0);
    int i32 = rental31.determineFrequentRenterPoints();
    customer27.addRental(rental31);
    nul.study.videostore.Customer customer35 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie37 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie37, 0);
    int i40 = rental39.determineFrequentRenterPoints();
    customer35.addRental(rental39);
    int i42 = rental39.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie43 = rental39.getMovie();
    int i44 = rental39.determineFrequentRenterPoints();
    customer27.addRental(rental39);
    nul.study.videostore.RentalStatement rentalStatement47 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i48 = rentalStatement47.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie50 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i51 = newReleaseMovie50.getPriceCode();
    nul.study.videostore.Rental rental53 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie50, 1);
    int i54 = rental53.getDaysRented();
    int i55 = rental53.getDaysRented();
    double d56 = rental53.determineAmount();
    int i57 = rental53.getDaysRented();
    rentalStatement47.addRental(rental53);
    customer27.addRental(rental53);
    int i60 = rental53.determineFrequentRenterPoints();
    customer1.addRental(rental53);
    java.lang.String str62 = customer1.getName();
    
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
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d56 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str62 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str62.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test282"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i4 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie6 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i7 = newReleaseMovie6.getPriceCode();
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie6, 1);
    int i10 = rental9.getDaysRented();
    int i11 = rental9.getDaysRented();
    double d12 = rental9.determineAmount();
    int i13 = rental9.getDaysRented();
    rentalStatement3.addRental(rental9);
    int i15 = rentalStatement3.getFrequentRenterPoints();
    double d16 = rentalStatement3.getAmountOwed();
    int i17 = rentalStatement3.getFrequentRenterPoints();
    nul.study.videostore.Customer customer19 = new nul.study.videostore.Customer("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str20 = customer19.getName();
    nul.study.videostore.RegularMovie regularMovie22 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str23 = regularMovie22.getTitle();
    int i25 = regularMovie22.determineFrequentRenterPoints(1);
    nul.study.videostore.Rental rental27 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie22, 0);
    int i28 = rental27.determineFrequentRenterPoints();
    customer19.addRental(rental27);
    rentalStatement3.addRental(rental27);
    customer1.addRental(rental27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 3.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str23.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test283"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.RegularMovie regularMovie5 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str6 = regularMovie5.getTitle();
    int i8 = regularMovie5.determineFrequentRenterPoints((int)(short)100);
    int i10 = regularMovie5.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie5, (int)(byte)0);
    customer1.addRental(rental12);
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("");
    int i16 = rentalStatement15.getFrequentRenterPoints();
    java.lang.String str17 = rentalStatement15.getName();
    int i18 = rentalStatement15.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie20 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental22 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie20, 0);
    int i23 = rental22.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie24 = rental22.getMovie();
    nul.study.videostore.Movie movie25 = rental22.getMovie();
    rentalStatement15.addRental(rental22);
    int i27 = rentalStatement15.getFrequentRenterPoints();
    double d28 = rentalStatement15.getAmountOwed();
    java.lang.String str29 = rentalStatement15.makeRentalStatement();
    double d30 = rentalStatement15.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement32 = new nul.study.videostore.RentalStatement("");
    int i33 = rentalStatement32.getFrequentRenterPoints();
    nul.study.videostore.Customer customer35 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie37 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie37, 0);
    int i40 = rental39.determineFrequentRenterPoints();
    customer35.addRental(rental39);
    int i42 = rental39.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie43 = rental39.getMovie();
    rentalStatement32.addRental(rental39);
    rentalStatement15.addRental(rental39);
    double d46 = rentalStatement15.getAmountOwed();
    java.lang.String str47 = rentalStatement15.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement49 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer51 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str52 = customer51.getName();
    java.lang.String str53 = customer51.statement();
    nul.study.videostore.RegularMovie regularMovie55 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str56 = regularMovie55.getTitle();
    int i58 = regularMovie55.determineFrequentRenterPoints((int)(short)100);
    int i60 = regularMovie55.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental62 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie55, (int)(byte)0);
    customer51.addRental(rental62);
    int i64 = rental62.getDaysRented();
    nul.study.videostore.Movie movie65 = rental62.getMovie();
    rentalStatement49.addRental(rental62);
    rentalStatement15.addRental(rental62);
    nul.study.videostore.RentalStatement rentalStatement69 = new nul.study.videostore.RentalStatement("");
    int i70 = rentalStatement69.getFrequentRenterPoints();
    java.lang.String str71 = rentalStatement69.getName();
    int i72 = rentalStatement69.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie74 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental76 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie74, 0);
    int i77 = rental76.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie78 = rental76.getMovie();
    nul.study.videostore.Movie movie79 = rental76.getMovie();
    rentalStatement69.addRental(rental76);
    java.lang.String str81 = rentalStatement69.makeRentalStatement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie83 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental85 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie83, 0);
    rentalStatement69.addRental(rental85);
    int i87 = rental85.determineFrequentRenterPoints();
    double d88 = rental85.determineAmount();
    rentalStatement15.addRental(rental85);
    customer1.addRental(rental85);
    java.lang.String str91 = customer1.getName();
    
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
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d28 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str29.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d46 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str47.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str52.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str53.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str56.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i58 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + ""+ "'", str71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i77 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie78);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str81.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d88 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str91 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str91.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test284"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test285"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(10);
    java.lang.String str6 = regularMovie1.getTitle();
    java.lang.String str7 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + ""+ "'", str6.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test286"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.getName();
    java.lang.String str3 = customer1.getName();
    java.lang.String str4 = customer1.getName();
    java.lang.String str5 = customer1.statement();
    java.lang.String str6 = customer1.getName();
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
    int i21 = rentalStatement8.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement23 = new nul.study.videostore.RentalStatement("");
    int i24 = rentalStatement23.getFrequentRenterPoints();
    nul.study.videostore.Customer customer26 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie28 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental30 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie28, 0);
    int i31 = rental30.determineFrequentRenterPoints();
    customer26.addRental(rental30);
    int i33 = rental30.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie34 = rental30.getMovie();
    rentalStatement23.addRental(rental30);
    nul.study.videostore.NewReleaseMovie newReleaseMovie37 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie37, 0);
    int i40 = rental39.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie41 = rental39.getMovie();
    rentalStatement23.addRental(rental39);
    rentalStatement8.addRental(rental39);
    double d44 = rentalStatement8.getAmountOwed();
    java.lang.String str45 = rentalStatement8.makeRentalStatement();
    nul.study.videostore.Customer customer47 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement49 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str50 = rentalStatement49.getName();
    nul.study.videostore.RentalStatement rentalStatement52 = new nul.study.videostore.RentalStatement("");
    java.lang.String str53 = rentalStatement52.makeRentalStatement();
    double d54 = rentalStatement52.getAmountOwed();
    nul.study.videostore.NewReleaseMovie newReleaseMovie56 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i57 = newReleaseMovie56.getPriceCode();
    nul.study.videostore.Rental rental59 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie56, 1);
    int i60 = rental59.getDaysRented();
    int i61 = rental59.getDaysRented();
    rentalStatement52.addRental(rental59);
    rentalStatement49.addRental(rental59);
    customer47.addRental(rental59);
    rentalStatement8.addRental(rental59);
    int i66 = rental59.getDaysRented();
    customer1.addRental(rental59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
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
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d44 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str45.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str50 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str50.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str53 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str53.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d54 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i61 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 1);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test287"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i3 = newReleaseMovie1.determineFrequentRenterPoints(100);
    double d5 = newReleaseMovie1.determineAmount((-1));
    double d7 = newReleaseMovie1.determineAmount((int)(short)100);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints(10);
    double d11 = newReleaseMovie1.determineAmount((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 3.0d);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test288"); }


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
    java.lang.String str16 = rentalStatement1.getName();
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
    nul.study.videostore.NewReleaseMovie newReleaseMovie32 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental34 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie32, 0);
    int i35 = rental34.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie36 = rental34.getMovie();
    rentalStatement18.addRental(rental34);
    int i38 = rental34.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental34);
    nul.study.videostore.Movie movie40 = rental34.getMovie();
    movie40.setPriceCode(0);
    
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
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie40);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test289"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t30.0\nYou owed 30.0\nYou earned 2 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test290"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    double d11 = regularMovie1.determineAmount((int)(byte)1);
    int i12 = regularMovie1.getPriceCode();
    int i14 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    int i16 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    regularMovie1.setPriceCode((int)(byte)1);
    
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

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test291"); }


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
    int i17 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement19 = new nul.study.videostore.RentalStatement("");
    int i20 = rentalStatement19.getFrequentRenterPoints();
    nul.study.videostore.Customer customer22 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 0);
    int i27 = rental26.determineFrequentRenterPoints();
    customer22.addRental(rental26);
    int i29 = rental26.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie30 = rental26.getMovie();
    rentalStatement19.addRental(rental26);
    java.lang.String str32 = rentalStatement19.makeRentalStatement();
    nul.study.videostore.Customer customer34 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie36 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental38 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie36, 0);
    int i39 = rental38.determineFrequentRenterPoints();
    customer34.addRental(rental38);
    rentalStatement19.addRental(rental38);
    rentalStatement1.addRental(rental38);
    
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
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str32.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test292"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental5);
    java.lang.String str8 = rentalStatement1.makeRentalStatement();
    java.lang.String str9 = rentalStatement1.makeRentalStatement();
    double d10 = rentalStatement1.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement12 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d13 = rentalStatement12.getAmountOwed();
    java.lang.String str14 = rentalStatement12.getName();
    java.lang.String str15 = rentalStatement12.getName();
    double d16 = rentalStatement12.getAmountOwed();
    nul.study.videostore.RentalStatement rentalStatement18 = new nul.study.videostore.RentalStatement("");
    int i19 = rentalStatement18.getFrequentRenterPoints();
    java.lang.String str20 = rentalStatement18.getName();
    int i21 = rentalStatement18.getFrequentRenterPoints();
    nul.study.videostore.NewReleaseMovie newReleaseMovie23 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie23, 0);
    int i26 = rental25.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie27 = rental25.getMovie();
    nul.study.videostore.Movie movie28 = rental25.getMovie();
    rentalStatement18.addRental(rental25);
    rentalStatement12.addRental(rental25);
    nul.study.videostore.RegularMovie regularMovie32 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str33 = regularMovie32.getTitle();
    double d35 = regularMovie32.determineAmount((int)(byte)-1);
    java.lang.String str36 = regularMovie32.getTitle();
    double d38 = regularMovie32.determineAmount(10);
    regularMovie32.setPriceCode(2);
    int i42 = regularMovie32.determineFrequentRenterPoints((int)(byte)-1);
    regularMovie32.setPriceCode((int)(byte)1);
    java.lang.String str45 = regularMovie32.getTitle();
    regularMovie32.setPriceCode((int)(byte)0);
    nul.study.videostore.Rental rental49 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie32, 10);
    double d50 = rental49.determineAmount();
    int i51 = rental49.getDaysRented();
    int i52 = rental49.determineFrequentRenterPoints();
    rentalStatement12.addRental(rental49);
    rentalStatement1.addRental(rental49);
    double d55 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str9.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + ""+ "'", str20.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str33.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d35 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str36.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d38 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str45 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str45.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d50 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d55 == 0.0d);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test293"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    double d2 = rentalStatement1.getAmountOwed();
    java.lang.String str3 = rentalStatement1.getName();
    java.lang.String str4 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement6 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie8 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie8, 0);
    int i11 = rental10.determineFrequentRenterPoints();
    rentalStatement6.addRental(rental10);
    java.lang.String str13 = rentalStatement6.makeRentalStatement();
    java.lang.String str14 = rentalStatement6.makeRentalStatement();
    double d15 = rentalStatement6.getAmountOwed();
    java.lang.String str16 = rentalStatement6.makeRentalStatement();
    int i17 = rentalStatement6.getFrequentRenterPoints();
    java.lang.String str18 = rentalStatement6.getName();
    java.lang.String str19 = rentalStatement6.makeRentalStatement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie21 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i22 = newReleaseMovie21.getPriceCode();
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, 1);
    int i25 = newReleaseMovie21.getPriceCode();
    newReleaseMovie21.setPriceCode((int)(short)100);
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie21, (int)(short)0);
    double d30 = rental29.determineAmount();
    rentalStatement6.addRental(rental29);
    rentalStatement1.addRental(rental29);
    double d33 = rental29.determineAmount();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str14.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d15 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str16.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str19.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d30 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d33 == 0.0d);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test294"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t0.0\n\thi!\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test295"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\n\thi!\t156.0\n\t\t0.0\nYou owed 156.0\nYou earned 4 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test296"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'a');
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 1);
    int i9 = rental8.determineFrequentRenterPoints();
    int i10 = rental8.getDaysRented();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test297"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(1);
    double d5 = regularMovie1.determineAmount((int)(byte)100);
    regularMovie1.setPriceCode((int)'4');
    double d9 = regularMovie1.determineAmount((-1));
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i13 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i15 = regularMovie1.determineFrequentRenterPoints((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test298"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
    java.lang.String str3 = rentalStatement1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    nul.study.videostore.Rental rental8 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i10 = newReleaseMovie5.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, (int)(byte)-1);
    int i13 = rental12.getDaysRented();
    rentalStatement1.addRental(rental12);
    nul.study.videostore.Movie movie15 = rental12.getMovie();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie15);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test299"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie9 = rental7.getMovie();
    customer1.addRental(rental7);
    java.lang.String str11 = customer1.statement();
    java.lang.String str12 = customer1.statement();
    java.lang.String str13 = customer1.statement();
    java.lang.String str14 = customer1.getName();
    
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
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str12.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str14.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test300"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test301"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(10);
    java.lang.String str4 = childrensMovie1.getTitle();
    int i6 = childrensMovie1.determineFrequentRenterPoints(0);
    int i8 = childrensMovie1.determineFrequentRenterPoints((int)(short)10);
    int i10 = childrensMovie1.determineFrequentRenterPoints(0);
    double d12 = childrensMovie1.determineAmount((int)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.5d);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test302"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    double d8 = regularMovie1.determineAmount((int)(short)0);
    java.lang.String str9 = regularMovie1.getTitle();
    regularMovie1.setPriceCode(3);
    
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

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test303"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    double d9 = regularMovie1.determineAmount(4);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 5.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test304"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i8 = regularMovie1.determineFrequentRenterPoints(0);
    double d10 = regularMovie1.determineAmount((int)'4');
    java.lang.String str11 = regularMovie1.getTitle();
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str11.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test305"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer3 = new nul.study.videostore.Customer("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    java.lang.String str12 = rentalStatement5.makeRentalStatement();
    java.lang.String str13 = rentalStatement5.makeRentalStatement();
    double d14 = rentalStatement5.getAmountOwed();
    nul.study.videostore.Customer customer16 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie18 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie18, 0);
    int i21 = rental20.determineFrequentRenterPoints();
    customer16.addRental(rental20);
    int i23 = rental20.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie24 = rental20.getMovie();
    int i25 = rental20.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental20);
    customer3.addRental(rental20);
    customer1.addRental(rental20);
    int i29 = rental20.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str12.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test306"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = childrensMovie1.getTitle();
    childrensMovie1.setPriceCode(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test307"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)10);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints(0);
    double d10 = newReleaseMovie1.determineAmount((int)'a');
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test308"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)0);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i10 = newReleaseMovie1.determineFrequentRenterPoints(0);
    int i11 = newReleaseMovie1.getPriceCode();
    int i13 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i15 = newReleaseMovie1.determineFrequentRenterPoints(1);
    int i17 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test309"); }


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
    nul.study.videostore.NewReleaseMovie newReleaseMovie51 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i52 = newReleaseMovie51.getPriceCode();
    nul.study.videostore.Rental rental54 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie51, 0);
    rentalStatement1.addRental(rental54);
    int i56 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str57 = rentalStatement1.getName();
    java.lang.String str58 = rentalStatement1.getName();
    java.lang.String str59 = rentalStatement1.getName();
    java.lang.String str60 = rentalStatement1.getName();
    nul.study.videostore.RentalStatement rentalStatement62 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str63 = rentalStatement62.getName();
    nul.study.videostore.RentalStatement rentalStatement65 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i66 = rentalStatement65.getFrequentRenterPoints();
    nul.study.videostore.Customer customer68 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie70 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental72 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie70, 0);
    int i73 = rental72.determineFrequentRenterPoints();
    customer68.addRental(rental72);
    java.lang.String str75 = customer68.statement();
    nul.study.videostore.RegularMovie regularMovie77 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str78 = regularMovie77.getTitle();
    double d80 = regularMovie77.determineAmount((int)(byte)-1);
    java.lang.String str81 = regularMovie77.getTitle();
    nul.study.videostore.Rental rental83 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie77, (int)(byte)1);
    customer68.addRental(rental83);
    double d85 = rental83.determineAmount();
    double d86 = rental83.determineAmount();
    rentalStatement65.addRental(rental83);
    java.lang.String str88 = rentalStatement65.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie90 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n");
    int i92 = newReleaseMovie90.determineFrequentRenterPoints(35);
    nul.study.videostore.Rental rental94 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie90, 0);
    rentalStatement65.addRental(rental94);
    nul.study.videostore.Movie movie96 = rental94.getMovie();
    rentalStatement62.addRental(rental94);
    rentalStatement1.addRental(rental94);
    
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
    org.junit.Assert.assertTrue(i52 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + ""+ "'", str57.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str58 + "' != '" + ""+ "'", str58.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str59 + "' != '" + ""+ "'", str59.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + ""+ "'", str60.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str63 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str63.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i66 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i73 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str75.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str78 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str78.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d80 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str81 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str81.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d85 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d86 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str88 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str88.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie96);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test310"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount((int)'a');
    int i6 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    double d8 = newReleaseMovie1.determineAmount((int)(short)0);
    int i10 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)1);
    java.lang.String str11 = newReleaseMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 291.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test311"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    childrensMovie1.setPriceCode((int)(byte)100);
    double d6 = childrensMovie1.determineAmount(100);
    int i8 = childrensMovie1.determineFrequentRenterPoints((int)(byte)1);
    double d10 = childrensMovie1.determineAmount((int)(byte)-1);
    double d12 = childrensMovie1.determineAmount(0);
    int i14 = childrensMovie1.determineFrequentRenterPoints(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 147.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test312"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str4 = rentalStatement1.getName();
    java.lang.String str5 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str4.equals("Rental Record for \n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"+ "'", str5.equals("Rental Record for \n\t\t0.0\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test313"); }


    nul.study.videostore.Movie movie0 = null;
    nul.study.videostore.Rental rental2 = new nul.study.videostore.Rental(movie0, 3);
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
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test314"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    double d7 = childrensMovie1.determineAmount((int)(short)10);
    double d9 = childrensMovie1.determineAmount((int)(short)1);
    int i11 = childrensMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i12 = childrensMovie1.getPriceCode();
    int i14 = childrensMovie1.determineFrequentRenterPoints(35);
    double d16 = childrensMovie1.determineAmount((-1));
    double d18 = childrensMovie1.determineAmount((int)(byte)0);
    
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
    org.junit.Assert.assertTrue(d16 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 1.5d);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test315"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((-1));
    int i6 = regularMovie1.determineFrequentRenterPoints((-1));
    regularMovie1.setPriceCode((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test316"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
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
    nul.study.videostore.Movie movie17 = rental12.getMovie();
    int i18 = rental12.getDaysRented();
    customer1.addRental(rental12);
    java.lang.String str20 = customer1.statement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
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
    org.junit.Assert.assertNotNull(movie17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str20.equals("Rental Record for Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test317"); }


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
    double d24 = rentalStatement1.getAmountOwed();
    int i25 = rentalStatement1.getFrequentRenterPoints();
    int i26 = rentalStatement1.getFrequentRenterPoints();
    int i27 = rentalStatement1.getFrequentRenterPoints();
    double d28 = rentalStatement1.getAmountOwed();
    java.lang.String str29 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue(d24 == 0.0d);
    
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

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test318"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    double d6 = newReleaseMovie1.determineAmount(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 12.0d);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test319"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("hi!");
    double d3 = regularMovie1.determineAmount((int)(byte)0);
    double d5 = regularMovie1.determineAmount((-1));
    java.lang.String str6 = regularMovie1.getTitle();
    double d8 = regularMovie1.determineAmount((-1));
    double d10 = regularMovie1.determineAmount(35);
    double d12 = regularMovie1.determineAmount((int)' ');
    java.lang.String str13 = regularMovie1.getTitle();
    
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
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!"+ "'", str13.equals("hi!"));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test320"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 0);
    int i5 = newReleaseMovie1.getPriceCode();
    double d7 = newReleaseMovie1.determineAmount(1);
    int i9 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)0);
    int i10 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)100);
    int i14 = newReleaseMovie1.determineFrequentRenterPoints(2);
    
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
    org.junit.Assert.assertTrue(i14 == 2);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test321"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    double d3 = newReleaseMovie1.determineAmount((int)'4');
    int i5 = newReleaseMovie1.determineFrequentRenterPoints(3);
    double d7 = newReleaseMovie1.determineAmount((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 156.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 156.0d);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test322"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    double d4 = newReleaseMovie1.determineAmount(100);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)10);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints(0);
    int i9 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental11 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 10);
    int i13 = newReleaseMovie1.determineFrequentRenterPoints((int)'a');
    int i15 = newReleaseMovie1.determineFrequentRenterPoints(2);
    int i16 = newReleaseMovie1.getPriceCode();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test323"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.Rental rental2 = null;
    rentalStatement1.addRental(rental2);
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
    double d17 = rental12.determineAmount();
    rentalStatement1.addRental(rental12);
    int i19 = rental12.getDaysRented();
    nul.study.videostore.Movie movie20 = rental12.getMovie();
    double d21 = rental12.determineAmount();
    
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
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test324"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints((int)(short)10);
    java.lang.String str4 = regularMovie1.getTitle();
    double d6 = regularMovie1.determineAmount(0);
    java.lang.String str7 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + ""+ "'", str4.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + ""+ "'", str7.equals(""));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test325"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i2 = childrensMovie1.getPriceCode();
    childrensMovie1.setPriceCode(35);
    double d6 = childrensMovie1.determineAmount((int)(short)1);
    double d8 = childrensMovie1.determineAmount((int)(byte)-1);
    double d10 = childrensMovie1.determineAmount((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d6 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == 45.0d);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test326"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(10);
    double d5 = childrensMovie1.determineAmount((int)(short)1);
    java.lang.String str6 = childrensMovie1.getTitle();
    double d8 = childrensMovie1.determineAmount(35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str6.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 49.5d);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test327"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    int i2 = newReleaseMovie1.getPriceCode();
    int i4 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (-1));
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    newReleaseMovie1.setPriceCode((int)(byte)1);
    int i12 = newReleaseMovie1.determineFrequentRenterPoints((-1));
    int i14 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)-1);
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)'4');
    int i17 = rental16.determineFrequentRenterPoints();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 2);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test328"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    java.lang.String str12 = rentalStatement5.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement14 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 0);
    int i19 = rental18.determineFrequentRenterPoints();
    rentalStatement14.addRental(rental18);
    double d21 = rental18.determineAmount();
    double d22 = rental18.determineAmount();
    rentalStatement5.addRental(rental18);
    double d24 = rental18.determineAmount();
    customer1.addRental(rental18);
    java.lang.String str26 = customer1.statement();
    java.lang.String str27 = customer1.getName();
    java.lang.String str28 = customer1.statement();
    java.lang.String str29 = customer1.getName();
    nul.study.videostore.Customer customer31 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str32 = customer31.statement();
    java.lang.String str33 = customer31.statement();
    nul.study.videostore.Customer customer35 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie37 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie37, 0);
    int i40 = rental39.determineFrequentRenterPoints();
    customer35.addRental(rental39);
    nul.study.videostore.NewReleaseMovie newReleaseMovie43 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i44 = newReleaseMovie43.getPriceCode();
    nul.study.videostore.Rental rental46 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie43, 1);
    int i47 = rental46.getDaysRented();
    customer35.addRental(rental46);
    nul.study.videostore.Customer customer50 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie52 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental54 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie52, 0);
    int i55 = rental54.determineFrequentRenterPoints();
    customer50.addRental(rental54);
    int i57 = rental54.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie58 = rental54.getMovie();
    int i59 = rental54.getDaysRented();
    int i60 = rental54.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie61 = rental54.getMovie();
    customer35.addRental(rental54);
    customer31.addRental(rental54);
    double d64 = rental54.determineAmount();
    customer1.addRental(rental54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str12.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str26.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "hi!"+ "'", str27.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str28.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "hi!"+ "'", str29.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str32.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str33.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i59 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i60 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d64 == 0.0d);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test329"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.getName();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test330"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("");
    int i3 = childrensMovie1.determineFrequentRenterPoints(1);
    int i5 = childrensMovie1.determineFrequentRenterPoints(2);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, 52);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test331"); }


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
    int i25 = rental18.getDaysRented();
    double d26 = rental18.determineAmount();
    int i27 = rental18.getDaysRented();
    
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
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 0);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test332"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer5 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    customer5.addRental(rental9);
    nul.study.videostore.Movie movie12 = rental9.getMovie();
    rentalStatement1.addRental(rental9);
    double d14 = rentalStatement1.getAmountOwed();
    java.lang.String str15 = rentalStatement1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str15.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test333"); }


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
    java.lang.String str15 = customer1.statement();
    nul.study.videostore.ChildrensMovie childrensMovie17 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i19 = childrensMovie17.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental21 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie17, (int)(byte)10);
    customer1.addRental(rental21);
    java.lang.String str23 = customer1.statement();
    nul.study.videostore.Customer customer25 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str26 = customer25.getName();
    java.lang.String str27 = customer25.statement();
    nul.study.videostore.RegularMovie regularMovie29 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str30 = regularMovie29.getTitle();
    int i32 = regularMovie29.determineFrequentRenterPoints((int)(short)100);
    int i34 = regularMovie29.determineFrequentRenterPoints((int)(short)-1);
    nul.study.videostore.Rental rental36 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie29, (int)(byte)0);
    customer25.addRental(rental36);
    int i38 = rental36.getDaysRented();
    int i39 = rental36.determineFrequentRenterPoints();
    int i40 = rental36.determineFrequentRenterPoints();
    int i41 = rental36.getDaysRented();
    customer1.addRental(rental36);
    java.lang.String str43 = customer1.statement();
    
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
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str15.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\tRental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\t12.0\nYou owed 15.0\nYou earned 2 frequent renter points\n"+ "'", str23.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\tRental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\t12.0\nYou owed 15.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str26.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str27.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str30.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\tRental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\t12.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 17.0\nYou earned 3 frequent renter points\n"+ "'", str43.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\tRental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\t12.0\n\tRental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2.0\nYou owed 17.0\nYou earned 3 frequent renter points\n"));

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test334"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\n\t\t0.0\nYou owed 3.0\nYou earned 3 frequent renter points\n\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test335"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount(10);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)'4');
    regularMovie1.setPriceCode(0);
    java.lang.String str9 = regularMovie1.getTitle();
    double d11 = regularMovie1.determineAmount(3);
    java.lang.String str12 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str9.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d11 == 3.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str12.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test336"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints(1);
    nul.study.videostore.Rental rental6 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 0);
    double d8 = regularMovie1.determineAmount((int)(short)100);
    regularMovie1.setPriceCode(35);
    int i12 = regularMovie1.determineFrequentRenterPoints((int)(byte)0);
    double d14 = regularMovie1.determineAmount(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 2.0d);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test337"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    nul.study.videostore.Movie movie8 = rental5.getMovie();
    nul.study.videostore.Movie movie9 = rental5.getMovie();
    nul.study.videostore.Movie movie10 = rental5.getMovie();
    java.lang.String str11 = movie10.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + ""+ "'", str11.equals(""));

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test338"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("hi!");
    double d3 = childrensMovie1.determineAmount(1);
    double d5 = childrensMovie1.determineAmount(1);
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)0);
    java.lang.String str8 = childrensMovie1.getTitle();
    int i10 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!"+ "'", str8.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test339"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Customer customer3 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    int i12 = rental9.determineFrequentRenterPoints();
    int i13 = rental9.determineFrequentRenterPoints();
    customer3.addRental(rental9);
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i17 = newReleaseMovie16.getPriceCode();
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 0);
    int i20 = newReleaseMovie16.getPriceCode();
    int i22 = newReleaseMovie16.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, (int)(short)10);
    customer3.addRental(rental24);
    java.lang.String str26 = customer3.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie28 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i29 = newReleaseMovie28.getPriceCode();
    nul.study.videostore.Rental rental31 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie28, 0);
    int i33 = newReleaseMovie28.determineFrequentRenterPoints((int)(short)0);
    nul.study.videostore.Rental rental35 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie28, (int)(byte)-1);
    int i36 = rental35.getDaysRented();
    int i37 = rental35.determineFrequentRenterPoints();
    customer3.addRental(rental35);
    customer1.addRental(rental35);
    java.lang.String str40 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str26 + "' != '" + "hi!"+ "'", str26.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i36 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str40.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test340"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    java.lang.String str4 = customer1.statement();
    java.lang.String str5 = customer1.statement();
    java.lang.String str6 = customer1.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str5.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!"+ "'", str6.equals("hi!"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test341"); }


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
    int i22 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str23 = rentalStatement1.makeRentalStatement();
    
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
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str23.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test342"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(byte)10);
    childrensMovie1.setPriceCode(0);
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test343"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \n\t\t0.0\n\t\t-3.0\nYou owed -3.0\nYou earned 2 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    regularMovie1.setPriceCode(1);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test344"); }


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
    nul.study.videostore.Movie movie90 = rental81.getMovie();
    
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
    org.junit.Assert.assertNotNull(movie90);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test345"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\n\t\t0.0\n\thi!\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test346"); }


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
    int i18 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str19 = rentalStatement1.getName();
    
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
    org.junit.Assert.assertTrue(i18 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + ""+ "'", str19.equals(""));

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test347"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    java.lang.String str2 = customer1.statement();
    java.lang.String str3 = customer1.statement();
    nul.study.videostore.RentalStatement rentalStatement5 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    rentalStatement5.addRental(rental9);
    java.lang.String str12 = rentalStatement5.makeRentalStatement();
    nul.study.videostore.RentalStatement rentalStatement14 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 0);
    int i19 = rental18.determineFrequentRenterPoints();
    rentalStatement14.addRental(rental18);
    double d21 = rental18.determineAmount();
    double d22 = rental18.determineAmount();
    rentalStatement5.addRental(rental18);
    double d24 = rental18.determineAmount();
    customer1.addRental(rental18);
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i28 = newReleaseMovie27.getPriceCode();
    nul.study.videostore.Rental rental30 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 1);
    int i31 = newReleaseMovie27.getPriceCode();
    newReleaseMovie27.setPriceCode((int)(short)100);
    nul.study.videostore.Rental rental35 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, (int)(short)0);
    double d36 = rental35.determineAmount();
    customer1.addRental(rental35);
    nul.study.videostore.Customer customer39 = new nul.study.videostore.Customer("hi!");
    java.lang.String str40 = customer39.getName();
    java.lang.String str41 = customer39.getName();
    java.lang.String str42 = customer39.getName();
    java.lang.String str43 = customer39.getName();
    java.lang.String str44 = customer39.statement();
    nul.study.videostore.Customer customer46 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie48 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental50 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie48, 0);
    int i51 = rental50.determineFrequentRenterPoints();
    customer46.addRental(rental50);
    int i53 = rental50.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie54 = rental50.getMovie();
    int i55 = rental50.getDaysRented();
    int i56 = rental50.determineFrequentRenterPoints();
    int i57 = rental50.getDaysRented();
    customer39.addRental(rental50);
    nul.study.videostore.Customer customer60 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie62 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i63 = newReleaseMovie62.getPriceCode();
    nul.study.videostore.Rental rental65 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie62, 0);
    customer60.addRental(rental65);
    java.lang.String str67 = customer60.statement();
    nul.study.videostore.RentalStatement rentalStatement69 = new nul.study.videostore.RentalStatement("");
    int i70 = rentalStatement69.getFrequentRenterPoints();
    java.lang.String str71 = rentalStatement69.getName();
    int i72 = rentalStatement69.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement74 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie76 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental78 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie76, 0);
    int i79 = rental78.determineFrequentRenterPoints();
    rentalStatement74.addRental(rental78);
    double d81 = rental78.determineAmount();
    rentalStatement69.addRental(rental78);
    int i83 = rental78.getDaysRented();
    customer60.addRental(rental78);
    nul.study.videostore.NewReleaseMovie newReleaseMovie86 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i87 = newReleaseMovie86.getPriceCode();
    double d89 = newReleaseMovie86.determineAmount(100);
    nul.study.videostore.Rental rental91 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie86, (int)(byte)10);
    int i92 = rental91.getDaysRented();
    double d93 = rental91.determineAmount();
    int i94 = rental91.getDaysRented();
    customer60.addRental(rental91);
    customer39.addRental(rental91);
    customer1.addRental(rental91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str12.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d22 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d36 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "hi!"+ "'", str40.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "hi!"+ "'", str41.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "hi!"+ "'", str42.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "hi!"+ "'", str43.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str44.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i51 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i56 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i63 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str67 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str67.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i70 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str71 + "' != '" + ""+ "'", str71.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i79 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d81 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i83 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i87 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d89 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i92 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d93 == 30.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i94 == 10);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test348"); }


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
    int i16 = rentalStatement1.getFrequentRenterPoints();
    int i17 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str18 = rentalStatement1.getName();
    int i19 = rentalStatement1.getFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + ""+ "'", str18.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 1);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test349"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    double d3 = childrensMovie1.determineAmount(0);
    int i5 = childrensMovie1.determineFrequentRenterPoints(0);
    int i7 = childrensMovie1.determineFrequentRenterPoints((int)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test350"); }


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
    double d16 = rentalStatement1.getAmountOwed();
    java.lang.String str17 = rentalStatement1.getName();
    nul.study.videostore.Customer customer19 = new nul.study.videostore.Customer("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str20 = customer19.statement();
    java.lang.String str21 = customer19.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie23 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie23, 0);
    int i26 = rental25.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie27 = rental25.getMovie();
    customer19.addRental(rental25);
    rentalStatement1.addRental(rental25);
    nul.study.videostore.Customer customer31 = new nul.study.videostore.Customer("hi!");
    java.lang.String str32 = customer31.getName();
    java.lang.String str33 = customer31.getName();
    nul.study.videostore.RentalStatement rentalStatement35 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie37 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie37, 0);
    int i40 = rental39.determineFrequentRenterPoints();
    rentalStatement35.addRental(rental39);
    customer31.addRental(rental39);
    java.lang.String str43 = customer31.statement();
    java.lang.String str44 = customer31.statement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie46 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental48 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie46, 0);
    int i49 = rental48.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie50 = rental48.getMovie();
    nul.study.videostore.Movie movie51 = rental48.getMovie();
    double d52 = rental48.determineAmount();
    customer31.addRental(rental48);
    nul.study.videostore.Customer customer55 = new nul.study.videostore.Customer("hi!");
    java.lang.String str56 = customer55.getName();
    java.lang.String str57 = customer55.getName();
    nul.study.videostore.RentalStatement rentalStatement59 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie61 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental63 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie61, 0);
    int i64 = rental63.determineFrequentRenterPoints();
    rentalStatement59.addRental(rental63);
    customer55.addRental(rental63);
    nul.study.videostore.NewReleaseMovie newReleaseMovie68 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i69 = newReleaseMovie68.getPriceCode();
    nul.study.videostore.Rental rental71 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie68, 1);
    int i72 = rental71.getDaysRented();
    customer55.addRental(rental71);
    java.lang.String str74 = customer55.getName();
    java.lang.String str75 = customer55.statement();
    nul.study.videostore.Customer customer77 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie79 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental81 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie79, 0);
    int i82 = rental81.determineFrequentRenterPoints();
    customer77.addRental(rental81);
    int i84 = rental81.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie85 = rental81.getMovie();
    customer55.addRental(rental81);
    customer31.addRental(rental81);
    double d88 = rental81.determineAmount();
    int i89 = rental81.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental81);
    
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
    org.junit.Assert.assertTrue(d16 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str20.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str21.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "hi!"+ "'", str32.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str33 + "' != '" + "hi!"+ "'", str33.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str43.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str44 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str44.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d52 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "hi!"+ "'", str56.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!"+ "'", str57.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i69 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "hi!"+ "'", str74.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str75.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i82 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i84 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d88 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i89 == 1);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test351"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n");
    nul.study.videostore.Rental rental2 = null;
    rentalStatement1.addRental(rental2);
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
    double d17 = rental12.determineAmount();
    rentalStatement1.addRental(rental12);
    java.lang.String str19 = rentalStatement1.getName();
    nul.study.videostore.RegularMovie regularMovie21 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str22 = regularMovie21.getTitle();
    double d24 = regularMovie21.determineAmount((int)(byte)-1);
    java.lang.String str25 = regularMovie21.getTitle();
    double d27 = regularMovie21.determineAmount(10);
    regularMovie21.setPriceCode(2);
    int i31 = regularMovie21.determineFrequentRenterPoints((int)(byte)-1);
    regularMovie21.setPriceCode((int)(byte)1);
    java.lang.String str34 = regularMovie21.getTitle();
    regularMovie21.setPriceCode((int)(byte)0);
    nul.study.videostore.Rental rental38 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie21, 10);
    double d39 = rental38.determineAmount();
    int i40 = rental38.getDaysRented();
    int i41 = rental38.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental38);
    nul.study.videostore.ChildrensMovie childrensMovie44 = new nul.study.videostore.ChildrensMovie("");
    int i46 = childrensMovie44.determineFrequentRenterPoints(1);
    childrensMovie44.setPriceCode((int)'4');
    childrensMovie44.setPriceCode((int)'4');
    java.lang.String str51 = childrensMovie44.getTitle();
    int i53 = childrensMovie44.determineFrequentRenterPoints((int)(short)100);
    double d55 = childrensMovie44.determineAmount((int)(short)0);
    nul.study.videostore.Rental rental57 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie44, (int)(byte)10);
    rentalStatement1.addRental(rental57);
    
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
    org.junit.Assert.assertTrue(d17 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"+ "'", str19.equals("Rental Record for Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\nYou owed 3.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str22.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str25.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i31 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str34.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d39 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i41 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str51 + "' != '" + ""+ "'", str51.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i53 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d55 == 1.5d);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test352"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount((int)(byte)0);
    int i7 = regularMovie1.determineFrequentRenterPoints(0);
    double d9 = regularMovie1.determineAmount((int)(short)-1);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(byte)0);
    regularMovie1.setPriceCode((int)'4');
    int i15 = regularMovie1.determineFrequentRenterPoints(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test353"); }


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
    java.lang.String str20 = customer1.statement();
    java.lang.String str21 = customer1.statement();
    nul.study.videostore.Customer customer23 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement25 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie27 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental29 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie27, 0);
    int i30 = rental29.determineFrequentRenterPoints();
    rentalStatement25.addRental(rental29);
    int i32 = rental29.determineFrequentRenterPoints();
    int i33 = rental29.determineFrequentRenterPoints();
    customer23.addRental(rental29);
    nul.study.videostore.NewReleaseMovie newReleaseMovie36 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i37 = newReleaseMovie36.getPriceCode();
    nul.study.videostore.Rental rental39 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie36, 0);
    int i40 = newReleaseMovie36.getPriceCode();
    int i42 = newReleaseMovie36.determineFrequentRenterPoints((int)(byte)10);
    nul.study.videostore.Rental rental44 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie36, (int)(short)10);
    customer23.addRental(rental44);
    int i46 = rental44.getDaysRented();
    int i47 = rental44.determineFrequentRenterPoints();
    customer1.addRental(rental44);
    int i49 = rental44.determineFrequentRenterPoints();
    
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
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str20.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"+ "'", str21.equals("Rental Record for hi!\n\t\t0.0\n\thi!\t3.0\nYou owed 3.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i40 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i46 == 10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i47 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i49 == 2);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test354"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("");
    int i2 = rentalStatement1.getFrequentRenterPoints();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i6 = newReleaseMovie5.getPriceCode();
    double d8 = newReleaseMovie5.determineAmount(100);
    double d10 = newReleaseMovie5.determineAmount((int)(byte)-1);
    nul.study.videostore.Rental rental12 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, (int)(byte)100);
    double d13 = rental12.determineAmount();
    rentalStatement1.addRental(rental12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d8 == 300.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d10 == (-3.0d));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d13 == 300.0d);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test355"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("");
    newReleaseMovie1.setPriceCode((-1));
    int i5 = newReleaseMovie1.determineFrequentRenterPoints((int)' ');
    int i7 = newReleaseMovie1.determineFrequentRenterPoints((int)(byte)100);
    int i8 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental10 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, (int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-1));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test356"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    double d4 = regularMovie1.determineAmount((int)(byte)-1);
    java.lang.String str5 = regularMovie1.getTitle();
    double d7 = regularMovie1.determineAmount(10);
    regularMovie1.setPriceCode(2);
    int i11 = regularMovie1.determineFrequentRenterPoints((int)(byte)-1);
    regularMovie1.setPriceCode((int)(byte)1);
    java.lang.String str14 = regularMovie1.getTitle();
    regularMovie1.setPriceCode((int)(byte)0);
    double d18 = regularMovie1.determineAmount(97);
    
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
    org.junit.Assert.assertTrue(d18 == 144.5d);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test357"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    int i3 = childrensMovie1.determineFrequentRenterPoints((-1));
    int i5 = childrensMovie1.determineFrequentRenterPoints(1);
    int i7 = childrensMovie1.determineFrequentRenterPoints((int)(short)0);
    double d9 = childrensMovie1.determineAmount((int)'#');
    java.lang.String str10 = childrensMovie1.getTitle();
    double d12 = childrensMovie1.determineAmount(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d9 == 49.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str10.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 1.5d);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test358"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i2 = newReleaseMovie1.getPriceCode();
    nul.study.videostore.Rental rental4 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie1, 1);
    int i6 = newReleaseMovie1.determineFrequentRenterPoints(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test359"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    int i4 = regularMovie1.determineFrequentRenterPoints((int)(short)100);
    int i6 = regularMovie1.determineFrequentRenterPoints((int)(short)-1);
    int i8 = regularMovie1.determineFrequentRenterPoints(0);
    regularMovie1.setPriceCode(4);
    double d12 = regularMovie1.determineAmount(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d12 == 2.0d);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test360"); }


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
    int i17 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement19 = new nul.study.videostore.RentalStatement("");
    int i20 = rentalStatement19.getFrequentRenterPoints();
    nul.study.videostore.Customer customer22 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie24 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental26 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie24, 0);
    int i27 = rental26.determineFrequentRenterPoints();
    customer22.addRental(rental26);
    int i29 = rental26.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie30 = rental26.getMovie();
    rentalStatement19.addRental(rental26);
    java.lang.String str32 = rentalStatement19.makeRentalStatement();
    nul.study.videostore.Customer customer34 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie36 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental38 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie36, 0);
    int i39 = rental38.determineFrequentRenterPoints();
    customer34.addRental(rental38);
    rentalStatement19.addRental(rental38);
    java.lang.String str42 = rentalStatement19.makeRentalStatement();
    java.lang.String str43 = rentalStatement19.makeRentalStatement();
    nul.study.videostore.Customer customer45 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie47 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i48 = newReleaseMovie47.getPriceCode();
    nul.study.videostore.Rental rental50 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie47, 0);
    customer45.addRental(rental50);
    java.lang.String str52 = customer45.statement();
    nul.study.videostore.RentalStatement rentalStatement54 = new nul.study.videostore.RentalStatement("");
    int i55 = rentalStatement54.getFrequentRenterPoints();
    java.lang.String str56 = rentalStatement54.getName();
    int i57 = rentalStatement54.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement59 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie61 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental63 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie61, 0);
    int i64 = rental63.determineFrequentRenterPoints();
    rentalStatement59.addRental(rental63);
    double d66 = rental63.determineAmount();
    rentalStatement54.addRental(rental63);
    int i68 = rental63.getDaysRented();
    customer45.addRental(rental63);
    rentalStatement19.addRental(rental63);
    int i71 = rental63.determineFrequentRenterPoints();
    int i72 = rental63.determineFrequentRenterPoints();
    rentalStatement1.addRental(rental63);
    java.lang.String str74 = rentalStatement1.makeRentalStatement();
    java.lang.String str75 = rentalStatement1.makeRentalStatement();
    
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
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str32.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i39 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str42.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str43.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str52 + "' != '" + "Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str52.equals("Rental Record for hi!\n\thi!\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i55 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + ""+ "'", str56.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i57 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i64 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d66 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i68 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i71 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i72 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str74.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"+ "'", str75.equals("Rental Record for \n\t\t0.0\n\t\t0.0\nYou owed 0.0\nYou earned 2 frequent renter points\n"));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test361"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \n\t\t0.0\n\t\t30.0\nYou owed 30.0\nYou earned 3 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test362"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("hi!");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    java.lang.String str3 = rentalStatement1.makeRentalStatement();
    double d4 = rentalStatement1.getAmountOwed();
    double d5 = rentalStatement1.getAmountOwed();
    nul.study.videostore.Customer customer7 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str8 = customer7.getName();
    java.lang.String str9 = customer7.statement();
    nul.study.videostore.RegularMovie regularMovie11 = new nul.study.videostore.RegularMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str12 = regularMovie11.getTitle();
    double d14 = regularMovie11.determineAmount(10);
    int i16 = regularMovie11.determineFrequentRenterPoints((int)'a');
    nul.study.videostore.Rental rental18 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie11, 1);
    nul.study.videostore.Rental rental20 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie11, (int)(byte)-1);
    double d21 = rental20.determineAmount();
    customer7.addRental(rental20);
    rentalStatement1.addRental(rental20);
    nul.study.videostore.Movie movie24 = rental20.getMovie();
    movie24.setPriceCode((int)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str3.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d4 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str8.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str9.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str12.equals("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d14 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d21 == 2.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie24);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test363"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("Rental Record for \n\t\t0.0\n\t\t0.0\n\t\t2.0\nYou owed 2.0\nYou earned 3 frequent renter points\n");

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test364"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental3 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 0);
    java.lang.String str4 = regularMovie1.getTitle();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str4.equals("Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test365"); }


    nul.study.videostore.ChildrensMovie childrensMovie1 = new nul.study.videostore.ChildrensMovie("hi!");
    double d3 = childrensMovie1.determineAmount(1);
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie1, (int)(byte)10);
    double d7 = childrensMovie1.determineAmount((int)(byte)10);
    int i8 = childrensMovie1.getPriceCode();
    int i10 = childrensMovie1.determineFrequentRenterPoints(100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d7 == 12.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test366"); }


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
    nul.study.videostore.ChildrensMovie childrensMovie21 = new nul.study.videostore.ChildrensMovie("Rental Record for hi!\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    nul.study.videostore.Rental rental23 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie21, 1);
    nul.study.videostore.Rental rental25 = new nul.study.videostore.Rental((nul.study.videostore.Movie)childrensMovie21, (int)(byte)10);
    int i26 = rental25.getDaysRented();
    rentalStatement1.addRental(rental25);
    
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
    org.junit.Assert.assertTrue(i26 == 10);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test367"); }


    nul.study.videostore.NewReleaseMovie newReleaseMovie1 = new nul.study.videostore.NewReleaseMovie("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    java.lang.String str2 = newReleaseMovie1.getTitle();
    int i3 = newReleaseMovie1.getPriceCode();
    java.lang.String str4 = newReleaseMovie1.getTitle();
    int i6 = newReleaseMovie1.determineFrequentRenterPoints(0);
    int i8 = newReleaseMovie1.determineFrequentRenterPoints((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str2.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str4.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test368"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie3 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental5 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie3, 0);
    int i6 = rental5.determineFrequentRenterPoints();
    customer1.addRental(rental5);
    java.lang.String str8 = customer1.statement();
    nul.study.videostore.Customer customer10 = new nul.study.videostore.Customer("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str11 = customer10.getName();
    java.lang.String str12 = customer10.statement();
    nul.study.videostore.RegularMovie regularMovie14 = new nul.study.videostore.RegularMovie("");
    int i16 = regularMovie14.determineFrequentRenterPoints(0);
    double d18 = regularMovie14.determineAmount(100);
    int i20 = regularMovie14.determineFrequentRenterPoints((int)'#');
    int i22 = regularMovie14.determineFrequentRenterPoints((int)(byte)100);
    double d24 = regularMovie14.determineAmount((int)'#');
    double d26 = regularMovie14.determineAmount((int)(short)10);
    nul.study.videostore.Rental rental28 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie14, (int)(byte)100);
    customer10.addRental(rental28);
    customer1.addRental(rental28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str8.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str11.equals("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str12.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d18 == 149.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d24 == 51.5d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d26 == 14.0d);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test369"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n\n\t\t2.0\n\t\t1.5\nYou owed 3.5\nYou earned 2 frequent renter points\n");

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test370"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\n\thi!\t3.0\n\thi!\t-3.0\nYou owed 0.0\nYou earned 2 frequent renter points\n");
    double d3 = regularMovie1.determineAmount(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 14.0d);

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test371"); }


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
    org.junit.Assert.assertTrue(d28 == 0.0d);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test372"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)(byte)10);
    int i9 = regularMovie1.determineFrequentRenterPoints(10);
    int i11 = regularMovie1.determineFrequentRenterPoints(0);
    double d13 = regularMovie1.determineAmount((int)(short)10);
    int i15 = regularMovie1.determineFrequentRenterPoints(4);
    
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
    org.junit.Assert.assertTrue(d13 == 14.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test373"); }


    nul.study.videostore.RegularMovie regularMovie1 = new nul.study.videostore.RegularMovie("");
    int i3 = regularMovie1.determineFrequentRenterPoints(0);
    double d5 = regularMovie1.determineAmount(100);
    int i7 = regularMovie1.determineFrequentRenterPoints((int)'#');
    double d9 = regularMovie1.determineAmount(10);
    int i10 = regularMovie1.getPriceCode();
    double d12 = regularMovie1.determineAmount((int)(byte)10);
    double d14 = regularMovie1.determineAmount(0);
    nul.study.videostore.Rental rental16 = new nul.study.videostore.Rental((nul.study.videostore.Movie)regularMovie1, 1);
    
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
    org.junit.Assert.assertTrue(d14 == 2.0d);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test374"); }


    nul.study.videostore.Customer customer1 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.RentalStatement rentalStatement3 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie5 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental7 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie5, 0);
    int i8 = rental7.determineFrequentRenterPoints();
    rentalStatement3.addRental(rental7);
    int i10 = rental7.determineFrequentRenterPoints();
    int i11 = rental7.determineFrequentRenterPoints();
    customer1.addRental(rental7);
    java.lang.String str13 = customer1.statement();
    java.lang.String str14 = customer1.getName();
    nul.study.videostore.NewReleaseMovie newReleaseMovie16 = new nul.study.videostore.NewReleaseMovie("hi!");
    int i17 = newReleaseMovie16.getPriceCode();
    nul.study.videostore.Rental rental19 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, 1);
    int i20 = newReleaseMovie16.getPriceCode();
    newReleaseMovie16.setPriceCode((int)(short)100);
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie16, (int)(short)0);
    customer1.addRental(rental24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str13.equals("Rental Record for hi!\n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!"+ "'", str14.equals("hi!"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 1);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest6.test375"); }


    nul.study.videostore.RentalStatement rentalStatement1 = new nul.study.videostore.RentalStatement("Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n");
    java.lang.String str2 = rentalStatement1.makeRentalStatement();
    int i3 = rentalStatement1.getFrequentRenterPoints();
    nul.study.videostore.Customer customer5 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie7 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental9 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie7, 0);
    int i10 = rental9.determineFrequentRenterPoints();
    customer5.addRental(rental9);
    nul.study.videostore.Movie movie12 = rental9.getMovie();
    rentalStatement1.addRental(rental9);
    nul.study.videostore.RentalStatement rentalStatement15 = new nul.study.videostore.RentalStatement("");
    int i16 = rentalStatement15.getFrequentRenterPoints();
    java.lang.String str17 = rentalStatement15.getName();
    int i18 = rentalStatement15.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement20 = new nul.study.videostore.RentalStatement("");
    nul.study.videostore.NewReleaseMovie newReleaseMovie22 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental24 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie22, 0);
    int i25 = rental24.determineFrequentRenterPoints();
    rentalStatement20.addRental(rental24);
    double d27 = rental24.determineAmount();
    rentalStatement15.addRental(rental24);
    int i29 = rentalStatement15.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement31 = new nul.study.videostore.RentalStatement("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n");
    int i32 = rentalStatement31.getFrequentRenterPoints();
    nul.study.videostore.RentalStatement rentalStatement34 = new nul.study.videostore.RentalStatement("");
    int i35 = rentalStatement34.getFrequentRenterPoints();
    nul.study.videostore.Customer customer37 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie39 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental41 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie39, 0);
    int i42 = rental41.determineFrequentRenterPoints();
    customer37.addRental(rental41);
    int i44 = rental41.determineFrequentRenterPoints();
    nul.study.videostore.Movie movie45 = rental41.getMovie();
    rentalStatement34.addRental(rental41);
    java.lang.String str47 = rentalStatement34.makeRentalStatement();
    nul.study.videostore.Customer customer49 = new nul.study.videostore.Customer("hi!");
    nul.study.videostore.NewReleaseMovie newReleaseMovie51 = new nul.study.videostore.NewReleaseMovie("");
    nul.study.videostore.Rental rental53 = new nul.study.videostore.Rental((nul.study.videostore.Movie)newReleaseMovie51, 0);
    int i54 = rental53.determineFrequentRenterPoints();
    customer49.addRental(rental53);
    rentalStatement34.addRental(rental53);
    rentalStatement31.addRental(rental53);
    rentalStatement15.addRental(rental53);
    rentalStatement1.addRental(rental53);
    double d60 = rentalStatement1.getAmountOwed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"+ "'", str2.equals("Rental Record for Rental Record for Rental Record for \nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n\nYou owed 0.0\nYou earned 0 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + ""+ "'", str17.equals(""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i18 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d27 == 0.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i32 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i35 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i42 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i44 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(movie45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str47 + "' != '" + "Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"+ "'", str47.equals("Rental Record for \n\t\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i54 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d60 == 0.0d);

  }

}
