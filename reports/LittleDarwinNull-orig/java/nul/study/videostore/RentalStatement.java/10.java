/* LittleDarwin generated mutant
 mutant type: nullifyReturnValue
 ----> before: return makeHeader   ( )  + makeRentalLines   ( )   + makeSummary   ( )   ;

----> after: return null 
----> line number in original file: 22
*/ 

package nul . study . videostore  ;
 import java . util . ArrayList  ;
 import java . util . List  ;
 public  class RentalStatement { private   String   name    ;
   private   List <Rental    >   rentals  = new ArrayList <Rental    >   ( )        ;
   private   double   totalAmount    ;
   private   int   frequentRenterPoints    ;
   public   RentalStatement ( String   customerName    )  { this   . name  = customerName     ;
  }      public   void addRental ( Rental   rental    )  { rentals   . add  ( rental    )   ;
  }      public   String   makeRentalStatement ( )  throws Exception   { clearTotals   ( )   ;
  return null /*  makeHeader   ( )  + makeRentalLines   ( )   + makeSummary   ( )    */ ;   }      private   void clearTotals ( )  { totalAmount   = 0      ;
  frequentRenterPoints   = 0      ;
  }      private   String   makeHeader ( )  { return "Rental Record for "    + getName   ( )   + "\n"     ;
  }      private   String   makeRentalLines ( )  throws Exception   { String   rentalLines  = ""        ;
  for ( Rental   rental  : rentals     ) rentalLines   += makeRentalLine   ( rental    )    ;
   return rentalLines   ;
  }      private   String   makeRentalLine ( Rental   rental    )  throws Exception   { double   thisAmount  = rental   . determineAmount  ( )      ;
  frequentRenterPoints   += rental   . determineFrequentRenterPoints  ( )    ;
  totalAmount   += thisAmount     ;
  return formatRentalLine   ( rental   , thisAmount    )  ;
  }      private   String   formatRentalLine ( Rental   rental   , double   thisAmount    )  { return "\t"    + rental   . getMovie  ( )  . getTitle  ( )   + "\t"     + thisAmount    + "\n"     ;
  }      private   String   makeSummary ( )  { return "You owed "    + totalAmount    + "\n"     + "You earned "     + frequentRenterPoints    + " frequent renter points\n"     ;
  }      public   String   getName ( )  { return name   ;
  }      public   double   getAmountOwed ( )  { return totalAmount   ;
  }      public   int   getFrequentRenterPoints ( )  { return frequentRenterPoints   ;
  }      }      