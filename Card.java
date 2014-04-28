public class Card 
{     
    public final static int SPADES = 0, HEARTS = 1, DIAMONDS = 2, CLUBS = 3;
    public final static int ACE = 1, JACK = 11, QUEEN = 12, KING = 13;
    private int suit; 
                              
    private int rank;  
    public Card(int rank, int suit) 
    {
        this.rank = rank;
        this.suit = suit;
    }
    public Card(Card otherCard) 
    {
         this.rank = otherCard.rank;
         this.suit = otherCard.suit;
    }
    public int getSuit() 
    {
      return suit;
    }
    public int getRank() 
    {
        return rank;
    }
    public String getSuitAsString() 
    {
        switch ( suit ) {
           case SPADES:   return "Spades";
           case HEARTS:   return "Hearts";
           case DIAMONDS: return "Diamonds";
           case CLUBS:    return "Clubs";
           default:       return "Invalid";
        }
    }
   public String getRankAsString() 
   {
        switch ( rank )
        {
           case 1:   
           return "Ace";
           case 2:   
           return "2";
           case 3:   
           return "3";
           case 4:   
           return "4";
           case 5:  
           return "5";
           case 6:   
           return "6";
           case 7:   
           return "7";
           case 8:   
           return "8";
           case 9:   
           return "9";
           case 10:  
           return "10";
           case 11:  
           return "Jack";
           case 12:  
           return "Queen";
           case 13:  
           return "King";
           default:  
           return "__";
        }
    }
    public String toString() 
    {
        return getRankAsString() + " of " + getSuitAsString();
    }
   public boolean equals(Card otherCard ) 
   {
      if ( ( rank != otherCard.rank ) || ( suit != otherCard.suit ) )
         return false;
      else
         return true;
   }

}
    