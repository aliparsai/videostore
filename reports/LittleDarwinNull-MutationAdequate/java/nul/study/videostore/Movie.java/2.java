/* LittleDarwin generated mutant
 mutant type: nullifyObjectInitialization
 ----> before: new Exception  ( "Invalid value for daysRented."     )    
----> after:  null 
----> line number in original file: 36
*/ 

package nul . study . videostore  ;
 public  abstract  class Movie { public   static   final   int   REGULAR  = 0       ;
   public   static   final   int   NEW_RELEASE  = 1       ;
   public   static   final   int   CHILDRENS  = 2       ;
   private   String   title    ;
   private   int   priceCode    ;
   public   Movie ( String   title   , int   priceCode    )  { this   . title  = title     ;
  if ( title   == null     )  this   . title  = "Untitled"      ;
   this   . priceCode  = priceCode     ;
  }      public   int   getPriceCode ( )  { return priceCode   ;
  }      public   void setPriceCode ( int   code    )  { priceCode   = code     ;
  }      public   String   getTitle ( )  { return title   ;
  }      public   double   determineAmount ( int   daysRented    )  throws Exception   { if ( daysRented   <= 0     )  throw  null /*  Exception  ( "Invalid value for daysRented."      ) */      ;
   return 0    ;
  }      public   abstract   int   determineFrequentRenterPoints ( int   daysRented    )  ;
   }      