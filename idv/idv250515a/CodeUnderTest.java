package idv250515a;


import static cards.Card.*;
import static cards.Card.Constant.*;
import cards.*;
import cards.Card.*;


public class CodeUnderTest {
    public void justDoIt(){
        /* Bemerkung: Einige Variablennamen waren zunächst (bei der Code-Eingabe) sehr kurz - Z.B.: cc, r, s, rai, sai
         * Wir hatten also wenig Tipparbeit.
         * Als uns der Code gefiel, wurden sie mit [Rechts-Klick]->Refactor->Rename gegen gute Namen ausgetauscht.
         * Achtung! Der Code darf zum Zeitpukt des "Refactoring" KEINE Syntax-Fehler enthalten.
         */
        //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
        
        // Idee: (Zunächst) ? Karten ziehen und sortiert ausgeben:
        
        // Konfiguration in Form von Konstanten
        final boolean debugOutputEnable = true;
        final int numberOfDraws = 7;            // <- Auch mit dieser Konstante vermeiden wir eine "Magic Number"
        
        
        // Konstanten  <- um "Magic Numbers" zu vermeiden, definieren wir Konstanten mit selbsterklärenden Namen
        final int numberOfRanks = 13;
        final int numberOfSuits = 4;
        // Folgendes ist klar besser !!! - verstehen wir aber noch nicht :-(
      //final int numberOfRanks = Rank.values().length;
      //final int numberOfSuits = Suit.values().length;
        
        
        // Setup
        final Deck deck = new Deck();
        final Card[][] cardMatrix = new Card[numberOfSuits][numberOfRanks];
        
        
        // gewünschte Anzahl Karten ziehen (und sofern gewünscht, jeweils unmittelbar danach ausgeben) und in Karten-Matrix ablegen
        if( debugOutputEnable )  System.out.printf( "Die gezogenen Karten:\n" );
        for( int cardCount=0; cardCount<numberOfDraws; cardCount++ ) {
            final Card card = deck.deal();
            if( debugOutputEnable )  System.out.printf( "%s",  card );
            final Rank cardRank = card.getRank();
            final int cardRankAsIndex = cardRank.ordinal();
            final Suit cardSuit = card.getSuit();
            final int cardSuitAsIndex = cardSuit.ordinal();
            cardMatrix[cardSuitAsIndex][cardRankAsIndex] = card;
        }//for
        if( debugOutputEnable )  System.out.printf( "\n\n" );
        
        
        
        
        
        // TODO
        // ====
        // Die anfangs gezogenen Karten sortiert ausgeben und zwar (einfach mal willkürlich beschlossen)
        // mit 1.Prio aufsteigend nach Farben (Poker folgt diesbezüglich Bridge) und
        // mit 2.Prio aufsteigend nach Rängen
        // Machen wir nächstes Mal
        //
        // Aber als Übung vielleicht schon mal selber zu Hause programmieren/probieren ? ;-)
        
        
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    }//method()
    
}//class