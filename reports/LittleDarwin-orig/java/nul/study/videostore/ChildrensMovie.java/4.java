/* LittleDarwin generated mutant
 mutant type: relationalOperatorReplacement
 ----> before: daysRented   >3    
----> after: daysRented   <= 3    
----> line number in original file: 11
----> mutated nodes: 90
*/ 

package nul . study . videostore  ;
 public  class ChildrensMovie extends Movie   { public   ChildrensMovie ( String   title    )  { super   ( title   , CHILDRENS    )   ;
  }      @ Override      public   double   determineAmount ( int   daysRented    )  throws Exception   { double   thisAmount  = 1.5    + super   . determineAmount  ( daysRented    )       ;
  if ( daysRented   <= 3     )  thisAmount   += ( daysRented   - 3     )   * 1.5       ;
   return thisAmount   ;
  }      @ Override      public   int   determineFrequentRenterPoints ( int   daysRented    )  { return 1    ;
  }      }      