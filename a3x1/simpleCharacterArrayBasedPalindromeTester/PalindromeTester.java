package simpleCharacterArrayBasedPalindromeTester;


/**
 * PalindromeTester - see task
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 *
 */
public class PalindromeTester {
    
    /**
     * Die Methode isPalindrome prüft ob ein Palindrom vorliegt.
     * 
     * @param word      das zu überprüfende Wort.
     *
     * @return boolean  <code>true</code> falls das zu überprüfende Wort ein Palindrom ist,
     *                  andernfalls <code>false</code>.
     */
    //###
    //###
    //###
    //###         HIER kommt Ihr Code hin ;-)
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
    
    // Schreiben Sie eine Methode, die
    // o) ein Ergebnis vom Typ boolean abliefert
    // o) isPalindrome heißt
    // o) ein char[] als Parameter entgegen nimmt
    //    Der Parameter soll word heißen
    public static boolean isPalindrome(char[] word) {
        // returns false if the word is palindrome but has capital letter at the start
        for (int i = 0; i < word.length / 2; i++) {
            char leftChar = word[i];
            int rightIndex = word.length - 1 - i; // The length of an array is always 1 higher than max index, so -1
            char rightChar = word[rightIndex];
            if(leftChar != rightChar) return false;
        }
        return true;
    }
    
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // Führen Sie Änderungen oberhalb dieser Zeilen durch.
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
}//class
