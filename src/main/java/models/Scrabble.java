package models;

import java.util.Map;
import java.util.HashMap;
import java.io.IOException;

public class Scrabble {
    private static Character[] letterKeys = new Character[] { 'A', 'B', 'C', 'D',
                                                    'E', 'F', 'G', 'H',
                                                    'I', 'J', 'K', 'L',
                                                    'M', 'N', 'O', 'P',
                                                    'Q', 'R', 'S', 'T',
                                                    'U', 'V', 'W', 'X',
                                                    'Y', 'Z' };

    public Integer calculateScore(Character letter) {
        Map<Character, Integer> lettersAndValues = new HashMap<>();

        // Pair Keys with their respective Values and put them in the HashMap
        for (char eachLetter : letterKeys) {
            if (eachLetter == 'A' || eachLetter == 'E' || eachLetter == 'I' || eachLetter == 'O' || eachLetter =='U' || eachLetter == 'L' || eachLetter == 'N' || eachLetter == 'R' || eachLetter == 'S' || eachLetter == 'T')  {
                lettersAndValues.put(eachLetter, 1);
            } else if (eachLetter == 'D' || eachLetter == 'G') {
                lettersAndValues.put(eachLetter, 2);
            } else if (eachLetter == 'B' || eachLetter == 'C' || eachLetter == 'M' || eachLetter == 'P') {
                lettersAndValues.put(eachLetter, 3);
            } else if (eachLetter == 'F' || eachLetter == 'H' || eachLetter == 'V' || eachLetter == 'W' || eachLetter == 'Y') {
                lettersAndValues.put(eachLetter, 4);
            } else if (eachLetter == 'K') {
                lettersAndValues.put(eachLetter, 5);
            } else if (eachLetter == 'J' || eachLetter == 'X') {
                lettersAndValues.put(eachLetter, 8);
            } else if (eachLetter == 'Q' || eachLetter == 'Z') {
                lettersAndValues.put(eachLetter, 10);
            }
        }

        // Character.toUpperCase(letter) Capitalizes
        return lettersAndValues.get(Character.toUpperCase(letter));
    }

}
