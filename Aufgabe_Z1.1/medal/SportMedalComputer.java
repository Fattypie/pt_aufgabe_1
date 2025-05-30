// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package medal;
/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * Wir erinnern uns: NIEMALS verschiedene Sprachen in einem Programm mixen.
 * Oder konkreter: Entweder Code, Variablen und Kommentar in deutsch oder in englisch.
 * Es gelten die in der Vorlesung besprochenen Regeln.
 * Es lohnt sich immer, die Vorlesungsinhalte zu kennen ;-)
 * 
 * Auch ist diese Art von Kommentar KEIN guter Kommentar.
 * Wir nutzen den Kommentar "hier" für Erklärungen und Ausführungen zur
 * Aufgabenstellung. Es  gilt "hier" die Regel:
 *  o) "Kommentar" der Kommentar ist in englisch.
 *  o) "Kommentar" der die Aufgabenstellung vertieft in deutsch.
 *     Löschen Sie derartigen Kommentar vor der Abgabe.
 * 
 * Im Rahmen der Aufgabenstellung müssen Sie GUTEN Kommentar schreiben.
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


/**
 * {@link SportMedalComputer} - see task.
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class SportMedalComputer {
    
    /**
     * compute proper medal for participant
     * 
     * @param points number of  points earned by participant
     * @param age    age of participant
     * @return       resulting medal
     */
    public String evaluate(
        int    points,  // Punkte die Teilnehmer im Wettkampf erworben hat
        int    age      // Alter des jeweiligen Teilnehmers
    ){
        //vvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv
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
        
        
        
        // Fügen Sie hier Ihren Code ein
        // bzw. ersetzen Sie diesen Kommentar durch Ihren Code.
        // ...
        
        //not here!!!!!!!!!!!!
        // "Code-Vorgabe"
        
        
        // Deklaration
        String medal;   // Medaille, die jeweiligem Teilnehmer ausgeh�ndigt wird
        
        // Initialisierung
        medal = "currently none";
        
        int Gold1 = 4000;
        int Gold2 = 5000;
        int Silber1 = 3999;
        int Silber2= 4999;
        int Bronze1 = 3000;
        int Bronze2 = 4000;
        
        int num = age;
        
        //here start the LOVELY code
        if (age < 14) { //Junge gruppe
        	if(points > 3999) {
        		medal = "Gold";
        	}else if(points > 2999) {
        		medal = "Siber";
        	}else{
        		medal = "Bronze";
        	}
        }else {
        	
        	}if(points > 4999){
        		medal = "Gold";
        	}else if(points > 3999) {
        		medal = "Silber";
        }else {
        	medal = "Bronze";
        }
        
        return medal;
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //
    }//method()
    
}//class
