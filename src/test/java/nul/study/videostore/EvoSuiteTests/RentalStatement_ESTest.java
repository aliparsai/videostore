
package nul.study.videostore.EvoSuiteTests;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;

import nul.study.videostore.Movie;
import nul.study.videostore.NewReleaseMovie;
import nul.study.videostore.RegularMovie;
import nul.study.videostore.Rental;
import nul.study.videostore.RentalStatement;
import org.junit.runner.RunWith;

public class RentalStatement_ESTest {
	public static void assertThrownBy(String sourceClass, Throwable t) throws AssertionError{
        StackTraceElement[] stackTrace = t.getStackTrace();

        // TODO: Force mocked exceptions to always have stack trace
        if(stackTrace.length == 0)
            return;

        StackTraceElement el = stackTrace[0];

        if(sourceClass==null){
            return; //can this even happen?
        }


        String name = el.getClassName();
        if(sourceClass.equals(name)){
            return;
        }
 
        Class<?> klass;

        try {
           klass = Customer_ESTest.class.getClassLoader().loadClass(sourceClass);
        } catch (ClassNotFoundException e) {
            throw new AssertionError("Cannot load/analyze class "+sourceClass);
        }

        for(Annotation annotation : klass.getAnnotations()){
            if(annotation.getClass().getName().equals(name)){
                return;
            }
        }

        while(klass != null){
            klass = klass.getSuperclass();
            if(klass != null && klass.getName().equals(name)){
                return;
            }
        }

        throw new AssertionError("Exception was not thrown in "+sourceClass +" but in "+el+": "+t);
    }


  //Test case number: 0

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RentalStatement rentalStatement0 = new RentalStatement((String) null);
      String string0 = rentalStatement0.getName();
      assertNull(string0);
  }

  //Test case number: 1

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RentalStatement rentalStatement0 = new RentalStatement(".IQf>=\"yQ7?Mi?\"t");
      String string0 = rentalStatement0.getName();
      assertEquals(".IQf>=\"yQ7?Mi?\"t", string0);
  }

  //Test case number: 2

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RentalStatement rentalStatement0 = new RentalStatement("@c.21LdFJ.");
      RegularMovie regularMovie0 = new RegularMovie("@c.21LdFJ.");
      Rental rental0 = new Rental((Movie) regularMovie0, 142);
      rentalStatement0.addRental(rental0);
      rentalStatement0.makeRentalStatement();
      int int0 = rentalStatement0.getFrequentRenterPoints();
      assertEquals(1, int0);
  }

  //Test case number: 3

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RentalStatement rentalStatement0 = new RentalStatement("");
      RegularMovie regularMovie0 = new RegularMovie("");
      Rental rental0 = new Rental((Movie) regularMovie0, (-1480));
      rentalStatement0.addRental(rental0);
      rentalStatement0.makeRentalStatement();
      double double0 = rentalStatement0.getAmountOwed();
      assertEquals(2.0, double0, 0.01);
  }

  //Test case number: 4

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RentalStatement rentalStatement0 = new RentalStatement("-NZIU");
      rentalStatement0.addRental((Rental) null);
      // Undeclared exception!
      try { 
        rentalStatement0.makeRentalStatement();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("nul.study.videostore.RentalStatement", e);
      }
  }

  //Test case number: 5

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RentalStatement rentalStatement0 = new RentalStatement("");
      String string0 = rentalStatement0.getName();
      assertEquals("", string0);
  }

  //Test case number: 6

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      RentalStatement rentalStatement0 = new RentalStatement("");
      double double0 = rentalStatement0.getAmountOwed();
      assertEquals(0.0, double0, 0.01);
  }

  //Test case number: 7

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      RentalStatement rentalStatement0 = new RentalStatement("");
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("");
      Rental rental0 = new Rental((Movie) newReleaseMovie0, (-1));
      rentalStatement0.addRental(rental0);
      rentalStatement0.makeRentalStatement();
      double double0 = rentalStatement0.getAmountOwed();
      assertEquals(1, rentalStatement0.getFrequentRenterPoints());
      assertEquals((-3.0), double0, 0.01);
  }

  //Test case number: 8

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      RentalStatement rentalStatement0 = new RentalStatement("@c.21LdFJ.");
      int int0 = rentalStatement0.getFrequentRenterPoints();
      assertEquals(0, int0);
  }
}
