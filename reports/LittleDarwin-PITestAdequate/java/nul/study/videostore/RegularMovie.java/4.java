/* LittleDarwin generated mutant
 mutant type: relationalOperatorReplacement
 ----> before: daysRented   >2    
----> after: daysRented   <= 2    
----> line number in original file: 11
----> mutated nodes: 90
*/ 

package nul . study . videostore  ;
 public  class RegularMovie extends Movie   { public   RegularMovie ( String   title    )  { super   ( title   , REGULAR    )   ;
  }      @ Override      public   double   determineAmount ( int   daysRented    )  throws Exception   { double   thisAmount  = 2    + super   . determineAmount  ( daysRented    )       ;
  if ( daysRented   <= 2     )  thisAmount   += ( daysRented   - 2     )   * 1.5       ;
   return thisAmount   ;
  }      @ Override      public   int   determineFrequentRenterPoints ( int   daysRented    )  { return 1    ;
  }      }      