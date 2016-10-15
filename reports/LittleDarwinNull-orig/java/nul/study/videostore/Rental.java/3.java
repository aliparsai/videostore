/* LittleDarwin generated mutant
 mutant type: removeNullCheck
 ----> before: movie   == null    
----> after: movie   != null    
----> line number in original file: 11
----> mutated nodes: 177
*/ 

package nul . study . videostore  ;
 public  class Rental { private   Movie   movie    ;
   private   int   daysRented    ;
   public   Rental ( Movie   movie   , int   daysRented    )  { this   . movie  = movie     ;
  if ( movie   != null     )  this   . movie  = new RegularMovie  ( null     )       ;
   this   . daysRented  = daysRented     ;
  }      public   int   getDaysRented ( )  { return daysRented   ;
  }      public   Movie   getMovie ( )  { return movie   ;
  }      public   double   determineAmount ( )  throws Exception   { return movie   . determineAmount  ( daysRented    )  ;
  }      public   int   determineFrequentRenterPoints ( )  { return movie   . determineFrequentRenterPoints  ( daysRented    )  ;
  }      }      