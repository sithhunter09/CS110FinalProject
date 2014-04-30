public class Card 
{ 
   public static int SPADES = 20; 
   public static int CLUBS = 40; 
   public static int DIAMONDS = 60; 
   public static int HEARTS = 80; 
   private int rank; 
   private int suit; 
   private String stringSuit; 
   private String stringRank; 
     
   public Card(int cardRank, int cardSuit) 
   { 
      rank = cardRank; 
      suit = cardSuit; 
   } 
     
   public void setRank(int rank) 
   { 
      this.rank = rank; 
   } 
     
   public void setSuit(int suit) 
   { 
      this.suit = suit; 
   } 
     
   public int getRank() 
   { 
      return rank; 
   } 
     
   public int getSuit() 
   { 
      return suit; 
   } 
     
   public String toString() 
   { 
      switch(suit) 
      { 
         case 20: 
            stringSuit = "Spades"; 
            break; 
         case 40: 
            stringSuit = "Clubs"; 
            break; 
         case 60: 
            stringSuit = "Diamonds"; 
            break; 
         case 80: 
            stringSuit = "Hearts"; 
            break; 
      } 
        
      if (rank >= 2 && rank <= 10) 
      { 
         stringRank = String.valueOf(rank); 
      } 
        
      else if (rank == 11) 
      { 
         stringRank = "Jack"; 
      } 
        
      else if (rank == 12) 
      { 
         stringRank = "Queen"; 
      } 
        
      else if (rank == 13) 
      { 
         stringRank = "King"; 
      } 
        
      else if (rank == 14) 
      { 
         stringRank = "Ace"; 
      } 
        
      return stringRank + " of " + stringSuit; 
   } 
     
   public boolean greaterThan(Card otherCard) 
   { 
      boolean x; 
        
      if (rank > otherCard.rank) 
      { 
         x = true; 
      } 
        
      else
      { 
         x = false; 
      } 
        
      return x; 
   } 
     
   public boolean equalTo(Card otherCard) 
   { 
      boolean x; 
        
      if (rank == otherCard.rank) 
      { 
         x = true; 
      } 
        
      else
      { 
         x = false; 
      } 
        
      return x; 
   } 
     
   public boolean lessThan(Card otherCard) 
   { 
      boolean x; 
        
      if (rank < otherCard.rank) 
      { 
         x = true; 
      } 
        
      else
      { 
         x = false; 
      } 
        
      return x; 
   } 
}