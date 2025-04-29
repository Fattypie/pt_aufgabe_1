// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse

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
 * {@link GradeConverter} - see task.
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class GradeConverter {
    
    /**
     * Converts "Notenpunkte"  into old german "Schulnote"
     * 
     * @param np  Notenpunkte number of  points earned by participant
     * @return    old german "Schulnote"
     */
    public String convertGrade( final int np ){
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
        
        
        // "Code-Vorgabe"
        
        
        // Deklaration und Initialisierung
    	
        String result = "";
        
        switch(np) { //switch case: we have 15 possiblites
        case 0:
        	System.out.printf("Anzahl der Notenpunkte: %d\f", np);
        	result = "6";
        	break;
        	
        case 1:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "5-";
        	break;
        case 2:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "5";
        	break;
        
        case 3:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "5+";
        	break;
        	
        case 4:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "4-";
        	break;
        	
        case 5:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "4";
        	break;
        	
        case 6:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "4+";
        	break;
        	
        case 7:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "3-";
        	break;
        	
        case 8:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "3";
        	break;
        	
        case 9:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "3+";
        	break;
        	
        case 10:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "2-";
        	break;
        	
        case 11:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "2";
        	break;
        	
        case 12:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "2+";
        	break;
        	
        case 13:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "1-";
        	break;
        	
        case 14:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "1";
        	break;
        	
        case 15:
        	System.out.printf("Anzahl der Notepunkte: %d", np);
        	result = "1+";
        	break;
        	default: //if the user put the wrong number
        		System.out.printf("Der Wert %d ist kein richtige Notenwert", np);
        }
        //...
        // rechne NP um und speichere das Ergebnis in result
        //...
        
        
        return result;
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        // Sofern Sie kein Vorwissen haben und/oder NICHT wissen was Sie tun
        // führen Sie KEINE! Änderungen unterhalb dieser Zeilen durch.
        //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
        //
    }//method()
    
}//class
