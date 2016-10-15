/* LittleDarwin generated mutant
 mutant type: nullifyObjectInitialization
 ----> before: new RegularMovie  ( null     )    
----> after:  null 
----> line number in original file: 12
*/ 

package nul . study . videostore  ;
 public  class Rental { private   Movie   movie    ;
   private   int   daysRented    ;
   public   Rental ( Movie   movie   , int   daysRented    )  { this   . movie  = movie     ;
  if ( movie   == null     )  this   . movie  =  null /*  RegularMovie  ( null      ) */        ;
   this   . daysRented  = daysRented     ;
  }      public   int   getDaysRented ( )  { return daysRented   ;
  }      public   Movie   getMovie ( )  { return movie   ;
  }      public   double   determineAmount ( )  throws Exception   { return movie   . determineAmount  ( daysRented    )  ;
  }      public   int   determineFrequentRenterPoints ( )  { return movie   . determineFrequentRenterPoints  ( daysRented    )  ;
  }      }      