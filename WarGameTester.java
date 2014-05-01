/*
CJ Pecor
CS110
WarGameTester class
*/
import java.util.Scanner; 
  
public class WarGameTester 
{ 
   public static void main(String [] args) 
   { 
   //Create variables for all required instances. 
      int P1Card; 
      int P2Card; 
      int P1Rank; 
      int P2Rank; 
      int P1WarCard; 
      int P2WarCard; 
      int P1FaceDown; 
      int P2FaceDown; 
      int P1WarRank; 
      int P2WarRank; 
      String P1CardString; 
      String P2CardString; 
      String P1WarString; 
      String P2WarString; 
      boolean greater; 
      boolean equal; 
      
      WarGame w = new WarGame();  //Create a new game.
          
      System.out.println("WAR!");  
      w.shuffle(); //Shuffle decks
      w.split(); //Deak out the two decks.
      Scanner keyboard = new Scanner(System.in); 
      System.out.print("Guns have been loaded and are ready to fire. Deal a card by pressing 1: "); 
      int answer = keyboard.nextInt(); 
      while (answer == 1) 
      {   
      //While they keep wishing to continue, retrieves top card of deck, determines its value and suit, 
      //returns said information as a strings. 
         w.drawTopCard(); 
         P1Card = w.getP1Card(); 
         P2Card = w.getP2Card(); 
         w.findCard(P1Card); 
         P1Rank = w.getRank(); 
         P1CardString = w.toString(); 
         w.findCard(P2Card); 
         P2Rank = w.getRank(); 
         P2CardString = w.toString(); 
         System.out.printf("Player 1: %s\n", P1CardString); 
         System.out.printf("Player 2: %s\n", P2CardString); 
         greater = w.greaterThan(P1Rank, P2Rank); 
         equal = w.equalTo(P1Rank, P2Rank); 
         //If the returned boolean returned is true (Player 1's card greater than Player 2's) adds to player 1's discard.
         if (greater == true) 
         { 
            System.out.println("Player 1 has won the battle."); 
            w.addToPile1(); 
         } 
         //Does the same for Player 2 if the returned is false. However, if it is equal, they enter a war, repeating the same process
         //but with a single card ante as well. 
         else if (greater == false) 
         { 
            if (equal == true) 
            { 
               w.warInstance(); 
               P1FaceDown = w.getAnte1(); 
               P2FaceDown = w.getAnte2(); 
               P1WarCard = w.getWarCard1(); 
               P2WarCard = w.getWarCard2(); 
               w.findCard(P1WarCard); 
               P1WarRank = w.getRank(); 
               P1WarString = w.toString(); 
               w.findCard(P2WarCard); 
               P2WarRank = w.getRank(); 
               P2WarString = w.toString(); 
               System.out.println("!WAR!"); 
               System.out.println("Each player has additional cards on the line."); 
               System.out.printf("Player 1: %s\n", P1WarString); 
               System.out.printf("Player 2: %s\n", P2WarString); 
               greater = w.greaterThan(P1WarRank, P2WarRank); 
               if (greater == true) 
               { 
                  System.out.println("Victory for Player 1!"); 
                  w.addToPile1(); 
                  w.removeTopCard(); 
                  w.addToPile1(); 
                  w.removeTopCard(); 
                  w.addToPile1(); 
               } 
               else if (greater == false) 
               { 
                  System.out.println("Victory for Player 2!"); 
                  w.addToPile2(); 
                  w.removeTopCard(); 
                  w.addToPile2(); 
                  w.removeTopCard(); 
                  w.addToPile2(); 
               } 
            } 
            else if (equal == false) 
            { 
               System.out.println("Player has won this battle."); 
               w.addToPile2(); 
            } 
         }    
         //removes the the played card from the player's decks. 
         w.removeTopCard(); 
         System.out.printf("Player 1's deck size: %d\n", w.getP1DeckSize()); 
         System.out.printf("Player 2's deck size: %d\n", w.getP2DeckSize());     
         if (answer == 1) 
         //if player 1 is out of cards during the war, player 2 wins. Vice versa as well. 
         { 
            if (w.getP1DeckSize() == 0) 
            { 
               if (w.getP1PileSize() == 0) 
               { 
                  System.out.println("Player 2 has won the War!"); 
                  answer = 2; 
               } 
               else if (w.getP1PileSize() != 0) 
               { 
          //Shuffles player 1's discard back into their deck. 
                  w.transferToDeck1(); 
                  System.out.println("Reloading Player 1's deck."); 
               } 
            }   
            if (w.getP2DeckSize() == 0) 
            { 
               if (w.getP2PileSize() == 0) 
               { 
                  System.out.println("Player 1 has won the War!"); 
                  answer = 2; 
               } 
               else if (w.getP2PileSize() != 0) 
               { 
            //Shuffles player 2's discard back into their deck. 
                  w.transferToDeck2(); 
                  System.out.println("Reloading Player 2's deck."); 
               } 
            } 
            System.out.println(""); 
            if (answer == 1) 
            { 
               System.out.print("Deal a card by pressing 1 again: "); 
               answer = keyboard.nextInt(); 
            } 
         }  
      } 
   } 
}