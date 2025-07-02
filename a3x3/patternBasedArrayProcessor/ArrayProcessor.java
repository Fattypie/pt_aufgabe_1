// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package patternBasedArrayProcessor;


/**
 * ArrayProcessor - see task
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 *
 */
public class ArrayProcessor {
    

    public long process( long[][] theArray, boolean[][] pattern ){
        long result = 0;
        int patternHeightY = pattern.length;
        // The maximum steps down is array y-length  -  pattern y-length, if pattern does not fit y it wont enter for loop
        for(int yStart = 0; yStart <= theArray.length - patternHeightY ; yStart++) {
            boolean xLengthFits = true;
            
            for(int y = 0; y < patternHeightY; y++) {
                int patternLengthX = pattern[y].length;
                if(theArray[yStart + y].length < patternLengthX) {
                    xLengthFits = false;
                    break;
                }
            }//for(y)
            // Skip the y start position if x length not big enough for pattern
            if(!xLengthFits) continue;
            
            // Check for max steps for x (take the smallest from all the rows)
            int xShiftMax = Integer.MAX_VALUE;
            for(int y = 0; y < patternHeightY; y++) {
                int patternRowWidth = pattern[y].length;
                int arrayRowWidth = theArray[y + yStart].length;
                xShiftMax = Math.min(xShiftMax, arrayRowWidth - patternRowWidth);
            }
            
            for(int xStart = 0; xStart <= xShiftMax; xStart++) {
                for(int y = 0; y < patternHeightY; y++) {
                    for (int x = 0; x < pattern[y].length; x++) {
                        if(pattern[y][x]) { // if the position is part of the pattern it will have the value true
                            result += theArray[y + yStart][x + xStart]; 
                        }
                    }
                }
            }
            
        }//for(yStart)
        
        return result;   // <<<=== Diese Zeile ist falsch!   bzw. nur ein Platzhalter um den Compiler gluecklich zu machen. Die Zeile muss sinnvoll ersetzt werden.
    }//method()
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    // Führen Sie Änderungen oberhalb dieser Zeilen durch.
    //^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
    
}//class
