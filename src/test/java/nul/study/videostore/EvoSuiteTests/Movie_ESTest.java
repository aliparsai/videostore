
package nul.study.videostore.EvoSuiteTests;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;

import nul.study.videostore.ChildrensMovie;
import nul.study.videostore.NewReleaseMovie;
import nul.study.videostore.RegularMovie;
import org.junit.runner.RunWith;

public class Movie_ESTest {
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
      ChildrensMovie childrensMovie0 = new ChildrensMovie("");
      childrensMovie0.getTitle();
      assertEquals(2, childrensMovie0.getPriceCode());
  }

  //Test case number: 1

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChildrensMovie childrensMovie0 = new ChildrensMovie("&/Q,l");
      int int0 = childrensMovie0.getPriceCode();
      assertEquals(2, int0);
  }

  //Test case number: 2

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegularMovie regularMovie0 = new RegularMovie("7d+?b{,jdRzNW");
      regularMovie0.setPriceCode((-1201));
      int int0 = regularMovie0.getPriceCode();
      assertEquals((-1201), int0);
  }

  //Test case number: 3

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChildrensMovie childrensMovie0 = new ChildrensMovie("");
      childrensMovie0.determineFrequentRenterPoints((-1));
      assertEquals(2, childrensMovie0.getPriceCode());
  }

  //Test case number: 4

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("nul.study.videostore.Movie");
      newReleaseMovie0.determineAmount(0);
      assertEquals(1, newReleaseMovie0.getPriceCode());
  }

  //Test case number: 5

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ChildrensMovie childrensMovie0 = new ChildrensMovie("nul.study.videostore.Movie");
      childrensMovie0.determineAmount(0);
      assertEquals(2, childrensMovie0.getPriceCode());
  }

  //Test case number: 6

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("6sDfY");
      newReleaseMovie0.determineAmount((-945));
      assertEquals(1, newReleaseMovie0.getPriceCode());
  }

  //Test case number: 7

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NewReleaseMovie newReleaseMovie0 = new NewReleaseMovie("6sDfY");
      newReleaseMovie0.getTitle();
      assertEquals(1, newReleaseMovie0.getPriceCode());
  }

  //Test case number: 8

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NewReleaseMovie newReleaseMovie0 = null;
      try {
        newReleaseMovie0 = new NewReleaseMovie((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // title is Null
         //
         assertThrownBy("nul.study.videostore.Movie", e);
      }
  }

  //Test case number: 9

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      RegularMovie regularMovie0 = new RegularMovie("7d+?b{,jdRzNW");
      int int0 = regularMovie0.getPriceCode();
      assertEquals(0, int0);
  }
}
