import java.util.Random; 
import java.util.Arrays;
import java.util.ArrayList; 
  
public class Deck extends Card 
{
   public static int DECK_SIZE = 52; 
   public static int HALF_DECK = 26; 
   public ArrayList<Integer> deck; 
   public ArrayList<Integer> p1Deck; 
   public ArrayList<Integer> p2Deck; 
   public ArrayList<Integer> suits = {20, 40, 60, 80}; 
   public ArrayList<Integer> ranks = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; 
   public Random rand; 
     
     
   //make the deck, use for loop to add unique cards to that array 
   public Deck(int cardRank, int cardSuit) 
   { 
      super(cardRank, cardSuit); 
      rand = new Random(); 
      deck = new ArrayList<>(); 
      p1Deck = new ArrayList<>(); 
      p2Deck = new ArrayList<>(); 
      for (int r = 0; r < ranks.length; r++) 
      { 
         for (int s = 0; s < suits.length; s++) 
         { 
            deck.add(ranks[r] + suits[s]); 
         } 
      } 
   } 
     
   public void shuffle() 
   { 
      int randNum; 
      int temp; 
      Random r = new Random(); 
      for (int i = 0; i < DECK_SIZE; i++) 
      { 
         randNum = r.nextInt(DECK_SIZE); 
         temp = deck.get(i); 
         deck.get(i) = deck.get(randNum); 
         deck(randNum) = temp; 
      } 
   } 
     
   public void split() 
   { 
      for (int i = 0; i < HALF_DECK; i++) 
      { 
         p1Deck[i] = deck[i]; 
      } 
        
      for (int i = 0; i < HALF_DECK; i++) 
      { 
         p2Deck[i] = deck[i + HALF_DECK]; 
      } 
   } 
     
   public String getDeck() 
   { 
      return Arrays.toString(deck); 
   } 
     
   public String getP1Deck() 
   { 
      return Arrays.toString(p1Deck); 
   } 
     
   public String getP2Deck() 
   { 
      return Arrays.toString(p2Deck); 
   } 
  
   public static void main(String [] args) 
   { 
      Deck d = new Deck(25, 45); 
      d.shuffle(); 
      d.split(); 
      System.out.println(d.getDeck()); 
      System.out.println(d.getP1Deck()); 
      System.out.println(d.getP2Deck()); 
   } 
}