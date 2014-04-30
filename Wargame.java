public class WarGame extends Deck 
{ 
   public int drawnCard1; 
   public int drawnCard2; 
   public int [] p1Pile; 
   public int [] p2Pile; 
     
   public WarGame(int cardRank, int cardSuit) 
   { 
      super(cardRank, cardSuit); 
        
   public int drawP1Card() 
   { 
      drawnCard1 = p1Deck[0]; 
      return drawnCard1; 
   } 
     
   public int drawP2Card() 
   { 
      drawnCard2 = p2Deck[0]; 
      return drawnCard2; 
   } 