package cardHand;
import cards.Card;
import cards.Card.*;

public class Hand{
    
    private Card[] handCards;   //All Attribute should be private
     
    
    public Hand() {
        this.handCards = new Card[0]; //empty card array
    }
    
    public Hand(Card...handCards ) { //varargs can give 1 card, multiple card or card Array -> will turn to array
        assert handCards != null : "Hand darf nicht null sein!";
        for(int i= 0; i < handCards.length; i++) {  
                assert handCards[i] != null : "Card darf nicht null sein!"; //single card from the array
        }
        this.handCards = handCards;
    }
    
    public void add(Card...cards) {     //get the card from other player
            assert handCards != null :"Hand darf nicht null sein!";
        Card[] newHand = new Card[handCards.length + cards.length]; // just define array size
        
        //put the old card 
        for(int i = 0; i < handCards.length; i++) {
            newHand[i] = handCards[i]; //write each Card of handCards in newHand, i = index position
        }
        
        //put new cards on the cards array
        for(int i = 0; i < cards.length; i++) {
            newHand[handCards.length + i] = cards[i];  //the handCards length + cards current index
        }
        
        handCards = newHand;
        
    }
  
    //add new cards to handCards 
    public void add(Hand hand) {        //similar to Card...cards, but this time the whole cards from the player
        Card[] cards = hand.getHandCards(); // get the card array from the hand
        Card[] newHand = new Card[handCards.length + cards.length];
        
        //put the old card 
        for(int i = 0; i < handCards.length; i++) {
            newHand[i] = handCards[i]; //newHand make a copy of handCards, i = index position
        }
        
        //put new cards on the cards array
        for(int i = 0; i < cards.length; i++) {
            newHand[handCards.length + i] = cards[i];  //the handCards length + cards current index
        }
        
        handCards = newHand;
    }
    
    //once have different color, directly return false, otherweise it will return to true
    public boolean isSuited() {
        if(handCards.length == 0) return false;
        Suit firstSuit = handCards[0].getSuit();
        for(int i = 1; i < handCards.length; i++) {
            if(handCards[i].getSuit() != firstSuit) return false; 
        }
        return true;
    }
    
    public Card[] getHandCards() {
        return handCards;
    }
    
    public void setHandCards(Card...handCards) {
        assert handCards != null :"Hand darf nicht null sein!";
        
        this.handCards = handCards;
    }
    
    public void setHandCards() {
        this.handCards = new Card[0];
    }
}


