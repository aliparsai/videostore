
package nul.study.videostore.EvoSuiteTests;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;

import nul.study.videostore.RegularMovie;
import org.junit.runner.RunWith;

public class RegularMovie_ESTest  {
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
      RegularMovie regularMovie0 = new RegularMovie(";h[GHr");
      double double0 = regularMovie0.determineAmount(1);
      assertEquals(2.0, double0, 0.01);
  }

  //Test case number: 1

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RegularMovie regularMovie0 = null;
      try {
        regularMovie0 = new RegularMovie((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // title is Null
         //
         assertThrownBy("nul.study.videostore.Movie", e);
      }
  }

  //Test case number: 2

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RegularMovie regularMovie0 = new RegularMovie("");
      double double0 = regularMovie0.determineAmount(742);
      assertEquals(1112.0, double0, 0.01);
  }

  //Test case number: 3

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RegularMovie regularMovie0 = new RegularMovie(";h[GHr");
      int int0 = regularMovie0.determineFrequentRenterPoints(1);
      assertEquals(1, int0);
  }

  //Test case number: 4

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RegularMovie regularMovie0 = new RegularMovie("title is Null");
      double double0 = regularMovie0.determineAmount(2);
      assertEquals(2.0, double0, 0.01);
  }
}
