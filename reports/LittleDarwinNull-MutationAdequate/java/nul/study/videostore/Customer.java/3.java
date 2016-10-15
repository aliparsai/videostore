/* LittleDarwin generated mutant
 mutant type: nullifyReturnValue
 ----> before: return name   ;

----> after: return null 
----> line number in original file: 24
*/ 

package nul . study . videostore  ;
 import java . util . Vector  ;
 import java . util . Enumeration  ;
 public  class Customer { public   Customer ( String   name    )  throws NullPointerException   { if ( name   == null     )  throw new NullPointerException  ( "name is Null"     )     ;
   this   . name  = name     ;
  }      public   void addRental ( Rental   rental    )  throws NullPointerException   { if ( rental   == null     )  rentals   . addElement  ( new Rental  ( new RegularMovie  ( null     )     , 0     )      )   ;
 else rentals   . addElement  ( rental    )   ;
   }      public   String   getName ( )  { return null /*  name    */ ;   }      public   String   statement ( )  { double   totalAmount  = 0        ;
  int   frequentRenterPoints  = 0        ;
  Enumeration <Rental    >   rentals  = this   . rentals  . elements  ( )      ;
  String   result  = "Rental Record for "    + getName   ( )   + "\n"         ;
  while ( rentals   . hasMoreElements  ( )  )  { double   thisAmount  = 0        ;
  Rental   each  = rentals   . nextElement  ( )      ;
  switch ( each   . getMovie  ( )  . getPriceCode  ( )  )  { case Movie   . REGULAR   :  thisAmount   += 2      ;
  if ( each   . getDaysRented  ( )  >2     )  thisAmount   += ( each   . getDaysRented  ( )  - 2     )   * 1.5       ;
   break ;
   case Movie   . NEW_RELEASE   :  thisAmount   += each   . getDaysRented  ( )  * 3       ;
  break ;
   case Movie   . CHILDRENS   :  thisAmount   += 1.5      ;
  if ( each   . getDaysRented  ( )  >3     )  thisAmount   += ( each   . getDaysRented  ( )  - 3     )   * 1.5       ;
   break ;
   }   frequentRenterPoints   ++   ;
  if ( each   . getMovie  ( )  . getPriceCode  ( )  == Movie   . NEW_RELEASE   && each   . getDaysRented  ( )  >1      )  frequentRenterPoints   ++   ;
   result   += "\t"    + each   . getMovie  ( )  . getTitle  ( )   + "\t"     + String   . valueOf  ( thisAmount    )   + "\n"       ;
  totalAmount   += thisAmount     ;
  }     result   += "You owed "    + String   . valueOf  ( totalAmount    )   + "\n"       ;
  result   += "You earned "    + String   . valueOf  ( frequentRenterPoints    )   + " frequent renter points\n"       ;
  return result   ;
  }      private   String   name    ;
   private   Vector <Rental    >   rentals  = new Vector <Rental    >   ( )        ;
   }      