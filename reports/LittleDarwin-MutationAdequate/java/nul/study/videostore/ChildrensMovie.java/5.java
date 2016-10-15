/* LittleDarwin generated mutant
 mutant type: assignmentOperatorReplacementShortcut
----> before: thisAmount   += ( daysRented   - 3     )   * 1.5     
----> after: thisAmount   -= ( daysRented   - 3     )   * 1.5     
----> line number in original file: 12
----> mutated nodes: 64
*/ 

package nul . study . videostore  ;
 public  class ChildrensMovie extends Movie   { public   ChildrensMovie ( String   title    )  { super   ( title   , CHILDRENS    )   ;
  }      @ Override      public   double   determineAmount ( int   daysRented    )  throws Exception   { double   thisAmount  = 1.5    + super   . determineAmount  ( daysRented    )       ;
  if ( daysRented   >3     )  thisAmount   -= ( daysRented   - 3     )   * 1.5       ;
   return thisAmount   ;
  }      @ Override      public   int   determineFrequentRenterPoints ( int   daysRented    )  { return 1    ;
  }      }      