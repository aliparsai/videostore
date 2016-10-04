
package nul.study.videostore.EvoSuiteTests;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;

import nul.study.videostore.ChildrensMovie;
import nul.study.videostore.Movie;
import nul.study.videostore.NewReleaseMovie;
import nul.study.videostore.RegularMovie;
import nul.study.videostore.Rental;
import org.junit.runner.RunWith;

public class Rental_ESTest {
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
  public void test00()  throws Throwable  {
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("");
      newReleaseMovie0.setPriceCode(0);
      Rental rental0 = new Rental((Movie) newReleaseMovie0, (-637));
      rental0.getMovie();
      assertEquals(-637, rental0.getDaysRented());
  }

  //Test case number: 1

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("");
      newReleaseMovie0.setPriceCode((-736));
      Rental rental0 = new Rental((Movie) newReleaseMovie0, (-3520));
      rental0.getMovie();
      assertEquals(-3520, rental0.getDaysRented());
  }

  //Test case number: 2

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RegularMovie regularMovie0 = new RegularMovie("");
      Rental rental0 = new Rental((Movie) regularMovie0, 41);
      int int0 = rental0.getDaysRented();
      assertEquals(41, int0);
  }

  //Test case number: 3

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("");
      Rental rental0 = new Rental((Movie) newReleaseMovie0, (-3520));
      int int0 = rental0.getDaysRented();
      assertEquals((-3520), int0);
  }

  //Test case number: 4

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ChildrensMovie childrensMovie0 = new ChildrensMovie("");
      Rental rental0 = new Rental((Movie) childrensMovie0, (-15));
      double double0 = rental0.determineAmount();
      assertEquals(-15, rental0.getDaysRented());
      assertEquals(1.5, double0, 0.01);
  }

  //Test case number: 5

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("");
      Rental rental0 = new Rental((Movie) newReleaseMovie0, (-637));
      double double0 = rental0.determineAmount();
      assertEquals((-1911.0), double0, 0.01);
  }

  //Test case number: 6

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Rental rental0 = null;
      try {
        rental0 = new Rental((Movie) null, (-17));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // movie is Null
         //
         assertThrownBy("nul.study.videostore.Rental", e);
      }
  }

  //Test case number: 7

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("");
      Rental rental0 = new Rental((Movie) newReleaseMovie0, (-3520));
      rental0.getMovie();
      assertEquals(-3520, rental0.getDaysRented());
  }

  //Test case number: 8

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("");
      Rental rental0 = new Rental((Movie) newReleaseMovie0, (-637));
      int int0 = rental0.determineFrequentRenterPoints();
      assertEquals(-637, rental0.getDaysRented());
      assertEquals(1, int0);
  }

  //Test case number: 9

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("");
      Rental rental0 = new Rental((Movie) newReleaseMovie0, 0);
      double double0 = rental0.determineAmount();
      assertEquals(0.0, double0, 0.01);
  }

  //Test case number: 10

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("");
      Rental rental0 = new Rental((Movie) newReleaseMovie0, 0);
      int int0 = rental0.getDaysRented();
      assertEquals(0, int0);
  }
}
