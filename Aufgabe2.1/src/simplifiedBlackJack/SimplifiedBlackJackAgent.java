// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package simplifiedBlackJack;


import cards.*;
import cards.Card.*;

import static cards.Card.*;
import static cards.Card.Constant.*;


/**
 * Simplified Black Jack Agent - see task
 * 
 * @author  (your name(s)) 
 * @version (a version number or a date)
 */
public class SimplifiedBlackJackAgent {
    
    // Ersetzen Sie diesen Kommentar durch Ihren Code
    // oder falls kein Code noetig ist, loeschen diesen Kommentar einfach.
    // Hier waere die Stelle fuer moegliche Zustandsvariablen, Exemplarvariablen
    // bzw. Objekt-spezifische Variablen oder einen Konstruktor,
    // sofern derartiges benoetigt wird.
    // Es ist Ihre Entscheidung und sie sollte Sinn machen.
    
    
    
    /**
     * "Play" Black Jack
     */
    public void playBlackJack(){
        //VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###
        //###
        //###
        //###           HIER kommt Ihr Code hin
        //###
        //###                    VVVV
        //###                    VVVV
        //###                    VVVV
        //###   VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###      VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
        //###         VVVVVVVVVVVVVVVVVVVVVVVVVV
        //###            VVVVVVVVVVVVVVVVVVVV
        //###               VVVVVVVVVVVVVV
        //###                  VVVVVVVV
        //###                     VV
        
        
        
        //...
       Deck deck = new Deck(); 
       int score = 0;
       Card card;   //just placeholder
       // starting here loop
       while(score < 17) {      //while the card score is under 17 draw new card
           card = deck.deal();      //give a random card from the deck
           System.out.println("Raw card" + card);   //debug the card
           Rank cardRank = card.getRank();  //getRank is a getter function - Rank is numbers, J Q K and Ace
           System.out.println("card rank " + cardRank); //debug
           int cardRankValue = cardRank.value(); //get the number value of the cardrank E.G k is 13
           System.out.println("card rank value" + cardRankValue);   //debug the cardRank
           
        // if cardRankValue is 14, then its an Ace, so it counts 11 points
           // else if cardRankValue is bigger than 10, then it is J or Q or K and counts 10 points
           // else count the exact points of cardRankValue
           if(cardRankValue == 14) {
              // score = score + 1;
               score += 11;
           }else if(cardRankValue > 10){
               score += 10;
           }else {
               score += cardRankValue;
           }
           
           //System.out.println(cardRank);
           System.out.printf("gezogene Karte: %s -- score: %d\n", cardRank.toString(), score); //toString - transform an Object into a string
       }
       if(score > 21) {
           System.out.println("You Lose! :)");
       } else {
           System.out.printf("Endpunktstand: %d\n", score);
       }
             
       
       
        
        
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        System.out.flush();
    }//method()
    
}//class
