// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;


import static cards.Card.*;
import static cards.Card.Constant.*;
//
import cards.*;
import cards.Card.*;
import java.util.*;



/**
 * CardProcessor printing cards in reverse order - see task
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class CardProcessor {
    
    /**
     * Die Methode reverseOrder() zieht solange Karten von einem Kartenstapel
     * bis eine gewünschte Karte gezogen wird
     * und gibt danach alle gezogenen Karten in umgekehrter Reihenfolge wieder aus.
     *
     * @param deck              der Kartenstapel von dem die Karten gezogen werden.
     * @param lastCard          die gewünschte Karte, die die Ziehung beendet.
     * @param dbgOutputEnable   true schaltet Kontrollausgabe an und false aus.
     */
 
    public void reverseOrder(Deck deck, Card wantedCard, boolean printCards) {
        Stack<Card> cardStack = new Stack<Card>();
        Card topCard;       //außerhalb do scope
        do {
            topCard = deck.deal();
            if(printCards) {
                System.out.printf("gezogene Karte: %s%n", topCard.toString());
            }
            cardStack.push(topCard);    //i put my card on my stack
        }while(!topCard.equals(wantedCard));
        
        while(!cardStack.empty()) {     //wir machen so lange den Card nicht empty ist
            topCard = cardStack.pop();  //ausgabe
        System.out.println(topCard);    
        }
        
    }
    
    
}//class
