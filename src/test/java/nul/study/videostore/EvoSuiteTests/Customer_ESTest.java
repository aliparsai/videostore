
package nul.study.videostore.EvoSuiteTests;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;

import nul.study.videostore.ChildrensMovie;
import nul.study.videostore.Customer;
import nul.study.videostore.Movie;
import nul.study.videostore.NewReleaseMovie;
import nul.study.videostore.RegularMovie;
import nul.study.videostore.Rental;
import org.junit.runner.RunWith;

public class Customer_ESTest{
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
      Customer customer0 = new Customer("");
      ChildrensMovie childrensMovie0 = new ChildrensMovie("ZPO(plD)");
      Rental rental0 = new Rental((Movie) childrensMovie0, 3);
      customer0.addRental(rental0);
      String string0 = customer0.statement();
      assertEquals("Rental Record for \n\tZPO(plD)\t1.5\nYou owed 1.5\nYou earned 1 frequent renter points\n", string0);
  }

  //Test case number: 1

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Customer customer0 = new Customer(",e\fkk");
      ChildrensMovie childrensMovie0 = new ChildrensMovie("))%");
      Rental rental0 = new Rental((Movie) childrensMovie0, 1);
      customer0.addRental(rental0);
      customer0.addRental(rental0);
      String string0 = customer0.statement();
      assertEquals("Rental Record for ,e\fkk\n\t))%\t1.5\n\t))%\t1.5\nYou owed 3.0\nYou earned 2 frequent renter points\n", string0);
  }

  //Test case number: 2

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Customer customer0 = new Customer("JX*7 B");
      ChildrensMovie childrensMovie0 = new ChildrensMovie("Rental Record for JX*7 B\nYou owed 0.0\nYou earned 0 frequent renter points\n");
      Rental rental0 = new Rental((Movie) childrensMovie0, 1402);
      customer0.addRental(rental0);
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("Rental Record for JX*7 B\nYou owed 0.0\nYou earned 0 frequent renter points\n");
      Rental rental1 = new Rental((Movie) newReleaseMovie0, 1402);
      customer0.addRental(rental1);
      String string0 = customer0.statement();
      assertEquals("Rental Record for JX*7 B\n\tRental Record for JX*7 B\nYou owed 0.0\nYou earned 0 frequent renter points\n\t2100.0\n\tRental Record for JX*7 B\nYou owed 0.0\nYou earned 0 frequent renter points\n\t4206.0\nYou owed 6306.0\nYou earned 3 frequent renter points\n", string0);
  }

  //Test case number: 3

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Customer customer0 = new Customer("PyLj66%4vN93e");
      RegularMovie regularMovie0 = new RegularMovie("PyLj66%4vN93e");
      Rental rental0 = new Rental((Movie) regularMovie0, 1958);
      customer0.addRental(rental0);
      String string0 = customer0.statement();
      assertEquals("Rental Record for PyLj66%4vN93e\n\tPyLj66%4vN93e\t2936.0\nYou owed 2936.0\nYou earned 1 frequent renter points\n", string0);
  }

  //Test case number: 4

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Customer customer0 = new Customer(",e\fkk");
      ChildrensMovie childrensMovie0 = new ChildrensMovie("))%");
      Rental rental0 = new Rental((Movie) childrensMovie0, 1);
      customer0.addRental(rental0);
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("1OR??YEgcAT2hU,=");
      newReleaseMovie0.setPriceCode(0);
      Rental rental1 = new Rental((Movie) newReleaseMovie0, (-2028));
      customer0.addRental(rental1);
      String string0 = customer0.statement();
      assertEquals("Rental Record for ,e\fkk\n\t))%\t1.5\n\t1OR??YEgcAT2hU,=\t2.0\nYou owed 3.5\nYou earned 2 frequent renter points\n", string0);
  }

  //Test case number: 5

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Customer customer0 = new Customer("");
      String string0 = customer0.getName();
      assertEquals("", string0);
  }

  //Test case number: 6

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Customer customer0 = new Customer(",e\fkk");
      String string0 = customer0.getName();
      assertEquals(",e\fkk", string0);
  }

  //Test case number: 7

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Customer customer0 = new Customer("#");
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("#");
      Rental rental0 = new Rental((Movie) newReleaseMovie0, 0);
      customer0.addRental(rental0);
      String string0 = customer0.statement();
      assertEquals("Rental Record for #\n\t#\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n", string0);
  }

  //Test case number: 8

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Customer customer0 = new Customer("#");
      ChildrensMovie childrensMovie0 = new ChildrensMovie("#");
      Rental rental0 = new Rental((Movie) childrensMovie0, 0);
      childrensMovie0.setPriceCode((-640));
      customer0.addRental(rental0);
      String string0 = customer0.statement();
      assertEquals("Rental Record for #\n\t#\t0.0\nYou owed 0.0\nYou earned 1 frequent renter points\n", string0);
  }

  //Test case number: 9

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Customer customer0 = new Customer("PyLj66%4vN93e");
      try { 
        customer0.addRental((Rental) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rental object is Null
         //
         assertThrownBy("nul.study.videostore.Customer", e);
      }
  }

  //Test case number: 10

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Customer customer0 = new Customer("");
      RegularMovie regularMovie0 = new RegularMovie("T;'eo*NxI4<rg/$#66O");
      Rental rental0 = new Rental((Movie) regularMovie0, 2);
      customer0.addRental(rental0);
      String string0 = customer0.statement();
      assertEquals("Rental Record for \n\tT;'eo*NxI4<rg/$#66O\t2.0\nYou owed 2.0\nYou earned 1 frequent renter points\n", string0);
  }

  //Test case number: 11

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Customer customer0 = null;
      try {
        customer0 = new Customer((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // name is Null
         //
         assertThrownBy("nul.study.videostore.Customer", e);
      }
  }
}
