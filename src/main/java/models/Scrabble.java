package models;

import java.util.Map;
import java.util.HashMap;
import java.io.IOException;

public class Scrabble {
    private static String[] letterKeys = new String[] { "A", "B", "C", "D",
                                                    "E", "F", "G", "H",
                                                    "I", "J", "K", "L",
                                                    "M", "N", "O", "P",
                                                    "Q", "R", "S", "T",
                                                    "U", "V", "W", "X",
                                                    "Y", "Z" };


    public Integer calculateScore(String word) {
        Map<String, Integer> lettersAndValues = new HashMap<>();

        char[] charArray = word.toUpperCase().toCharArray();
        int score = 0;

        for (char letter : charArray) {
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'L' || letter == 'N' || letter == 'R' || letter == 'S' || letter == 'T') {
                score += 1;
            } else if (letter == 'D' || letter == 'G') {
                score += 2;
            } else if (letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P') {
                score += 3;
            } else if (letter == 'F' || letter == 'H' || letter == 'V' || letter == 'W' || letter == 'Y') {
                score += 4;
            } else if (letter == 'K') {
                score += 5;
            } else if (letter == 'J' || letter == 'X') {
                score += 8;
            } else if (letter == 'Q' || letter == 'Z') {
                score += 10;
            }
        }

        // Pair Keys with their respective Values and put them in the HashMap
//        for (String eachLetter : letterKeys) {
//            if (eachLetter.equals("A") || eachLetter.equals ("E") || eachLetter.equals ("I") || eachLetter .equals ("O") || eachLetter .equals("U") || eachLetter .equals ("L") || eachLetter .equals ("N") || eachLetter .equals ("R") || eachLetter .equals ("S") || eachLetter .equals ("T"))  {
//                lettersAndValues.put(eachLetter, 1);
//            } else if (eachLetter .equals ("D") || eachLetter .equals ("G")) {
//                lettersAndValues.put(eachLetter, 2);
//            } else if (eachLetter .equals ("B") || eachLetter .equals ("C") || eachLetter .equals ("M") || eachLetter .equals ("P")) {
//                lettersAndValues.put(eachLetter, 3);
//            } else if (eachLetter .equals ("F") || eachLetter .equals ("H") || eachLetter .equals ("V") || eachLetter .equals ("W") || eachLetter .equals ("Y")) {
//                lettersAndValues.put(eachLetter, 4);
//            } else if (eachLetter .equals ("K")) {
//                lettersAndValues.put(eachLetter, 5);
//            } else if (eachLetter .equals ("J") || eachLetter .equals ("X")) {
//                lettersAndValues.put(eachLetter, 8);
//            } else if (eachLetter .equals ("Q") || eachLetter .equals ("Z")) {
//                lettersAndValues.put(eachLetter, 10);
//            }
//        }

        // Character.toUpperCase(letter) Capitalizes
        return score;
    }

}
