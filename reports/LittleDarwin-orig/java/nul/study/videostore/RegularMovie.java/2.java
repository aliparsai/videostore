/* LittleDarwin generated mutant
 mutant type: arithmeticOperatorReplacementBinary
 ----> before: ( daysRented   - 2     )   * 1.5    
----> after: ( daysRented   - 2     )   / 1.5    
----> line number in original file: 12
----> mutated nodes: 65
*/ 

package nul . study . videostore  ;
 public  class RegularMovie extends Movie   { public   RegularMovie ( String   title    )  { super   ( title   , REGULAR    )   ;
  }      @ Override      public   double   determineAmount ( int   daysRented    )  throws Exception   { double   thisAmount  = 2    + super   . determineAmount  ( daysRented    )       ;
  if ( daysRented   >2     )  thisAmount   += ( daysRented   - 2     )   / 1.5       ;
   return thisAmount   ;
  }      @ Override      public   int   determineFrequentRenterPoints ( int   daysRented    )  { return 1    ;
  }      }      