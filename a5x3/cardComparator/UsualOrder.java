package cardComparator;

import java.util.Comparator;
import java.util.List;

import cards.Card;

import static cards.Card.*;
import static cards.Card.Constant.*;

/**
 * Comparator for Cards defining "usual order"
 * 
 * @author (your name(s))
 * @version (a version number or a date)
 */
// Klasse "UsualOrder"
//
// Fügen Sie hier Ihren Code ein
// bzw. ersetzen Sie diesen Kommentar durch Ihren Code.
// ...
public class UsualOrder implements Comparator<Card> {
    private final List<Suit> suitOrder = List.of(Suit.CLUB, Suit.SPADES, Suit.HEART, Suit.DIAMOND);

    @Override
    public int compare(Card c1, Card c2) {
        if (c1.getRank().ordinal() == c2.getRank().ordinal()) {
            //
            if (suitOrder.indexOf(c1.getSuit()) < suitOrder.indexOf(c2.getSuit())) { 
                return -1; // erste Karte (c1) ist höher, also c1 nach links, deswegen -1
            } else if (suitOrder.indexOf(c1.getSuit()) == suitOrder.indexOf(c2.getSuit())) {
                return 0; // beide Karte sind gleich
            } else {
                return 1; // zweite Karte (c2) ist höher, also c1 nach rechts, deswegen 1
            }
        }
        if (c1.getRank().ordinal() > c2.getRank().ordinal()) {
            return -1;
        } else {
            return 1;
        }
    }

}