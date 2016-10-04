

package nul.study.videostore.EvoSuiteTests;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.annotation.Annotation;

import nul.study.videostore.ChildrensMovie;
import org.junit.runner.RunWith;

public class ChildrensMovie_ESTest {
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
      ChildrensMovie childrensMovie0 = new ChildrensMovie("<k}`z<bAJULLlr&Nj");
      double double0 = childrensMovie0.determineAmount(3);
      assertEquals(1.5, double0, 0.01);
  }

  //Test case number: 1
  

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChildrensMovie childrensMovie0 = null;
      try {
        childrensMovie0 = new ChildrensMovie((String) null);
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
      ChildrensMovie childrensMovie0 = new ChildrensMovie("<k}`z<bAJULLlr&Nj");
      double double0 = childrensMovie0.determineAmount(83);
      assertEquals(121.5, double0, 0.01);
  }

  //Test case number: 3
  

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChildrensMovie childrensMovie0 = new ChildrensMovie("<k}`z<bAJULLlr&Nj");
      double double0 = childrensMovie0.determineAmount((-1436));
      assertEquals(1.5, double0, 0.01);
  }

  //Test case number: 4
  

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ChildrensMovie childrensMovie0 = new ChildrensMovie("<k}`z<bAJULLlr&Nj");
      int int0 = childrensMovie0.determineFrequentRenterPoints((-321));
      assertEquals(1, int0);
  }
}
