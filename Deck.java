/*
CJ Pecor
CS 110
Deck class
*/

import java.util.Random; 
import java.util.ArrayList; 
  
public class Deck extends Card 
{ 
//Create array lists that hold the cards in the main deck that then gets shuffled and dealt out
//to the decks of the two players. 
   public static int DECK = 52; 
   public static int PLAYER_DECK = 26; 
   public ArrayList<Integer> deck; 
   public ArrayList<Integer> p1; 
   public ArrayList<Integer> p2; 
   public int [] suits = {20, 40, 60, 80}; 
   public int [] ranks = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; 
   public Random rand; 
   //add cards to a deck
   public Deck() 
   { 
      rand = new Random(); 
      deck = new ArrayList<Integer>(); 
      p1 = new ArrayList<Integer>(); 
      p2 = new ArrayList<Integer>(); 
      for (int r = 0; r < ranks.length; r++) 
      { 
         for (int s = 0; s < suits.length; s++)  
            deck.add(ranks[r] + suits[s]);  
      } 
   } 
   //shuffles the deck  
   public void shuffle() 
   { 
      int randNum; 
      int temp; 
      Random r = new Random(); 
      for (int i = 0; i < DECK; i++) 
      { 
         randNum = r.nextInt(DECK); 
         temp = deck.get(i); 
         deck.set(i, Integer.valueOf(deck.get(randNum))); 
         deck.set(randNum, Integer.valueOf(temp)); 
      } 
   } 
   //Deals out the deck to the two players.  
   public void split() 
   { 
      for (int i = 0; i < PLAYER_DECK; i++) 
         p1.add(deck.get(i)); 
      for (int i = 0; i < PLAYER_DECK; i++)
         p2.add(deck.get(i + PLAYER_DECK));
   } 
   //Returns the main, unsplit deck
   //@return deck The main deck. 
   public ArrayList<Integer> getDeck() 
   { 
      return deck; 
   } 
  //Returns the deck belonging to player 1.
  //@return p1 Player 1's deck.   
   public ArrayList<Integer> getP1Deck() 
   { 
      return p1; 
   } 
  //Returns the deck belonging to player 2.
  //@return p2 Player 2's deck.
   public ArrayList<Integer> getP2Deck() 
   { 
      return p2; 
   } 
}