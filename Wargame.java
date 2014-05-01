/*
CJ Pecor
CS110
WarGame class
*/
import java.util.ArrayList; 
  
public class WarGame extends Deck 
{ 
//ints that reference the cards in each zone: the zone where the played card is put, the zone where a facedown is put
//in the case of a war, and the zone where the card is played during a war.
   public int Card1; 
   public int Card2; 
   public int Ante1; 
   public int Ante2; 
   public int warCard1; 
   public int warCard2; 
   public ArrayList<Integer> Discard1; 
   public ArrayList<Integer> Discard2; 
   //Creates new discard piles for each player. 
   public WarGame() 
   { 
      Discard1 = new ArrayList<Integer>(); 
      Discard2 = new ArrayList<Integer>(); 
   } 
  //Retrieves the first card in the deck arrays of each player      
   public void drawTopCard() 
   { 
      Card1 = p1.get(0); 
      Card2 = p2.get(0); 
   } 
   //Removes that top card so as to take it out of their deck.  
   public void removeTopCard() 
   { 
      p1.remove(0); 
      p2.remove(0); 
   } 
   //Adds the removed card to the discard pile if Player 1 won the exchange.  
   public void addToPile1() 
   { 
      Discard1.add(p1.get(0)); 
      Discard1.add(p2.get(0)); 
   } 
   //Adds the removed card to the discard pile if Player 2 won the exchange.   
   public void addToPile2() 
   { 
      Discard2.add(p1.get(0)); 
      Discard2.add(p2.get(0)); 
   } 
   //When player 1's deck is empty, adds discard pile to their deck.   
   public void transferToDeck1() 
   { 
      p1.addAll(Discard1); 
      Discard1.clear(); 
   } 
   //When player 2's deck is empty, adds discard pile to their deck.  
   public void transferToDeck2() 
   { 
      p2.addAll(Discard2); 
      Discard2.clear(); 
   } 
   //Returns a boolean on whether or not Player 1's card is greater than Player 2's.
   //@return x boolean relationship of Player 1's vs Player 2's card.
   public boolean greaterThan(int card1, int card2) 
   { 
      boolean x; 
      if (card1 > card2) 
      { 
         x = true; 
      } 
        
      else
      { 
         x = false; 
      } 
      return x; 
   } 
   //Returns a boolean on whether or not Player 1's card is equal to Player 2's.
   //@return x boolean relationship of Player 1's vs Player 2's card.  
   public boolean equalTo(int card1, int card2) 
   { 
      boolean x; 
      if (card1 == card2) 
      { 
         x = true; 
      } 
        
      else
      { 
         x = false; 
      } 
      return x; 
   } 
   //In the case of a war, gets needed cards from the players decks.    
   public void warInstance() 
   { 
      Ante1 = p1.get(1); 
      Ante2 = p2.get(1); 
      warCard1 = p1.get(2); 
      warCard2 = p2.get(2); 
   } 
   //Returns the deck size of Player 1.
   //@return p1.size the size of Player 1's deck.   
   public int getP1DeckSize() 
   { 
      return p1.size(); 
   } 
   //Returns the deck size of Player 2.
   //@return p2.size the size of Player 2's deck.      
   public int getP2DeckSize() 
   { 
      return p2.size(); 
   } 
   //Returns the discard pile size of Player 1.
   //@return Discard1.size the size of Player 1's discard pile.      
   public int getP1PileSize() 
   { 
      return Discard1.size(); 
   } 
   //Returns the discard pile size of Player 2.
   //@return Discard2.size the size of Player 2's discard pile.      
   public int getP2PileSize() 
   { 
      return Discard2.size(); 
   } 
   //Returns value of Player 1's card.
   //@return Card1 Player 1's card.  
   public int getP1Card() 
   { 
      return Card1; 
   } 
   //Returns value of Player 2's card.
   //@return Card2 Player 2's card.       
   public int getP2Card() 
   { 
      return Card2; 
   } 
   //Returns value of Player 1's ante card.
   //@return Card1 Player 1's ante card.       
   public int getAnte1() 
   { 
      return Ante1; 
   } 
   //Returns value of Player 2's ante card.
   //@return Card1 Player 2's ante card.       
   public int getAnte2() 
   { 
      return Ante2; 
   } 
   //Returns value of Player 1's war card.
   //@return Card1 Player 1's war card.       
   public int getWarCard1() 
   { 
      return warCard1; 
   } 
   //Returns value of Player 2's war card.
   //@return Card1 Player 2's war card.       
   public int getWarCard2() 
   { 
      return warCard2; 
   } 
   //Returns the discard pile of Player 1
   //@return Discard1 the discard pile of Player 1     
   public ArrayList<Integer> getP1Pile() 
   { 
      return Discard1; 
   } 
   //Returns the discard pile of Player 2
   //@return Discard2 the discard pile of Player 2  
   public ArrayList<Integer> getP2Pile() 
   { 
      return Discard2; 
   } 
}