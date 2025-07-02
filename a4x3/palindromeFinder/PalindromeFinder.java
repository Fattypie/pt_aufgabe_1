package palindromeFinder;

/**
 * PalinromeFinder
 * 
 * @author Yuk Lin Ng, Yasemin Kerbs
 * @version 30.06.2025
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
        int leftLetter = 0;
        int rightLetter = word.length() - 1;
        while ((leftLetter < rightLetter ) && (word.charAt(leftLetter) == word.charAt(rightLetter))
        ){
            leftLetter++;
            rightLetter--;
        }
        return leftLetter >= rightLetter;
    }

    public String getLongestPalindrome() {
        for (int indexRight = text.length(); indexRight >= 0; indexRight--) {
            for (int indexLeft = 0; text.length() >= indexLeft + indexRight; indexLeft++) {
                final String word = text.substring(indexLeft, indexLeft + indexRight);
                if (isPalindrome(word.toLowerCase())) {
                    return word;
                }
            }
        }
        return "";      
    }

    public void setText(String neueText) {
        this.text = neueText;
    }

}//class
