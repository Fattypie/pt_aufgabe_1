package cardProcessor;


import static cards.Card.*;
import static cards.Card.Constant.*;

import java.util.Arrays;

//
import cards.*;
import cards.Card.*;



/**
 * CardProcessor - sort cards in-place - see task
 * 
 * @author  (your name(s)) 
 * @version (a version number or a date)
 */
public class CardProcessor {
    
    public void sortCards( final Card[] cardsToBeSorted ){
        // TODO ...
        if(cardsToBeSorted.length > 52) {
            System.out.printf("Fehler: Die zu sortierenden Karten haben eine länge über 52 \n Tatsächliche Länge: %d", cardsToBeSorted.length);
        }else {
        Card[][] cardMatrix = generateCardMatrix(cardsToBeSorted);
        int indexCounter = 0;
        for(int i = 12; i >= 0; i--) {
            // First C, then S, then H, then D
            Card cCard = cardMatrix[0][i]; // first dimension 0 is always C Suit
            if(cCard != null) cardsToBeSorted[indexCounter++] = cCard; // post increment happens after the line
            Card sCard = cardMatrix[3][i];
            if(sCard != null) cardsToBeSorted[indexCounter++] = sCard; 
            Card hCard = cardMatrix[2][i];
            if(hCard != null) cardsToBeSorted[indexCounter++] = hCard; 
            Card dCard = cardMatrix[1][i];
            if(dCard != null) cardsToBeSorted[indexCounter++] = dCard; 
        }
        }
    }//method()
    
  
    public Card[][] generateCardMatrix ( Card[] givenCards){
        Card[][] cardMatrix = new Card[4][13]; //index 0 is C, 1 is D, 2 is H, 3 is S
        // for loop through givenCards and sort each card into the matrix
        for(int i = 0; i < givenCards.length; i++) {
            //System.out.println("Rank : " + givenCards[i].getRank() + "===" + givenCards[i].getRank().ordinal());
            //System.out.println("Suit : " + givenCards[i].getSuit() + "===" + givenCards[i].getSuit().ordinal());
            // Important: Rank ordinal starts with 2 at 0, so 3 is 1, 6 is 4, A is 12
            // Important: Suit Ordinal: 0 is C, 1 is D, 2 is H, 3 is S
            Card currentCard = givenCards[i];
            int suitOrdinal = currentCard.getSuit().ordinal();
            int rankOrdinal = currentCard.getRank().ordinal();
            cardMatrix[suitOrdinal][rankOrdinal] = currentCard;
          
        }
        // System.out.println(Arrays.deepToString(cardMatrix));
        
        return cardMatrix;
    }
    
    
}//class
