package palindromeFinder;

/**
 * PalinromeFinder
 * 
 * @author Eleonora Nuzhdina,Denys Hreskov 
 * @version 18.06.25
 *
 */

public class PalindromeFinder {
    private String text;

    public PalindromeFinder(String text) {
        assert text!=null : "Text kann nicht null sein";
        this.text = text;
    }

    public PalindromeFinder() {
        this.text = "";
    }

    public String getText() {
        return text;
    }

    private boolean isPalindrome(String word) {
        int buchstabeVonLinks = 0;
        int buchstabeVonRechts = word.length() - 1;
        while ((buchstabeVonLinks < buchstabeVonRechts )
           && (word.charAt(buchstabeVonLinks) == word.charAt(buchstabeVonRechts))
        ){
            buchstabeVonLinks++;
            buchstabeVonRechts--;
        }
        return buchstabeVonLinks >= buchstabeVonRechts;
    }

    public String getLongestPalindrome() {
        String textMitKleinenBuchstaben = text.toLowerCase();
        for (int indexVonEnde = text.length(); indexVonEnde >= 0; indexVonEnde--) {
            for (int indexVonAnfang = 0; indexVonAnfang <= text.length() - indexVonEnde; indexVonAnfang++) {
                final String word = textMitKleinenBuchstaben.substring(indexVonAnfang, indexVonAnfang + indexVonEnde);
                if (isPalindrome(word)) {
                    return text.substring(indexVonAnfang, indexVonAnfang + indexVonEnde);
                }
            }
        }
        assert false : "unexpected control flow";
        return "";      // unnecessary, just keep compiler happy
    }

    public void setText(String neueText) {
        this.text = neueText;
    }

}
