package tripleFinder;

import cards.Card;

public class CardProcessor implements CardProcessor_I{

    /**
     * Diese Methode verarbeitet eine (Spiel-)Karte.
     * Die als Parameter übergebene(n) Karte(n) wird(werden) zunächst intern gespeichert.
     * Sobald ein Drilling (3 Karten vom gleichen Rang) vorliegt,
     * soll dieser Drilling (also die entsprechenden 3 Karten) als Rückgaberwert der Methode zurückgegeben werden.
     *
     * @param card bestimmt die (neue) Karte, die zu verarbeiten ist.
     * @return  der erste Drilling unmittebar nachdem er aufgetreten ist<br />
     *          und sonst null.
     */
    List<Card> process( final Card card ){
        return new List<Card>();
    };
    
    
    /**
     * löscht alle (internen) gespeicherten Karten.
     */
    void reset();
}
