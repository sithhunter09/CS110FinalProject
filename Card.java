/*
CJ Pecor
CS110
Card Class
*/

public class Card 
{ 
//hold info for cards. Card types done in multiples of 20 to make it easier for card identification.
   public final int SPADES = 20; 
   public final int CLUBS = 40; 
   public final int DIAMONDS = 60; 
   public final int HEARTS = 80; 
   private int rank; 
   private int suit; 
   private String Suit; 
   private String Rank; 
   //Determines the rank and suit of a card.
   //@param int cardVal the card's value.
   public void findCard(int cardVal) 
   { 
      if (cardVal >= 22 && cardVal <= 34) 
      { 
         rank = cardVal - SPADES; 
         suit = SPADES; 
      } 
        
      else if (cardVal >= 42 && cardVal <= 54) 
      { 
         rank = cardVal - CLUBS; 
         suit = CLUBS; 
      } 
        
      else if (cardVal >= 62 && cardVal <= 74) 
      { 
         rank = cardVal - DIAMONDS; 
         suit = DIAMONDS; 
      } 
        
      else if (cardVal >= 82 && cardVal <= 94) 
      { 
         rank = cardVal - HEARTS; 
         suit = HEARTS; 
      } 
   } 
   //Sets the rank of a card. 
   //@param int rank The card's rank.
   public void setRank(int rank) 
   { 
      this.rank = rank; 
   } 
   //Sets the suit of a card.
   //@param in suit The card's suit.   
   public void setSuit(int suit) 
   { 
      this.suit = suit; 
   } 
   //Returns the card's rank.
   //@return rank The card's rank.   
   public int getRank() 
   { 
      return rank; 
   } 
   //Returns the card's suit.
   //@return suit The card's suit.   
   public int getSuit() 
   { 
      return suit; 
   } 
   //Returns the values of the card as a string (Ace of Diamonds, for example)
   //@return Rank the card rank.
   //@return Suit the card suit.   
   public String toString() 
   { 
      switch(suit) 
      { 
         case SPADES: 
            Suit = "Spades"; 
            break; 
         case CLUBS: 
            Suit = "Clubs"; 
            break; 
         case DIAMONDS: 
            Suit = "Diamonds"; 
            break; 
         case HEARTS: 
            Suit = "Hearts"; 
            break; 
      }   
      if (rank >= 2 && rank <= 10) 
      { 
         Rank = String.valueOf(rank); 
      }   
      else if (rank == 11) 
      { 
         Rank = "Jack"; 
      }  
      else if (rank == 12) 
      { 
         Rank = "Queen"; 
      }   
      else if (rank == 13) 
      { 
         Rank = "King"; 
      }   
      else if (rank == 14) 
      { 
         Rank = "Ace"; 
      }  
      return Rank + " of " + Suit; 
   } 
}