/*
 * This file was automatically generated by EvoSuite
 * Fri Sep 30 17:45:08 GMT 2016
 */

package nul.study.videostore.EvoSuiteTests;

import org.junit.Test;
import static org.junit.Assert.*;
import nul.study.videostore.ChildrensMovie;

public class ChildrensMovie_ESTest {

  //Test case number: 0
  /*
   * 61 covered goals:
   * Goal 1. nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. nul.study.videostore.ChildrensMovie.determineAmount(I)D: I8 Branch 1 IF_ICMPLE L11 - false
   * Goal 3. Branch nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V: root-Branch in context: nul.study.videostore.ChildrensMovie:<init>(Ljava/lang/String;)V
   * Goal 4. Branch nul.study.videostore.ChildrensMovie.determineAmount(I)D: I8 Branch 1 IF_ICMPLE L11 - false in context: nul.study.videostore.ChildrensMovie:determineAmount(I)D
   * Goal 5. [Output]: nul.study.videostore.ChildrensMovie.determineAmount(I)D:Positive
   * Goal 6. nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V: Line 6
   * Goal 7. nul.study.videostore.ChildrensMovie.determineAmount(I)D: Line 10
   * Goal 8. nul.study.videostore.ChildrensMovie.determineAmount(I)D: Line 11
   * Goal 9. nul.study.videostore.ChildrensMovie.determineAmount(I)D: Line 12
   * Goal 10. nul.study.videostore.ChildrensMovie.determineAmount(I)D: Line 14
   * Goal 11. [METHOD] nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V
   * Goal 12. [METHOD] nul.study.videostore.ChildrensMovie.determineAmount(I)D
   * Goal 13. [METHODNOEX] nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V
   * Goal 14. [METHODNOEX] nul.study.videostore.ChildrensMovie.determineAmount(I)D
   * Goal 15. Weak Mutation 0: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> 0.0
   * Goal 16. Weak Mutation 1: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> 1.0
   * Goal 17. Weak Mutation 2: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> -1.0
   * Goal 18. Weak Mutation 3: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> 0.5
   * Goal 19. Weak Mutation 4: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> 2.5
   * Goal 20. Weak Mutation 5: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceVariable daysRented -> NEW_RELEASE
   * Goal 21. Weak Mutation 6: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceVariable daysRented -> REGULAR
   * Goal 22. Weak Mutation 7: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceVariable daysRented -> CHILDRENS
   * Goal 23. Weak Mutation 8: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - InsertUnaryOp Negation of daysRented
   * Goal 24. Weak Mutation 9: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - InsertUnaryOp IINC 1 daysRented
   * Goal 25. Weak Mutation 10: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - InsertUnaryOp IINC -1 daysRented
   * Goal 26. Weak Mutation 11: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> 0
   * Goal 27. Weak Mutation 12: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> 1
   * Goal 28. Weak Mutation 13: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> -1
   * Goal 29. Weak Mutation 14: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> 2
   * Goal 30. Weak Mutation 15: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> 4
   * Goal 31. Weak Mutation 16: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceComparisonOperator <= -> -1
   * Goal 32. Weak Mutation 19: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - InsertUnaryOp Negation of thisAmount
   * Goal 33. Weak Mutation 20: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceVariable daysRented -> NEW_RELEASE
   * Goal 34. Weak Mutation 21: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceVariable daysRented -> REGULAR
   * Goal 35. Weak Mutation 22: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceVariable daysRented -> CHILDRENS
   * Goal 36. Weak Mutation 23: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - InsertUnaryOp Negation of daysRented
   * Goal 37. Weak Mutation 24: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - InsertUnaryOp IINC 1 daysRented
   * Goal 38. Weak Mutation 25: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - InsertUnaryOp IINC -1 daysRented
   * Goal 39. Weak Mutation 26: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceConstant - 3 -> 0
   * Goal 40. Weak Mutation 27: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceConstant - 3 -> 1
   * Goal 41. Weak Mutation 28: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceConstant - 3 -> -1
   * Goal 42. Weak Mutation 29: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceConstant - 3 -> 2
   * Goal 43. Weak Mutation 30: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceConstant - 3 -> 4
   * Goal 44. Weak Mutation 31: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceArithmeticOperator - -> +
   * Goal 45. Weak Mutation 32: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceArithmeticOperator - -> %
   * Goal 46. Weak Mutation 33: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceArithmeticOperator - -> *
   * Goal 47. Weak Mutation 34: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceArithmeticOperator - -> /
   * Goal 48. Weak Mutation 35: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceConstant - 1.5 -> 0.0
   * Goal 49. Weak Mutation 36: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceConstant - 1.5 -> 1.0
   * Goal 50. Weak Mutation 37: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceConstant - 1.5 -> -1.0
   * Goal 51. Weak Mutation 38: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceConstant - 1.5 -> 0.5
   * Goal 52. Weak Mutation 39: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceConstant - 1.5 -> 2.5
   * Goal 53. Weak Mutation 40: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceArithmeticOperator * -> +
   * Goal 54. Weak Mutation 41: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceArithmeticOperator * -> %
   * Goal 55. Weak Mutation 42: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceArithmeticOperator * -> -
   * Goal 56. Weak Mutation 43: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceArithmeticOperator * -> /
   * Goal 57. Weak Mutation 44: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceArithmeticOperator + -> %
   * Goal 58. Weak Mutation 45: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceArithmeticOperator + -> -
   * Goal 59. Weak Mutation 46: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceArithmeticOperator + -> *
   * Goal 60. Weak Mutation 47: nul.study.videostore.ChildrensMovie.determineAmount(I)D:12 - ReplaceArithmeticOperator + -> /
   * Goal 61. Weak Mutation 48: nul.study.videostore.ChildrensMovie.determineAmount(I)D:14 - InsertUnaryOp Negation of thisAmount
   */

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChildrensMovie childrensMovie0 = new ChildrensMovie("1&");
      double double0 = childrensMovie0.determineAmount(3158);
      assertEquals(4734.0, double0, 0.01);
  }

  //Test case number: 1
  /*
   * 30 covered goals:
   * Goal 1. nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. nul.study.videostore.ChildrensMovie.determineAmount(I)D: I8 Branch 1 IF_ICMPLE L11 - true
   * Goal 3. Branch nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V: root-Branch in context: nul.study.videostore.ChildrensMovie:<init>(Ljava/lang/String;)V
   * Goal 4. Branch nul.study.videostore.ChildrensMovie.determineAmount(I)D: I8 Branch 1 IF_ICMPLE L11 - true in context: nul.study.videostore.ChildrensMovie:determineAmount(I)D
   * Goal 5. [Output]: nul.study.videostore.ChildrensMovie.determineAmount(I)D:Positive
   * Goal 6. nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V: Line 6
   * Goal 7. nul.study.videostore.ChildrensMovie.determineAmount(I)D: Line 10
   * Goal 8. nul.study.videostore.ChildrensMovie.determineAmount(I)D: Line 11
   * Goal 9. nul.study.videostore.ChildrensMovie.determineAmount(I)D: Line 14
   * Goal 10. [METHOD] nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V
   * Goal 11. [METHOD] nul.study.videostore.ChildrensMovie.determineAmount(I)D
   * Goal 12. [METHODNOEX] nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V
   * Goal 13. [METHODNOEX] nul.study.videostore.ChildrensMovie.determineAmount(I)D
   * Goal 14. Weak Mutation 0: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> 0.0
   * Goal 15. Weak Mutation 1: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> 1.0
   * Goal 16. Weak Mutation 2: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> -1.0
   * Goal 17. Weak Mutation 3: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> 0.5
   * Goal 18. Weak Mutation 4: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> 2.5
   * Goal 19. Weak Mutation 6: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceVariable daysRented -> REGULAR
   * Goal 20. Weak Mutation 7: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceVariable daysRented -> CHILDRENS
   * Goal 21. Weak Mutation 8: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - InsertUnaryOp Negation of daysRented
   * Goal 22. Weak Mutation 9: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - InsertUnaryOp IINC 1 daysRented
   * Goal 23. Weak Mutation 10: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - InsertUnaryOp IINC -1 daysRented
   * Goal 24. Weak Mutation 11: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> 0
   * Goal 25. Weak Mutation 12: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> 1
   * Goal 26. Weak Mutation 13: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> -1
   * Goal 27. Weak Mutation 14: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> 2
   * Goal 28. Weak Mutation 15: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> 4
   * Goal 29. Weak Mutation 18: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceComparisonOperator <= -> ==
   * Goal 30. Weak Mutation 48: nul.study.videostore.ChildrensMovie.determineAmount(I)D:14 - InsertUnaryOp Negation of thisAmount
   */

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChildrensMovie childrensMovie0 = new ChildrensMovie("1&");
      double double0 = childrensMovie0.determineAmount(1);
      assertEquals(1.5, double0, 0.01);
  }

  //Test case number: 2
  /*
   * 12 covered goals:
   * Goal 1. nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. nul.study.videostore.ChildrensMovie.determineFrequentRenterPoints(I)I: root-Branch
   * Goal 3. Branch nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V: root-Branch in context: nul.study.videostore.ChildrensMovie:<init>(Ljava/lang/String;)V
   * Goal 4. Branch nul.study.videostore.ChildrensMovie.determineFrequentRenterPoints(I)I: root-Branch in context: nul.study.videostore.ChildrensMovie:determineFrequentRenterPoints(I)I
   * Goal 5. [Output]: nul.study.videostore.ChildrensMovie.determineFrequentRenterPoints(I)I:Positive
   * Goal 6. nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V: Line 6
   * Goal 7. nul.study.videostore.ChildrensMovie.determineFrequentRenterPoints(I)I: Line 19
   * Goal 8. [METHOD] nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V
   * Goal 9. [METHOD] nul.study.videostore.ChildrensMovie.determineFrequentRenterPoints(I)I
   * Goal 10. [METHODNOEX] nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V
   * Goal 11. [METHODNOEX] nul.study.videostore.ChildrensMovie.determineFrequentRenterPoints(I)I
   * Goal 12. Weak Mutation 49: nul.study.videostore.ChildrensMovie.determineFrequentRenterPoints(I)I:19 - ReplaceConstant - 1 -> 0
   */

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChildrensMovie childrensMovie0 = new ChildrensMovie("1&");
      int int0 = childrensMovie0.determineFrequentRenterPoints(3158);
      assertEquals(1, int0);
  }

  //Test case number: 3
  /*
   * 31 covered goals:
   * Goal 1. nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. nul.study.videostore.ChildrensMovie.determineAmount(I)D: I8 Branch 1 IF_ICMPLE L11 - true
   * Goal 3. Branch nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V: root-Branch in context: nul.study.videostore.ChildrensMovie:<init>(Ljava/lang/String;)V
   * Goal 4. Branch nul.study.videostore.ChildrensMovie.determineAmount(I)D: I8 Branch 1 IF_ICMPLE L11 - true in context: nul.study.videostore.ChildrensMovie:determineAmount(I)D
   * Goal 5. [Output]: nul.study.videostore.ChildrensMovie.determineAmount(I)D:Positive
   * Goal 6. nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V: Line 6
   * Goal 7. nul.study.videostore.ChildrensMovie.determineAmount(I)D: Line 10
   * Goal 8. nul.study.videostore.ChildrensMovie.determineAmount(I)D: Line 11
   * Goal 9. nul.study.videostore.ChildrensMovie.determineAmount(I)D: Line 14
   * Goal 10. [METHOD] nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V
   * Goal 11. [METHOD] nul.study.videostore.ChildrensMovie.determineAmount(I)D
   * Goal 12. [METHODNOEX] nul.study.videostore.ChildrensMovie.<init>(Ljava/lang/String;)V
   * Goal 13. [METHODNOEX] nul.study.videostore.ChildrensMovie.determineAmount(I)D
   * Goal 14. Weak Mutation 0: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> 0.0
   * Goal 15. Weak Mutation 1: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> 1.0
   * Goal 16. Weak Mutation 2: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> -1.0
   * Goal 17. Weak Mutation 3: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> 0.5
   * Goal 18. Weak Mutation 4: nul.study.videostore.ChildrensMovie.determineAmount(I)D:10 - ReplaceConstant - 1.5 -> 2.5
   * Goal 19. Weak Mutation 5: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceVariable daysRented -> NEW_RELEASE
   * Goal 20. Weak Mutation 6: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceVariable daysRented -> REGULAR
   * Goal 21. Weak Mutation 7: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceVariable daysRented -> CHILDRENS
   * Goal 22. Weak Mutation 8: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - InsertUnaryOp Negation of daysRented
   * Goal 23. Weak Mutation 9: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - InsertUnaryOp IINC 1 daysRented
   * Goal 24. Weak Mutation 10: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - InsertUnaryOp IINC -1 daysRented
   * Goal 25. Weak Mutation 11: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> 0
   * Goal 26. Weak Mutation 12: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> 1
   * Goal 27. Weak Mutation 13: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> -1
   * Goal 28. Weak Mutation 14: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> 2
   * Goal 29. Weak Mutation 15: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceConstant - 3 -> 4
   * Goal 30. Weak Mutation 17: nul.study.videostore.ChildrensMovie.determineAmount(I)D:11 - ReplaceComparisonOperator <= -> <
   * Goal 31. Weak Mutation 48: nul.study.videostore.ChildrensMovie.determineAmount(I)D:14 - InsertUnaryOp Negation of thisAmount
   */

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChildrensMovie childrensMovie0 = new ChildrensMovie((String) null);
      double double0 = childrensMovie0.determineAmount(3);
      assertEquals(1.5, double0, 0.01);
  }
}
